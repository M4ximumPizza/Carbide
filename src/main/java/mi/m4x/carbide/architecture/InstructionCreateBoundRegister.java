package mi.m4x.carbide.architecture;

import mi.m4x.carbide.interfaces.Beta;

/**
 * This class provides static instances representing the bound registers used in Intel MPX (Memory Protection Extensions).
 * These registers are part of the MPX architecture and are utilized for memory safety by performing bounds checking
 * on pointers at runtime. The class prevents instantiation to ensure it is used solely as a container for
 * these static register instances.
 *
 * @since 1.0.1
 * @author M4ximumpizza
 */
@Beta
public class InstructionCreateBoundRegister {
    // Private constructor to prevent instantiation
    private InstructionCreateBoundRegister() {
        // Prevent instantiation
    }

    /**
     * Bound register 0 (BND0) for MPX. This register stores the lower and upper bounds
     * for pointer bounds checking in the MPX memory protection system.
     */
    public static final InstructionCreateRegister bnd0 = InstructionCreateRegisters.bnd0;

    /**
     * Bound register 1 (BND1) for MPX. This register holds bounds for another pointer
     * that is being tracked for bounds checking in the MPX system.
     */
    public static final InstructionCreateRegister bnd1 = InstructionCreateRegisters.bnd1;

    /**
     * Bound register 2 (BND2) for MPX. This register is used by MPX instructions
     * to validate memory accesses by checking if they fall within the specified bounds.
     */
    public static final InstructionCreateRegister bnd2 = InstructionCreateRegisters.bnd2;

    /**
     * Bound register 3 (BND3) for MPX. This register is one of four bound registers
     * used in the hardware-assisted bounds checking mechanism provided by MPX.
     */
    public static final InstructionCreateRegister bnd3 = InstructionCreateRegisters.bnd3;
}
