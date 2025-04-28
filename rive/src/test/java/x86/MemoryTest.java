package x86;

import mi.m4x.rive.InstructionCreateRegister;
import mi.m4x.rive.MemorySize;

import java.util.List;

public class MemoryTest {
    public static void main(String[] args) {
        List<Integer> broadcasts = MemorySize.all();

        broadcasts.forEach(value -> System.out.println("Register ID: " + value));
    }
}
