package mi.m4x.rive;

import mi.m4x.carbide.interfaces.Beta;
import mi.m4x.rive.constants.Constants;

import java.util.List;

/**
 * This class provides constants and methods for handling different memory sizes.
 * It includes methods to retrieve information about memory sizes, such as their
 * element size, type, and whether they are broadcast or packed types.
 *
 * This class is not intended to be instantiated directly.
 *
 * @since 1.0.2
 * @author M4ximumpizza
 */
@Beta
public final class MemorySize {
    private MemorySize() {
        // Prevent instantiation
    }

    /**
     * Returns the {@link MemorySizeInformation} for a given memory size.
     * @param memorySize The memory size constant (e.g., UINT8, UINT16, etc.).
     * @return The corresponding {@link MemorySizeInformation} object.
     */
    public static MemorySizeInformation getInformation(int memorySize) {
        MemorySizeInformation[] informations = MemorySizeInformation.informations;
        return informations[memorySize];
    }

    /**
     * Returns the size of the element in bytes for a given memory size.
     * @param memorySize The memory size constant (e.g., UINT8, UINT16, etc.).
     * @return The size of the element in bytes.
     */
    public static int getElementSize(int memorySize) {
        return MemorySize.getInformation(memorySize).getElementSize();
    }

    /**
     * Returns the type of the element for a given memory size.
     */
    public static int getElementType(int memorySize) {
        return MemorySize.getInformation(memorySize).getElementType();
    }

    /**
     * Returns the {@link MemorySizeInformation} for a given memory size.
     * @param memorySize The memory size constant (e.g., UINT8, UINT16, etc.).
     * @return The corresponding {@link MemorySizeInformation} object.
     */
    public static MemorySizeInformation getElementTypeInformation(int memorySize) {
        return MemorySize.getInformation(MemorySize.getInformation(memorySize).getElementType());
    }

    /**
     * Checks if the given memory size is a broadcast type.
     * @param memorySize The memory size constant (e.g., UINT8, UINT16, etc.).
     * @return true if the memory size is a broadcast type, false otherwise.
     */
    public static boolean isBroadcast(int memorySize) {
        return Integer.compareUnsigned(memorySize, Constants.FIRST_BROADCAST_MEMORY_SIZE) >= 0;
    }

    /**
     * Checks if the given memory size is a packed type.
     * @param memorySize The memory size constant (e.g., UINT8, UINT16, etc.).
     * @return true if the memory size is a packed type, false otherwise.
     */
    public static boolean isPacked(int memorySize) {
        return MemorySize.getInformation(memorySize).isPacked();
    }

    /**
     * Returns the number of elements in a given memory size.
     * @param memorySize The memory size constant (e.g., UINT8, UINT16, etc.).
     * @return The number of elements in the memory size.
     */
    public static int getElementCount(int memorySize) {
        return MemorySize.getInformation(memorySize).getElementCount();
    }

    /**
     * Returns the size of the memory size in bytes.
     * @param memorySize The memory size constant (e.g., UINT8, UINT16, etc.).
     * @return The size of the memory size in bytes.
     */
    public static int getSize(int memorySize) {
        return MemorySize.getInformation(memorySize).getSize();
    }

    /**
     * Constant representing an unknown integer type.
     */
    public static final int UNKNOWN;

    /**
     * Constant representing an unsigned 8-bit integer (0 to 255).
     */
    public static final int UINT8;

    /**
     * Constant representing an unsigned 16-bit integer (0 to 65535).
     */
    public static final int UINT16;

    /**
     * Constant representing an unsigned 32-bit integer (0 to 4294967295).
     */
    public static final int UINT32;

    /**
     * Constant representing an unsigned 52-bit integer.
     */
    public static final int UINT52;

    /**
     * Constant representing an unsigned 64-bit integer (0 to 18446744073709551615).
     */
    public static final int UINT64;

    /**
     * Constant representing an unsigned 128-bit integer.
     */
    public static final int UINT128;

    /**
     * Constant representing an unsigned 256-bit integer.
     */
    public static final int UINT256;

    /**
     * Constant representing an unsigned 512-bit integer.
     */
    public static final int UINT512;

    /**
     * Constant representing a signed 8-bit integer (-128 to 127).
     */
    public static final int INT8;

    /**
     * Constant representing a signed 16-bit integer (-32768 to 32767).
     */
    public static final int INT16;

    /**
     * Constant representing a signed 32-bit integer (-2147483648 to 2147483647).
     */
    public static final int INT32;

    /**
     * Constant representing a signed 64-bit integer.
     */
    public static final int INT64;

    /**
     * Constant representing a signed 128-bit integer.
     */
    public static final int INT128;

