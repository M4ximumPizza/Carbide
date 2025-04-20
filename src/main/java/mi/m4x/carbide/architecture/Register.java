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

    /**
     * R8D: 32-bit lower portion of the 64-bit R8 register, introduced in x86-64.
     * Used as a general-purpose doubleword (32-bit) register.
     */
    public static final int R8D = 45;

    /**
     * R9D: 32-bit lower portion of the 64-bit R9 register, introduced in x86-64.
     * Used as a general-purpose doubleword (32-bit) register.
     */
    public static final int R9D = 46;

    /**
     * R10D: 32-bit lower portion of the 64-bit R10 register, introduced in x86-64.
     * Used as a general-purpose doubleword (32-bit) register.
     */
    public static final int R10D = 47;

    /**
     * R11D: 32-bit lower portion of the 64-bit R11 register, introduced in x86-64.
     * Used as a general-purpose doubleword (32-bit) register.
     */
    public static final int R11D = 48;

    /**
     * R12D: 32-bit lower portion of the 64-bit R12 register, introduced in x86-64.
     * Often used in memory addressing and general-purpose computation.
     */
    public static final int R12D = 49;

    /**
     * R13D: 32-bit lower portion of the 64-bit R13 register, introduced in x86-64.
     * Often used in memory addressing and general-purpose computation.
     */
    public static final int R13D = 50;

    /**
     * R14D: 32-bit lower portion of the 64-bit R14 register, introduced in x86-64.
     * Often used in memory addressing and general-purpose computation.
     */
    public static final int R14D = 51;

    /**
     * R15D: 32-bit lower portion of the 64-bit R15 register, introduced in x86-64.
     * Often used in memory addressing and general-purpose computation.
     */
    public static final int R15D = 52;

    /**
     * RAX: 64-bit version of the accumulator register (extended {@link #EAX}), used for arithmetic operations.
     * Implicit operand in many arithmetic instructions.
     */
    public static final int RAX = 53;

    /**
     * RCX: 64-bit version of the counter register (extended {@link #ECX}), often used for loop counters
     * and shift/rotate operations.
     */
    public static final int RCX = 54;

    /**
     * RDX: 64-bit version of the data register (extended {@link #EDX}), used in I/O operations
     * and for high-order bits in multiplication/division.
     */
    public static final int RDX = 55;

    /**
     * RBX: 64-bit version of the base register (extended {@link #EBX}), used for memory addressing.
     */
    public static final int RBX = 56;

    /**
     * RSP: 64-bit version of the stack pointer (extended {@link #ESP}), points to the top of the stack.
     * Automatically updated by push/pop/call/ret instructions.
     */
    public static final int RSP = 57;

    /**
     * RBP: 64-bit version of the base pointer (extended {@link #EBP}), used to point to the base of the current stack frame.
     */
    public static final int RBP = 58;

    /**
     * RSI: 64-bit version of the source index (extended {@link #ESI}), used in string/memory operations as a source pointer.
     */
    public static final int RSI = 59;

    /**
     * RDI: 64-bit version of the destination index (extended {@link #EDI}), used in string/memory operations as a destination pointer.
     */
    public static final int RDI = 60;

    /**
     * R8: 64-bit general-purpose register introduced in x86-64.
     * Used for computation and holds the fifth function argument in the System V calling convention.
     */
    public static final int R8 = 61;

    /**
     * R9: 64-bit general-purpose register introduced in x86-64.
     * Used for computation and holds the sixth function argument in the System V calling convention.
     */
    public static final int R9 = 62;

    /**
     * R10: 64-bit general-purpose register introduced in x86-64.
     * Caller-saved and used for temporary values or syscall numbers.
     */
    public static final int R10 = 63;

    /**
     * R11: 64-bit general-purpose register introduced in x86-64.
     * Caller-saved and commonly used for temporary or scratch values.
     */
    public static final int R11 = 64;

    /**
     * R12: 64-bit general-purpose register introduced in x86-64.
     * Callee-saved and often used for local variables or memory addressing.
     */
    public static final int R12 = 65;

    /**
     * R13: 64-bit general-purpose register introduced in x86-64.
     * Callee-saved and often used for local variables or stack frames.
     */
    public static final int R13 = 66;

    /**
     * R14: 64-bit general-purpose register introduced in x86-64.
     * Callee-saved and commonly used for control or data flow within procedures.
     */
    public static final int R14 = 67;

    /**
     * R15: 64-bit general-purpose register introduced in x86-64.
     * Callee-saved and commonly used for managing context or large functions.
     */
    public static final int R15 = 68;

    /**
     * EIP (Extended Instruction Pointer): 32-bit register that holds the address of the next instruction
     * to execute in 32-bit x86 mode.
     */
    public static final int EIP = 69; // Noice

    /**
     * RIP (Register Instruction Pointer): 64-bit register that holds the address of the next instruction
     * to execute in 64-bit x86-64 mode. Supports RIP-relative addressing.
     */
    public static final int RIP = 70;

    /**
     * ES (Extra Segment): Segment register used in legacy x86 for segmented memory addressing.
     * Rarely used in modern 64-bit systems.
     */
    public static final int ES = 71;

    /**
     * CS (Code Segment): Segment register that holds the segment selector for the currently executing code.
     * Still used in x86-64 for privilege level separation and far jumps.
     */
    public static final int CS = 72;

    /**
     * SS (Stack Segment): Segment register used for stack operations (push/pop/call/ret) in legacy x86.
     * Still holds a valid descriptor in 64-bit mode but mostly ignored.
     */
    public static final int SS = 73;

    /**
     * DS (Data Segment): Segment register historically used to access data memory in 16/32-bit modes.
     * Ignored in most 64-bit code but still loaded.
     */
    public static final int DS = 74;

    /**
     * FS: Segment register used for accessing thread-local storage or platform-specific structures.
     * Still relevant in both 32-bit and 64-bit code (e.g., Windows TIB or Linux TLS).
     */
    public static final int FS = 75;

    /**
     * GS: Segment register used similarly to FS for thread-local or system-level access.
     * Used in 64-bit systems for accessing per-CPU data structures (e.g., Linux kernel).
     */
    public static final int GS = 76;

    /**
     * ST0: Top of the x87 floating-point register stack (register 0).
     * Implicitly used in most x87 instructions as the default operand.
     */
    public static final int ST0 = 77;

    /**
     * ST1: Second register in the x87 floating-point register stack.
     */
    public static final int ST1 = 78;

    /**
     * ST2: Third register in the x87 floating-point register stack.
     */
    public static final int ST2 = 79;

    /**
     * ST3: Fourth register in the x87 floating-point register stack.
     */
    public static final int ST3 = 80;

    /**
     * ST4: Fifth register in the x87 floating-point register stack.
     */
    public static final int ST4 = 81;

    /**
     * ST5: Sixth register in the x87 floating-point register stack.
     */
    public static final int ST5 = 82;

    /**
     * ST6: Seventh register in the x87 floating-point register stack.
     */
    public static final int ST6 = 83;

    /**
     * ST7: Eighth and last register in the x87 floating-point register stack.
     */
    public static final int ST7 = 84;

    /**
     * CR0: Control Register 0. Enables and configures key processor modes such as paging, protection, and coprocessor presence.
     */
    public static final int CR0 = 85;

    /**
     * CR1: Reserved. Not used in any known implementation.
     */
    public static final int CR1 = 86;

    /**
     * CR2: Control Register 2. Holds the page-fault linear address (the address that caused the most recent page fault).
     */
    public static final int CR2 = 87;

    /**
     * CR3: Control Register 3. Holds the physical address of the page directory base in paging mode.
     * Crucial for virtual memory management.
     */
    public static final int CR3 = 88;

    /**
     * CR4: Control Register 4. Enables various processor extensions such as SSE, PAE, and protection mode features.
     */
    public static final int CR4 = 89;

    /**
     * CR5: Reserved. Not used in standard processors.
     */
    public static final int CR5 = 90;

    /**
     * CR6: Reserved. Not used in standard processors.
     */
    public static final int CR6 = 91;

    /**
     * CR7: Reserved. Not used in standard processors.
     */
    public static final int CR7 = 92;

    /**
     * CR8: Control Register 8. Used on x86-64 systems to store the Task Priority Register (TPR),
     * which controls interrupt priority thresholding.
     */
    public static final int CR8 = 93;

    /**
     * CR9: Reserved or implementation-defined. Not typically accessible in standard software.
     */
    public static final int CR9 = 94;

    /**
     * CR10: Reserved or implementation-defined. Not typically accessible in standard software.
     */
    public static final int CR10 = 95;

    /**
     * CR11: Reserved or implementation-defined. Not typically accessible in standard software.
     */
    public static final int CR11 = 96;

    /**
     * CR12: Reserved or implementation-defined. Not typically accessible in standard software.
     */
    public static final int CR12 = 97;

    /**
     * CR13: Reserved or implementation-defined. Not typically accessible in standard software.
     */
    public static final int CR13 = 98;

    /**
     * CR14: Reserved or implementation-defined. Not typically accessible in standard software.
     */
    public static final int CR14 = 99;

    /**
     * CR15: Reserved or implementation-defined. Not typically accessible in standard software.
     */
    public static final int CR15 = 100;

    /**
     * DR0: Debug Register 0. Holds the linear address of the first hardware breakpoint.
     */
    public static final int DR0 = 101;

    /**
     * DR1: Debug Register 1. Holds the linear address of the second hardware breakpoint.
     */
    public static final int DR1 = 102;

    /**
     * DR2: Debug Register 2. Holds the linear address of the third hardware breakpoint.
     */
    public static final int DR2 = 103;

    /**
     * DR3: Debug Register 3. Holds the linear address of the fourth hardware breakpoint.
     */
    public static final int DR3 = 104;

    /**
     * DR4: Reserved or alias for DR6 on some legacy processors. Avoid using.
     */
    public static final int DR4 = 105;

    /**
     * DR5: Reserved or alias for DR7 on some legacy processors. Avoid using.
     */
    public static final int DR5 = 106;

    /**
     * DR6: Debug Status Register. Reports which debug conditions have occurred (e.g., breakpoint hits).
     * Automatically updated by the processor when a debug exception occurs.
     */
    public static final int DR6 = 107;

    /**
     * DR7: Debug Control Register. Controls hardware breakpoints—sets which DRx registers are active,
     * breakpoint types (execution, read, write), and length.
     */
    public static final int DR7 = 108;

    /**
     * DR8: Reserved for future use or system-specific extensions. Not used in standard debugging.
     */
    public static final int DR8 = 109;

    /**
     * DR9: Reserved for future use or system-specific extensions. Not used in standard debugging.
     */
    public static final int DR9 = 110;

    /**
     * DR10: Reserved for future use or system-specific extensions. Not used in standard debugging.
     */
    public static final int DR10 = 111;

    /**
     * DR11: Reserved for future use or system-specific extensions. Not used in standard debugging.
     */
    public static final int DR11 = 112;

    /**
     * DR12: Reserved for future use or system-specific extensions. Not used in standard debugging.
     */
    public static final int DR12 = 113;

    /**
     * DR13: Reserved for future use or system-specific extensions. Not used in standard debugging.
     */
    public static final int DR13 = 114;

    /**
     * DR14: Reserved for future use or system-specific extensions. Not used in standard debugging.
     */
    public static final int DR14 = 115;

    /**
     * DR15: Reserved for future use or system-specific extensions. Not used in standard debugging.
     */
    public static final int DR15 = 116;
}