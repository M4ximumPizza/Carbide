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
     * AL (Accumulator Low): Lower 8 bits of the {@link #AX} register (Accumulator Register).
     * Commonly used for arithmetic operations and I/O instructions. Frequently acts
     * as the default operand for many instructions.
     */
    public static final int AL = 1;

    /**
     * CL (Counter Low): Lower 8 bits of the {@link #CX} register (Counter Register).
     * Often used in loop control structures and for shift/rotate operations
     * where the shift count is stored in CL.
     */
    public static final int CL = 2;

    /**
     * DL (Data Low): Lower 8 bits of the {@link #DX} register (Data Register).
     * Used in I/O port access and extended arithmetic operations such as
     * multiplication and division.
     */
    public static final int DL = 3;

    /**
     * BL (Base Low): Lower 8 bits of the {@link #BX} register (Base Register).
     * Commonly used in memory addressing and general-purpose byte storage.
     */
    public static final int BL = 4;

    /**
     * AH (Accumulator High): High 8 bits of the {@link #AX} register (Accumulator Register).
     * Often used for extended precision in arithmetic and data manipulation.
     */
    public static final int AH = 5;

    /**
     * CH (Counter High): High 8 bits of the {@link #CX} register (Counter Register).
     * Sometimes used in loops or when 8-bit operations are split across {@link #CH} and {@link #CL}.
     */
    public static final int CH = 6;

    /**
     * DH (Data High): High 8 bits of the {@link #DX} register (Data Register).
     * Used in conjunction with DL for extended arithmetic operations.
     */
    public static final int DH = 7;

    /**
     * BH (Base High): High 8 bits of the {@link #BX} register (Base Register).
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

    /**
     * AX (Accumulator Register): 16-bit general-purpose register.
     * Frequently used in arithmetic and I/O operations.
     */
    public static final int AX = 21;

    /**
     * CX (Counter Register): 16-bit general-purpose register.
     * Commonly used as a loop counter or for shift/rotate operations.
     */
    public static final int CX = 22;

    /**
     * DX (Data Register): 16-bit general-purpose register.
     * Used in I/O operations and as an extension of AX in some arithmetic operations.
     */
    public static final int DX = 23;

    /**
     * BX (Base Register): 16-bit general-purpose register.
     * Often used as a base pointer for memory addressing.
     */
    public static final int BX = 24;

    /**
     * SP (Stack Pointer): 16-bit register pointing to the top of the stack.
     * Implicitly used by push/pop/call/ret instructions.
     */
    public static final int SP = 25;

    /**
     * BP (Base Pointer): 16-bit register pointing to the base of the current stack frame.
     * Often used to reference function arguments and local variables.
     */
    public static final int BP = 26;

    /**
     * SI (Source Index): 16-bit register used in string/memory operations as the source.
     */
    public static final int SI = 27;

    /**
     * DI (Destination Index): 16-bit register used in string/memory operations as the destination.
     */
    public static final int DI = 28;

    /**
     * R8W: 16-bit lower portion of the 64-bit R8 register, introduced in x86-64.
     * Used as a general-purpose word-sized register.
     */
    public static final int R8W = 29;


    /**
     * R9W: 16-bit lower portion of the 64-bit R9 register, introduced in x86-64.
     * Used as a general-purpose word-sized register.
     */
    public static final int R9W = 30;

    /**
     * R10W: 16-bit lower portion of the 64-bit R10 register, introduced in x86-64.
     * Used as a general-purpose word-sized register.
     */
    public static final int R10W = 31;

    /**
     * R11W: 16-bit lower portion of the 64-bit R11 register, introduced in x86-64.
     * Used as a general-purpose word-sized register.
     */
    public static final int R11W = 32;

    /**
     * R12W: 16-bit lower portion of the 64-bit R12 register, introduced in x86-64.
     * Used as a general-purpose word-sized register.
     */
    public static final int R12W = 33;

    /**
     * R13W: 16-bit lower portion of the 64-bit R13 register, introduced in x86-64.
     * Used as a general-purpose word-sized register.
     */
    public static final int R13W = 34;

    /**
     * R14W: 16-bit lower portion of the 64-bit R14 register, introduced in x86-64.
     * Used as a general-purpose word-sized register.
     */
    public static final int R14W = 35;

    /**
     * R15W: 16-bit lower portion of the 64-bit R15 register, introduced in x86-64.
     * Used as a general-purpose word-sized register.
     */
    public static final int R15W = 36;

    /**
     * EAX (Extended Accumulator): 32-bit general-purpose register, often used for arithmetic operations
     * and as the implicit operand for instructions like MUL and DIV.
     */
    public static final int EAX = 37;

    /**
     * ECX (Extended Count): 32-bit general-purpose register, commonly used as a counter in loop and shift operations.
     */
    public static final int ECX = 38;

    /**
     * EDX (Extended Data): 32-bit general-purpose register, often used in I/O operations and for
     * storing high-order bits of multiplication/division results.
     */
    public static final int EDX = 39;

    /**
     * EBX (Extended Base): 32-bit general-purpose register, historically used as a base pointer
     * for memory addressing (especially in position-independent code).
     */
    public static final int EBX = 40;

    /**
     * ESP (Extended Stack Pointer): 32-bit register that points to the top of the stack.
     * Automatically updated by push/pop/call/ret instructions.
     */
    public static final int ESP = 41;

    /**
     * EBP (Extended Base Pointer): 32-bit register used to point to the base of the current stack frame.
     * Commonly used for accessing function parameters and local variables.
     */
    public static final int EBP = 42;

    /**
     * ESI (Extended Source Index): 32-bit register often used in string and memory operations
     * as a source pointer (e.g., for `movs`, `lods` instructions).
     */
    public static final int ESI = 43;

    /**
     * EDI (Extended Destination Index): 32-bit register often used in string and memory operations
     * as a destination pointer (e.g., for `movs`, `stos` instructions).
     */
    public static final int EDI = 44;
}
