package mi.m4x.rive.registers;

import mi.m4x.carbide.interfaces.Beta;

/**
 * Provides static references to the 32-bit general-purpose x86 and x86-64 registers.
 *
 * <p>These registers are commonly used in 32-bit assembly programming, as well as in compatibility
 * modes on x86-64 architectures. They are used for arithmetic operations, addressing, stack
 * management, and data manipulation.</p>
 *
 * <p>This class serves as a utility container for referencing {@link InstructionCreateRegister}
 * instances corresponding to each 32-bit general-purpose register. It is not intended to be instantiated.</p>
 *
 * @since 1.0.1
 * @author M4ximumpizza
 */
@Beta
public class InstructionCreateGeneralPurposeRegister32 {

    // Private constructor to prevent instantiation
    private InstructionCreateGeneralPurposeRegister32() {
        // Prevent instantiation
    }

    // 32-bit general-purpose registers
    public static final InstructionCreateRegister eax = InstructionCreateRegisters.eax;
    public static final InstructionCreateRegister ebx = InstructionCreateRegisters.ebx;
    public static final InstructionCreateRegister ecx = InstructionCreateRegisters.ecx;
    public static final InstructionCreateRegister edx = InstructionCreateRegisters.edx;
    public static final InstructionCreateRegister esi = InstructionCreateRegisters.esi;
    public static final InstructionCreateRegister edi = InstructionCreateRegisters.edi;
    public static final InstructionCreateRegister esp = InstructionCreateRegisters.esp;
    public static final InstructionCreateRegister ebp = InstructionCreateRegisters.ebp;
    public static final InstructionCreateRegister r8d = InstructionCreateRegisters.r8d;
    public static final InstructionCreateRegister r9d = InstructionCreateRegisters.r9d;
    public static final InstructionCreateRegister r10d = InstructionCreateRegisters.r10d;
    public static final InstructionCreateRegister r11d = InstructionCreateRegisters.r11d;
    public static final InstructionCreateRegister r12d = InstructionCreateRegisters.r12d;
    public static final InstructionCreateRegister r13d = InstructionCreateRegisters.r13d;
    public static final InstructionCreateRegister r14d = InstructionCreateRegisters.r14d;
    public static final InstructionCreateRegister r15d = InstructionCreateRegisters.r15d;
}
