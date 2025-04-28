package mi.m4x.rive.registers;

import mi.m4x.carbide.interfaces.Beta;

/**
 * Provides static references to the x86 debug registers (DR0–DR15).
 *
 * <p>Debug registers are a set of processor registers used to support debugging operations
 * such as setting hardware breakpoints and monitoring specific memory accesses. These are
 * especially useful in low-level debugging, emulation, and virtualization scenarios.</p>
 *
 * <p>This class serves as a utility container for referencing {@link InstructionCreateRegister}
 * instances corresponding to each debug register and is not meant to be instantiated.</p>
 *
 * @since 1.0.1
 * @author M4ximumpizza
 */
@Beta
public class InstructionCreateDebugRegisters {

    // Private constructor to prevent instantiation
    private InstructionCreateDebugRegisters() {
        // Prevent instantiation
    }

    public static final InstructionCreateRegister dr0 = InstructionCreateRegisters.dr0;
    public static final InstructionCreateRegister dr1 = InstructionCreateRegisters.dr1;
    public static final InstructionCreateRegister dr2 = InstructionCreateRegisters.dr2;
    public static final InstructionCreateRegister dr3 = InstructionCreateRegisters.dr3;
    public static final InstructionCreateRegister dr4 = InstructionCreateRegisters.dr4;
    public static final InstructionCreateRegister dr5 = InstructionCreateRegisters.dr5;
    public static final InstructionCreateRegister dr6 = InstructionCreateRegisters.dr6;
    public static final InstructionCreateRegister dr7 = InstructionCreateRegisters.dr7;
    public static final InstructionCreateRegister dr8 = InstructionCreateRegisters.dr8;
    public static final InstructionCreateRegister dr9 = InstructionCreateRegisters.dr9;
    public static final InstructionCreateRegister dr10 = InstructionCreateRegisters.dr10;
    public static final InstructionCreateRegister dr11 = InstructionCreateRegisters.dr11;
    public static final InstructionCreateRegister dr12 = InstructionCreateRegisters.dr12;
    public static final InstructionCreateRegister dr13 = InstructionCreateRegisters.dr13;
    public static final InstructionCreateRegister dr14 = InstructionCreateRegisters.dr14;
    public static final InstructionCreateRegister dr15 = InstructionCreateRegisters.dr15;
}