    /**
     * Constant representing a signed 256-bit integer.
     */
    public static final int INT256;

    /**
     * Constant representing a signed 512-bit integer.
     */
    public static final int INT512;

    /**
     * Memory location contains a seg:ptr pair, where the offset is a 16-bit unsigned short
     * and the segment/selector is a 16-bit unsigned short.
     * This represents a 16-bit pointer to a memory location with a segment and an offset.
     */
    public static final int SEG_PTR16;

    /**
     * Memory location contains a seg:ptr pair, where the offset is a 32-bit unsigned integer
     * and the segment/selector is a 16-bit unsigned short.
     * This represents a 32-bit pointer to a memory location with a segment and an offset.
     */
    public static final int SEG_PTR32;

    /**
     * Memory location contains a seg:ptr pair, where the offset is a 64-bit unsigned long
     * and the segment/selector is a 16-bit unsigned short.
     * This represents a 64-bit pointer to a memory location with a segment and an offset.
     */
    public static final int SEG_PTR64;

    /**
     * Memory location contains a 16-bit offset, typically used in jump or call instructions
     * that target a memory location.
     */
    public static final int WORD_OFFSET;

    /**
     * Memory location contains a 32-bit offset, typically used in jump or call instructions
     * that target a memory location.
     */
    public static final int DWORD_OFFSET;

    /**
     * Memory location contains a 64-bit offset, typically used in jump or call instructions
     * that target a memory location.
     */
    public static final int QWORD_OFFSET;

    /**
     * Memory location contains two 16-bit unsigned shorts, typically used in the 16-bit BOUND instruction.
     * The BOUND instruction compares a value against a range specified by two bounds.
     */
    public static final int BOUND16_WORD_WORD;

    /**
     * Memory location contains two 32-bit unsigned integers, typically used in the 32-bit BOUND instruction.
     * The BOUND instruction compares a value against a range specified by two bounds.
     */
    public static final int BOUND32_DWORD_DWORD;

    /**
     * Memory location contains two 32-bit unsigned integers, used in the 32-bit BNDMOV instruction.
     * The BNDMOV instruction is used for moving a bound register or value.
     */
    public static final int BND32;

    /**
     * Memory location contains two 64-bit unsigned long integers, used in the 64-bit BNDMOV instruction.
     * The BNDMOV instruction is used for moving a bound register or value in a 64-bit context.
     */
    public static final int BND64;

    /**
     * FWORD6: 6-byte far pointer. Contains a 16-bit limit and a 32-bit base address (used by instructions like {@code LGDTW} and {@code LGDTD}).
     */
    public static final int FWORD6;

    /**
     * FWORD10: 10-byte far pointer. Contains a 16-bit limit and a 64-bit base address (used by instructions like {@code LGDTQ}).
     */
    public static final int FWORD10;

    /**
     * FLOAT16: 16-bit floating-point value. Represents half-precision floating-point data.
     */
    public static final int FLOAT16;

    /**
     * FLOAT32: 32-bit floating-point value. Represents single-precision floating-point data.
     */
    public static final int FLOAT32;

    /**
     * FLOAT64: 64-bit floating-point value. Represents double-precision floating-point data.
     */
    public static final int FLOAT64;

    /**
     * FLOAT80: 80-bit floating-point value. Represents extended-precision floating-point data (x87 format).
     */
    public static final int FLOAT80;

    /**
     * FLOAT128: 128-bit floating-point value. Represents quadruple-precision floating-point data.
     */
    public static final int FLOAT128;

    /**
     * BFLOAT16: 16-bit brain floating-point value. Used for reduced-precision machine learning data.
     */
    public static final int BFLOAT16;

    /**
     * FPU_ENV14: 14-byte FPU environment. Used by 16-bit {@code FLDENV}/{@code FSTENV} instructions to load/save FPU state.
     */
    public static final int FPU_ENV14;

    /**
     * FPU_ENV28: 28-byte FPU environment. Used by 32-bit and 64-bit {@code FLDENV}/{@code FSTENV} instructions to load/save FPU state.
     */
    public static final int FPU_ENV28;

    /**
     * FPU_STATE94: 94-byte FPU state. Used by 16-bit {@code FSAVE}/{@code FRSTOR} instructions to save/restore full FPU state.
     */
    public static final int FPU_STATE94;

    /**
     * FPU_STATE108: 108-byte FPU state. Used by 32-bit and 64-bit {@code FSAVE}/{@code FRSTOR} instructions to save/restore full FPU state.
     */
    public static final int FPU_STATE108;

