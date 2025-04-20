package mi.m4x.carbide.architecture;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class InstructionCreateRegisters {
    public InstructionCreateRegisters() {}

    public static final InstructionCreateRegister al = new InstructionCreateRegister(Register.AL);
    public static final InstructionCreateRegister cl = new InstructionCreateRegister(Register.CL);
    public static final InstructionCreateRegister dl = new InstructionCreateRegister(Register.DL);
    public static final InstructionCreateRegister bl = new InstructionCreateRegister(Register.BL);
    public static final InstructionCreateRegister ah = new InstructionCreateRegister(Register.AH);
    public static final InstructionCreateRegister ch = new InstructionCreateRegister(Register.CH);
    public static final InstructionCreateRegister dh = new InstructionCreateRegister(Register.DH);
    public static final InstructionCreateRegister bh = new InstructionCreateRegister(Register.BH);
    public static final InstructionCreateRegister spl = new InstructionCreateRegister(Register.SPL);
    public static final InstructionCreateRegister bpl = new InstructionCreateRegister(Register.BPL);
    public static final InstructionCreateRegister sil = new InstructionCreateRegister(Register.SIL);
    public static final InstructionCreateRegister dil = new InstructionCreateRegister(Register.DIL);
    public static final InstructionCreateRegister r8b = new InstructionCreateRegister(Register.R8L);
    public static final InstructionCreateRegister r9b = new InstructionCreateRegister(Register.R9L);
    public static final InstructionCreateRegister r10b = new InstructionCreateRegister(Register.R10L);
    public static final InstructionCreateRegister r11b = new InstructionCreateRegister(Register.R11L);
    public static final InstructionCreateRegister r12b = new InstructionCreateRegister(Register.R12L);
    public static final InstructionCreateRegister r13b = new InstructionCreateRegister(Register.R13L);
    public static final InstructionCreateRegister r14b = new InstructionCreateRegister(Register.R14L);
    public static final InstructionCreateRegister r15b = new InstructionCreateRegister(Register.R15L);
    public static final InstructionCreateRegister ax = new InstructionCreateRegister(Register.AX);
    public static final InstructionCreateRegister cx = new InstructionCreateRegister(Register.CX);
    public static final InstructionCreateRegister dx = new InstructionCreateRegister(Register.DX);
    public static final InstructionCreateRegister bx = new InstructionCreateRegister(Register.BX);
    public static final InstructionCreateRegister sp = new InstructionCreateRegister(Register.SP);
    public static final InstructionCreateRegister bp = new InstructionCreateRegister(Register.BP);
    public static final InstructionCreateRegister si = new InstructionCreateRegister(Register.SI);
    public static final InstructionCreateRegister di = new InstructionCreateRegister(Register.DI);
    public static final InstructionCreateRegister r8w = new InstructionCreateRegister(Register.R8W);
    public static final InstructionCreateRegister r9w = new InstructionCreateRegister(Register.R9W);
    public static final InstructionCreateRegister r10w = new InstructionCreateRegister(Register.R10W);
    public static final InstructionCreateRegister r11w = new InstructionCreateRegister(Register.R11W);
    public static final InstructionCreateRegister r12w = new InstructionCreateRegister(Register.R12W);
    public static final InstructionCreateRegister r13w = new InstructionCreateRegister(Register.R13W);
    public static final InstructionCreateRegister r14w = new InstructionCreateRegister(Register.R14W);
    public static final InstructionCreateRegister r15w = new InstructionCreateRegister(Register.R15W);
    public static final InstructionCreateRegister eax = new InstructionCreateRegister(Register.EAX);
    public static final InstructionCreateRegister ecx = new InstructionCreateRegister(Register.ECX);
    public static final InstructionCreateRegister edx = new InstructionCreateRegister(Register.EDX);
    public static final InstructionCreateRegister ebx = new InstructionCreateRegister(Register.EBX);
    public static final InstructionCreateRegister esp = new InstructionCreateRegister(Register.ESP);
    public static final InstructionCreateRegister ebp = new InstructionCreateRegister(Register.EBP);
    public static final InstructionCreateRegister esi = new InstructionCreateRegister(Register.ESI);
    public static final InstructionCreateRegister edi = new InstructionCreateRegister(Register.EDI);
    public static final InstructionCreateRegister r8d = new InstructionCreateRegister(Register.R8D);
    public static final InstructionCreateRegister r9d = new InstructionCreateRegister(Register.R9D);
    public static final InstructionCreateRegister r10d = new InstructionCreateRegister(Register.R10D);
    public static final InstructionCreateRegister r11d = new InstructionCreateRegister(Register.R11D);
    public static final InstructionCreateRegister r12d = new InstructionCreateRegister(Register.R12D);
    public static final InstructionCreateRegister r13d = new InstructionCreateRegister(Register.R13D);
    public static final InstructionCreateRegister r14d = new InstructionCreateRegister(Register.R14D);
    public static final InstructionCreateRegister r15d = new InstructionCreateRegister(Register.R15D);
    public static final InstructionCreateRegister rax = new InstructionCreateRegister(Register.RAX);
    public static final InstructionCreateRegister rcx = new InstructionCreateRegister(Register.RCX);
    public static final InstructionCreateRegister rdx = new InstructionCreateRegister(Register.RDX);
    public static final InstructionCreateRegister rbx = new InstructionCreateRegister(Register.RBX);
    public static final InstructionCreateRegister rsp = new InstructionCreateRegister(Register.RSP);
    public static final InstructionCreateRegister rbp = new InstructionCreateRegister(Register.RBP);
    public static final InstructionCreateRegister rsi = new InstructionCreateRegister(Register.RSI);
    public static final InstructionCreateRegister rdi = new InstructionCreateRegister(Register.RDI);
    public static final InstructionCreateRegister r8 = new InstructionCreateRegister(Register.R8);
    public static final InstructionCreateRegister r9 = new InstructionCreateRegister(Register.R9);
    public static final InstructionCreateRegister r10 = new InstructionCreateRegister(Register.R10);
    public static final InstructionCreateRegister r11 = new InstructionCreateRegister(Register.R11);
    public static final InstructionCreateRegister r12 = new InstructionCreateRegister(Register.R12);
    public static final InstructionCreateRegister r13 = new InstructionCreateRegister(Register.R13);
    public static final InstructionCreateRegister r14 = new InstructionCreateRegister(Register.R14);
    public static final InstructionCreateRegister r15 = new InstructionCreateRegister(Register.R15);
    public static final InstructionCreateRegister eip = new InstructionCreateRegister(Register.EIP);
    public static final InstructionCreateRegister rip = new InstructionCreateRegister(Register.RIP);
    public static final InstructionCreateRegister es = new InstructionCreateRegister(Register.ES);
    public static final InstructionCreateRegister cs = new InstructionCreateRegister(Register.CS);
    public static final InstructionCreateRegister ss = new InstructionCreateRegister(Register.SS);
    public static final InstructionCreateRegister ds = new InstructionCreateRegister(Register.DS);
    public static final InstructionCreateRegister fs = new InstructionCreateRegister(Register.FS);
    public static final InstructionCreateRegister gs = new InstructionCreateRegister(Register.GS);
    public static final InstructionCreateRegister st0 = new InstructionCreateRegister(Register.ST0);
    public static final InstructionCreateRegister st1 = new InstructionCreateRegister(Register.ST1);
    public static final InstructionCreateRegister st2 = new InstructionCreateRegister(Register.ST2);
    public static final InstructionCreateRegister st3 = new InstructionCreateRegister(Register.ST3);
    public static final InstructionCreateRegister st4 = new InstructionCreateRegister(Register.ST4);
    public static final InstructionCreateRegister st5 = new InstructionCreateRegister(Register.ST5);
    public static final InstructionCreateRegister st6 = new InstructionCreateRegister(Register.ST6);
    public static final InstructionCreateRegister st7 = new InstructionCreateRegister(Register.ST7);
    public static final InstructionCreateRegister cr0 = new InstructionCreateRegister(Register.CR0);
    public static final InstructionCreateRegister cr1 = new InstructionCreateRegister(Register.CR1);
    public static final InstructionCreateRegister cr2 = new InstructionCreateRegister(Register.CR2);
    public static final InstructionCreateRegister cr3 = new InstructionCreateRegister(Register.CR3);
    public static final InstructionCreateRegister cr4 = new InstructionCreateRegister(Register.CR4);
    public static final InstructionCreateRegister cr5 = new InstructionCreateRegister(Register.CR5);
    public static final InstructionCreateRegister cr6 = new InstructionCreateRegister(Register.CR6);
    public static final InstructionCreateRegister cr7 = new InstructionCreateRegister(Register.CR7);
    public static final InstructionCreateRegister cr8 = new InstructionCreateRegister(Register.CR8);
    public static final InstructionCreateRegister cr9 = new InstructionCreateRegister(Register.CR9);
    public static final InstructionCreateRegister cr10 = new InstructionCreateRegister(Register.CR10);
    public static final InstructionCreateRegister cr11 = new InstructionCreateRegister(Register.CR11);
    public static final InstructionCreateRegister cr12 = new InstructionCreateRegister(Register.CR12);
    public static final InstructionCreateRegister cr13 = new InstructionCreateRegister(Register.CR13);
    public static final InstructionCreateRegister cr14 = new InstructionCreateRegister(Register.CR14);
    public static final InstructionCreateRegister cr15 = new InstructionCreateRegister(Register.CR15);
    public static final InstructionCreateRegister dr0 = new InstructionCreateRegister(Register.DR0);
    public static final InstructionCreateRegister dr1 = new InstructionCreateRegister(Register.DR1);
    public static final InstructionCreateRegister dr2 = new InstructionCreateRegister(Register.DR2);
    public static final InstructionCreateRegister dr3 = new InstructionCreateRegister(Register.DR3);
    public static final InstructionCreateRegister dr4 = new InstructionCreateRegister(Register.DR4);
    public static final InstructionCreateRegister dr5 = new InstructionCreateRegister(Register.DR5);
    public static final InstructionCreateRegister dr6 = new InstructionCreateRegister(Register.DR6);
    public static final InstructionCreateRegister dr7 = new InstructionCreateRegister(Register.DR7);
    public static final InstructionCreateRegister dr8 = new InstructionCreateRegister(Register.DR8);
    public static final InstructionCreateRegister dr9 = new InstructionCreateRegister(Register.DR9);
    public static final InstructionCreateRegister dr10 = new InstructionCreateRegister(Register.DR10);
    public static final InstructionCreateRegister dr11 = new InstructionCreateRegister(Register.DR11);
    public static final InstructionCreateRegister dr12 = new InstructionCreateRegister(Register.DR12);
    public static final InstructionCreateRegister dr13 = new InstructionCreateRegister(Register.DR13);
    public static final InstructionCreateRegister dr14 = new InstructionCreateRegister(Register.DR14);
    public static final InstructionCreateRegister dr15 = new InstructionCreateRegister(Register.DR15);

    public static List<InstructionCreateRegister> all() {
        // No register
        return List.of(InstructionCreateRegister.NONE,

                // 8-bit general-purpose registers
                al, cl, dl, bl, ah, ch, dh, bh, spl, bpl, sil, dil, r8b, r9b, r10b, r11b, r12b, r13b, r14b, r15b,

                // 16-bit general-purpose registers
                ax, cx, dx, bx, sp, bp, si, di, r8w, r9w, r10w, r11w, r12w, r13w, r14w, r15w,

                // 32-bit general-purpose registers
                eax, ecx, edx, ebx, esp, ebp, esi, edi, r8d, r9d, r10d, r11d, r12d, r13d, r14d, r15d,

                // 64-bit general-purpose registers
                rax, rcx, rdx, rbx, rsp, rbp, rsi, rdi, r8, r9, r10, r11, r12, r13, r14, r15,

                // Instruction pointers
                eip, rip,

                // Segment registers
                es, cs, ss, ds, fs, gs,

                // FPU stack registers
                st0, st1, st2, st3, st4, st5, st6, st7,

                // Control registers
                cr0, cr1, cr2, cr3, cr4, cr5, cr6, cr7, cr8, cr9, cr10, cr11, cr12, cr13, cr14, cr15,

                // Debug registers
                dr0, dr1, dr2, dr3, dr4, dr5, dr6, dr7, dr8, dr9, dr10, dr11, dr12, dr13, dr14, dr15);
    }
}
