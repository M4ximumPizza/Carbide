package mi.m4x.rive.registers;

import mi.m4x.carbide.interfaces.Beta;

import java.util.List;

@Beta
public class InstructionCreateRegisters {
    public InstructionCreateRegisters() {}

    public static final InstructionCreateRegister NONE = new InstructionCreateRegister(Register.NONE);
    public static final InstructionCreateRegister rip = new InstructionCreateRegister(Register.RIP);
    public static final InstructionCreateRegister eip = new InstructionCreateRegister(Register.EIP);
    public static final InstructionCreateRegister rax = new InstructionCreateRegister(Register.RAX);
    public static final InstructionCreateRegister rcx = new InstructionCreateRegister(Register.RCX);
    public static final InstructionCreateRegister rdx = new InstructionCreateRegister(Register.RDX);
    public static final InstructionCreateRegister rbx = new InstructionCreateRegister(Register.RBX);
    public static final InstructionCreateRegister rsp = new InstructionCreateRegister(Register.RSP);
    public static final InstructionCreateRegister rbp = new InstructionCreateRegister(Register.RBP);
    public static final InstructionCreateRegister rsi = new InstructionCreateRegister(Register.RSI);
    public static final InstructionCreateRegister rdi = new InstructionCreateRegister(Register.RDI);
    public static final InstructionCreateRegister eax = new InstructionCreateRegister(Register.EAX);
    public static final InstructionCreateRegister ecx = new InstructionCreateRegister(Register.ECX);
    public static final InstructionCreateRegister edx = new InstructionCreateRegister(Register.EDX);
    public static final InstructionCreateRegister ebx = new InstructionCreateRegister(Register.EBX);
    public static final InstructionCreateRegister esp = new InstructionCreateRegister(Register.ESP);
    public static final InstructionCreateRegister ebp = new InstructionCreateRegister(Register.EBP);
    public static final InstructionCreateRegister esi = new InstructionCreateRegister(Register.ESI);
    public static final InstructionCreateRegister edi = new InstructionCreateRegister(Register.EDI);
    public static final InstructionCreateRegister ax = new InstructionCreateRegister(Register.AX);
    public static final InstructionCreateRegister cx = new InstructionCreateRegister(Register.CX);
    public static final InstructionCreateRegister dx = new InstructionCreateRegister(Register.DX);
    public static final InstructionCreateRegister bx = new InstructionCreateRegister(Register.BX);
    public static final InstructionCreateRegister sp = new InstructionCreateRegister(Register.SP);
    public static final InstructionCreateRegister bp = new InstructionCreateRegister(Register.BP);
    public static final InstructionCreateRegister si = new InstructionCreateRegister(Register.SI);
    public static final InstructionCreateRegister di = new InstructionCreateRegister(Register.DI);
    public static final InstructionCreateRegister al = new InstructionCreateRegister(Register.AL);
    public static final InstructionCreateRegister cl = new InstructionCreateRegister(Register.CL);
    public static final InstructionCreateRegister dl = new InstructionCreateRegister(Register.DL);
    public static final InstructionCreateRegister bl = new InstructionCreateRegister(Register.BL);
    public static final InstructionCreateRegister ah = new InstructionCreateRegister(Register.AH);
    public static final InstructionCreateRegister ch = new InstructionCreateRegister(Register.CH);
    public static final InstructionCreateRegister dh = new InstructionCreateRegister(Register.DH);
    public static final InstructionCreateRegister bh = new InstructionCreateRegister(Register.BH);
    public static final InstructionCreateRegister r8 = new InstructionCreateRegister(Register.R8);
    public static final InstructionCreateRegister r9 = new InstructionCreateRegister(Register.R9);
    public static final InstructionCreateRegister r10 = new InstructionCreateRegister(Register.R10);
    public static final InstructionCreateRegister r11 = new InstructionCreateRegister(Register.R11);
    public static final InstructionCreateRegister r12 = new InstructionCreateRegister(Register.R12);
    public static final InstructionCreateRegister r13 = new InstructionCreateRegister(Register.R13);
    public static final InstructionCreateRegister r14 = new InstructionCreateRegister(Register.R14);
    public static final InstructionCreateRegister r15 = new InstructionCreateRegister(Register.R15);
    public static final InstructionCreateRegister r8d = new InstructionCreateRegister(Register.R8D);
    public static final InstructionCreateRegister r9d = new InstructionCreateRegister(Register.R9D);
    public static final InstructionCreateRegister r10d = new InstructionCreateRegister(Register.R10D);
    public static final InstructionCreateRegister r11d = new InstructionCreateRegister(Register.R11D);
    public static final InstructionCreateRegister r12d = new InstructionCreateRegister(Register.R12D);
    public static final InstructionCreateRegister r13d = new InstructionCreateRegister(Register.R13D);
    public static final InstructionCreateRegister r14d = new InstructionCreateRegister(Register.R14D);
    public static final InstructionCreateRegister r15d = new InstructionCreateRegister(Register.R15D);
    public static final InstructionCreateRegister r8w = new InstructionCreateRegister(Register.R8W);
    public static final InstructionCreateRegister r9w = new InstructionCreateRegister(Register.R9W);
    public static final InstructionCreateRegister r10w = new InstructionCreateRegister(Register.R10W);
    public static final InstructionCreateRegister r11w = new InstructionCreateRegister(Register.R11W);
    public static final InstructionCreateRegister r12w = new InstructionCreateRegister(Register.R12W);
    public static final InstructionCreateRegister r13w = new InstructionCreateRegister(Register.R13W);
    public static final InstructionCreateRegister r14w = new InstructionCreateRegister(Register.R14W);
    public static final InstructionCreateRegister r15w = new InstructionCreateRegister(Register.R15W);
    public static final InstructionCreateRegister r8b = new InstructionCreateRegister(Register.R8L);
    public static final InstructionCreateRegister r9b = new InstructionCreateRegister(Register.R9L);
    public static final InstructionCreateRegister r10b = new InstructionCreateRegister(Register.R10L);
    public static final InstructionCreateRegister r11b = new InstructionCreateRegister(Register.R11L);
    public static final InstructionCreateRegister r12b = new InstructionCreateRegister(Register.R12L);
    public static final InstructionCreateRegister r13b = new InstructionCreateRegister(Register.R13L);
    public static final InstructionCreateRegister r14b = new InstructionCreateRegister(Register.R14L);
    public static final InstructionCreateRegister r15b = new InstructionCreateRegister(Register.R15L);
    public static final InstructionCreateRegister spl = new InstructionCreateRegister(Register.SPL);
    public static final InstructionCreateRegister bpl = new InstructionCreateRegister(Register.BPL);
    public static final InstructionCreateRegister sil = new InstructionCreateRegister(Register.SIL);
    public static final InstructionCreateRegister dil = new InstructionCreateRegister(Register.DIL);
    public static final InstructionCreateRegister es = new InstructionCreateRegister(Register.ES);
    public static final InstructionCreateRegister cs = new InstructionCreateRegister(Register.CS);
    public static final InstructionCreateRegister ss = new InstructionCreateRegister(Register.SS);
    public static final InstructionCreateRegister ds = new InstructionCreateRegister(Register.DS);
    public static final InstructionCreateRegister fs = new InstructionCreateRegister(Register.FS);
    public static final InstructionCreateRegister gs = new InstructionCreateRegister(Register.GS);
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
    public static final InstructionCreateRegister tr0 = new InstructionCreateRegister(Register.TR0);
    public static final InstructionCreateRegister tr1 = new InstructionCreateRegister(Register.TR1);
    public static final InstructionCreateRegister tr2 = new InstructionCreateRegister(Register.TR2);
    public static final InstructionCreateRegister tr3 = new InstructionCreateRegister(Register.TR3);
    public static final InstructionCreateRegister tr4 = new InstructionCreateRegister(Register.TR4);
    public static final InstructionCreateRegister tr5 = new InstructionCreateRegister(Register.TR5);
    public static final InstructionCreateRegister tr6 = new InstructionCreateRegister(Register.TR6);
    public static final InstructionCreateRegister tr7 = new InstructionCreateRegister(Register.TR7);
    public static final InstructionCreateRegister st0 = new InstructionCreateRegister(Register.ST0);
    public static final InstructionCreateRegister st1 = new InstructionCreateRegister(Register.ST1);
    public static final InstructionCreateRegister st2 = new InstructionCreateRegister(Register.ST2);
    public static final InstructionCreateRegister st3 = new InstructionCreateRegister(Register.ST3);
    public static final InstructionCreateRegister st4 = new InstructionCreateRegister(Register.ST4);
    public static final InstructionCreateRegister st5 = new InstructionCreateRegister(Register.ST5);
    public static final InstructionCreateRegister st6 = new InstructionCreateRegister(Register.ST6);
    public static final InstructionCreateRegister st7 = new InstructionCreateRegister(Register.ST7);
    public static final InstructionCreateRegister bnd0 = new InstructionCreateRegister(Register.BND0);
    public static final InstructionCreateRegister bnd1 = new InstructionCreateRegister(Register.BND1);
    public static final InstructionCreateRegister bnd2 = new InstructionCreateRegister(Register.BND2);
    public static final InstructionCreateRegister bnd3 = new InstructionCreateRegister(Register.BND3);
    public static final InstructionCreateRegister k0 = new InstructionCreateRegister(Register.K0);
    public static final InstructionCreateRegister k1 = new InstructionCreateRegister(Register.K1);
    public static final InstructionCreateRegister k2 = new InstructionCreateRegister(Register.K2);
    public static final InstructionCreateRegister k3 = new InstructionCreateRegister(Register.K3);
    public static final InstructionCreateRegister k4 = new InstructionCreateRegister(Register.K4);
    public static final InstructionCreateRegister k5 = new InstructionCreateRegister(Register.K5);
    public static final InstructionCreateRegister k6 = new InstructionCreateRegister(Register.K6);
    public static final InstructionCreateRegister k7 = new InstructionCreateRegister(Register.K7);
    public static final InstructionCreateRegister mm0 = new InstructionCreateRegister(Register.MM0);
    public static final InstructionCreateRegister mm1 = new InstructionCreateRegister(Register.MM1);
    public static final InstructionCreateRegister mm2 = new InstructionCreateRegister(Register.MM2);
    public static final InstructionCreateRegister mm3 = new InstructionCreateRegister(Register.MM3);
    public static final InstructionCreateRegister mm4 = new InstructionCreateRegister(Register.MM4);
    public static final InstructionCreateRegister mm5 = new InstructionCreateRegister(Register.MM5);
    public static final InstructionCreateRegister mm6 = new InstructionCreateRegister(Register.MM6);
    public static final InstructionCreateRegister mm7 = new InstructionCreateRegister(Register.MM7);
    public static final InstructionCreateRegister xmm0 = new InstructionCreateRegister(Register.XMM0);
    public static final InstructionCreateRegister xmm1 = new InstructionCreateRegister(Register.XMM1);
    public static final InstructionCreateRegister xmm2 = new InstructionCreateRegister(Register.XMM2);
    public static final InstructionCreateRegister xmm3 = new InstructionCreateRegister(Register.XMM3);
    public static final InstructionCreateRegister xmm4 = new InstructionCreateRegister(Register.XMM4);
    public static final InstructionCreateRegister xmm5 = new InstructionCreateRegister(Register.XMM5);
    public static final InstructionCreateRegister xmm6 = new InstructionCreateRegister(Register.XMM6);
    public static final InstructionCreateRegister xmm7 = new InstructionCreateRegister(Register.XMM7);
    public static final InstructionCreateRegister xmm8 = new InstructionCreateRegister(Register.XMM8);
    public static final InstructionCreateRegister xmm9 = new InstructionCreateRegister(Register.XMM9);
    public static final InstructionCreateRegister xmm10 = new InstructionCreateRegister(Register.XMM10);
    public static final InstructionCreateRegister xmm11 = new InstructionCreateRegister(Register.XMM11);
    public static final InstructionCreateRegister xmm12 = new InstructionCreateRegister(Register.XMM12);
    public static final InstructionCreateRegister xmm13 = new InstructionCreateRegister(Register.XMM13);
    public static final InstructionCreateRegister xmm14 = new InstructionCreateRegister(Register.XMM14);
    public static final InstructionCreateRegister xmm15 = new InstructionCreateRegister(Register.XMM15);
    public static final InstructionCreateRegister xmm16 = new InstructionCreateRegister(Register.XMM16);
    public static final InstructionCreateRegister xmm17 = new InstructionCreateRegister(Register.XMM17);
    public static final InstructionCreateRegister xmm18 = new InstructionCreateRegister(Register.XMM18);
    public static final InstructionCreateRegister xmm19 = new InstructionCreateRegister(Register.XMM19);
    public static final InstructionCreateRegister xmm20 = new InstructionCreateRegister(Register.XMM20);
    public static final InstructionCreateRegister xmm21 = new InstructionCreateRegister(Register.XMM21);
    public static final InstructionCreateRegister xmm22 = new InstructionCreateRegister(Register.XMM22);
    public static final InstructionCreateRegister xmm23 = new InstructionCreateRegister(Register.XMM23);
    public static final InstructionCreateRegister xmm24 = new InstructionCreateRegister(Register.XMM24);
    public static final InstructionCreateRegister xmm25 = new InstructionCreateRegister(Register.XMM25);
    public static final InstructionCreateRegister xmm26 = new InstructionCreateRegister(Register.XMM26);
    public static final InstructionCreateRegister xmm27 = new InstructionCreateRegister(Register.XMM27);
    public static final InstructionCreateRegister xmm28 = new InstructionCreateRegister(Register.XMM28);
    public static final InstructionCreateRegister xmm29 = new InstructionCreateRegister(Register.XMM29);
    public static final InstructionCreateRegister xmm30 = new InstructionCreateRegister(Register.XMM30);
    public static final InstructionCreateRegister xmm31 = new InstructionCreateRegister(Register.XMM31);
    public static final InstructionCreateRegister ymm0 = new InstructionCreateRegister(Register.YMM0);
    public static final InstructionCreateRegister ymm1 = new InstructionCreateRegister(Register.YMM1);
    public static final InstructionCreateRegister ymm2 = new InstructionCreateRegister(Register.YMM2);
    public static final InstructionCreateRegister ymm3 = new InstructionCreateRegister(Register.YMM3);
    public static final InstructionCreateRegister ymm4 = new InstructionCreateRegister(Register.YMM4);
    public static final InstructionCreateRegister ymm5 = new InstructionCreateRegister(Register.YMM5);
    public static final InstructionCreateRegister ymm6 = new InstructionCreateRegister(Register.YMM6);
    public static final InstructionCreateRegister ymm7 = new InstructionCreateRegister(Register.YMM7);
    public static final InstructionCreateRegister ymm8 = new InstructionCreateRegister(Register.YMM8);
    public static final InstructionCreateRegister ymm9 = new InstructionCreateRegister(Register.YMM9);
    public static final InstructionCreateRegister ymm10 = new InstructionCreateRegister(Register.YMM10);
    public static final InstructionCreateRegister ymm11 = new InstructionCreateRegister(Register.YMM11);
    public static final InstructionCreateRegister ymm12 = new InstructionCreateRegister(Register.YMM12);
    public static final InstructionCreateRegister ymm13 = new InstructionCreateRegister(Register.YMM13);
    public static final InstructionCreateRegister ymm14 = new InstructionCreateRegister(Register.YMM14);
    public static final InstructionCreateRegister ymm15 = new InstructionCreateRegister(Register.YMM15);
    public static final InstructionCreateRegister ymm16 = new InstructionCreateRegister(Register.YMM16);
    public static final InstructionCreateRegister ymm17 = new InstructionCreateRegister(Register.YMM17);
    public static final InstructionCreateRegister ymm18 = new InstructionCreateRegister(Register.YMM18);
    public static final InstructionCreateRegister ymm19 = new InstructionCreateRegister(Register.YMM19);
    public static final InstructionCreateRegister ymm20 = new InstructionCreateRegister(Register.YMM20);
    public static final InstructionCreateRegister ymm21 = new InstructionCreateRegister(Register.YMM21);
    public static final InstructionCreateRegister ymm22 = new InstructionCreateRegister(Register.YMM22);
    public static final InstructionCreateRegister ymm23 = new InstructionCreateRegister(Register.YMM23);
    public static final InstructionCreateRegister ymm24 = new InstructionCreateRegister(Register.YMM24);
    public static final InstructionCreateRegister ymm25 = new InstructionCreateRegister(Register.YMM25);
    public static final InstructionCreateRegister ymm26 = new InstructionCreateRegister(Register.YMM26);
    public static final InstructionCreateRegister ymm27 = new InstructionCreateRegister(Register.YMM27);
    public static final InstructionCreateRegister ymm28 = new InstructionCreateRegister(Register.YMM28);
    public static final InstructionCreateRegister ymm29 = new InstructionCreateRegister(Register.YMM29);
    public static final InstructionCreateRegister ymm30 = new InstructionCreateRegister(Register.YMM30);
    public static final InstructionCreateRegister ymm31 = new InstructionCreateRegister(Register.YMM31);
    public static final InstructionCreateRegister zmm0 = new InstructionCreateRegister(Register.ZMM0);
    public static final InstructionCreateRegister zmm1 = new InstructionCreateRegister(Register.ZMM1);
    public static final InstructionCreateRegister zmm2 = new InstructionCreateRegister(Register.ZMM2);
    public static final InstructionCreateRegister zmm3 = new InstructionCreateRegister(Register.ZMM3);
    public static final InstructionCreateRegister zmm4 = new InstructionCreateRegister(Register.ZMM4);
    public static final InstructionCreateRegister zmm5 = new InstructionCreateRegister(Register.ZMM5);
    public static final InstructionCreateRegister zmm6 = new InstructionCreateRegister(Register.ZMM6);
    public static final InstructionCreateRegister zmm7 = new InstructionCreateRegister(Register.ZMM7);
    public static final InstructionCreateRegister zmm8 = new InstructionCreateRegister(Register.ZMM8);
    public static final InstructionCreateRegister zmm9 = new InstructionCreateRegister(Register.ZMM9);
    public static final InstructionCreateRegister zmm10 = new InstructionCreateRegister(Register.ZMM10);
    public static final InstructionCreateRegister zmm11 = new InstructionCreateRegister(Register.ZMM11);
    public static final InstructionCreateRegister zmm12 = new InstructionCreateRegister(Register.ZMM12);
    public static final InstructionCreateRegister zmm13 = new InstructionCreateRegister(Register.ZMM13);
    public static final InstructionCreateRegister zmm14 = new InstructionCreateRegister(Register.ZMM14);
    public static final InstructionCreateRegister zmm15 = new InstructionCreateRegister(Register.ZMM15);
    public static final InstructionCreateRegister zmm16 = new InstructionCreateRegister(Register.ZMM16);
    public static final InstructionCreateRegister zmm17 = new InstructionCreateRegister(Register.ZMM17);
    public static final InstructionCreateRegister zmm18 = new InstructionCreateRegister(Register.ZMM18);
    public static final InstructionCreateRegister zmm19 = new InstructionCreateRegister(Register.ZMM19);
    public static final InstructionCreateRegister zmm20 = new InstructionCreateRegister(Register.ZMM20);
    public static final InstructionCreateRegister zmm21 = new InstructionCreateRegister(Register.ZMM21);
    public static final InstructionCreateRegister zmm22 = new InstructionCreateRegister(Register.ZMM22);
    public static final InstructionCreateRegister zmm23 = new InstructionCreateRegister(Register.ZMM23);
    public static final InstructionCreateRegister zmm24 = new InstructionCreateRegister(Register.ZMM24);
    public static final InstructionCreateRegister zmm25 = new InstructionCreateRegister(Register.ZMM25);
    public static final InstructionCreateRegister zmm26 = new InstructionCreateRegister(Register.ZMM26);
    public static final InstructionCreateRegister zmm27 = new InstructionCreateRegister(Register.ZMM27);
    public static final InstructionCreateRegister zmm28 = new InstructionCreateRegister(Register.ZMM28);
    public static final InstructionCreateRegister zmm29 = new InstructionCreateRegister(Register.ZMM29);
    public static final InstructionCreateRegister zmm30 = new InstructionCreateRegister(Register.ZMM30);
    public static final InstructionCreateRegister zmm31 = new InstructionCreateRegister(Register.ZMM31);
    public static final InstructionCreateRegister tmm0 = new InstructionCreateRegister(Register.TMM0);
    public static final InstructionCreateRegister tmm1 = new InstructionCreateRegister(Register.TMM1);
    public static final InstructionCreateRegister tmm2 = new InstructionCreateRegister(Register.TMM2);
    public static final InstructionCreateRegister tmm3 = new InstructionCreateRegister(Register.TMM3);
    public static final InstructionCreateRegister tmm4 = new InstructionCreateRegister(Register.TMM4);
    public static final InstructionCreateRegister tmm5 = new InstructionCreateRegister(Register.TMM5);
    public static final InstructionCreateRegister tmm6 = new InstructionCreateRegister(Register.TMM6);
    public static final InstructionCreateRegister tmm7 = new InstructionCreateRegister(Register.TMM7);

