package mi.m4x.rive;

import mi.m4x.carbide.interfaces.Beta;

/**
 * Represents the operands for memory addressing in assembly instructions.
 * This class encapsulates the details of how memory is accessed, including
 * the base and index registers, scale factor, displacement, and segment prefix.
 *
 * <p>It is used to create and manipulate memory operands in assembly instructions.</p>
 *
 * <p>Note: This class is not intended to be instantiated directly. Use the provided
 * constructors to create instances with the desired parameters.</p>
 *
 * @since 1.0.2
 * @author M4ximumpizza
 */
@Beta
public final class MemoryOperands {
    /**
     * Segment override or {@code NONE} if not provided.
     */
    public final InstructionCreateRegister segmentPrefix;

    /**
     * Base register or {@code NONE} if not provided.
     */
    public final InstructionCreateRegister base;

    /**
     * Index register or {@code NONE} if not provided.
     */
    public final InstructionCreateRegister index;

    /**
     * Index register scale (1, 2, 4, or 8).
     */
    public final int scale;

    /**
     * Memory displacement.
     */
    public final long displacement;

    /**
     * Displacement size:
     * <ul>
     * <li>0: No displacement</li>
     * <li>1: 16/32/64-bit (use 2/4/8 if not fitting in a byte)</li>
     * <li>2: 16-bit</li>
     * <li>4: 32-bit</li>
     * <li>8: 64-bit</li>
     * </ul>
     */
    public final int displSize;

    /**
     * {@code true} if it’s broadcast memory (EVEX instructions).
     */
    public final boolean isBroadcast;

    /**
     * Default constructor that initializes fields with provided values or defaults to NONE or zero.
     *
     * @param base          Base register or {@code NONE}.
     * @param index         Index register or {@code NONE}.
     * @param scale         Index register scale (1, 2, 4, or 8).
     * @param displacement  Memory displacement.
     * @param displSize     Displacement size (see above).
     * @param isBroadcast   {@code true} if it's broadcast memory (EVEX instructions).
     * @param segmentPrefix Segment override or {@code NONE}.
     */
    public MemoryOperands(InstructionCreateRegister base, InstructionCreateRegister index, int scale, long displacement, int displSize, boolean isBroadcast,
                          InstructionCreateRegister segmentPrefix) {
        this.base = base == null ? InstructionCreateRegister.NONE : base;
        this.index = index == null ? InstructionCreateRegister.NONE : index;
        this.scale = scale;
        this.displacement = displacement;
        this.displSize = displSize;
        this.isBroadcast = isBroadcast;
        this.segmentPrefix = segmentPrefix == null ? InstructionCreateRegister.NONE : segmentPrefix;
    }

    /**
     * Overloaded constructor for cases where displacement is not provided.
     *
     * @param base          Base register or {@code NONE}.
     * @param index         Index register or {@code NONE}.
     * @param scale         Index register scale (1, 2, 4, or 8).
     * @param isBroadcast   {@code true} if it's broadcast memory (EVEX instructions).
     * @param segmentPrefix Segment override or {@code NONE}.
     */
    public MemoryOperands(InstructionCreateRegister base, InstructionCreateRegister index, int scale, boolean isBroadcast, InstructionCreateRegister segmentPrefix) {
        this(base, index, scale, 0L, 0, isBroadcast, segmentPrefix);
    }

    /**
     * Overloaded constructor for simpler cases where no index register is used.
     *
     * @param base          Base register or {@code NONE}.
     * @param displacement  Memory displacement.
     * @param displSize     Displacement size (see above).
     * @param isBroadcast   {@code true} if it's broadcast memory (EVEX instructions).
     * @param segmentPrefix Segment override or {@code NONE}.
     */
    public MemoryOperands(InstructionCreateRegister base, long displacement, int displSize, boolean isBroadcast, InstructionCreateRegister segmentPrefix) {
        this(base, InstructionCreateRegister.NONE, 1, displacement, displSize, isBroadcast, segmentPrefix);
    }

    /**
     * Overloaded constructor for cases with no displacement and no broadcast flag.
     *
     * @param base          Base register or {@code NONE}.
     * @param index         Index register or {@code NONE}.
     * @param scale         Index register scale (1, 2, 4, or 8).
     */
    public MemoryOperands(InstructionCreateRegister base, InstructionCreateRegister index, int scale) {
        this(base, index, scale, 0L, 0, false, InstructionCreateRegister.NONE);
    }

    /**
     * Overloaded constructor for cases with only a base register and no displacement.
     *
     * @param base Base register or {@code NONE}.
     */
    public MemoryOperands(InstructionCreateRegister base) {
        this(base, InstructionCreateRegister.NONE, 1, 0L, 0, false, InstructionCreateRegister.NONE);
    }

    /**
     * Overloaded constructor for cases with only displacement and no registers.
     *
     * @param displacement Memory displacement.
     * @param displSize    Displacement size (see above).
     */
    public MemoryOperands(long displacement, int displSize) {
        this(InstructionCreateRegister.NONE, InstructionCreateRegister.NONE, 1, displacement, displSize, false, InstructionCreateRegister.NONE);
    }

    /**
     * Hash code implementation based on all fields of the object.
     */
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * (31 * (31 * base.hashCode() + index.hashCode()) + Long.hashCode(displacement)) + Integer.hashCode(displSize)) + Integer.hashCode(scale))
                + (isBroadcast ? 1231 : 1237) + segmentPrefix.hashCode();
    }

    /**
     * Equality check based on all fields of the object.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        MemoryOperands other = (MemoryOperands) obj;
        return base.equals(other.base) && index.equals(other.index) && displacement == other.displacement && displSize == other.displSize
                && scale == other.scale && isBroadcast == other.isBroadcast && segmentPrefix.equals(other.segmentPrefix);
    }
}
