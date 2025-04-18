package mi.m4x.carbide;

import mi.m4x.carbide.natives.Architecture;
import mi.m4x.carbide.natives.OperatingSystems;

public class Main {
    public static void main(String[] args) {
        System.out.printf(Architecture.get() + "\n");
        System.out.printf(OperatingSystems.get() + "\n");
    }
}