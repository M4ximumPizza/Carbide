package mi.m4x.carbide.architecture;

import mi.m4x.carbide.interfaces.Beta;

@Beta
public class InstructionCreateRegisters {
    private InstructionCreateRegisters() {}

    public static final InstructionCreateRegister al = new InstructionCreateRegister(Register.AL);
    public static final InstructionCreateRegister cl = new InstructionCreateRegister(Register.CL);
    public static final InstructionCreateRegister dl = new InstructionCreateRegister(Register.DL);
}
