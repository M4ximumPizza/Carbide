package mi.m4x.carbide.architecture;

import mi.m4x.carbide.interfaces.Beta;

/**
 * @since 1.0.1
 * @author M4ximumpizza
 */
@Beta
public final class Register {
    private Register() {}

    public static final int NONE = 0;

    /**
     * Lower 8 bits of the AX register (Accumulator Register). This is often used
     * for arithmetic operations and I/O operations. Sometimes, the default operand
     * for many instructions.
     */
    public static final int AL = 1;
    /**
     * Lower 8 bits of the CX register (Counter Register). This is often used in
     * loop operations and shift/rotate instructions.
     */
    public static final int CL = 2;

    /**
     * Lower 8 bits of the DX register (Data Register). This is often used in
     * I/O operations and multiplication/division operations.
     */
    public static final int DL = 3;

}
