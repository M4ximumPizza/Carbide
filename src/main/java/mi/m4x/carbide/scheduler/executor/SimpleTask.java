package mi.m4x.carbide.scheduler.executor;

import java.util.Objects;

/**
 * A simple implementation of the {@link Task} interface that wraps a {@link Runnable}
 * with an associated priority and no locking requirements.
 * <p>
 * This task is ideal for basic unit-of-work scheduling without inter-task dependencies.
 *
 * @author M4ximumpizza
 * @since 1.0.0
 */
public final class SimpleTask implements Task {

    private static final LockToken[] NO_LOCKS = new LockToken[0];

    private final Runnable wrapped;
    private final int priority;

    /**
     * Constructs a new SimpleTask.
     *
     * @param wrapped  the runnable to execute. Must not be {@code null}.
     * @param priority the priority of this task. Lower values typically indicate higher priority.
     */
    public SimpleTask(Runnable wrapped, int priority) {
        this.wrapped = Objects.requireNonNull(wrapped, "Runnable cannot be null");
        this.priority = priority;
    }

    /**
     * Executes the wrapped {@link Runnable}, ensuring the provided {@code releaseLocks}
     * action is called afterward, even if an exception is thrown.
     *
     * @param releaseLocks a runnable to release acquired locks; must always be invoked.
     */
    @Override
    public void run(Runnable releaseLocks) {
        try {
            wrapped.run();
        } finally {
            releaseLocks.run();
        }
    }

    /**
     * Handles exceptions thrown during task execution. This implementation logs the stack trace.
     *
     * @param t the exception thrown by {@link #run(Runnable)}
     */
    @Override
    public void propagateException(Throwable t) {
        t.printStackTrace(); // Can be enhanced with logging frameworks
    }

    /**
     * Returns an empty array as this task has no lock requirements.
     *
     * @return an empty {@code LockToken[]} array.
     */
    @Override
    public LockToken[] lockTokens() {
        return NO_LOCKS;
    }

    /**
     * Returns the priority of this task.
     *
     * @return the priority.
     */
    @Override
    public int priority() {
        return priority;
    }
}

