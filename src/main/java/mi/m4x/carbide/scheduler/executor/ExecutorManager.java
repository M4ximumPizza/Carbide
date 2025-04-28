package mi.m4x.carbide.scheduler.executor;

import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import mi.m4x.carbide.scheduler.structures.DynamicPriorityQueue;

import java.util.concurrent.*;
import java.util.function.Consumer;

/**
 * Manages task execution using a priority-based global queue and lock-based task coordination.
 * Tasks are only executed when their required lock tokens are available.
 *
 * @author M4ximumpizza
 * @since 1.0.0
 */
public class ExecutorManager {

    private final DynamicPriorityQueue<Task> globalWorkQueue;
    private final ConcurrentMap<LockToken, FreeableTaskList> lockListeners = new ConcurrentHashMap<>();
    final Object workerMonitor = new Object();
    private final WorkerThread[] workerThreads;

    /**
     * Constructs an ExecutorManager with the specified number of worker threads.
     *
     * @param workerThreadCount Number of worker threads.
     */
    public ExecutorManager(int workerThreadCount) {
        this(workerThreadCount, thread -> {});
    }

    /**
     * Constructs an ExecutorManager with a thread initializer.
     *
     * @param workerThreadCount Number of worker threads.
     * @param threadInitializer Callback to customize each worker thread before start.
     */
    public ExecutorManager(int workerThreadCount, Consumer<Thread> threadInitializer) {
        this(workerThreadCount, threadInitializer, 64);
    }

    /**
     * Constructs an ExecutorManager with full configuration.
     *
     * @param workerThreadCount Number of worker threads.
     * @param threadInitializer Callback to customize each worker thread.
     * @param priorityCount     Number of priority levels supported by the task queue.
     */
    public ExecutorManager(int workerThreadCount, Consumer<Thread> threadInitializer, int priorityCount) {
        this.globalWorkQueue = new DynamicPriorityQueue<>(priorityCount);
        this.workerThreads = new WorkerThread[workerThreadCount];

        for (int i = 0; i < workerThreadCount; i++) {
            WorkerThread thread = new WorkerThread(this);
            threadInitializer.accept(thread);
            thread.start();
            workerThreads[i] = thread;
        }
    }

    /**
     * Attempts to acquire all locks required by the task.
     * If any lock is already held, the task is added as a listener and not executed now.
     *
     * @param task Task to lock.
     * @return {@code true} if the task acquired all locks, {@code false} otherwise.
     */
    boolean tryLock(Task task) {
        LockToken[] tokens = task.lockTokens();
        FreeableTaskList localList = new FreeableTaskList();

        retry:
        while (true) {
            for (int i = 0; i < tokens.length; i++) {
                LockToken token = tokens[i];
                FreeableTaskList existing = lockListeners.putIfAbsent(token, localList);

                if (existing != null) {
                    // Rollback inserted tokens
                    for (int j = 0; j < i; j++) {
                        lockListeners.remove(tokens[j], localList);
                    }

                    // Try adding safely
                    if (!existing.addIfNotFreed(task)) {
                        continue retry;
                    }

                    callListeners(localList);
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * Releases all locks held by the task and schedules any waiting tasks.
     *
     * @param task Task that finished execution.
     */
    void releaseLocks(Task task) {
        LockToken[] tokens = task.lockTokens();
        FreeableTaskList sharedListeners = null;

        for (LockToken token : tokens) {
            FreeableTaskList list = lockListeners.remove(token);
            if (list == null) {
                throw new IllegalStateException("Lock not found: " + token);
            }

            if (sharedListeners == null) {
                sharedListeners = list;
            } else if (sharedListeners != list) {
                throw new IllegalStateException("Inconsistent lock listener state.");
            }
        }

        if (sharedListeners != null) {
            callListeners(sharedListeners);
        }
    }

    /**
     * Wakes up all listeners in the list and marks it as freed.
     *
     * @param listeners Listener task list to wake up.
     */
    private void callListeners(FreeableTaskList listeners) {
        listeners.markFreed();
        if (!listeners.isEmpty()) {
            for (Task task : listeners) {
                schedule0(task);
            }
        }
        wakeup();
    }

    /**
     * Retrieves the next executable task if any exists.
     *
     * @return Task ready for execution or {@code null}.
     */
    Task pollExecutableTask() {
        Task task;
        while ((task = globalWorkQueue.dequeue()) != null) {
            if (tryLock(task)) {
                return task;
            }
        }
        return null;
    }

    /**
     * Gracefully shuts down all worker threads.
     */
    public void shutdown() {
        for (WorkerThread thread : workerThreads) {
            thread.shutdown();
        }
    }

    /**
     * Schedules a task for execution.
     *
     * @param task Task to schedule.
     */
    public void schedule(Task task) {
        schedule0(task);
        wakeup();
    }

    /**
     * Schedules a simple runnable task with a given priority.
     *
     * @param runnable Runnable to execute.
     * @param priority Priority level of execution.
     */
    public void schedule(Runnable runnable, int priority) {
        schedule(new SimpleTask(runnable, priority));
    }

    /**
     * Provides an Executor interface bound to a fixed priority.
     *
     * @param priority Priority level for execution.
     * @return An {@link Executor} that submits tasks at the given priority.
     */
    public Executor executor(int priority) {
        return runnable -> schedule(runnable, priority);
    }

    /**
     * Notifies the manager that a task's priority has changed, updating its position in the queue.
     *
     * @param task Task whose priority has changed.
     */
    public void notifyPriorityChange(Task task) {
        globalWorkQueue.changePriority(task, task.priority());
    }

    /**
     * Checks if there are any tasks pending in the work queue.
     *
     * @return {@code true} if tasks are pending; {@code false} otherwise.
     */
    public boolean hasPendingTasks() {
        return globalWorkQueue.size() > 0;
    }

    private void schedule0(Task task) {
        globalWorkQueue.enqueue(task, task.priority());
    }

    private void wakeup() {
        synchronized (workerMonitor) {
            workerMonitor.notifyAll();
        }
    }

    /**
     * Internal class for managing a list of listeners waiting for lock release.
     */
    private static class FreeableTaskList extends ReferenceArrayList<Task> {
        private volatile boolean freed = false;

        /**
         * Marks this list as freed, in a thread-safe way.
         * @since 1.0.2
         */
        public void markFreed() {
            synchronized (this) {
                this.freed = true;
            }
        }

        /**
         * Attempts to add a task if not freed.
         *
         * @param task Task to add.
         * @return true if added, false if already freed.
         * @since 1.0.2
         */
        public boolean addIfNotFreed(Task task) {
            synchronized (this) {
                if (freed) {
                    return false;
                }
                add(task);
                return true;
            }
        }
    }
}

