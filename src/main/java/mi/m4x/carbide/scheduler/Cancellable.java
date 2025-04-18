package mi.m4x.carbide.scheduler;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * A lightweight, thread-safe cancellation token.
 *
 * Designed for concurrent systems where tasks may be cancelled asynchronously.
 * Backed by an AtomicBoolean to allow safe publication and visibility across threads.
 *
 * Use case: worker shutdown signals, async interruption, or cooperative task cancellation.
 * @author M4ximumpizza
 * @since 1.0.0
 */
public final class Cancellable {

    // Atomic flag representing the cancellation state
    private final AtomicBoolean cancelled = new AtomicBoolean(false);

    /**
     * Marks this task or operation as cancelled.
     *
     * This method is idempotent — calling it multiple times has no additional effect.
     * Thread-safe: visible across threads immediately due to volatile semantics of AtomicBoolean.
     */
    public void cancel() {
        cancelled.set(true);
    }

    /**
     * Checks if this task has been cancelled.
     *
     * @return true if cancelled, false otherwise
     * This read is non-blocking and thread-safe.
     *
     */
    public boolean isCancelled() {
        return cancelled.get();
    }
}

