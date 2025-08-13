package mi.m4x.carbide.scheduler.utility;

/**
 * Represents a task with a weight for WFQ scheduling.
 *
 * @since 1.0.4
 * @author M4ximumpizza
 */
public class WeightedTask implements Comparable<WeightedTask> {
    private final Runnable task;
    final int weight;
    private final long enqueueTime;
    private long virtualFinishTime;

    public WeightedTask(Runnable task, int weight, long currentTime) {
        this.task = task;
        this.weight = Math.max(weight, 1); // minimum weight = 1
        this.enqueueTime = currentTime;
        this.virtualFinishTime = currentTime + 1_000L / this.weight;
    }

    public Runnable getTask() {
        return task;
    }

    public long getVirtualFinishTime() {
        return virtualFinishTime;
    }

    @Override
    public int compareTo(WeightedTask other) {
        return Long.compare(this.virtualFinishTime, other.virtualFinishTime);
    }
}