    /**
     * FXSAVE_512BYTE: 512-byte FPU/MMX/SSE save area. Used by {@code FXSAVE} and {@code FXRSTOR} instructions (32-bit mode).
     */
    public static final int FXSAVE_512BYTE;

    /**
     * FXSAVE64_512BYTE: 512-byte FPU/MMX/SSE save area. Used by {@code FXSAVE64} and {@code FXRSTOR64} instructions (64-bit mode).
     */
    public static final int FXSAVE64_512BYTE;

    /**
     * XSAVE: 32-bit XSAVE area. Used for saving extended processor states (e.g., AVX, MPX) in 32-bit mode.
     */
    public static final int XSAVE;

    /**
     * XSAVE64: 64-bit XSAVE area. Used for saving extended processor states (e.g., AVX, MPX) in 64-bit mode.
     */
    public static final int XSAVE64;

    /**
     * BCD: 10-byte packed BCD value. Used by {@code FBLD} (load) and {@code FBSTP} (store and pop) instructions.
     */
    public static final int BCD;

    /**
     * TILECFG: 64-byte tile configuration structure. Used by {@code LDTILECFG} and {@code STTILECFG} instructions (AMX extensions).
     */
    public static final int TILECFG;

    /**
     * TILE: Tile data block. Used by AMX instructions for matrix-oriented operations.
     */
    public static final int TILE;

    /**
     * SEGMENT_DESC_SELECTOR: 80-bit segment descriptor and selector. Bytes 0–7 are the descriptor, bytes 8–9 are the selector.
     */
    public static final int SEGMENT_DESC_SELECTOR;

    /**
     * KLHANDLE_AES128: 384-bit AES-128 key handle. Used by Key Locker for protected key management.
     */
    public static final int KLHANDLE_AES128;

    /**
     * KLHANDLE_AES256: 512-bit AES-256 key handle. Used by Key Locker for protected key management.
     */
    public static final int KLHANDLE_AES256;

    /**
     * PACKED16_UINT8: 16-bit value containing 2 x unsigned 8-bit integers.
     */
    public static final int PACKED16_UINT8;

    /**
     * PACKED16_INT8: 16-bit value containing 2 x signed 8-bit integers.
     */
    public static final int PACKED16_INT8;

    /**
     * PACKED32_UINT8: 32-bit value containing 4 x unsigned 8-bit integers.
     */
    public static final int PACKED32_UINT8;

    /**
     * PACKED32_INT8: 32-bit value containing 4 x signed 8-bit integers.
     */
    public static final int PACKED32_INT8;

    /**
     * PACKED32_UINT16: 32-bit value containing 2 x unsigned 16-bit integers.
     */
    public static final int PACKED32_UINT16;

    /**
     * PACKED32_INT16: 32-bit value containing 2 x signed 16-bit integers.
     */
    public static final int PACKED32_INT16;

    /**
     * PACKED32_FLOAT16: 32-bit value containing 2 x 16-bit floating-point numbers.
     */
    public static final int PACKED32_FLOAT16;

    /**
     * PACKED32_BFLOAT16: 32-bit value containing 2 x 16-bit brain floating-point numbers.
     */
    public static final int PACKED32_BFLOAT16;

    /**
     * PACKED64_UINT8: 64-bit value containing 8 x unsigned 8-bit integers.
     */
    public static final int PACKED64_UINT8;

    /**
     * PACKED64_INT8: 64-bit value containing 8 x signed 8-bit integers.
     */
    public static final int PACKED64_INT8;

    /**
     * PACKED64_UINT16: 64-bit value containing 4 x unsigned 16-bit integers.
     */
    public static final int PACKED64_UINT16;

    /**
     * PACKED64_INT16: 64-bit value containing 4 x signed 16-bit integers.
     */
    public static final int PACKED64_INT16;

    /**
     * PACKED64_UINT32: 64-bit value containing 2 x unsigned 32-bit integers.
     */
    public static final int PACKED64_UINT32;

    /**
     * PACKED64_INT32: 64-bit value containing 2 x signed 32-bit integers.
     */
    public static final int PACKED64_INT32;

    /**
     * PACKED64_FLOAT16: 64-bit value containing 4 x 16-bit floating-point numbers.
     */
    public static final int PACKED64_FLOAT16;

    /**
     * PACKED64_FLOAT32: 64-bit value containing 2 x 32-bit floating-point numbers.
     */
    public static final int PACKED64_FLOAT32;

    /**
     * PACKED128_UINT8: 128-bit value containing 16 x unsigned 8-bit integers.
     */
    public static final int PACKED128_UINT8;

    /**
     * PACKED128_INT8: 128-bit value containing 16 x signed 8-bit integers.
     */
    public static final int PACKED128_INT8;

