package mi.m4x.carbide.architecture;

import mi.m4x.carbide.interfaces.Beta;

/**
 * Provides static references to the x87 FPU floating-point stack registers (ST0–ST7).
 *
 * <p>The x87 FPU architecture includes a set of eight 80-bit wide registers arranged
 * as a stack (ST0–ST7). These registers are used for floating-point arithmetic and
 * are accessed either explicitly by name or implicitly via stack operations.</p>
 *
 * <p>This class serves as a utility container for referencing {@link InstructionCreateRegister}
 * instances corresponding to each of the x87 FPU stack registers. It is not intended to be instantiated.</p>
 *
 * @since 1.0.1
 * @author M4ximumpizza
 */
@Beta
public class InstructionCreateRegisterST {

    // Private constructor to prevent instantiation
    private InstructionCreateRegisterST() {}

    // x87 FPU stack registers
    public static final InstructionCreateRegister st0 = InstructionCreateRegisters.st0;
    public static final InstructionCreateRegister st1 = InstructionCreateRegisters.st1;
    public static final InstructionCreateRegister st2 = InstructionCreateRegisters.st2;
    public static final InstructionCreateRegister st3 = InstructionCreateRegisters.st3;
    public static final InstructionCreateRegister st4 = InstructionCreateRegisters.st4;
    public static final InstructionCreateRegister st5 = InstructionCreateRegisters.st5;
    public static final InstructionCreateRegister st6 = InstructionCreateRegisters.st6;
    public static final InstructionCreateRegister st7 = InstructionCreateRegisters.st7;
}
