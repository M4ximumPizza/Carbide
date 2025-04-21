package mi.m4x.carbide.architecture;

import mi.m4x.carbide.interfaces.Beta;

/**
 * Provides static references to the x86 and x86-64 instruction pointer registers.
 *
 * <p>The instruction pointer registers ({@code eip}, {@code rip}) store the address of the next instruction
 * to be executed by the CPU. These registers are critical for controlling program flow and are commonly
 * used in debugging, emulation, and instruction patching.</p>
 *
 * <p>This class serves as a utility container for referencing {@link InstructionCreateRegister}
 * instances corresponding to each instruction pointer register and is not intended to be instantiated.</p>
 *
 * @since 1.0.1
 * @author M4ximumpizza
 */
@Beta
public class InstructionCreateInstructionPointerRegister {

    // Private constructor to prevent instantiation
    private InstructionCreateInstructionPointerRegister() {
        // Prevent instantiation
    }

    // Instruction pointer registers
    public static final InstructionCreateRegister eip = InstructionCreateRegisters.eip;
    public static final InstructionCreateRegister rip = InstructionCreateRegisters.rip;
}
