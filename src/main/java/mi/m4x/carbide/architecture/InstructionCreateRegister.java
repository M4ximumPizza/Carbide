package mi.m4x.carbide.architecture;

import mi.m4x.carbide.interfaces.Beta;

/**
 * Represents an instruction that creates or references a specific register.
 * This class is immutable and optimized for quick equality checks and hash-based lookups.
 *
 * <p>Used in contexts where virtual registers are dynamically allocated or referenced.
 *
 * @author M4ximumpizza
 * @since 1.0.1
 */
@Beta
public final class InstructionCreateRegister {

    /** The internal identifier for the register. */
    private final int register;

    /**
     * A singleton representing a "no register" state.
     * This is often used as a default or placeholder instruction.
     */
    public static final InstructionCreateRegister NONE = new InstructionCreateRegister(Register.NONE);

    /**
     * Constructs a new {@code InstructionCreateRegister} with the given register.
     *
     * Dont call
     *
     * @param register the register identifier
     */
    public InstructionCreateRegister(int register) {
        this.register = register;
    }

    /**
     * Returns the register associated with this instruction.
     *
     * @return the register ID
     */
    public int get() {
        return register;
    }

    /**
     * Computes a hash code based on the register value.
     *
     * @return the hash code
     */
    @Override
    public int hashCode() {
        return Integer.hashCode(register);
    }

    /**
     * Compares this instruction to another for equality.
     * Two {@code InstructionCreateRegister} instances are equal if they reference the same register.
     *
     * @param obj the object to compare
     * @return true if the other object is an {@code InstructionCreateRegister} with the same register
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof InstructionCreateRegister)) return false;
        InstructionCreateRegister other = (InstructionCreateRegister) obj;
        return this.register == other.register;
    }
}

