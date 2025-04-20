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

    /**
     * TR0: Test Register 0. Used on early Intel 486 processors for TLB testing.
     * Obsolete in modern architectures.
     */
    public static final int TR0 = 117;

    /**
     * TR1: Test Register 1. Used for internal diagnostics and TLB testing on early processors.
     * Obsolete in modern architectures.
     */
    public static final int TR1 = 118;

    /**
     * TR2: Test Register 2. Part of TLB testing and diagnostic facilities on Intel 486.
     * Obsolete and undocumented in later architectures.
     */
    public static final int TR2 = 119;

    /**
     * TR3: Test Register 3. Used for TLB testing and diagnostics on early Intel processors.
     * Obsolete in modern architectures.
     */
    public static final int TR3 = 120;

    /**
     * TR4: Test Register 4. Used for testing L1 cache and TLB behavior in early Intel processors.
     * Obsolete in modern x86 systems.
     */
    public static final int TR4 = 121;

    /**
     * TR5: Test Register 5. Complemented TR4 in cache testing procedures.
     * No longer present or functional in modern CPUs.
     */
    public static final int TR5 = 122;

    /**
     * TR6: Test Register 6. Used to initiate or check test conditions, particularly for cache.
     * Obsolete; should not be used in modern system software.
     */
    public static final int TR6 = 123;

    /**
     * TR7: Test Register 7. Typically used alongside TR6 for cache testing.
     * Removed from Intel architecture after the 486 generation.
     */
    public static final int TR7 = 124;

    /**
     * BND0: MPX Bound Register 0. Holds lower and upper bounds for pointer bounds checking.
     * Part of Intel MPX (Memory Protection Extensions), used for enforcing memory safety.
     */
    public static final int BND0 = 125;

    /**
     * BND1: MPX Bound Register 1. Stores bounds for another pointer being tracked for bounds checking.
     */
    public static final int BND1 = 126;

    /**
     * BND2: MPX Bound Register 2. Used by MPX instructions to validate memory accesses within specified bounds.
     */
    public static final int BND2 = 127;

    /**
     * BND3: MPX Bound Register 3. One of four bound registers used for hardware-assisted bounds checking.
     */
    public static final int BND3 = 128;

    /**
     * K0: AVX-512 Mask Register 0. Used to control per-element operations in AVX-512 instructions.
     * K0 is often implicitly zeroed or ignored depending on the instruction.
     */
    public static final int K0 = 129;

    /**
     * K1: AVX-512 Mask Register 1. Controls which elements are active in vector operations.
     * Commonly used for predicate-based execution.
     */
    public static final int K1 = 130;

    /**
     * K2: AVX-512 Mask Register 2. One of eight 64-bit predicate registers used in AVX-512 for selective computation.
     */
    public static final int K2 = 131;

    /**
     * K3: AVX-512 Mask Register 3. Holds bitmask flags indicating which vector lanes to update or ignore.
     */
    public static final int K3 = 132;

    /**
     * K4: AVX-512 Mask Register 4. Used to mask out elements during vector computations.
     */
    public static final int K4 = 133;

    /**
     * K5: AVX-512 Mask Register 5. Can be used to apply conditional operations on vector registers.
     */
    public static final int K5 = 134;

    /**
     * K6: AVX-512 Mask Register 6. One of the available predicate registers for fine-grained control over AVX-512 instructions.
     */
    public static final int K6 = 135;

    /**
     * K7: AVX-512 Mask Register 7. Last of the AVX-512 mask registers, usable in most AVX-512 enabled processors.
     */
    public static final int K7 = 136;

    /**
     * MM0: MMX register 0. 64-bit register used for multimedia SIMD operations.
     */
    public static final int MM0 = 137;

    /**
     * MM1: MMX register 1. Stores packed integers for SIMD processing.
     */
    public static final int MM1 = 138;

    /**
     * MM2: MMX register 2. Utilized in integer-based parallel computations.
     */
    public static final int MM2 = 139;

    /**
     * MM3: MMX register 3. Part of the MMX SIMD instruction set for multimedia acceleration.
     */
    public static final int MM3 = 140;

    /**
     * MM4: MMX register 4. Used in legacy 64-bit SIMD integer processing.
     */
    public static final int MM4 = 141;

    /**
     * MM5: MMX register 5. 64-bit SIMD register, shares storage with x87 FPU stack.
     */
    public static final int MM5 = 142;

    /**
     * MM6: MMX register 6. Holds packed data for legacy SIMD integer operations.
     */
    public static final int MM6 = 143;

    /**
     * MM7: MMX register 7. Final MMX register; used in packed integer arithmetic.
     */
    public static final int MM7 = 144;

    /**
     * XMM0: 128-bit SIMD register used in SSE/SSE2 instructions for floating-point and integer operations.
     */
    public static final int XMM0 = 145;

    /**
     * XMM1: SSE register 1. Used for packed single/double precision floating-point or integer vectors.
     */
    public static final int XMM1 = 146;

    /**
     * XMM2: 128-bit register used for vectorized computations in modern multimedia applications.
     */
    public static final int XMM2 = 147;

    /**
     * XMM3: SSE register 3. Performs SIMD operations on packed float/double data.
     */
    public static final int XMM3 = 148;

    /**
     * XMM4: Used in vector arithmetic, logic, and shuffle operations under SSE/AVX.
     */
    public static final int XMM4 = 149;

    /**
     * XMM5: 128-bit register for parallel processing in multimedia/graphics workloads.
     */
    public static final int XMM5 = 150;

    /**
     * XMM6: Holds four 32-bit floats or two 64-bit doubles for SIMD computations.
     */
    public static final int XMM6 = 151;

    /**
     * XMM7: Legacy SSE register, often used in floating-point vector processing.
     */
    public static final int XMM7 = 152;

    /**
     * XMM8–XMM15: Extended XMM registers (only available in 64-bit mode).
     */
    public static final int XMM8 = 153;
    public static final int XMM9 = 154;
    public static final int XMM10 = 155;
    public static final int XMM11 = 156;
    public static final int XMM12 = 157;
    public static final int XMM13 = 158;
    public static final int XMM14 = 159;
    public static final int XMM15 = 160;

    /**
     * XMM16–XMM31: AVX-512 enabled XMM registers used in high-performance vectorized computing.
     */
    public static final int XMM16 = 161;
    public static final int XMM17 = 162;
    public static final int XMM18 = 163;
    public static final int XMM19 = 164;
    public static final int XMM20 = 165;
    public static final int XMM21 = 166;
    public static final int XMM22 = 167;
    public static final int XMM23 = 168;
    public static final int XMM24 = 169;
    public static final int XMM25 = 170;
    public static final int XMM26 = 171;
    public static final int XMM27 = 172;
    public static final int XMM28 = 173;
    public static final int XMM29 = 174;
    public static final int XMM30 = 175;
    public static final int XMM31 = 176;

    /**
     * YMM0: 256-bit AVX register for packed SIMD operations.
     * Extends XMM0 with 128 additional bits.
     */
    public static final int YMM0 = 177;

    /**
     * YMM1: 256-bit SIMD register used in AVX instructions for parallel floating-point and integer data.
     */
    public static final int YMM1 = 178;

    /**
     * YMM2: AVX register for vectorized mathematical and logical computations.
     */
    public static final int YMM2 = 179;

    /**
     * YMM3: Used for processing packed float/double/integer operations across 256 bits.
     */
    public static final int YMM3 = 180;

    /**
     * YMM4: Extended register from XMM4 for high-performance vector operations.
     */
    public static final int YMM4 = 181;

    /**
     * YMM5: SIMD AVX register for parallel data transformations and computations.
     */
    public static final int YMM5 = 182;

    /**
     * YMM6: 256-bit vector register used in floating-point and integer AVX instructions.
     */
    public static final int YMM6 = 183;

    /**
     * YMM7: Final legacy AVX register before extended YMM8–YMM15 in x86_64.
     */
    public static final int YMM7 = 184;

    /**
     * YMM8–YMM15: Extended AVX registers (available in 64-bit mode only).
     * Provide additional vector registers for high-throughput SIMD operations.
     */
    public static final int YMM8 = 185;
    public static final int YMM9 = 186;
    public static final int YMM10 = 187;
    public static final int YMM11 = 188;
    public static final int YMM12 = 189;
    public static final int YMM13 = 190;
    public static final int YMM14 = 191;
    public static final int YMM15 = 192;

    /**
     * YMM16–YMM31: AVX-512 extended YMM registers (upper 16 registers).
     * Used in AVX-512F and other AVX-512 instruction subsets for wider throughput.
     */
    public static final int YMM16 = 193;
    public static final int YMM17 = 194;
    public static final int YMM18 = 195;
    public static final int YMM19 = 196;
    public static final int YMM20 = 197;
    public static final int YMM21 = 198;
    public static final int YMM22 = 199;
    public static final int YMM23 = 200;
    public static final int YMM24 = 201;
    public static final int YMM25 = 202;
    public static final int YMM26 = 203;
    public static final int YMM27 = 204;
    public static final int YMM28 = 205;
    public static final int YMM29 = 206;
    public static final int YMM30 = 207;
    public static final int YMM31 = 208;

    /**
     * ZMM0: 512-bit SIMD register used in AVX-512 instructions for parallel floating-point and integer computations.
     */
    public static final int ZMM0 = 209;

    /**
     * ZMM1: AVX-512 register 1. Used in wide vectorized data operations and compute-heavy tasks.
     */
    public static final int ZMM1 = 210;

    /**
     * ZMM2: 512-bit vector register utilized in high-throughput numerical algorithms.
     */
    public static final int ZMM2 = 211;

    /**
     * ZMM3: Register 3 in the AVX-512 family, optimized for data-parallel workloads.
     */
    public static final int ZMM3 = 212;

    /**
     * ZMM4: Used in wide SIMD operations including matrix multiplication and signal processing.
     */
    public static final int ZMM4 = 213;

    /**
     * ZMM5: 512-bit SIMD register for highly parallelized floating-point and integer processing.
     */
    public static final int ZMM5 = 214;

    /**
     * ZMM6: AVX-512 register supporting operations on packed 32/64-bit elements.
     */
    public static final int ZMM6 = 215;

    /**
     * ZMM7: Used in massive data parallelism scenarios like machine learning and simulations.
     */
    public static final int ZMM7 = 216;

    /**
     * ZMM8: AVX-512 register 8. Enables high-speed processing of large datasets.
     */
    public static final int ZMM8 = 217;

    /**
     * ZMM9: Optimized for vectorized workloads involving large-scale numerical computations.
     */
    public static final int ZMM9 = 218;

    /**
     * ZMM10: 512-bit register used in floating-point heavy AVX-512 instructions.
     */
    public static final int ZMM10 = 219
            ;
    /**
     * ZMM11: Supports wide vector calculations for scientific computing and media processing.
     */
    public static final int ZMM11 = 220;

    /**
     * ZMM12: Used in SIMD operations involving parallel element-wise computations.
     */
    public static final int ZMM12 = 221;

    /**
     * ZMM13: 512-bit register aiding in high-performance mathematical operations.
     */
    public static final int ZMM13 = 222;

    /**
     * ZMM14: AVX-512 register for SIMD tasks in graphics, physics, and audio engines.
     */
    public static final int ZMM14 = 223;

    /**
     * ZMM15: Supports operations on vectors of floats or integers in parallel.
     */
    public static final int ZMM15 = 224;

    /**
     * ZMM16: Extended ZMM register available in AVX-512 for intensive vector math.
     */
    public static final int ZMM16 = 225;

    /**
     * ZMM17: Useful in batched data processing and transformation workloads.
     */
    public static final int ZMM17 = 226;

    /**
     * ZMM18: Enables manipulation of large-scale packed data structures.
     */
    public static final int ZMM18 = 227;

    /**
     * ZMM19: Designed for throughput-critical numerical tasks.
     */
    public static final int ZMM19 = 228;

    /**
     * ZMM20: Register for executing AVX-512 vector arithmetic and logic operations.
     */
    public static final int ZMM20 = 229;

    /**
     * ZMM21: Employed in highly parallelized applications such as data analytics.
     */
    public static final int ZMM21 = 230;

    /**
     * ZMM22: Supports simultaneous processing of packed elements in SIMD pipelines.
     */
    public static final int ZMM22 = 231;

    /**
     * ZMM23: 512-bit register optimized for performance-critical vector workloads.
     */
    public static final int ZMM23 = 232;

    /**
     * ZMM24: Used in advanced vector operations across multimedia and scientific applications.
     */
    public static final int ZMM24 = 233;

    /**
     * ZMM25: AVX-512 register for fast, parallel processing of floating-point arrays.
     */
    public static final int ZMM25 = 234;

    /**
     * ZMM26: Vector register supporting operations on wide data structures.
     */
    public static final int ZMM26 = 235;

    /**
     * ZMM27: Used in computationally intensive SIMD workflows.
     */
    public static final int ZMM27 = 236;

    /**
     * ZMM28: Ideal for AVX-512 enabled algorithms with heavy vector math.
     */
    public static final int ZMM28 = 237;

    /**
     * ZMM29: 512-bit SIMD register utilized in AI, rendering, and crypto workloads.
     */
    public static final int ZMM29 = 238;

    /**
     * ZMM30: Extended AVX-512 register aiding in high-efficiency data transformations.
     */
    public static final int ZMM30 = 239;

    /**
     * ZMM31: Final ZMM register in AVX-512, used for extensive parallel processing.
     */
    public static final int ZMM31 = 240;
}