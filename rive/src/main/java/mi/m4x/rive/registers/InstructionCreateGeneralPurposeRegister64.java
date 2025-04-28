package mi.m4x.rive.registers;

import mi.m4x.carbide.interfaces.Beta;

/**
 * Provides static references to the 64-bit general-purpose x86-64 registers.
 *
 * <p>These registers are used in modern 64-bit assembly programming on x86-64 architectures.
 * They support full 64-bit operations and are essential for addressing, computation,
 * function calls, and system-level programming.</p>
 *
 * <p>This class serves as a utility container for referencing {@link InstructionCreateRegister}
 * instances corresponding to each 64-bit general-purpose register. It is not intended to be instantiated.</p>
 *
 * @since 1.0.1
 * @author M4ximumpizza
 */
@Beta
public class InstructionCreateGeneralPurposeRegister64 {

    // Private constructor to prevent instantiation
    private InstructionCreateGeneralPurposeRegister64() {
        // Prevent instantiation
    }

    // 64-bit general-purpose registers
    public static final InstructionCreateRegister rax = InstructionCreateRegisters.rax;
    public static final InstructionCreateRegister rbx = InstructionCreateRegisters.rbx;
    public static final InstructionCreateRegister rcx = InstructionCreateRegisters.rcx;
    public static final InstructionCreateRegister rdx = InstructionCreateRegisters.rdx;
    public static final InstructionCreateRegister rsi = InstructionCreateRegisters.rsi;
    public static final InstructionCreateRegister rdi = InstructionCreateRegisters.rdi;
    public static final InstructionCreateRegister rsp = InstructionCreateRegisters.rsp;
    public static final InstructionCreateRegister rbp = InstructionCreateRegisters.rbp;
    public static final InstructionCreateRegister r8 = InstructionCreateRegisters.r8;
    public static final InstructionCreateRegister r9 = InstructionCreateRegisters.r9;
    public static final InstructionCreateRegister r10 = InstructionCreateRegisters.r10;
    public static final InstructionCreateRegister r11 = InstructionCreateRegisters.r11;
    public static final InstructionCreateRegister r12 = InstructionCreateRegisters.r12;
    public static final InstructionCreateRegister r13 = InstructionCreateRegisters.r13;
    public static final InstructionCreateRegister r14 = InstructionCreateRegisters.r14;
    public static final InstructionCreateRegister r15 = InstructionCreateRegisters.r15;
}

