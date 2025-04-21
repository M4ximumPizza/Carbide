package mi.m4x.carbide.architecture;

import mi.m4x.carbide.interfaces.Beta;

/**
 * Provides static references to all vector registers (XMM0–XMM31, YMM0–YMM31, ZMM0–ZMM31).
 *
 * <p>This utility class unifies access to all 128-bit, 256-bit, and 512-bit SIMD registers,
 * as used in SSE, AVX, and AVX-512 instruction sets respectively.
 * It is intended for low-level instruction composition and should not be instantiated.</p>
 *
 * @since 1.0.1
 * @author M4ximumpizza
 */
@Beta
public final class InstructionCreateVectorRegisters {

    private InstructionCreateVectorRegisters() {}

    // XMM (128-bit) registers
    public static final InstructionCreateRegister xmm0 = InstructionCreateRegisters.xmm0;
    public static final InstructionCreateRegister xmm1 = InstructionCreateRegisters.xmm1;
    public static final InstructionCreateRegister xmm2 = InstructionCreateRegisters.xmm2;
    public static final InstructionCreateRegister xmm3 = InstructionCreateRegisters.xmm3;
    public static final InstructionCreateRegister xmm4 = InstructionCreateRegisters.xmm4;
    public static final InstructionCreateRegister xmm5 = InstructionCreateRegisters.xmm5;
    public static final InstructionCreateRegister xmm6 = InstructionCreateRegisters.xmm6;
    public static final InstructionCreateRegister xmm7 = InstructionCreateRegisters.xmm7;
    public static final InstructionCreateRegister xmm8 = InstructionCreateRegisters.xmm8;
    public static final InstructionCreateRegister xmm9 = InstructionCreateRegisters.xmm9;
    public static final InstructionCreateRegister xmm10 = InstructionCreateRegisters.xmm10;
    public static final InstructionCreateRegister xmm11 = InstructionCreateRegisters.xmm11;
    public static final InstructionCreateRegister xmm12 = InstructionCreateRegisters.xmm12;
    public static final InstructionCreateRegister xmm13 = InstructionCreateRegisters.xmm13;
    public static final InstructionCreateRegister xmm14 = InstructionCreateRegisters.xmm14;
    public static final InstructionCreateRegister xmm15 = InstructionCreateRegisters.xmm15;
    public static final InstructionCreateRegister xmm16 = InstructionCreateRegisters.xmm16;
    public static final InstructionCreateRegister xmm17 = InstructionCreateRegisters.xmm17;
    public static final InstructionCreateRegister xmm18 = InstructionCreateRegisters.xmm18;
    public static final InstructionCreateRegister xmm19 = InstructionCreateRegisters.xmm19;
    public static final InstructionCreateRegister xmm20 = InstructionCreateRegisters.xmm20;
    public static final InstructionCreateRegister xmm21 = InstructionCreateRegisters.xmm21;
    public static final InstructionCreateRegister xmm22 = InstructionCreateRegisters.xmm22;
    public static final InstructionCreateRegister xmm23 = InstructionCreateRegisters.xmm23;
    public static final InstructionCreateRegister xmm24 = InstructionCreateRegisters.xmm24;
    public static final InstructionCreateRegister xmm25 = InstructionCreateRegisters.xmm25;
    public static final InstructionCreateRegister xmm26 = InstructionCreateRegisters.xmm26;
    public static final InstructionCreateRegister xmm27 = InstructionCreateRegisters.xmm27;
    public static final InstructionCreateRegister xmm28 = InstructionCreateRegisters.xmm28;
    public static final InstructionCreateRegister xmm29 = InstructionCreateRegisters.xmm29;
    public static final InstructionCreateRegister xmm30 = InstructionCreateRegisters.xmm30;
    public static final InstructionCreateRegister xmm31 = InstructionCreateRegisters.xmm31;

    // YMM (256-bit) registers
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
    public static final InstructionCreateRegister ymm23 = InstructionCreateRegisters.ymm23;
    public static final InstructionCreateRegister ymm24 = InstructionCreateRegisters.ymm24;
    public static final InstructionCreateRegister ymm25 = InstructionCreateRegisters.ymm25;
    public static final InstructionCreateRegister ymm26 = InstructionCreateRegisters.ymm26;
    public static final InstructionCreateRegister ymm27 = InstructionCreateRegisters.ymm27;
    public static final InstructionCreateRegister ymm28 = InstructionCreateRegisters.ymm28;
    public static final InstructionCreateRegister ymm29 = InstructionCreateRegisters.ymm29;
    public static final InstructionCreateRegister ymm30 = InstructionCreateRegisters.ymm30;
    public static final InstructionCreateRegister ymm31 = InstructionCreateRegisters.ymm31;

    // ZMM (512-bit) registers
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
    public static final InstructionCreateRegister zmm16 = InstructionCreateRegisters.zmm16;
    public static final InstructionCreateRegister zmm17 = InstructionCreateRegisters.zmm17;
    public static final InstructionCreateRegister zmm18 = InstructionCreateRegisters.zmm18;
    public static final InstructionCreateRegister zmm19 = InstructionCreateRegisters.zmm19;
    public static final InstructionCreateRegister zmm20 = InstructionCreateRegisters.zmm20;
    public static final InstructionCreateRegister zmm21 = InstructionCreateRegisters.zmm21;
    public static final InstructionCreateRegister zmm22 = InstructionCreateRegisters.zmm22;
    public static final InstructionCreateRegister zmm23 = InstructionCreateRegisters.zmm23;
    public static final InstructionCreateRegister zmm24 = InstructionCreateRegisters.zmm24;
    public static final InstructionCreateRegister zmm25 = InstructionCreateRegisters.zmm25;
    public static final InstructionCreateRegister zmm26 = InstructionCreateRegisters.zmm26;
    public static final InstructionCreateRegister zmm27 = InstructionCreateRegisters.zmm27;
    public static final InstructionCreateRegister zmm28 = InstructionCreateRegisters.zmm28;
    public static final InstructionCreateRegister zmm29 = InstructionCreateRegisters.zmm29;
    public static final InstructionCreateRegister zmm30 = InstructionCreateRegisters.zmm30;
    public static final InstructionCreateRegister zmm31 = InstructionCreateRegisters.zmm31;
}
