package mi.m4x.carbide.natives.utility;

/**
 * CallConventionOverride is a utility class that allows the override
 * of a calling convention class used elsewhere in the program.
 * This is typically used for providing custom behavior during method invocation
 * or interop scenarios.
 *
 * This class cannot be instantiated.
 *
 * @author M4ximumpizza
 * @since 1.0.0
 */
public class CallConventionOverride {

    // Holds the reference to the overridden calling convention class
    private static Class<?> callConventionClass = null;

    // Private constructor to prevent instantiation
    private CallConventionOverride() {
    }

    /**
     * Sets a new class to override the default calling convention.
     *
     * @param cla the Class object representing the new calling convention
     */
    public static void setCallConventionOverride(Class<?> cla) {
        callConventionClass = cla;
    }

    /**
     * Retrieves the currently set calling convention override class.
     *
     * @return the Class object representing the override, or null if none is set
     */
    public static Class<?> getCallConventionOverride() {
        return callConventionClass;
    }
}
