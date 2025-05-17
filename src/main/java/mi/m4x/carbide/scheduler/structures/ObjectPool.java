package mi.m4x.carbide.scheduler.structures;

import mi.m4x.carbide.scheduler.utility.Assertions;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * A high-performance, fixed-size object pool that recycles instances to minimize GC overhead.
 * Supports overflow instantiation beyond capacity, optional initialization and cleanup hooks,
 * and is safe for multi-threaded use.
 *
 * @param <T> the type of object managed by this pool
 * @since 1.0.0
 * @author M4ximumpizza
 */
public final class ObjectPool<T> {

    private final Function<ObjectPool<T>, T> constructor;
    private final Consumer<T> initializer;
    private final Consumer<T> postRelease;
    private final int capacity;
    private final Object[] buffer;

    // The number of objects currently checked out (also serves as index for the next free slot)
    private int count;

    /**
     * Constructs a new ObjectPool.
     *
     * @param constructor function to create new objects
     * @param initializer function to initialize objects before use
     * @param postRelease function to clean up objects before reuse
     * @param capacity maximum number of pooled objects
     */
    public ObjectPool(Function<ObjectPool<T>, T> constructor,
                      Consumer<T> initializer,
                      Consumer<T> postRelease,
                      int capacity) {

        Assertions.assertTrue(capacity > 0, "ObjectPool capacity must be positive");
        this.constructor = Objects.requireNonNull(constructor, "Constructor must not be null");
        this.initializer = Objects.requireNonNull(initializer, "Initializer must not be null");
        this.postRelease = Objects.requireNonNull(postRelease, "PostRelease must not be null");
        this.capacity = capacity;
        this.buffer = new Object[capacity];

        // Pre-fill the pool to avoid on-demand creation
        for (int i = 0; i < capacity; i++) {
            buffer[i] = constructor.apply(this);
        }

        this.count = capacity;
    }

    /**
     * Allocates an object from the pool, or creates a new one if exhausted.
     *
     * @return an initialized object, never null
     */
    public T alloc() {
        final T obj;

        synchronized (this) {
            if (count > 0) {
                obj = getFromPool();
            } else {
                // Overflow: create a new instance on demand
                obj = constructor.apply(this);
                initializer.accept(obj);
                return obj;
            }
        }

        initializer.accept(obj);
        return obj;
    }

    /**
     * Releases an object back into the pool. If full, the object is discarded.
     *
     * @param obj the object to release
     */
    public void release(T obj) {
        if (obj == null) return;

        postRelease.accept(obj);

        synchronized (this) {
            if (count < capacity) {
                buffer[count++] = obj;
            }
            // Else: silently drop the object
        }
    }

    /**
     * Internal helper for retrieving an object from the pool.
     *
     * @since 1.0.3
     */
    @SuppressWarnings("unchecked")
    private T getFromPool() {
        return (T) buffer[--count];
    }
}
