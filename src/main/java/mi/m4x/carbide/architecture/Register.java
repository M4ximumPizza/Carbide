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
     * AL (Accumulator Low): Lower 8 bits of the AX register (Accumulator Register).
     * Commonly used for arithmetic operations and I/O instructions. Frequently acts
     * as the default operand for many instructions.
     */
    public static final int AL = 1;

    /**
     * CL (Counter Low): Lower 8 bits of the CX register (Counter Register).
     * Often used in loop control structures and for shift/rotate operations
     * where the shift count is stored in CL.
     */
    public static final int CL = 2;

    /**
     * DL (Data Low): Lower 8 bits of the DX register (Data Register).
     * Used in I/O port access and extended arithmetic operations such as
     * multiplication and division.
     */
    public static final int DL = 3;

    /**
     * BL (Base Low): Lower 8 bits of the BX register (Base Register).
     * Commonly used in memory addressing and general-purpose byte storage.
     */
    public static final int BL = 4;

    /**
     * AH (Accumulator High): High 8 bits of the AX register (Accumulator Register).
     * Often used for extended precision in arithmetic and data manipulation.
     */
    public static final int AH = 5;

    /**
     * CH (Counter High): High 8 bits of the CX register (Counter Register).
     * Sometimes used in loops or when 8-bit operations are split across {@link #CH} and {@link #CL}.
     */
    public static final int CH = 6;

    /**
     * DH (Data High): High 8 bits of the DX register (Data Register).
     * Used in conjunction with DL for extended arithmetic operations.
     */
    public static final int DH = 7;

    /**
     * BH (Base High): High 8 bits of the BX register (Base Register).
     * Occasionally used in memory addressing or as a general-purpose register.
     */
    public static final int BH = 8;

    /**
    * SPL (Stack Pointer Low): Lower 8 bits of the RSP register (Stack Pointer).
    * Introduced in x86-64. Used for byte-level operations involving the stack pointer.
    */
    public static final int SPL = 9;

    /**
     * BPL (Base Pointer Low): Lower 8 bits of the RBP register (Base Pointer).
     * Introduced in x86-64. Occasionally used in pointer arithmetic or memory ops.
     */
    public static final int BPL = 10;

    /**
     * SIL (Source Index Low): Lower 8 bits of the RSI register (Source Index).
     * Introduced in x86-64. Used in string/memory operations or function argument passing.
     */
    public static final int SIL = 11;

    /**
     * DIL (Destination Index Low): Lower 8 bits of the RDI register (Destination Index).
     * Introduced in x86-64. Commonly used in string/memory operations or function argument passing.
     */
    public static final int DIL = 12;

    /**
     * R8L: Lower 8 bits of the R8 register.
     * Introduced in x86-64. Used for 8-bit operations with the R8 general-purpose register.
     */
    public static final int R8L = 13;

    /**
     * R9L: Lower 8 bits of the R9 register.
     * Introduced in x86-64. Used for 8-bit operations with the R9 general-purpose register.
     */
    public static final int R9L = 14;

    /**
     * R10L: Lower 8 bits of the R10 register.
     * Introduced in x86-64. Used for 8-bit operations with the R10 general-purpose register.
     */
    public static final int R10L = 15;

    /**
     * R11L: Lower 8 bits of the R11 register.
     * Introduced in x86-64. Used for 8-bit operations with the R11 general-purpose register.
     */
    public static final int R11L = 16;

    /**
     * R12L: Lower 8 bits of the R12 register.
     * Introduced in x86-64. Used for 8-bit operations with the R12 general-purpose register.
     */
    public static final int R12L = 17;

    /**
     * R13L: Lower 8 bits of the R13 register.
     * Introduced in x86-64. Used for 8-bit operations with the R13 general-purpose register.
     */
    public static final int R13L = 18;

    /**
     * R14L: Lower 8 bits of the R14 register.
     * Introduced in x86-64. Used for 8-bit operations with the R14 general-purpose register.
     */
    public static final int R14L = 19;

    /**
     * R15L: Lower 8 bits of the R15 register.
     * Introduced in x86-64. Used for 8-bit operations with the R15 general-purpose register.
     */
    public static final int R15L = 20;
}
