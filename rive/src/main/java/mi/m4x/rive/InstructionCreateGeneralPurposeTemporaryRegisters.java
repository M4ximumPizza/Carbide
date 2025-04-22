package mi.m4x.rive;

import mi.m4x.carbide.interfaces.Beta;

/**
 * Provides static references to the general-purpose temporary memory registers (TMM0–TMM7).
 *
 * <p>Temporary memory registers (TMM) are used primarily in the context of AMX (Advanced Matrix Extensions),
 * introduced by Intel for high-performance matrix operations. These registers are designed to facilitate
 * temporary storage during large-scale, tile-based compute operations, such as those used in machine learning
 * and scientific computation workloads.</p>
 *
 * <p>This class serves as a utility container for referencing {@link InstructionCreateRegister}
 * instances corresponding to each TMM register. It is not intended to be instantiated.</p>
 *
 * @since 1.0.1
 * @author M4ximumpizza
 */
@Beta
public class InstructionCreateGeneralPurposeTemporaryRegisters {

    // Private constructor to prevent instantiation
    private InstructionCreateGeneralPurposeTemporaryRegisters() {
        // Prevent instantiation
    }

    // General-purpose temporary memory registers (AMX TMM0–TMM7)
    public static final InstructionCreateRegister tmm0 = InstructionCreateRegisters.tmm0;
    public static final InstructionCreateRegister tmm1 = InstructionCreateRegisters.tmm1;
    public static final InstructionCreateRegister tmm2 = InstructionCreateRegisters.tmm2;
    public static final InstructionCreateRegister tmm3 = InstructionCreateRegisters.tmm3;
    public static final InstructionCreateRegister tmm4 = InstructionCreateRegisters.tmm4;
    public static final InstructionCreateRegister tmm5 = InstructionCreateRegisters.tmm5;
    public static final InstructionCreateRegister tmm6 = InstructionCreateRegisters.tmm6;
    public static final InstructionCreateRegister tmm7 = InstructionCreateRegisters.tmm7;
}
