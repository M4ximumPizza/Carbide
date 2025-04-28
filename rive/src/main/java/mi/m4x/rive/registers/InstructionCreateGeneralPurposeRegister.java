package mi.m4x.rive.registers;

import mi.m4x.carbide.interfaces.Beta;

/**
 * Provides static references to the general-purpose x86 and x86-64 registers.
 *
 * <p>This utility class exposes instances of {@link InstructionCreateRegister}
 * corresponding to general-purpose registers across all operand sizes:
 * 8-bit (e.g., {@code al}, {@code cl}), 16-bit (e.g., {@code ax}, {@code cx}),
 * 32-bit (e.g., {@code eax}, {@code ecx}), and 64-bit (e.g., {@code rax}, {@code rcx}).</p>
 *
 * <p>These registers are typically used for arithmetic, logic, data movement,
 * and function calling conventions in assembly-level programming.</p>
 *
 * <p>This class is not meant to be instantiated.</p>
 *
 * @since 1.0.1
 * @author M4ximumpizza
 */
@Beta
public class InstructionCreateGeneralPurposeRegister {

    // Private constructor to prevent instantiation
    private InstructionCreateGeneralPurposeRegister() {
        // Prevent instantiation
    }

    // 8-bit low registers
    public static final InstructionCreateRegister al = InstructionCreateRegisters.al;
    public static final InstructionCreateRegister cl = InstructionCreateRegisters.cl;
    public static final InstructionCreateRegister dl = InstructionCreateRegisters.dl;
    public static final InstructionCreateRegister bl = InstructionCreateRegisters.bl;
    public static final InstructionCreateRegister ah = InstructionCreateRegisters.ah;
    public static final InstructionCreateRegister ch = InstructionCreateRegisters.ch;
    public static final InstructionCreateRegister dh = InstructionCreateRegisters.dh;
    public static final InstructionCreateRegister bh = InstructionCreateRegisters.bh;
    public static final InstructionCreateRegister spl = InstructionCreateRegisters.spl;
    public static final InstructionCreateRegister bpl = InstructionCreateRegisters.bpl;
    public static final InstructionCreateRegister sil = InstructionCreateRegisters.sil;
    public static final InstructionCreateRegister dil = InstructionCreateRegisters.dil;
    public static final InstructionCreateRegister r8b = InstructionCreateRegisters.r8b;
    public static final InstructionCreateRegister r9b = InstructionCreateRegisters.r9b;
    public static final InstructionCreateRegister r10b = InstructionCreateRegisters.r10b;
    public static final InstructionCreateRegister r11b = InstructionCreateRegisters.r11b;
    public static final InstructionCreateRegister r12b = InstructionCreateRegisters.r12b;
    public static final InstructionCreateRegister r13b = InstructionCreateRegisters.r13b;
    public static final InstructionCreateRegister r14b = InstructionCreateRegisters.r14b;
    public static final InstructionCreateRegister r15b = InstructionCreateRegisters.r15b;

    // 16-bit registers
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

    // 32-bit registers
    public static final InstructionCreateRegister eax = InstructionCreateRegisters.eax;
    public static final InstructionCreateRegister ecx = InstructionCreateRegisters.ecx;
    public static final InstructionCreateRegister edx = InstructionCreateRegisters.edx;
    public static final InstructionCreateRegister ebx = InstructionCreateRegisters.ebx;
    public static final InstructionCreateRegister esp = InstructionCreateRegisters.esp;
    public static final InstructionCreateRegister ebp = InstructionCreateRegisters.ebp;
    public static final InstructionCreateRegister esi = InstructionCreateRegisters.esi;
    public static final InstructionCreateRegister edi = InstructionCreateRegisters.edi;
    public static final InstructionCreateRegister r8d = InstructionCreateRegisters.r8d;
    public static final InstructionCreateRegister r9d = InstructionCreateRegisters.r9d;
    public static final InstructionCreateRegister r10d = InstructionCreateRegisters.r10d;
    public static final InstructionCreateRegister r11d = InstructionCreateRegisters.r11d;
    public static final InstructionCreateRegister r12d = InstructionCreateRegisters.r12d;
    public static final InstructionCreateRegister r13d = InstructionCreateRegisters.r13d;
    public static final InstructionCreateRegister r14d = InstructionCreateRegisters.r14d;
    public static final InstructionCreateRegister r15d = InstructionCreateRegisters.r15d;

    // 64-bit registers
    public static final InstructionCreateRegister rax = InstructionCreateRegisters.rax;
    public static final InstructionCreateRegister rcx = InstructionCreateRegisters.rcx;
    public static final InstructionCreateRegister rdx = InstructionCreateRegisters.rdx;
    public static final InstructionCreateRegister rbx = InstructionCreateRegisters.rbx;
    public static final InstructionCreateRegister rsp = InstructionCreateRegisters.rsp;
    public static final InstructionCreateRegister rbp = InstructionCreateRegisters.rbp;
    public static final InstructionCreateRegister rsi = InstructionCreateRegisters.rsi;
    public static final InstructionCreateRegister rdi = InstructionCreateRegisters.rdi;
    public static final InstructionCreateRegister r8 = InstructionCreateRegisters.r8;
    public static final InstructionCreateRegister r9 = InstructionCreateRegisters.r9;
    public static final InstructionCreateRegister r10 = InstructionCreateRegisters.r10;
    public static final InstructionCreateRegister r11 = InstructionCreateRegisters.r11;
    public static final InstructionCreateRegister r12 = InstructionCreateRegisters.r12;
    public static final InstructionCreateRegister r13 = InstructionCreateRegisters.r13;
    public static final InstructionCreateRegister r14 = InstructionCreateRegisters.r14;
    public static final InstructionCreateRegister r15 = InstructionCreateRegisters.r15;
}
