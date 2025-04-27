package x86;

import mi.m4x.rive.MemorySize;

import java.util.List;

public class MemoryTest {
    public static void main(String[] args) {
        List<Integer> allSize = MemorySize.all();

        // Print them one by one
        for (Integer size : allSize) {
            System.out.println("Register ID: " + allSize.get(size));
        }
    }
}
