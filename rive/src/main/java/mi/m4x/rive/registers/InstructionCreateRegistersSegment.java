package mi.m4x.rive.registers;

import mi.m4x.carbide.interfaces.Beta;

/**
 * Provides static references to the x86 segment registers (ES, CS, SS, DS, FS, GS).
 *
 * <p>Segment registers are part of the x86 architecture's memory segmentation model.
 * While modern operating systems typically use flat memory models, these registers
 * still play a role in certain system-level and compatibility operations.</p>
 *
 * <p>This class acts as a utility container for referencing {@link InstructionCreateRegister}
 * instances corresponding to each segment register. It is not intended to be instantiated.</p>
 *
 * @since 1.0.1
 * @author M4ximumpizza
 */
@Beta
public class InstructionCreateRegistersSegment {

    // Private constructor to prevent instantiation
    private InstructionCreateRegistersSegment() {}

    // x86 segment registers
    public static final InstructionCreateRegister es = InstructionCreateRegisters.es;
    public static final InstructionCreateRegister cs = InstructionCreateRegisters.cs;
    public static final InstructionCreateRegister ss = InstructionCreateRegisters.ss;
    public static final InstructionCreateRegister ds = InstructionCreateRegisters.ds;
    public static final InstructionCreateRegister fs = InstructionCreateRegisters.fs;
    public static final InstructionCreateRegister gs = InstructionCreateRegisters.gs;
}
