package mi.m4x.rive;

/**
 * This class provides constants representing different code sizes.
 *
 * <p>It is not meant to be instantiated.</p>
 *
 * <p>Code sizes are represented as integers, with the following values:</p>
 * <ul>
 *     <li>UNKNOWN: The code size is unknown.</li>
 *     <li>CODE16: The code size is 16 bits.</li>
 *     <li>CODE32: The code size is 32 bits.</li>
 *     <li>CODE64: The code size is 64 bits.</li>
 * </ul>
 * <p>These constants can be used in various contexts where code size needs to be specified or checked.</p>
 *
 * @author M4ximumpizza
 * @since 1.0.2
 */
public class CodeSize {
    private CodeSize() {
        // Prevent instantiation
    }

    /**
     * The code size is unknown.
     */
    public static final int UNKNOWN;

    /**
     * The code size is 16 bits.
     */
    public static final int CODE16;
    /**
     * The code size is 32 bits.
     */
    public static final int CODE32;
    /**
     * The code size is 64 bits.
     */
    public static final int CODE64;

    static {
        int i = 0;
        UNKNOWN = i++;
        CODE16 = i++;
        CODE32 = i++;
        CODE64 = i++;
    }
}
