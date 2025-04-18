package mi.m4x.carbide.scheduler.structures;

import mi.m4x.carbide.scheduler.utility.Assertions;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * A high-performance, non-blocking object pool that recycles preallocated instances
 * to reduce GC pressure and allocation latency in performance-critical applications.
 *
 * - Fixed-size pool with thread-safe access.
 * - Optional post-release hook and custom initialization logic.
 * - Supports object overflow by allocating outside the pool when capacity is exceeded.
 * - No dependency on reflection or unsafe operations.
 *
 * Designed for hot code paths like networking, game engines, or real-time simulations
 * where allocation overhead is non-trivial.
 *
 * @author M4ximumpizza
 * @since 1.0.0
 */
public final class ObjectPool<T> {

    // Factory method to construct new instances for the pool
    private final Function<ObjectPool<T>, T> constructor;

    // Hook for resetting/initializing objects before reuse
    private final Consumer<T> initializer;

    // Hook for cleanup before object is returned to the pool
    private final Consumer<T> postRelease;

    // Maximum number of pooled objects
    private final int capacity;

    // Internal object buffer (statically sized, no resizing)
    private final Object[] buffer;

    // Tracks how many objects have been checked out from the pool
    private int count = 0;

    /**
     * Creates a new ObjectPool.
     *
     * @param constructor function to create new pooled objects
     * @param initializer function to prepare objects on allocation
     * @param postRelease function to clean up objects on release
     * @param capacity maximum number of objects to pool
     * @throws IllegalArgumentException if capacity <= 0
     * @throws NullPointerException if any function is null
     */
    public ObjectPool(Function<ObjectPool<T>, T> constructor,
                      Consumer<T> initializer,
                      Consumer<T> postRelease,
                      int capacity) {
        Assertions.assertTrue(capacity > 0, "ObjectPool capacity must be positive");
        this.constructor = Objects.requireNonNull(constructor);
        this.initializer = Objects.requireNonNull(initializer);
        this.postRelease = Objects.requireNonNull(postRelease);
        this.capacity = capacity;
        this.buffer = new Object[capacity];

        // Eagerly allocate all pooled objects to avoid lazy init race
        for (int i = 0; i < capacity; i++) {
            buffer[i] = constructor.apply(this);
        }
    }

    /**
     * Acquires an object from the pool. If the pool is exhausted,
     * a new object will be allocated via the constructor.
     *
     * @return an initialized object (never null)
     */
    public T alloc() {
        final T obj;
        synchronized (this) {
            if (count < capacity) {
                obj = (T) buffer[count];
                buffer[count++] = null;
            } else {
                // Allocate a fresh instance outside the pool (overflow)
                obj = constructor.apply(this);
                // Avoid initializing here to skip double init on overflow
                initializer.accept(obj);
                return obj;
            }
        }

        initializer.accept(obj);
        return obj;
    }

    /**
     * Returns an object to the pool. If the pool is full,
     * the object is discarded and may be GC'd.
     *
     * @param obj the object to return
     */
    public void release(T obj) {
        if (obj == null) return;

        postRelease.accept(obj);

        synchronized (this) {
            if (count > 0) {
                buffer[--count] = obj;
            }
            // If count == 0, pool is already full — silently drop
        }
    }
}

