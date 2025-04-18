package mi.m4x.carbide.scheduler.utility;

/**
 * Utility class providing lightweight, runtime assertion methods
 * for validating conditions during development and debugging.
 *
 * Each assertion method throws an AssertionError and prints the stack trace
 * if the provided condition evaluates to false. This helps with immediate
 * visibility into unexpected states during execution.
 *
 * Intended for internal use in performance-critical or low-level code
 * where exceptions should carry meaningful context without external dependencies.
 *
 * @since 1.0.0
 * @author M4ximumpizza
 */
public final class Assertions {
    // Prevent instantiation of utility class
    private Assertions() {}

    /**
     * Asserts that the given condition is true.
     * Throws an AssertionError with the specified message if it is false.
     *
     * @param condition the condition to check
     * @param message the error message if the condition is false
     */
    public static void assertTrue(boolean condition, String message) {
        if (!condition) {
            throw createAndThrow(message);
        }
    }

    /**
     * Asserts that the given condition is true.
     * Throws an AssertionError with a formatted message if it is false.
     *
     * @param condition the condition to check
     * @param format the format string for the error message
     * @param args arguments referenced by the format specifiers
     */
    public static void assertTrue(boolean condition, String format, Object... args) {
        if (!condition) {
            throw createAndThrow(String.format(format, args));
        }
    }

    /**
     * Asserts that the given condition is true.
     * Throws a generic AssertionError if it is false.
     *
     * @param condition the condition to check
     */
    public static void assertTrue(boolean condition) {
        if (!condition) {
            throw createAndThrow(null);
        }
    }

    /**
     * Helper method to create and throw AssertionError, with stack trace printing.
     *
     * @param message optional message for the AssertionError
     * @return never returns, always throws
     */
    private static AssertionError createAndThrow(String message) {
        AssertionError error = (message != null) ? new AssertionError(message) : new AssertionError();
        error.printStackTrace(); // Print to stderr for debugging visibility
        return error;
    }
}

