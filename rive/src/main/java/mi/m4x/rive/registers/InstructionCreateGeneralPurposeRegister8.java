package mi.m4x.rive.registers;

import mi.m4x.carbide.interfaces.Beta;

/**
 * Provides static references to the 8-bit general-purpose x86 and x86-64 registers.
 *
 * <p>These registers are used for byte-level operations and are available across all x86 architectures,
 * including legacy (e.g., {@code al}, {@code ah}) and extended 64-bit forms (e.g., {@code r8b}, {@code r15b}).</p>
 *
 * <p>This class acts as a utility container for referencing {@link InstructionCreateRegister}
 * instances corresponding to each 8-bit general-purpose register. It is not intended to be instantiated.</p>
 *
 * @since 1.0.1
 * @author M4ximumpizza
 */
@Beta
public class InstructionCreateGeneralPurposeRegister8 {

    // Private constructor to prevent instantiation
    private InstructionCreateGeneralPurposeRegister8() {
        // Prevent instantiation
    }

    // 8-bit general-purpose registers
    public static final InstructionCreateRegister al = InstructionCreateRegisters.al;
    public static final InstructionCreateRegister cl = InstructionCreateRegisters.cl;
    public static final InstructionCreateRegister dl = InstructionCreateRegisters.dl;
    public static final InstructionCreateRegister bl = InstructionCreateRegisters.bl;
    public static final InstructionCreateRegister ah = InstructionCreateRegisters.ah;
    public static final InstructionCreateRegister ch = InstructionCreateRegisters.ch;
    public static final InstructionCreateRegister dh = InstructionCreateRegisters.dh;
    public static final InstructionCreateRegister bh = InstructionCreateRegisters.bh;
    public static final InstructionCreateRegister spl = InstructionCreateRegisters.spl;
    public static final InstructionCreateRegister bpl = InstructionCreateRegisters.bpl;
    public static final InstructionCreateRegister sil = InstructionCreateRegisters.sil;
    public static final InstructionCreateRegister dil = InstructionCreateRegisters.dil;
    public static final InstructionCreateRegister r8b = InstructionCreateRegisters.r8b;
    public static final InstructionCreateRegister r9b = InstructionCreateRegisters.r9b;
    public static final InstructionCreateRegister r10b = InstructionCreateRegisters.r10b;
    public static final InstructionCreateRegister r11b = InstructionCreateRegisters.r11b;
    public static final InstructionCreateRegister r12b = InstructionCreateRegisters.r12b;
    public static final InstructionCreateRegister r13b = InstructionCreateRegisters.r13b;
    public static final InstructionCreateRegister r14b = InstructionCreateRegisters.r14b;
    public static final InstructionCreateRegister r15b = InstructionCreateRegisters.r15b;
}
