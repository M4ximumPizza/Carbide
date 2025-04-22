package mi.m4x.rive;

import mi.m4x.carbide.interfaces.Beta;

/**
 * Provides static references to the 16-bit general-purpose x86 and x86-64 registers.
 *
 * <p>These 16-bit registers are a legacy of the original 8086 architecture and are still used
 * in modern assembly when dealing with word-sized operations. They are commonly utilized in
 * tasks involving data manipulation, stack operations, and register-based addressing.</p>
 *
 * <p>This class serves as a utility container for referencing {@link InstructionCreateRegister}
 * instances corresponding to each 16-bit general-purpose register. It is not intended to be instantiated.</p>
 *
 * @since 1.0.1
 * @author M4ximumpizza
 */
@Beta
public class InstructionCreateGeneralPurposeRegister16 {

    // Private constructor to prevent instantiation
    private InstructionCreateGeneralPurposeRegister16() {
        // Prevent instantiation
    }

    // 16-bit general-purpose registers
    public static final InstructionCreateRegister ax = InstructionCreateRegisters.ax;
    public static final InstructionCreateRegister cx = InstructionCreateRegisters.cx;
    public static final InstructionCreateRegister dx = InstructionCreateRegisters.dx;
    public static final InstructionCreateRegister bx = InstructionCreateRegisters.bx;
    public static final InstructionCreateRegister sp = InstructionCreateRegisters.sp;
    public static final InstructionCreateRegister bp = InstructionCreateRegisters.bp;
    public static final InstructionCreateRegister si = InstructionCreateRegisters.si;
    public static final InstructionCreateRegister di = InstructionCreateRegisters.di;
    public static final InstructionCreateRegister r8w = InstructionCreateRegisters.r8w;
    public static final InstructionCreateRegister r9w = InstructionCreateRegisters.r9w;
    public static final InstructionCreateRegister r10w = InstructionCreateRegisters.r10w;
    public static final InstructionCreateRegister r11w = InstructionCreateRegisters.r11w;
    public static final InstructionCreateRegister r12w = InstructionCreateRegisters.r12w;
    public static final InstructionCreateRegister r13w = InstructionCreateRegisters.r13w;
    public static final InstructionCreateRegister r14w = InstructionCreateRegisters.r14w;
    public static final InstructionCreateRegister r15w = InstructionCreateRegisters.r15w;
}