    /**
     * PACKED128_UINT16: 128-bit value containing 8 x unsigned 16-bit integers.
     */
    public static final int PACKED128_UINT16;

    /**
     * PACKED128_INT16: 128-bit value containing 8 x signed 16-bit integers.
     */
    public static final int PACKED128_INT16;

    /**
     * PACKED128_UINT32: 128-bit value containing 4 x unsigned 32-bit integers.
     */
    public static final int PACKED128_UINT32;

    /**
     * PACKED128_INT32: 128-bit value containing 4 x signed 32-bit integers.
     */
    public static final int PACKED128_INT32;

    /**
     * PACKED128_UINT52: 128-bit value containing 2 x unsigned 52-bit integers.
     */
    public static final int PACKED128_UINT52;

    /**
     * PACKED128_UINT64: 128-bit value containing 2 x unsigned 64-bit integers.
     */
    public static final int PACKED128_UINT64;

    /**
     * PACKED128_INT64: 128-bit value containing 2 x signed 64-bit integers.
     */
    public static final int PACKED128_INT64;

    /**
     * PACKED128_FLOAT16: 128-bit value containing 8 x 16-bit floating-point numbers.
     */
    public static final int PACKED128_FLOAT16;

    /**
     * PACKED128_FLOAT32: 128-bit value containing 4 x 32-bit floating-point numbers.
     */
    public static final int PACKED128_FLOAT32;

    /**
     * PACKED128_FLOAT64: 128-bit value containing 2 x 64-bit floating-point numbers.
     */
    public static final int PACKED128_FLOAT64;

    /**
     * PACKED128_BFLOAT16: 128-bit value containing 8 x 16-bit brain floating-point numbers.
     */
    public static final int PACKED128_BFLOAT16;

    /**
     * PACKED128_2X_FLOAT16: 128-bit value containing 4 x pairs of 16-bit floating-point numbers.
     */
    public static final int PACKED128_2X_FLOAT16;

    /**
     * PACKED128_2X_BFLOAT16: 128-bit value containing 4 x pairs of 16-bit brain floating-point numbers.
     */
    public static final int PACKED128_2X_BFLOAT16;

    /**
     * PACKED256_UINT8: 256-bit value containing 32 x unsigned 8-bit integers.
     */
    public static final int PACKED256_UINT8;

    /**
     * PACKED256_INT8: 256-bit value containing 32 x signed 8-bit integers.
     */
    public static final int PACKED256_INT8;

    /**
     * PACKED256_UINT16: 256-bit value containing 16 x unsigned 16-bit integers.
     */
    public static final int PACKED256_UINT16;

    /**
     * PACKED256_INT16: 256-bit value containing 16 x signed 16-bit integers.
     */
    public static final int PACKED256_INT16;

    /**
     * PACKED256_UINT32: 256-bit value containing 8 x unsigned 32-bit integers.
     */
    public static final int PACKED256_UINT32;

    /**
     * PACKED256_INT32: 256-bit value containing 8 x signed 32-bit integers.
     */
    public static final int PACKED256_INT32;

    /**
     * PACKED256_UINT52: 256-bit value containing 4 x unsigned 52-bit integers.
     */
    public static final int PACKED256_UINT52;

    /**
     * PACKED256_UINT64: 256-bit value containing 4 x unsigned 64-bit integers.
     */
    public static final int PACKED256_UINT64;

    /**
     * PACKED256_INT64: 256-bit value containing 4 x signed 64-bit integers.
     */
    public static final int PACKED256_INT64;

    /**
     * PACKED256_UINT128: 256-bit value containing 2 x unsigned 128-bit integers.
     */
    public static final int PACKED256_UINT128;

    /**
     * PACKED256_INT128: 256-bit value containing 2 x signed 128-bit integers.
     */
    public static final int PACKED256_INT128;

    /**
     * PACKED256_FLOAT16: 256-bit value containing 16 x 16-bit floating-point numbers.
     */
    public static final int PACKED256_FLOAT16;

    /**
     * PACKED256_FLOAT32: 256-bit value containing 8 x 32-bit floating-point numbers.
     */
    public static final int PACKED256_FLOAT32;

    /**
     * PACKED256_FLOAT64: 256-bit value containing 4 x 64-bit floating-point numbers.
     */
    public static final int PACKED256_FLOAT64;

    /**
     * PACKED256_FLOAT128: 256-bit value containing 2 x 128-bit floating-point numbers.
     */
    public static final int PACKED256_FLOAT128;

    /**
     * PACKED256_BFLOAT16: 256-bit value containing 16 x 16-bit brain floating-point numbers.
     */
    public static final int PACKED256_BFLOAT16;

