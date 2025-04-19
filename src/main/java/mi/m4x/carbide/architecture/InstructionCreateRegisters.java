package mi.m4x.carbide.architecture;

import mi.m4x.carbide.interfaces.Beta;

@Beta
public class InstructionCreateRegisters {
    private InstructionCreateRegisters() {}

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
}
