package mi.m4x.rive.registers;

import mi.m4x.carbide.interfaces.Beta;
import mi.m4x.rive.constants.Constants;

/**
 * Represents metadata about a CPU register, including its identity, associated base register,
 * canonical full-width register, and register size in bytes.
 *
 * This is primarily used to unify different views of the same logical register (e.g., AL/AX/EAX/RAX)
 * under a consistent abstraction.
 *
 * @author M4ximumpizza
 * @since 1.0.1
 */
@Beta
public class RegisterInformation {
    private final int register;
    private final int baseRegister;
    private final int fullRegister;
    private final int size;

    /**
     * Constructs a new {@code RegisterInformation} instance.
     *
     * @param register     The specific register represented by this instance.
     * @param baseRegister The base or smallest subregister in the group (e.g., AL for RAX group).
     * @param fullRegister The canonical full-width register (e.g., RAX for AL/AX/EAX/RAX).
     * @param size         The size of the register in bytes.
     */
    public RegisterInformation(int register, int baseRegister, int fullRegister, int size) {
        this.register = register;
        this.baseRegister = baseRegister;
        this.fullRegister = fullRegister;
        this.size = size;
    }

    /**
     * Initializes the complete mapping of register information for all defined registers.
     * Handles special cases and quirks (e.g., GPR high-byte registers).
     *
     * @return An array of {@code RegisterInformation} instances indexed by register ordinal.
     */
    private static RegisterInformation[] initRegisterInfos() {
        RegisterInformation[] regInfos = new RegisterInformation[Constants.REGISTER_ENUM_COUNTS];

        // Special case registers
        regInfos[Register.NONE] = new RegisterInformation(0, 0, 0, 0);
        regInfos[Register.EIP] = new RegisterInformation(Register.EIP, Register.EIP, Register.RIP, 4);
        regInfos[Register.RIP] = new RegisterInformation(Register.RIP, Register.EIP, Register.RIP, 8);

        // Defined ranges of related registers
        final RegRange[] ranges = {
                new RegRange(Register.AL, Register.R15L, Register.RAX, 1),
                new RegRange(Register.AX, Register.R15W, Register.RAX, 2),
                new RegRange(Register.EAX, Register.R15D, Register.RAX, 4),
                new RegRange(Register.RAX, Register.R15, Register.RAX, 8),
                new RegRange(Register.ES, Register.GS, Register.ES, 2),
                new RegRange(Register.XMM0, Register.XMM31, Register.ZMM0, 16),
                new RegRange(Register.YMM0, Register.YMM31, Register.ZMM0, 32),
                new RegRange(Register.ZMM0, Register.ZMM31, Register.ZMM0, 64),
                new RegRange(Register.K0, Register.K7, Register.K0, 8),
                new RegRange(Register.BND0, Register.BND3, Register.BND0, 16),
                new RegRange(Register.CR0, Register.CR15, Register.CR0, 8),
                new RegRange(Register.DR0, Register.DR15, Register.DR0, 8),
                new RegRange(Register.ST0, Register.ST7, Register.ST0, 10),
                new RegRange(Register.MM0, Register.MM7, Register.MM0, 8),
                new RegRange(Register.TR0, Register.TR7, Register.TR0, 4),
                new RegRange(Register.TMM0, Register.TMM7, Register.TMM0, 0)
        };

        // Populate info for all registers in each range
        for (RegRange range : ranges) {
            int reg = range.start;
            int fullReg = range.full;

            while (reg <= range.end) {
                regInfos[reg] = new RegisterInformation(reg, range.start, fullReg, range.size);
                reg++;
                fullReg++;

                // Handle AH/BH/CH/DH skipping behavior in GPR
                if (reg == Register.AH) {
                    fullReg -= 4;
                }
            }
        }

        return regInfos;
    }

    /**
     * Lightweight container for describing a linear range of registers
     * with shared properties such as size and full-width association.
     */
    public static final class RegRange {
        final int start, end, full, size;

        /**
         * Constructs a new {@code RegRange}.
         *
         * @param start The starting register index of the range.
         * @param end   The ending register index of the range.
         * @param full  The associated full-width register for the start.
         * @param size  The size of registers in this range in bytes.
         */
        public RegRange(int start, int end, int full, int size) {
            this.start = start;
            this.end = end;
            this.full = full;
            this.size = size;
        }
    }

    /**
     * Gets the size of the register in bytes.
     *
     * @return The register size in bytes.
     */
    public int getSize() {
        return size;
    }

    /**
     * Gets the full-width register corresponding to this register.
     *
     * @return The full register index.
     */
    public int getFullRegister() {
        return fullRegister;
    }

    /**
     * Gets the base register for the register group this belongs to.
     *
     * @return The base register index.
     */
    public int getBaseRegister() {
        return baseRegister;
    }

    /**
     * Gets the register identifier represented by this object.
     *
     * @return The current register index.
     */
    public int getRegister() {
        return register;
    }
}
