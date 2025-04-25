package mi.m4x.rive;

import java.util.List;

/**
 * This class provides constants representing various memory sizes used in the Rive library.
 *
 * <p>Memory sizes are categorized into different types, including unsigned integers (UINT) and signed integers (INT),
 * with varying bit widths. The constants defined in this class are used to specify the size of memory
 * operands in instructions and data structures.</p>
 *
 * <p>Note: The size values are not directly related to the actual memory allocation but rather
 * indicate the size of the data type being represented.</p>
 *
 * @author M4ximumpizza
 * @since 1.0.2
 */
public final class MemorySize {
    private MemorySize() {
        // Prevent instantiation
    }

    /**
     * It's an unknown size or the instruction does not use any memory.
     */
    public static final int UNKNOWN = 0;
    /**
     * Unsigned integer types. This is 8 bits.
     */
    public static final int UINT8 = 1;
    /**
     * Unsigned integer types. This is 16 bits.
     */
    public static final int UINT16 = 2;

    /**
     * Unsigned integer types. This is 32 bits.
     */
    public static final int UINT32 = 3;

    /**
     * Unsigned integer types. This is 48 bits.
     */
    public static final int UINT52 = 4;

    /**
     * Unsigned integer types. This is 64 bits.
     */
    public static final int UINT64 = 5;

    /**
     * Unsigned integer types. This is 128 bits.
     */
    public static final int UINT128 = 6;

    /**
     * Unsigned integer types. This is 256 bits.
     */
    public static final int UINT256 = 7;

    /**
     * Unsigned integer types. This is 512 bits.
     */
    public static final int UINT512 = 8;

    /**
     * Signed integer types. This is 8 bits.
     */
    public static final int INT8 = 9;

    /**
     * Signed integer types. This is 16 bits.
     */
    public static final int INT16 = 10;

    /**
     * Signed integer types. This is 32 bits.
     */
    public static final int INT32 = 11;

    /**
     * Signed integer types. This is 64 bits.
     */
    public static final int INT64 = 12;

    /**
     * Signed integer types. This is 128 bits.
     */
    public static final int INT128 = 13;

    /**
     * Signed integer types. This is 256 bits.
     */
    public static final int INT256 = 14;

    /**
     * Signed integer types. This is 512 bits.
     */
    public static final int INT512 = 15;

    public static List<Integer> all() {
        // No register
        return List.of(
                UNKNOWN,
                UINT8,
                UINT16,
                UINT32,
                UINT52,
                UINT64,
                UINT128,
                UINT256,
                UINT512,
                INT8,
                INT16,
                INT32,
                INT64,
                INT128,
                INT256,
                INT512
        );
    }
}
