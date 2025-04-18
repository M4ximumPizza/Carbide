package mi.m4x.carbide.scheduler;

import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import it.unimi.dsi.fastutil.objects.ReferenceList;
import mi.m4x.carbide.scheduler.utility.Assertions;

import java.util.Objects;

/**
 * A reference counter with support for completion listeners.
 *
 * - Thread-safe and lightweight.
 * - Allows registering callbacks to run once the counter drops to zero.
 * - Supports both persistent listeners (via {@link #addListener}) and one-shot (via {@link #addListenerOnce}).
 *
 * Intended for dependency tracking, work-completion barriers, and async reference management.
 *
 * @author M4ximumpizza
 * @since 1.0.0
 */
public final class BusyReferenceCounter {

    // List of persistent listeners that are executed when counter reaches 0
    private final ReferenceList<Runnable> onComplete = new ReferenceArrayList<>();

    // A one-time listener, executed only once when refcount hits 0
    private Runnable onCompleteOnce = null;

    // Tracks the number of outstanding operations
    private int counter = 0;

    /**
     * Checks whether this counter is still "busy" (non-zero).
     * Thread-safe via synchronized access.
     *
     * @return true if the counter is non-zero
     */
    public synchronized boolean isBusy() {
        return counter != 0;
    }

    /**
     * Adds a listener that is triggered when the counter reaches 0.
     * If the counter is already 0, the listener is executed immediately.
     *
     * @param runnable the listener to execute
     */
    public void addListener(Runnable runnable) {
        Objects.requireNonNull(runnable);
        boolean runNow;
        synchronized (this) {
            if (counter == 0) {
                runNow = true;
            } else {
                onComplete.add(runnable);
                runNow = false;
            }
        }
        if (runNow) runnable.run();
    }

    /**
     * Adds a one-time listener to be run once when the counter hits 0.
     * Overrides any previously set one-shot listener.
     *
     * @param runnable the one-time listener
     */
    public void addListenerOnce(Runnable runnable) {
        Objects.requireNonNull(runnable);
        boolean runNow;
        synchronized (this) {
            if (counter == 0) {
                runNow = true;
            } else {
                onCompleteOnce = runnable;
                runNow = false;
            }
        }
        if (runNow) runnable.run();
    }

    /**
     * Increments the reference counter.
     * Thread-safe and allows nested or async tracking.
     */
    public synchronized void incrementRefCount() {
        counter++;
    }

    /**
     * Decrements the reference counter.
     * If the count reaches zero, all listeners (persistent and one-shot) are executed.
     *
     * Listeners are executed outside of synchronization for better performance and to avoid deadlocks.
     */
    public void decrementRefCount() {
        Runnable[] listeners = null;
        Runnable oneShot = null;

        synchronized (this) {
            Assertions.assertTrue(counter > 0, "Reference count underflow");
            if (--counter == 0) {
                // Collect listeners
                if (!onComplete.isEmpty()) {
                    listeners = onComplete.toArray(Runnable[]::new);
                    onComplete.clear();
                }
                oneShot = onCompleteOnce;
                onCompleteOnce = null;
            }
        }

        // Run listeners outside lock to reduce contention
        if (listeners != null) {
            for (Runnable r : listeners) {
                try {
                    r.run();
                } catch (Throwable t) {
                    t.printStackTrace(); // resilient error reporting
                }
            }
        }

        if (oneShot != null) {
            try {
                oneShot.run();
            } catch (Throwable t) {
                t.printStackTrace();
            }
        }
    }
}

