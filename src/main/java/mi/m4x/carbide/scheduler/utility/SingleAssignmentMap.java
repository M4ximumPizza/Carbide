package mi.m4x.carbide.scheduler.utility;

import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * A thread-safe map where each key can be assigned exactly once.
 * <p>
 * This is useful for cases where values are expensive to compute or should
 * not change after initial assignment, but multiple threads may read them concurrently.
 * </p>
 *
 * <h2>Features</h2>
 * <ul>
 *     <li>Each key can only be assigned once.</li>
 *     <li>Thread-safe concurrent reads and writes.</li>
 *     <li>Check if a key has been initialized.</li>
 * </ul>
 *
 * <h2>Example</h2>
 * <pre>{@code
 * SingleAssignmentMap<String, Integer> map = new SingleAssignmentMap<>();
 * map.set("answer", 42);
 * System.out.println(map.get("answer")); // 42
 * }</pre>
 *
 * @param <K> the key type
 * @param <V> the value type
 * @author M4ximumpizza
 * @since 1.0.4
 */
public class SingleAssignmentMap<K, V> {
    private final ConcurrentHashMap<K, V> map = new ConcurrentHashMap<>();

    /**
     * Sets the value for the given key if it has not already been initialized.
     *
     * @param key the key to assign
     * @param value the value to assign (must not be null)
     * @throws NullPointerException if key or value is null
     * @throws IllegalStateException if the key already has a value
     */
    public void set(K key, V value) {
        Objects.requireNonNull(key, "Key cannot be null");
        Objects.requireNonNull(value, "Value cannot be null");

        V existing = map.putIfAbsent(key, value);
        if (existing != null) {
            throw new IllegalStateException("Key '" + key + "' is already initialized");
        }
    }

    /**
     * Gets the value associated with the key.
     *
     * @param key the key to retrieve
     * @return the value
     * @throws NullPointerException if key is null
     * @throws IllegalStateException if the key has not been initialized
     */
    public V get(K key) {
        Objects.requireNonNull(key, "Key cannot be null");
        V value = map.get(key);
        if (value == null) {
            throw new IllegalStateException("Key '" + key + "' is not initialized");
        }
        return value;
    }

    /**
     * Returns whether the key has been initialized.
     *
     * @param key the key to check
     * @return true if the key has a value, false otherwise
     */
    public boolean isInitialized(K key) {
        Objects.requireNonNull(key, "Key cannot be null");
        return map.containsKey(key);
    }
}


