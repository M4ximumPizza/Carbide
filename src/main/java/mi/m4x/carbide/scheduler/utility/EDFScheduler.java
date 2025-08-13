package mi.m4x.carbide.scheduler.utility;

import java.util.PriorityQueue;

/**
 * Real-Time Scheduler using Earliest Deadline First (EDF) policy.
 * <p>
 * Tasks are scheduled according to their deadlines.
 * The task with the earliest deadline is executed first.
 *
 * @since 1.0.4
 * @author M4ximumpizza
 */
public class EDFScheduler {

    private final PriorityQueue<EDFTask> queue = new PriorityQueue<>();

    /**
     * Submits a task with a specific deadline.
     *
     * @param task     The task to execute.
     * @param deadline The absolute time in milliseconds by which the task should complete.
     */
    public synchronized void submit(Runnable task, long deadline) {
        queue.offer(new EDFTask(task, deadline));
    }

    /**
     * Executes the next task according to the earliest deadline.
     */
    public synchronized void executeNext() {
        EDFTask next = queue.poll();
        if (next != null) {
            next.getTask().run();
        }
    }

    /**
     * Checks if there are pending tasks.
     *
     * @return true if there are tasks waiting.
     */
    public synchronized boolean hasTasks() {
        return !queue.isEmpty();
    }
}