    /**
     * PACKED256_2X_FLOAT16: 256-bit value containing 8 x pairs of 16-bit floating-point numbers.
     */
    public static final int PACKED256_2X_FLOAT16;

    /**
     * PACKED256_2X_BFLOAT16: 256-bit value containing 8 x pairs of 16-bit brain floating-point numbers.
     */
    public static final int PACKED256_2X_BFLOAT16;

    /**
     * PACKED512_UINT8: 512-bit value containing 64 x unsigned 8-bit integers.
     */
    public static final int PACKED512_UINT8;

    /**
     * PACKED512_INT8: 512-bit value containing 64 x signed 8-bit integers.
     */
    public static final int PACKED512_INT8;

    /**
     * PACKED512_UINT16: 512-bit value containing 32 x unsigned 16-bit integers.
     */
    public static final int PACKED512_UINT16;

    /**
     * PACKED512_INT16: 512-bit value containing 32 x signed 16-bit integers.
     */
    public static final int PACKED512_INT16;

    /**
     * PACKED512_UINT32: 512-bit value containing 16 x unsigned 32-bit integers.
     */
    public static final int PACKED512_UINT32;

    /**
     * PACKED512_INT32: 512-bit value containing 16 x signed 32-bit integers.
     */
    public static final int PACKED512_INT32;

    /**
     * PACKED512_UINT52: 512-bit value containing 8 x unsigned 52-bit integers.
     */
    public static final int PACKED512_UINT52;

    /**
     * PACKED512_UINT64: 512-bit value containing 8 x unsigned 64-bit integers.
     */
    public static final int PACKED512_UINT64;

    /**
     * PACKED512_INT64: 512-bit value containing 8 x signed 64-bit integers.
     */
    public static final int PACKED512_INT64;

    /**
     * PACKED512_UINT128: 512-bit value containing 4 x unsigned 128-bit integers.
     */
    public static final int PACKED512_UINT128;

    /**
     * PACKED512_FLOAT16: 512-bit value containing 32 x 16-bit floating-point numbers.
     */
    public static final int PACKED512_FLOAT16;

    /**
     * PACKED512_FLOAT32: 512-bit value containing 16 x 32-bit floating-point numbers.
     */
    public static final int PACKED512_FLOAT32;

    /**
     * PACKED512_FLOAT64: 512-bit value containing 8 x 64-bit floating-point numbers.
     */
    public static final int PACKED512_FLOAT64;

    /**
     * PACKED512_2X_FLOAT16: 512-bit value containing 16 x pairs of 16-bit floating-point numbers.
     */
    public static final int PACKED512_2X_FLOAT16;

    /**
     * PACKED512_2X_BFLOAT16: 512-bit value containing 16 x pairs of 16-bit brain floating-point numbers.
     */
    public static final int PACKED512_2X_BFLOAT16;

    /**
     * BROADCAST32_FLOAT16: Broadcast a 16-bit floating-point value to 32 bits.
     */
    public static final int BROADCAST32_FLOAT16;

    /**
     * BROADCAST64_UINT32: Broadcast an unsigned 32-bit integer to 64 bits.
     */
    public static final int BROADCAST64_UINT32;

    /**
     * BROADCAST64_INT32: Broadcast a signed 32-bit integer to 64 bits.
     */
    public static final int BROADCAST64_INT32;

    /**
     * BROADCAST64_FLOAT16: Broadcast a 16-bit floating-point value to 64 bits.
     */
    public static final int BROADCAST64_FLOAT16;

    /**
     * BROADCAST64_FLOAT32: Broadcast a 32-bit floating-point value to 64 bits.
     */
    public static final int BROADCAST64_FLOAT32;

    /**
     * BROADCAST128_INT16: Broadcast a signed 16-bit integer to 128 bits.
     */
    public static final int BROADCAST128_INT16;

    /**
     * BROADCAST128_UINT16: Broadcast an unsigned 16-bit integer to 128 bits.
     */
    public static final int BROADCAST128_UINT16;

    /**
     * BROADCAST128_UINT32: Broadcast an unsigned 32-bit integer to 128 bits.
     */
    public static final int BROADCAST128_UINT32;

    /**
     * BROADCAST128_INT32: Broadcast a signed 32-bit integer to 128 bits.
     */
    public static final int BROADCAST128_INT32;

    /**
     * BROADCAST128_UINT52: Broadcast an unsigned 52-bit integer to 128 bits.
     */
    public static final int BROADCAST128_UINT52;

    /**
     * BROADCAST128_UINT64: Broadcast an unsigned 64-bit integer to 128 bits.
     */
    public static final int BROADCAST128_UINT64;

