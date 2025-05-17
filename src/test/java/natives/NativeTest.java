package natives;

import mi.m4x.carbide.natives.Architecture;
import mi.m4x.carbide.natives.OperatingSystems;

public class NativeTest {
    public static void main(String[] args) {
        System.out.printf(Architecture.get() + "\n");
        System.out.printf(OperatingSystems.detect() + "\n");
    }
}
