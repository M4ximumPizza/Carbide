package mi.m4x.rive;

import mi.m4x.carbide.interfaces.Beta;
import mi.m4x.rive.registers.InstructionCreateRegister;

/**
 * Represents a memory operand used in assembly instructions,
 * such as those involving register-indirect addressing, displacement,
 * or scaled indexed addressing.
 * <p>
 * {@code MemoryOperands} is immutable, thread-safe, and optimized for
 * fast hashing and equality checks.
 * </p>
 *
 * @since 1.0.2
 * @author M4ximumpizza
 */
@Beta
public final class MemoryOperands {

    /**
     * Predefined empty operand with no base, no index, and zero displacement.
     */
    public static final MemoryOperands EMPTY = new MemoryOperands(
            InstructionCreateRegister.NONE, InstructionCreateRegister.NONE,
            1, 0L, 0, false, InstructionCreateRegister.NONE
    );

    /**
     * Base register (or {@link InstructionCreateRegister#NONE} if absent).
     */
    public final InstructionCreateRegister base;

    /**
     * Index register (or {@link InstructionCreateRegister#NONE} if absent).
     */
    public final InstructionCreateRegister index;

    /**
     * Scaling factor for the index register (must be 1, 2, 4, or 8).
     */
    public final int scale;

    /**
     * Constant displacement offset added to the address.
     */
    public final long displacement;

    /**
     * Size of the displacement in bytes (0 = none, otherwise 2/4/8).
     */
    public final int displSize;

    /**
     * Whether this operand uses broadcast semantics (e.g., EVEX instructions).
     */
    public final boolean broadcast;

    /**
     * Optional segment override prefix (or {@link InstructionCreateRegister#NONE}).
     */
    public final InstructionCreateRegister segmentPrefix;

    /**
     * Cached hash code for faster lookups and comparisons.
     */
    private final int cachedHash;

    /**
     * Internal constructor.
     * Use static factories such as {@link #of} instead of direct instantiation.
     */
    private MemoryOperands(
            InstructionCreateRegister base,
            InstructionCreateRegister index,
            int scale,
            long displacement,
            int displSize,
            boolean broadcast,
            InstructionCreateRegister segmentPrefix) {
        this.base = base;
        this.index = index;
        this.scale = scale;
        this.displacement = displacement;
        this.displSize = displSize;
        this.broadcast = broadcast;
        this.segmentPrefix = segmentPrefix;
        this.cachedHash = computeHash();
    }

    /**
     * Creates a fully specified {@code MemoryOperands} instance.
     *
     * @param base           Base register (null treated as {@link InstructionCreateRegister#NONE}).
     * @param index          Index register (null treated as {@link InstructionCreateRegister#NONE}).
     * @param scale          Scale factor (must be 1, 2, 4, or 8; invalid values default to 1).
     * @param displacement   Displacement value.
     * @param displSize      Size of the displacement field in bytes.
     * @param broadcast      Whether broadcast mode is enabled.
     * @param segmentPrefix  Segment override (null treated as {@link InstructionCreateRegister#NONE}).
     * @return A new {@code MemoryOperands} instance.
     */
    public static MemoryOperands of(
            InstructionCreateRegister base,
            InstructionCreateRegister index,
            int scale,
            long displacement,
            int displSize,
            boolean broadcast,
            InstructionCreateRegister segmentPrefix) {
        return new MemoryOperands(
                nonNull(base), nonNull(index), validScale(scale),
                displacement, displSize, broadcast, nonNull(segmentPrefix)
        );
    }

    /**
     * Creates a {@code MemoryOperands} instance using a base register and index register only.
     * No displacement is applied.
     *
     * @param base  Base register.
     * @param index Index register.
     * @param scale Scaling factor (defaults to 1 if invalid).
     * @return A new {@code MemoryOperands} instance.
     */
    public static MemoryOperands baseIndex(
            InstructionCreateRegister base, InstructionCreateRegister index, int scale) {
        return new MemoryOperands(
                nonNull(base), nonNull(index), validScale(scale),
                0L, 0, false, InstructionCreateRegister.NONE
        );
    }

    /**
     * Creates a {@code MemoryOperands} instance with only a base register and no index or displacement.
     *
     * @param base Base register.
     * @return A new {@code MemoryOperands} instance.
     */
    public static MemoryOperands baseOnly(InstructionCreateRegister base) {
        return new MemoryOperands(
                nonNull(base), InstructionCreateRegister.NONE, 1,
                0L, 0, false, InstructionCreateRegister.NONE
        );
    }

    /**
     * Creates a {@code MemoryOperands} instance using only a displacement with no base or index registers.
     *
     * @param displacement Memory displacement value.
     * @param displSize    Size of the displacement in bytes.
     * @return A new {@code MemoryOperands} instance.
     */
    public static MemoryOperands displacementOnly(long displacement, int displSize) {
        return new MemoryOperands(
                InstructionCreateRegister.NONE, InstructionCreateRegister.NONE, 1,
                displacement, displSize, false, InstructionCreateRegister.NONE
        );
    }

    /**
     * Ensures that a register is non-null, replacing {@code null} with {@link InstructionCreateRegister#NONE}.
     *
     * @param reg Register to check.
     * @return Non-null register.
     */
    private static InstructionCreateRegister nonNull(InstructionCreateRegister reg) {
        return reg != null ? reg : InstructionCreateRegister.NONE;
    }

    /**
     * Validates the scale factor for an index register.
     * Allowed values are 1, 2, 4, or 8. Invalid values are corrected to 1.
     *
     * @param scale Input scale.
     * @return Valid scale factor.
     */
    private static int validScale(int scale) {
        return (scale == 1 || scale == 2 || scale == 4 || scale == 8) ? scale : 1;
    }

    /**
     * Computes the hash code based on all fields.
     * Called once during construction for caching.
     *
     * @return Hash code.
     */
    private int computeHash() {
        int result = base.hashCode();
        result = 31 * result + index.hashCode();
        result = 31 * result + Integer.hashCode(scale);
        result = 31 * result + Long.hashCode(displacement);
        result = 31 * result + Integer.hashCode(displSize);
        result = 31 * result + Boolean.hashCode(broadcast);
        result = 31 * result + segmentPrefix.hashCode();
        return result;
    }

    /**
     * Returns the cached hash code of this operand.
     *
     * @return Hash code.
     */
    @Override
    public int hashCode() {
        return cachedHash;
    }

    /**
     * Compares this operand to another for equality.
     * Two {@code MemoryOperands} instances are equal if all fields match exactly.
     *
     * @param obj The object to compare to.
     * @return {@code true} if equal, {@code false} otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof MemoryOperands other)) return false;
        return base == other.base
                && index == other.index
                && scale == other.scale
                && displacement == other.displacement
                && displSize == other.displSize
                && broadcast == other.broadcast
                && segmentPrefix == other.segmentPrefix;
    }
}