    public static List<InstructionCreateRegister> all() {
        // No register
        return List.of(
                NONE,

                // General-purpose registers
                rax, rcx, rdx, rbx, rsp, rbp, rsi, rdi,

                eax, ecx, edx, ebx, esp, ebp, esi, edi,

                ax, cx, dx, bx, sp, bp, si, di,

                al, cl, dl, bl, ah, ch, dh, bh,

                r8, r9, r10, r11, r12, r13, r14, r15,

                r8d, r9d, r10d, r11d, r12d, r13d, r14d, r15d,

                r8w, r9w, r10w, r11w, r12w, r13w, r14w, r15w,

                r8b, r9b, r10b, r11b, r12b, r13b, r14b, r15b,

                spl, bpl, sil, dil,

                // Segment registers
                es, cs, ss, ds, fs, gs,

                // Control registers
                cr0, cr1, cr2, cr3, cr4, cr5, cr6, cr7,
                cr8, cr9, cr10, cr11, cr12, cr13, cr14, cr15,

                // Debug registers
                dr0, dr1, dr2, dr3, dr4, dr5, dr6, dr7,
                dr8, dr9, dr10, dr11, dr12, dr13, dr14, dr15,

                // Test registers
                tr0, tr1, tr2, tr3, tr4, tr5, tr6, tr7,

                // Floating-point registers
                st0, st1, st2, st3, st4, st5, st6, st7,
                mm0, mm1, mm2, mm3, mm4, mm5, mm6, mm7,
                xmm0, xmm1, xmm2, xmm3, xmm4, xmm5, xmm6, xmm7,
                xmm8, xmm9, xmm10, xmm11, xmm12, xmm13, xmm14, xmm15,
                xmm16, xmm17, xmm18, xmm19, xmm20, xmm21, xmm22, xmm23,
                xmm24, xmm25, xmm26, xmm27, xmm28, xmm29, xmm30, xmm31,
                ymm0, ymm1, ymm2, ymm3, ymm4, ymm5, ymm6, ymm7,
                ymm8, ymm9, ymm10, ymm11, ymm12, ymm13, ymm14, ymm15,
                ymm16, ymm17, ymm18, ymm19, ymm20, ymm21, ymm22, ymm23,
                ymm24, ymm25, ymm26, ymm27, ymm28, ymm29, ymm30, ymm31,
                zmm0, zmm1, zmm2, zmm3, zmm4, zmm5, zmm6, zmm7,
                zmm8, zmm9, zmm10, zmm11, zmm12, zmm13, zmm14, zmm15,
                zmm16, zmm17, zmm18, zmm19, zmm20, zmm21, zmm22, zmm23,
                zmm24, zmm25, zmm26, zmm27, zmm28, zmm29, zmm30, zmm31,

                // Mask registers
                k0, k1, k2, k3, k4, k5, k6, k7,
                // Bound registers
                bnd0, bnd1, bnd2, bnd3,
                // Test registers
                tmm0, tmm1, tmm2, tmm3, tmm4, tmm5, tmm6, tmm7);
    }
}
