package mi.m4x.carbide.architecture;

import mi.m4x.carbide.interfaces.Beta;

/**
 * Provides static references to the MMX registers (MM0–MM7).
 *
 * <p>MMX registers are 64-bit multimedia registers introduced by Intel as part of the MMX
 * instruction set extension. They are primarily used for SIMD operations on integer data,
 * especially in older multimedia and signal processing applications.</p>
 *
 * <p>This class serves as a utility container for referencing {@link InstructionCreateRegister}
 * instances corresponding to each MMX register and is not intended to be instantiated.</p>
 *
 * @since 1.0.1
 * author M4ximumpizza
 */
@Beta
public class InstructionCreateRegistersMM {

    // Private constructor to prevent instantiation
    private InstructionCreateRegistersMM() {
        // Prevent instantiation
    }

    // MMX registers
    public static final InstructionCreateRegister mm0 = InstructionCreateRegisters.mm0;
    public static final InstructionCreateRegister mm1 = InstructionCreateRegisters.mm1;
    public static final InstructionCreateRegister mm2 = InstructionCreateRegisters.mm2;
    public static final InstructionCreateRegister mm3 = InstructionCreateRegisters.mm3;
    public static final InstructionCreateRegister mm4 = InstructionCreateRegisters.mm4;
    public static final InstructionCreateRegister mm5 = InstructionCreateRegisters.mm5;
    public static final InstructionCreateRegister mm6 = InstructionCreateRegisters.mm6;
    public static final InstructionCreateRegister mm7 = InstructionCreateRegisters.mm7;
}
