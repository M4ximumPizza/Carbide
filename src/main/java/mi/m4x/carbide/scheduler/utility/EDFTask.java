package mi.m4x.carbide.scheduler.utility;

/**
 * Represents a task with a deadline for EDF scheduling.
 *
 * @since 1.0.4
 * @author M4ximumpizza
 */
public class EDFTask implements Comparable<EDFTask> {
    private final Runnable task;
    private final long deadline; // in milliseconds

    public EDFTask(Runnable task, long deadline) {
        this.task = task;
        this.deadline = deadline;
    }

    public Runnable getTask() {
        return task;
    }

    public long getDeadline() {
        return deadline;
    }

    @Override
    public int compareTo(EDFTask other) {
        return Long.compare(this.deadline, other.deadline);
    }
}