    /**
     * BROADCAST128_INT64: Broadcast a signed 64-bit integer to 128 bits.
     */
    public static final int BROADCAST128_INT64;

    /**
     * BROADCAST128_FLOAT16: Broadcast a 16-bit floating-point value to 128 bits.
     */
    public static final int BROADCAST128_FLOAT16;

    /**
     * BROADCAST128_FLOAT32: Broadcast a 32-bit floating-point value to 128 bits.
     */
    public static final int BROADCAST128_FLOAT32;

    /**
     * BROADCAST128_FLOAT64: Broadcast a 64-bit floating-point value to 128 bits.
     */
    public static final int BROADCAST128_FLOAT64;

    /**
     * BROADCAST128_2X_INT16: Broadcast two 16-bit signed integers to 128 bits.
     */
    public static final int BROADCAST128_2X_INT16;

    /**
     * BROADCAST128_2X_INT32: Broadcast two 32-bit signed integers to 128 bits.
     */
    public static final int BROADCAST128_2X_INT32;

    /**
     * BROADCAST128_2X_UINT32: Broadcast two 32-bit unsigned integers to 128 bits.
     */
    public static final int BROADCAST128_2X_UINT32;

    /**
     * BROADCAST128_2X_FLOAT16: Broadcast two 16-bit floating-point values to 128 bits.
     */
    public static final int BROADCAST128_2X_FLOAT16;

    /**
     * BROADCAST128_2X_BFLOAT16: Broadcast two 16-bit brain floating-point values to 128 bits.
     */
    public static final int BROADCAST128_2X_BFLOAT16;

    /**
     * BROADCAST256_INT16: Broadcast a 16-bit signed integer to 256 bits.
     */
    public static final int BROADCAST256_INT16;

    /**
     * BROADCAST256_UINT16: Broadcast a 16-bit unsigned integer to 256 bits.
     */
    public static final int BROADCAST256_UINT16;

    /**
     * BROADCAST256_UINT32: Broadcast a 32-bit unsigned integer to 256 bits.
     */
    public static final int BROADCAST256_UINT32;

    /**
     * BROADCAST256_INT32: Broadcast a 32-bit signed integer to 256 bits.
     */
    public static final int BROADCAST256_INT32;

    /**
     * BROADCAST256_UINT52: Broadcast a 52-bit unsigned integer to 256 bits.
     */
    public static final int BROADCAST256_UINT52;

    /**
     * BROADCAST256_UINT64: Broadcast a 64-bit unsigned integer to 256 bits.
     */
    public static final int BROADCAST256_UINT64;

    /**
     * BROADCAST256_INT64: Broadcast a 64-bit signed integer to 256 bits.
     */
    public static final int BROADCAST256_INT64;

    /**
     * BROADCAST256_FLOAT16: Broadcast a 16-bit floating-point value to 256 bits.
     */
    public static final int BROADCAST256_FLOAT16;

    /**
     * BROADCAST256_FLOAT32: Broadcast a 32-bit floating-point value to 256 bits.
     */
    public static final int BROADCAST256_FLOAT32;

    /**
     * BROADCAST256_FLOAT64: Broadcast a 64-bit floating-point value to 256 bits.
     */
    public static final int BROADCAST256_FLOAT64;

    /**
     * BROADCAST256_2X_INT16: Broadcast two 16-bit signed integers to 256 bits.
     */
    public static final int BROADCAST256_2X_INT16;

    /**
     * BROADCAST256_2X_INT32: Broadcast two 32-bit signed integers to 256 bits.
     */
    public static final int BROADCAST256_2X_INT32;

    /**
     * BROADCAST256_2X_UINT32: Broadcast two 32-bit unsigned integers to 256 bits.
     */
    public static final int BROADCAST256_2X_UINT32;

    /**
     * BROADCAST256_2X_FLOAT16: Broadcast two 16-bit floating-point values to 256 bits.
     */
    public static final int BROADCAST256_2X_FLOAT16;

    /**
     * BROADCAST256_2X_BFLOAT16: Broadcast two 16-bit brain floating-point values to 256 bits.
     */
    public static final int BROADCAST256_2X_BFLOAT16;

    /**
     * BROADCAST512_INT16: Broadcast a 16-bit signed integer to 512 bits.
     */
    public static final int BROADCAST512_INT16;

    /**
     * BROADCAST512_UINT16: Broadcast a 16-bit unsigned integer to 512 bits.
     */
    public static final int BROADCAST512_UINT16;

    /**
     * BROADCAST512_UINT32: Broadcast a 32-bit unsigned integer to 512 bits.
     */
    public static final int BROADCAST512_UINT32;

