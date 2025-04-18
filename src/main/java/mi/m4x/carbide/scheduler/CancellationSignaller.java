package mi.m4x.carbide.scheduler;

import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import it.unimi.dsi.fastutil.objects.ReferenceList;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/**
 * Represents a signal that can be cancelled and completed with an optional error.
 *
 * - Supports cancellation propagation via a callback.
 * - Allows attaching listeners that run exactly once upon completion (success or failure).
 * - Thread-safe and optimized for low-latency and high-concurrency environments.
 */
public final class CancellationSignaller {

    /** A reusable, already-completed signaller instance. */
    public static final CancellationSignaller COMPLETED;

    static {
        final CancellationSignaller signaller = new CancellationSignaller(unused -> {});
        signaller.finished.set(null);
        signaller.cancelled.set(true);
        COMPLETED = signaller;
    }

    // Listeners to run when completion is fired
    private final ReferenceList<Consumer<Throwable>> onComplete = new ReferenceArrayList<>();

    // Cancellation handler callback
    private final Consumer<CancellationSignaller> cancel;

    // Cancellation state
    private final AtomicBoolean cancelled = new AtomicBoolean(false);

    // Completion result: null = not completed, non-null = completed with optional error
    private final AtomicReference<Throwable> finished = new AtomicReference<>(null);

    /**
     * Constructs a new signaller with a cancellation callback.
     *
     * @param cancel Callback to run when {@link #cancel()} is called.
     */
    public CancellationSignaller(Consumer<CancellationSignaller> cancel) {
        this.cancel = Objects.requireNonNull(cancel);
    }

    /**
     * Completes the signaller. This will trigger all registered listeners exactly once.
     *
     * @param throwable Optional failure cause; can be null to indicate success.
     */
    public void fireComplete(Throwable throwable) {
        // Only allow a single thread to complete
        if (finished.compareAndSet(null, throwable)) {
            Consumer[] listeners;
            synchronized (this) {
                listeners = onComplete.toArray(Consumer[]::new);
                onComplete.clear();
            }

            for (Consumer listener : listeners) {
                try {
                    listener.accept(throwable);
                } catch (Throwable t) {
                    t.printStackTrace();
                }
            }
        }
    }

    /**
     * Registers a listener to be run when the signaller completes.
     * If already completed, the listener is executed immediately.
     *
     * @param callback The listener accepting an optional failure cause.
     */
    public void addListener(Consumer<Throwable> callback) {
        Objects.requireNonNull(callback);
        Throwable result = finished.get();
        if (result != null) {
            callback.accept(result);
            return;
        }

        synchronized (this) {
            result = finished.get();
            if (result != null) {
                callback.accept(result);
            } else {
                onComplete.add(callback);
            }
        }
    }

    /**
     * Cancels this signal if it hasn’t already been cancelled.
     * Runs the cancellation callback once.
     */
    public void cancel() {
        if (cancelled.compareAndSet(false, true)) {
            cancel.accept(this);
        }
    }
}
