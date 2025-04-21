package mi.m4x.carbide.architecture;

import mi.m4x.carbide.interfaces.Beta;

/**
 * Provides static references to the AVX-512 opmask (k) registers (K0–K7).
 *
 * <p>Opmask registers are part of the AVX-512 instruction set extension introduced by Intel.
 * These registers are used for masking operations, allowing fine-grained control over which
 * elements of vector instructions are executed. This is especially useful in SIMD programming,
 * high-performance computing, and vectorized conditional execution.</p>
 *
 * <p>This class acts as a utility container for referencing {@link InstructionCreateRegister}
 * instances for AVX-512 k-registers, and is not intended to be instantiated.</p>
 *
 * @since 1.0.1
 * @author M4ximumpizza
 */
@Beta
public class InstructionCreateKRegisters {

    // Private constructor to prevent instantiation
    private InstructionCreateKRegisters() {
        // Prevent instantiation
    }

    // AVX-512 opmask registers
    public static final InstructionCreateRegister k0 = InstructionCreateRegisters.k0;
    public static final InstructionCreateRegister k1 = InstructionCreateRegisters.k1;
    public static final InstructionCreateRegister k2 = InstructionCreateRegisters.k2;
    public static final InstructionCreateRegister k3 = InstructionCreateRegisters.k3;
    public static final InstructionCreateRegister k4 = InstructionCreateRegisters.k4;
    public static final InstructionCreateRegister k5 = InstructionCreateRegisters.k5;
    public static final InstructionCreateRegister k6 = InstructionCreateRegisters.k6;
    public static final InstructionCreateRegister k7 = InstructionCreateRegisters.k7;
}
