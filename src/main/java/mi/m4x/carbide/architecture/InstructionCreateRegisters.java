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

    public static List<InstructionCreateRegister> all() {
        return Collections.unmodifiableList(Arrays.asList(
                al, cl, dl, bl, ah, ch, dh, bh,
                spl, bpl, sil, dil,
                r8b, r9b, r10b, r11b, r12b, r13b, r14b, r15b,
                ax, cx, dx, bx, sp, bp, si, di, r8w, r9w,
                r10w, r11w, r12w, r13w, r14w, r15w, eax, ecx,
                edx, ebx, esp, ebp, esi, edi
        ));
    }
}
