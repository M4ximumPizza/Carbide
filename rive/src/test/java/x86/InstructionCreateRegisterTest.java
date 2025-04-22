package x86;

import mi.m4x.rive.InstructionCreateRegister;
import mi.m4x.rive.InstructionCreateRegisters;

import java.util.List;

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
