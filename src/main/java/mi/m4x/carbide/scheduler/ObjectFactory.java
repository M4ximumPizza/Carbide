package mi.m4x.carbide.scheduler;

import java.util.Collections;
import java.util.Set;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Factory for creating high-performance concurrent data structures.
 *
 * @author M4ximumpizza
 * @since 1.0.0
 */
public interface ObjectFactory {

    /**
     * Creates a concurrent hash map.
     *
     * @param <K> the type of keys
     * @param <V> the type of values
     * @return a new concurrent hash map instance
     */
    <K, V> ConcurrentMap<K, V> createConcurrentHashMap();

    /**
     * Creates a concurrent set backed by a concurrent map.
     *
     * @param <E> the type of elements
     * @return a new concurrent set instance
     */
    <E> Set<E> createConcurrentSet();

    /**
     * Creates a multiple-producer, multiple-consumer (MPMC) queue.
     * Suitable for situations where many threads produce and consume.
     *
     * @param <E> the type of elements
     * @return a new MPMC queue instance
     */
    <E> Queue<E> newMPMCQueue();

    /**
     * Creates a multiple-producer, single-consumer (MPSC) queue.
     * Suitable when many threads produce and only one consumes.
     *
     * @param <E> the type of elements
     * @return a new MPSC queue instance
     */
    <E> Queue<E> newMPSCQueue();

    /**
     * Default implementation of ObjectFactory using standard Java concurrency utilities.
     */
    class DefaultObjectFactory implements ObjectFactory {

        @Override
        public <K, V> ConcurrentMap<K, V> createConcurrentHashMap() {
            return new ConcurrentHashMap<>();
        }

        @Override
        public <E> Set<E> createConcurrentSet() {
            // Backed by ConcurrentHashMap, standard high-performance set
            return Collections.newSetFromMap(new ConcurrentHashMap<>());
        }

        @Override
        public <E> Queue<E> newMPMCQueue() {
            // Java doesn't provide a true MPMC queue; fallback to CLQ
            return new ConcurrentLinkedQueue<>();
        }

        @Override
        public <E> Queue<E> newMPSCQueue() {
            // Java doesn't provide a true MPSC queue; fallback to CLQ
            return new ConcurrentLinkedQueue<>();
        }
    }
}
