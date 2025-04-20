package architecture;

import java.util.List;

import mi.m4x.carbide.architecture.InstructionCreateRegister;
import mi.m4x.carbide.architecture.InstructionCreateRegisters;

public class InstructionCreateRegisterTest {
    public static void main(String[] args) {
        // Call the static method to get all registers
        List<InstructionCreateRegister> allRegisters = InstructionCreateRegisters.all();

        // Print them one by one
        for (InstructionCreateRegister reg : allRegisters) {
            System.out.println("Register ID: " + reg.get());
        }
    }
}
