package mi.m4x.rive.registers;

import mi.m4x.carbide.interfaces.Beta;

/**
 * Provides static references to ZMM registers (ZMM0–ZMM15).
 *
 * <p>ZMM registers are 512-bit SIMD vector registers introduced as part of the
 * AVX-512 instruction set. They are used for highly parallelized operations on
 * large datasets in applications such as scientific computing, data analytics, and
 * cryptography.</p>
 *
 * <p>This utility class provides references to each {@link InstructionCreateRegister}
 * corresponding to the ZMM register set and is not meant to be instantiated.</p>
 *
 * @since 1.0.1
 * author M4ximumpizza
 */
@Beta
public class InstructionCreateZMMRegisters {

    // Private constructor to prevent instantiation
    private InstructionCreateZMMRegisters() {
        // Prevent instantiation
    }

    // ZMM registers
    public static final InstructionCreateRegister zmm0 = InstructionCreateRegisters.zmm0;
    public static final InstructionCreateRegister zmm1 = InstructionCreateRegisters.zmm1;
    public static final InstructionCreateRegister zmm2 = InstructionCreateRegisters.zmm2;
    public static final InstructionCreateRegister zmm3 = InstructionCreateRegisters.zmm3;
    public static final InstructionCreateRegister zmm4 = InstructionCreateRegisters.zmm4;
    public static final InstructionCreateRegister zmm5 = InstructionCreateRegisters.zmm5;
    public static final InstructionCreateRegister zmm6 = InstructionCreateRegisters.zmm6;
    public static final InstructionCreateRegister zmm7 = InstructionCreateRegisters.zmm7;
    public static final InstructionCreateRegister zmm8 = InstructionCreateRegisters.zmm8;
    public static final InstructionCreateRegister zmm9 = InstructionCreateRegisters.zmm9;
    public static final InstructionCreateRegister zmm10 = InstructionCreateRegisters.zmm10;
    public static final InstructionCreateRegister zmm11 = InstructionCreateRegisters.zmm11;
    public static final InstructionCreateRegister zmm12 = InstructionCreateRegisters.zmm12;
    public static final InstructionCreateRegister zmm13 = InstructionCreateRegisters.zmm13;
    public static final InstructionCreateRegister zmm14 = InstructionCreateRegisters.zmm14;
    public static final InstructionCreateRegister zmm15 = InstructionCreateRegisters.zmm15;
}
