package mi.m4x.rive.registers;

import mi.m4x.carbide.interfaces.Beta;

/**
 * Provides static references to YMM registers (YMM0–YMM22).
 *
 * <p>YMM registers are 256-bit SIMD vector registers introduced with the
 * AVX (Advanced Vector Extensions) instruction set. These registers enable
 * efficient parallel processing of packed data and are commonly used in
 * scientific, multimedia, and cryptographic workloads.</p>
 *
 * <p>This utility class serves as a central access point for all
 * {@link InstructionCreateRegister} instances corresponding to the YMM register set.
 * It is not meant to be instantiated.</p>
 *
 * @since 1.0.1
 * @author M4ximumpizza
 */
@Beta
public final class InstructionCreateYMMRegisters {

    // Prevent instantiation
    private InstructionCreateYMMRegisters() {}

    // YMM registers
    public static final InstructionCreateRegister ymm0 = InstructionCreateRegisters.ymm0;
    public static final InstructionCreateRegister ymm1 = InstructionCreateRegisters.ymm1;
    public static final InstructionCreateRegister ymm2 = InstructionCreateRegisters.ymm2;
    public static final InstructionCreateRegister ymm3 = InstructionCreateRegisters.ymm3;
    public static final InstructionCreateRegister ymm4 = InstructionCreateRegisters.ymm4;
    public static final InstructionCreateRegister ymm5 = InstructionCreateRegisters.ymm5;
    public static final InstructionCreateRegister ymm6 = InstructionCreateRegisters.ymm6;
    public static final InstructionCreateRegister ymm7 = InstructionCreateRegisters.ymm7;
    public static final InstructionCreateRegister ymm8 = InstructionCreateRegisters.ymm8;
    public static final InstructionCreateRegister ymm9 = InstructionCreateRegisters.ymm9;
    public static final InstructionCreateRegister ymm10 = InstructionCreateRegisters.ymm10;
    public static final InstructionCreateRegister ymm11 = InstructionCreateRegisters.ymm11;
    public static final InstructionCreateRegister ymm12 = InstructionCreateRegisters.ymm12;
    public static final InstructionCreateRegister ymm13 = InstructionCreateRegisters.ymm13;
    public static final InstructionCreateRegister ymm14 = InstructionCreateRegisters.ymm14;
    public static final InstructionCreateRegister ymm15 = InstructionCreateRegisters.ymm15;
    public static final InstructionCreateRegister ymm16 = InstructionCreateRegisters.ymm16;
    public static final InstructionCreateRegister ymm17 = InstructionCreateRegisters.ymm17;
    public static final InstructionCreateRegister ymm18 = InstructionCreateRegisters.ymm18;
    public static final InstructionCreateRegister ymm19 = InstructionCreateRegisters.ymm19;
    public static final InstructionCreateRegister ymm20 = InstructionCreateRegisters.ymm20;
    public static final InstructionCreateRegister ymm21 = InstructionCreateRegisters.ymm21;
    public static final InstructionCreateRegister ymm22 = InstructionCreateRegisters.ymm22;
}