    /**
     * BROADCAST512_INT32: Broadcast a 32-bit signed integer to 512 bits.
     */
    public static final int BROADCAST512_INT32;

    /**
     * BROADCAST512_UINT52: Broadcast a 52-bit unsigned integer to 512 bits.
     */
    public static final int BROADCAST512_UINT52;

    /**
     * BROADCAST512_UINT64: Broadcast a 64-bit unsigned integer to 512 bits.
     */
    public static final int BROADCAST512_UINT64;

    /**
     * BROADCAST512_INT64: Broadcast a 64-bit signed integer to 512 bits.
     */
    public static final int BROADCAST512_INT64;

    /**
     * BROADCAST512_FLOAT16: Broadcast a 16-bit floating-point value to 512 bits.
     */
    public static final int BROADCAST512_FLOAT16;

    /**
     * BROADCAST512_FLOAT32: Broadcast a 32-bit floating-point value to 512 bits.
     */
    public static final int BROADCAST512_FLOAT32;

    /**
     * BROADCAST512_FLOAT64: Broadcast a 64-bit floating-point value to 512 bits.
     */
    public static final int BROADCAST512_FLOAT64;

    /**
     * BROADCAST512_2X_FLOAT16: Broadcast two 16-bit floating-point values to 512 bits.
     */
    public static final int BROADCAST512_2X_FLOAT16;

    /**
     * BROADCAST512_2X_INT16: Broadcast two 16-bit signed integers to 512 bits.
     */
    public static final int BROADCAST512_2X_INT16;

    /**
     * BROADCAST512_2X_UINT32: Broadcast two 32-bit unsigned integers to 512 bits.
     */
    public static final int BROADCAST512_2X_UINT32;

    /**
     * BROADCAST512_2X_INT32: Broadcast two 32-bit signed integers to 512 bits.
     */
    public static final int BROADCAST512_2X_INT32;

    /**
     * BROADCAST512_2X_BFLOAT16: Broadcast two 16-bit brain floating-point values to 512 bits.
     */
    public static final int BROADCAST512_2X_BFLOAT16;

