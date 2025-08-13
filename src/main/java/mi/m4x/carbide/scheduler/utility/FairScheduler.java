package mi.m4x.carbide.scheduler.utility;

import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Implements a Weighted Fair Queuing (WFQ) scheduler for Carbide tasks.
 * <p>
 * Each task is assigned a weight. Tasks with higher weights get more CPU time,
 * but all tasks are guaranteed fair execution over time.
 *
 * @since 1.0.4
 * @author M4ximumpizza
 */
public class FairScheduler {

    private final PriorityQueue<WeightedTask> queue = new PriorityQueue<>();
    private final AtomicLong currentTime = new AtomicLong(0);

    /**
     * Adds a task to the fair scheduler.
     *
     * @param task   The Runnable task to execute.
     * @param weight The weight of the task. Higher weight = more CPU time.
     */
    public synchronized void submit(Runnable task, int weight) {
        long now = currentTime.get();
        WeightedTask wt = new WeightedTask(task, weight, now);
        queue.offer(wt);
    }

    /**
     * Executes the next task in a fair manner.
     */
    public synchronized void executeNext() {
        WeightedTask next = queue.poll();
        if (next != null) {
            next.getTask().run();
            // Update virtual time
            currentTime.addAndGet(1_000L / next.weight);
        }
    }

    /**
     * Checks if there are pending tasks.
     *
     * @return true if tasks are waiting.
     */
    public synchronized boolean hasTasks() {
        return !queue.isEmpty();
    }
}
