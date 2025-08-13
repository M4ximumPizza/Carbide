package mi.m4x.carbide.scheduler.utility;

import java.util.Objects;

/**
 * A thread-safe container for single-assignment, deferred initialization.
 * <p>
 * The {@code Late} class allows a value to be initialized exactly once and accessed multiple times thereafter.
 * It is useful for scenarios where an expensive computation or initialization should be performed lazily,
 * but once done, the result remains constant and safely accessible by multiple threads.
 * </p>
 *
 * <h2>Features</h2>
 * <ul>
 *     <li>Single assignment via {@link #set(Object)} — cannot be overwritten once set.</li>
 *     <li>Optionally allow {@code null} values via {@link #setAllowNull(Object)}.</li>
 *     <li>Thread-safe reads and writes using synchronized methods.</li>
 *     <li>Check initialization state using {@link #isInitialized()}.</li>
 * </ul>
 *
 * <h2>Thread Safety</h2>
 * <p>
 * All operations are synchronized to ensure correct behavior in concurrent environments.
 * However, if {@code T} is mutable, callers must avoid mutating the value after initialization,
 * as such mutations are not inherently thread-safe. Immutable types are strongly recommended.
 * </p>
 *
 * <h2>Example</h2>
 * <pre>{@code
 * public final class Person {
 *     private final Late<Integer> age = new Late<>();
 *
 *     public void initializeAge(int initialAge) {
 *         age.set(initialAge);
 *     }
 *
 *     public void initializeNullableAge(Integer nullableAge) {
 *         age.setAllowNull(nullableAge);
 *     }
 *
 *     public Integer getAge() {
 *         return age.get();
 *     }
 * }
 *
 * public class Main {
 *     public static void main(String[] args) {
 *         Person person = new Person();
 *         person.initializeAge(42);
 *         System.out.println("Age: " + person.getAge()); // Age: 42
 *
 *         Late<String> optionalValue = new Late<>();
 *         optionalValue.setAllowNull(null);
 *         System.out.println(optionalValue.get()); // null
 *     }
 * }
 * }</pre>
 *
 * @param <T> the type of the value to be initialized late (reference type)
 * @author M4ximumpizza
 * @since 1.0.4
 */
public final class Late<T> {
    private T value;
    private boolean initialized;

    /**
     * Creates an uninitialized {@code Late} instance.
     */
    public Late() {
        // default state is uninitialized
    }

    /**
     * Sets the value if it has not already been initialized.
     *
     * @param value the value to assign (must not be {@code null})
     * @throws NullPointerException if {@code value} is {@code null}
     * @throws IllegalStateException if the value has already been set
     */
    public synchronized void set(T value) {
        Objects.requireNonNull(value, "Late value cannot be null");
        setInternal(value);
    }

    /**
     * Sets the value allowing {@code null} if it has not already been initialized.
     *
     * @param value the value to assign (can be {@code null})
     * @throws IllegalStateException if the value has already been set
     */
    public synchronized void setAllowNull(T value) {
        setInternal(value);
    }

    /**
     * Returns the initialized value.
     *
     * @return the stored value
     * @throws IllegalStateException if the value has not been initialized
     */
    public synchronized T get() {
        if (!initialized) {
            throw new IllegalStateException("Late value not initialized");
        }
        return value;
    }

    /**
     * Returns whether the value has been initialized.
     *
     * @return {@code true} if the value has been set, otherwise {@code false}
     */
    public synchronized boolean isInitialized() {
        return initialized;
    }

    /**
     * Internal helper to set the value once.
     *
     * @param value the value to assign
     * @throws IllegalStateException if already initialized
     */
    private void setInternal(T value) {
        if (initialized) {
            throw new IllegalStateException("Late value already initialized");
        }
        this.value = value;
        this.initialized = true;
    }
}