    static {
        int i = 0;

        // Unknown
        UNKNOWN = i++;

        // Unsigned integers
        UINT8 = i++;
        UINT16 = i++;
        UINT32 = i++;
        UINT52 = i++;
        UINT64 = i++;
        UINT128 = i++;
        UINT256 = i++;
        UINT512 = i++;

        // Signed integers
        INT8 = i++;
        INT16 = i++;
        INT32 = i++;
        INT64 = i++;
        INT128 = i++;
        INT256 = i++;
        INT512 = i++;

        // Floating-point types
        FLOAT16 = i++;
        FLOAT32 = i++;
        FLOAT64 = i++;
        FLOAT80 = i++;
        FLOAT128 = i++;
        BFLOAT16 = i++;

        // Packed types
        PACKED16_UINT8 = i++;
        PACKED16_INT8 = i++;
        PACKED32_UINT8 = i++;
        PACKED32_INT8 = i++;
        PACKED32_UINT16 = i++;
        PACKED32_INT16 = i++;
        PACKED32_FLOAT16 = i++;
        PACKED32_BFLOAT16 = i++;
        PACKED64_UINT8 = i++;
        PACKED64_INT8 = i++;
        PACKED64_UINT16 = i++;
        PACKED64_INT16 = i++;
        PACKED64_UINT32 = i++;
        PACKED64_INT32 = i++;
        PACKED64_FLOAT16 = i++;
        PACKED64_FLOAT32 = i++;
        PACKED128_UINT8 = i++;
        PACKED128_INT8 = i++;
        PACKED128_UINT16 = i++;
        PACKED128_INT16 = i++;
        PACKED128_UINT32 = i++;
        PACKED128_INT32 = i++;
        PACKED128_UINT52 = i++;
        PACKED128_UINT64 = i++;
        PACKED128_INT64 = i++;
        PACKED128_FLOAT16 = i++;
        PACKED128_FLOAT32 = i++;
        PACKED128_FLOAT64 = i++;
        PACKED128_BFLOAT16 = i++;
        PACKED128_2X_FLOAT16 = i++;
        PACKED128_2X_BFLOAT16 = i++;
        PACKED256_UINT8 = i++;
        PACKED256_INT8 = i++;
        PACKED256_UINT16 = i++;
        PACKED256_INT16 = i++;
        PACKED256_UINT32 = i++;
        PACKED256_INT32 = i++;
        PACKED256_UINT52 = i++;
        PACKED256_UINT64 = i++;
        PACKED256_INT64 = i++;
        PACKED256_UINT128 = i++;
        PACKED256_INT128 = i++;
        PACKED256_FLOAT16 = i++;
        PACKED256_FLOAT32 = i++;
        PACKED256_FLOAT64 = i++;
        PACKED256_FLOAT128 = i++;
        PACKED256_BFLOAT16 = i++;
        PACKED256_2X_FLOAT16 = i++;
        PACKED256_2X_BFLOAT16 = i++;
        PACKED512_UINT8 = i++;
        PACKED512_INT8 = i++;
        PACKED512_UINT16 = i++;
        PACKED512_INT16 = i++;
        PACKED512_UINT32 = i++;
        PACKED512_INT32 = i++;
        PACKED512_UINT52 = i++;
        PACKED512_UINT64 = i++;
        PACKED512_INT64 = i++;
        PACKED512_UINT128 = i++;
        PACKED512_FLOAT16 = i++;
        PACKED512_FLOAT32 = i++;
        PACKED512_FLOAT64 = i++;
        PACKED512_2X_FLOAT16 = i++;
        PACKED512_2X_BFLOAT16 = i++;

        // Broadcast types
        BROADCAST32_FLOAT16 = i++;
        BROADCAST64_UINT32 = i++;
        BROADCAST64_INT32 = i++;
        BROADCAST64_FLOAT16 = i++;
        BROADCAST64_FLOAT32 = i++;
        BROADCAST128_INT16 = i++;
        BROADCAST128_UINT16 = i++;
        BROADCAST128_UINT32 = i++;
        BROADCAST128_INT32 = i++;
        BROADCAST128_UINT52 = i++;
        BROADCAST128_UINT64 = i++;
        BROADCAST128_INT64 = i++;
        BROADCAST128_FLOAT16 = i++;
        BROADCAST128_FLOAT32 = i++;
        BROADCAST128_FLOAT64 = i++;
        BROADCAST128_2X_INT16 = i++;
        BROADCAST128_2X_INT32 = i++;
        BROADCAST128_2X_UINT32 = i++;
        BROADCAST128_2X_FLOAT16 = i++;
        BROADCAST128_2X_BFLOAT16 = i++;
        BROADCAST256_INT16 = i++;
        BROADCAST256_UINT16 = i++;
        BROADCAST256_UINT32 = i++;
        BROADCAST256_INT32 = i++;
        BROADCAST256_UINT52 = i++;
        BROADCAST256_UINT64 = i++;
        BROADCAST256_INT64 = i++;
        BROADCAST256_FLOAT16 = i++;
        BROADCAST256_FLOAT32 = i++;
        BROADCAST256_FLOAT64 = i++;
        BROADCAST256_2X_INT16 = i++;
        BROADCAST256_2X_INT32 = i++;
        BROADCAST256_2X_UINT32 = i++;
        BROADCAST256_2X_FLOAT16 = i++;
        BROADCAST256_2X_BFLOAT16 = i++;
        BROADCAST512_INT16 = i++;
        BROADCAST512_UINT16 = i++;
        BROADCAST512_UINT32 = i++;
        BROADCAST512_INT32 = i++;
        BROADCAST512_UINT52 = i++;
        BROADCAST512_UINT64 = i++;
        BROADCAST512_INT64 = i++;
        BROADCAST512_FLOAT16 = i++;
        BROADCAST512_FLOAT32 = i++;
        BROADCAST512_FLOAT64 = i++;
        BROADCAST512_2X_FLOAT16 = i++;
        BROADCAST512_2X_INT16 = i++;
        BROADCAST512_2X_UINT32 = i++;
        BROADCAST512_2X_INT32 = i++;
        BROADCAST512_2X_BFLOAT16 = i++;

        // Segment pointers
        SEG_PTR16 = i++;
        SEG_PTR32 = i++;
        SEG_PTR64 = i++;

        // Offsets
        WORD_OFFSET = i++;
        DWORD_OFFSET = i++;
        QWORD_OFFSET = i++;

        // Bounds
        BOUND16_WORD_WORD = i++;
        BOUND32_DWORD_DWORD = i++;
        BND32 = i++;
        BND64 = i++;

        // FPU states
        FPU_ENV14 = i++;
        FPU_ENV28 = i++;
        FPU_STATE94 = i++;
        FPU_STATE108 = i++;
        FXSAVE_512BYTE = i++;
        FXSAVE64_512BYTE = i++;
        XSAVE = i++;
        XSAVE64 = i++;

        // Special types
        BCD = i++;
        TILECFG = i++;
        TILE = i++;
        SEGMENT_DESC_SELECTOR = i++;
        KLHANDLE_AES128 = i++;
        KLHANDLE_AES256 = i++;
        FWORD6 = i++;
        FWORD10 = i++;
    }
}
