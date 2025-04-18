package mi.m4x.carbide.scheduler.executor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;

/**
 * WorkerThread continuously polls and executes tasks from the ExecutorManager's global queue.
 * It handles lock acquisition/release and task lifecycle including exception propagation.
 *
 * The thread will wait (block) when there are no tasks ready for execution, minimizing CPU usage.
 *
 * @author M4ximumpizza
 * @since 1.0.0
 */
public class WorkerThread extends Thread {

    private static final Logger LOGGER = LoggerFactory.getLogger("Carbide Worker Thread");

    private final ExecutorManager executorManager;
    private final AtomicBoolean shutdown = new AtomicBoolean(false);

    /**
     * Constructs a new worker thread bound to a specific ExecutorManager.
     *
     * @param executorManager The manager that coordinates task execution and locking.
     */
    public WorkerThread(ExecutorManager executorManager) {
        this.executorManager = executorManager;
    }

    /**
     * Main execution loop that repeatedly polls and runs tasks, or waits if none are ready.
     */
    @Override
    public void run() {
        mainLoop:
        while (true) {
            if (shutdown.get()) {
                return;
            }

            if (pollAndExecuteTask()) {
                continue;
            }

            // Spin-wait optimization section (can be enabled if extremely low latency is required)
            // Uncomment for reduced wake-up latency at the cost of some CPU
            /*
            for (int i = 0; i < 1000; i++) {
                if (pollAndExecuteTask()) {
                    continue mainLoop;
                }
                LockSupport.parkNanos(10_000); // 10µs
            }
            */

            // Park until notified or new task arrives
            synchronized (executorManager.workerMonitor) {
                if (executorManager.hasPendingTasks()) {
                    continue;
                }
                try {
                    executorManager.workerMonitor.wait(); // Wait for work
                } catch (InterruptedException ignored) {
                    // Safe to ignore as thread will re-check shutdown flag
                }
            }
        }
    }

    /**
     * Attempts to poll a task from the manager and execute it.
     *
     * @return {@code true} if a task was executed, {@code false} otherwise.
     */
    private boolean pollAndExecuteTask() {
        final Task task = executorManager.pollExecutableTask();
        if (task == null) {
            return false;
        }

        final boolean[] released = new boolean[1]; // Efficient mutable holder
        try {
            task.run(() -> {
                if (!released[0]) {
                    released[0] = true;
                    executorManager.releaseLocks(task);
                }
            });
        } catch (Throwable taskException) {
            // Ensure locks are always released
            try {
                if (!released[0]) {
                    released[0] = true;
                    executorManager.releaseLocks(task);
                }
            } catch (Throwable lockException) {
                taskException.addSuppressed(lockException);
                LOGGER.error("Error while releasing locks", taskException);
            }

            // Handle propagation failure separately
            try {
                task.propagateException(taskException);
            } catch (Throwable propagationError) {
                taskException.addSuppressed(propagationError);
                LOGGER.error("Error while propagating exception", taskException);
            }
        }

        return true;
    }

    /**
     * Initiates a graceful shutdown of the worker thread.
     * Thread will exit its loop after the current iteration.
     */
    public void shutdown() {
        shutdown.set(true);
        LockSupport.unpark(this);
    }
}

