package mi.m4x.rive.registers;

import mi.m4x.carbide.interfaces.Beta;

/**
 * Provides static references to the x86 control registers (CR0–CR15).
 *
 * <p>Control registers are a set of special-purpose registers in the x86 architecture
 * used to control aspects of the processor's operation, such as enabling/disabling paging,
 * setting protection modes, and managing virtual memory. This class exposes these registers
 * through {@link InstructionCreateRegister} instances for instruction-level code generation or analysis.</p>
 *
 * <p>This class is non-instantiable and is used solely as a holder for static constants.</p>
 *
 * @since 1.0.1
 * @author M4ximumpizza
 */
@Beta
public class InstructionCreateControlRegister {

    // Private constructor to prevent instantiation
    private InstructionCreateControlRegister() {
    }

    public static final InstructionCreateRegister cr0 = InstructionCreateRegisters.cr0;
    public static final InstructionCreateRegister cr1 = InstructionCreateRegisters.cr1;
    public static final InstructionCreateRegister cr2 = InstructionCreateRegisters.cr2;
    public static final InstructionCreateRegister cr3 = InstructionCreateRegisters.cr3;
    public static final InstructionCreateRegister cr4 = InstructionCreateRegisters.cr4;
    public static final InstructionCreateRegister cr5 = InstructionCreateRegisters.cr5;
    public static final InstructionCreateRegister cr6 = InstructionCreateRegisters.cr6;
    public static final InstructionCreateRegister cr7 = InstructionCreateRegisters.cr7;
    public static final InstructionCreateRegister cr8 = InstructionCreateRegisters.cr8;
    public static final InstructionCreateRegister cr9 = InstructionCreateRegisters.cr9;
    public static final InstructionCreateRegister cr10 = InstructionCreateRegisters.cr10;
    public static final InstructionCreateRegister cr11 = InstructionCreateRegisters.cr11;
    public static final InstructionCreateRegister cr12 = InstructionCreateRegisters.cr12;
    public static final InstructionCreateRegister cr13 = InstructionCreateRegisters.cr13;
    public static final InstructionCreateRegister cr14 = InstructionCreateRegisters.cr14;
    public static final InstructionCreateRegister cr15 = InstructionCreateRegisters.cr15;
}
