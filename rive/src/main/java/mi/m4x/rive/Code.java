package mi.m4x.rive;

import mi.m4x.carbide.interfaces.Beta;

/**
 * Code is a utility class that provides constants representing various
 * x86 and x86-64 instructions and operations.
 *
 * <p>This class is not intended to be instantiated and contains only
 * static members.</p>
 *
 * <p>Each constant represents a specific instruction or operation
 * that can be used in assembly language programming or low-level
 * system programming.</p>
 *
 * <p>Note: The constants are not exhaustive and may not cover all
 * possible instructions or operations in the x86/x86-64 architecture.</p>
 *
 * @since 1.0.2
 * @author M4ximumpizza
 */

@Beta
public class Code {
    // Private constructor to prevent instantiation
    private Code() {
        // Prevent instantiation
    }

    /**
     * INVALID: Indicates an invalid operation or uninitialized state.
     */
    public static final int INVALID = 0;

    /**
     * DECLAREBYTE: Declares a byte-sized value.
     */
    public static final int DECLAREBYTE = 1;

    /**
     * DECLAREWORD: Declares a word-sized value (16 bits).
     */
    public static final int DECLAREWORD = 2;

    /**
     * DECLAREDWORD: Declares a double-word-sized value (32 bits).
     */
    public static final int DECLAREDWORD = 3;

    /**
     * DECLAREQWORD: Declares a quad-word-sized value (64 bits).
     */
    public static final int DECLAREQWORD = 4;

    /**
     * ADD_RM8_R8: Add an 8-bit register to an 8-bit memory operand.
     */
    public static final int ADD_RM8_R8 = 5;

    /**
     * ADD_RM16_R16: Add a 16-bit register to a 16-bit memory operand.
     */
    public static final int ADD_RM16_R16 = 6;

    /**
     * ADD_RM32_R32: Add a 32-bit register to a 32-bit memory operand.
     */
    public static final int ADD_RM32_R32 = 7;

    /**
     * ADD_RM64_R64: Add a 64-bit register to a 64-bit memory operand.
     */
    public static final int ADD_RM64_R64 = 8;

    /**
     * ADD_R8_RM8: Add an 8-bit register to an 8-bit memory operand.
     */
    public static final int ADD_R8_RM8 = 9;

    /**
     * ADD_R16_RM16: Add a 16-bit register to a 16-bit memory operand.
     */
    public static final int ADD_R16_RM16 = 10;

    /**
     * ADD_R32_RM32: Add a 32-bit register to a 32-bit memory operand.
     */
    public static final int ADD_R32_RM32 = 11;

    /**
     * ADD_R64_RM64: Add a 64-bit register to a 64-bit memory operand.
     */
    public static final int ADD_R64_RM64 = 12;

    /**
     * ADD_AL_IMM8: Add an 8-bit immediate value to the AL register.
     */
    public static final int ADD_AL_IMM8 = 13;

    /**
     * ADD_AX_IMM16: Add a 16-bit immediate value to the AX register.
     */
    public static final int ADD_AX_IMM16 = 14;

    /**
     * ADD_EAX_IMM32: Add a 32-bit immediate value to the EAX register.
     */
    public static final int ADD_EAX_IMM32 = 15;

    /**
     * ADD_RAX_IMM64: Add a 64-bit immediate value to the RAX register.
     */
    public static final int ADD_RAX_IMM64 = 16;

    /**
     * PUSHW_ES: Push the ES segment register (word-sized).
     */
    public static final int PUSHW_ES = 17;

    /**
     * PUSHD_ES: Push the ES segment register (double word-sized).
     */
    public static final int PUSHD_ES = 18;

    /**
     * POPW_ES: Pop the ES segment register (word-sized).
     */
    public static final int POPW_ES = 19;

    /**
     * POPD_ES: Pop the ES segment register (double word-sized).
     */
    public static final int POPD_ES = 20;

    /**
     * OR_RM8_R8: Perform a bitwise OR between an 8-bit register and an 8-bit memory operand.
     */
    public static final int OR_RM8_R8 = 21;

    /**
     * OR_RM16_R16: Perform a bitwise OR between a 16-bit register and a 16-bit memory operand.
     */
    public static final int OR_RM16_R16 = 22;

    /**
     * OR_RM32_R32: Perform a bitwise OR between a 32-bit register and a 32-bit memory operand.
     */
    public static final int OR_RM32_R32 = 23;

    /**
     * OR_RM64_R64: Perform a bitwise OR between a 64-bit register and a 64-bit memory operand.
     */
    public static final int OR_RM64_R64 = 24;

    /**
     * OR_R8_RM8: Perform a bitwise OR between an 8-bit register and an 8-bit memory operand.
     */
    public static final int OR_R8_RM8 = 25;

    /**
     * OR_R16_RM16: Perform a bitwise OR between a 16-bit register and a 16-bit memory operand.
     */
    public static final int OR_R16_RM16 = 26;

    /**
     * OR_R32_RM32: Perform a bitwise OR between a 32-bit register and a 32-bit memory operand.
     */
    public static final int OR_R32_RM32 = 27;

    /**
     * OR_R64_RM64: Perform a bitwise OR between a 64-bit register and a 64-bit memory operand.
     */
    public static final int OR_R64_RM64 = 28;

    /**
     * OR_AL_IMM8: Perform a bitwise OR between the AL register and an 8-bit immediate value.
     */
    public static final int OR_AL_IMM8 = 29;

    /**
     * OR_AX_IMM16: Perform a bitwise OR between the AX register and a 16-bit immediate value.
     */
    public static final int OR_AX_IMM16 = 30;

    /**
     * OR_EAX_IMM32: Perform a bitwise OR between the EAX register and a 32-bit immediate value.
     */
    public static final int OR_EAX_IMM32 = 31;

    /**
     * OR_RAX_IMM32: Perform a bitwise OR between the RAX register and a 32-bit immediate value.
     */
    public static final int OR_RAX_IMM32 = 32;

    /**
     * PUSHW_CS: Push the value of the CS (Code Segment) register onto the stack (16-bit operation).
     */
    public static final int PUSHW_CS = 33;

    /**
     * PUSHD_CS: Push the value of the CS (Code Segment) register onto the stack (32-bit operation).
     */
    public static final int PUSHD_CS = 34;

    /**
     * POPW_CS: Pop the value from the stack into the CS (Code Segment) register (16-bit operation).
     */
    public static final int POPW_CS = 35;

    /**
     * ADC_RM8_R8: Add with carry (ADC) between an 8-bit register and an 8-bit memory operand.
     */
    public static final int ADC_RM8_R8 = 36;

    /**
     * ADC_RM16_R16: Add with carry (ADC) between a 16-bit register and a 16-bit memory operand.
     */
    public static final int ADC_RM16_R16 = 37;

    /**
     * ADC_RM32_R32: Add with carry (ADC) between a 32-bit register and a 32-bit memory operand.
     */
    public static final int ADC_RM32_R32 = 38;

    /**
     * ADC_RM64_R64: Add with carry (ADC) between a 64-bit register and a 64-bit memory operand.
     */
    public static final int ADC_RM64_R64 = 39;

    /**
     * ADC_R8_RM8: Add with carry (ADC) between an 8-bit register and an 8-bit memory operand.
     */
    public static final int ADC_R8_RM8 = 40;

    /**
     * ADC_R16_RM16: Add with carry (ADC) between a 16-bit register and a 16-bit memory operand.
     */
    public static final int ADC_R16_RM16 = 41;

    /**
     * ADC_R32_RM32: Add with carry (ADC) between a 32-bit register and a 32-bit memory operand.
     */
    public static final int ADC_R32_RM32 = 42;

    /**
     * ADC_R64_RM64: Add with carry (ADC) between a 64-bit register and a 64-bit memory operand.
     */
    public static final int ADC_R64_RM64 = 43;

    /**
     * ADC_AL_IMM8: Add with carry (ADC) between the AL register and an 8-bit immediate value.
     */
    public static final int ADC_AL_IMM8 = 44;

    /**
     * ADC_AX_IMM16: Add with carry (ADC) between the AX register and a 16-bit immediate value.
     */
    public static final int ADC_AX_IMM16 = 45;

    /**
     * ADC_EAX_IMM32: Add with carry (ADC) between the EAX register and a 32-bit immediate value.
     */
    public static final int ADC_EAX_IMM32 = 46;

    /**
     * ADC_RAX_IMM32: Add with carry (ADC) between the RAX register and a 32-bit immediate value.
     */
    public static final int ADC_RAX_IMM32 = 47;

    /**
     * PUSHW_SS: Push the value of the SS (Stack Segment) register onto the stack (16-bit operation).
     */
    public static final int PUSHW_SS = 48;

    /**
     * PUSHD_SS: Push the value of the SS (Stack Segment) register onto the stack (32-bit operation).
     */
    public static final int PUSHD_SS = 49;

    /**
     * POPW_SS: Pop the SS segment register (word-sized).
     */
    public static final int POPW_SS = 50;

    /**
     * POPD_SS: Pop the SS segment register (double word-sized).
     */
    public static final int POPD_SS = 51;

    /**
     * SBB_RM8_R8: Subtract with borrow an 8-bit register from an 8-bit memory operand.
     */
    public static final int SBB_RM8_R8 = 52;

    /**
     * SBB_RM16_R16: Subtract with borrow a 16-bit register from a 16-bit memory operand.
     */
    public static final int SBB_RM16_R16 = 53;

    /**
     * SBB_RM32_R32: Subtract with borrow a 32-bit register from a 32-bit memory operand.
     */
    public static final int SBB_RM32_R32 = 54;

    /**
     * SBB_RM64_R64: Subtract with borrow a 64-bit register from a 64-bit memory operand.
     */
    public static final int SBB_RM64_R64 = 55;

    /**
     * SBB_R8_RM8: Subtract with borrow an 8-bit register from an 8-bit memory operand.
     */
    public static final int SBB_R8_RM8 = 56;

    /**
     * SBB_R16_RM16: Subtract with borrow a 16-bit register from a 16-bit memory operand.
     */
    public static final int SBB_R16_RM16 = 57;

    /**
     * SBB_R32_RM32: Subtract with borrow a 32-bit register from a 32-bit memory operand.
     */
    public static final int SBB_R32_RM32 = 58;

    /**
     * SBB_R64_RM64: Subtract with borrow a 64-bit register from a 64-bit memory operand.
     */
    public static final int SBB_R64_RM64 = 59;

    /**
     * SBB_AL_IMM8: Subtract with borrow an 8-bit immediate value from the AL register.
     */
    public static final int SBB_AL_IMM8 = 60;

    /**
     * SBB_AX_IMM16: Subtract with borrow a 16-bit immediate value from the AX register.
     */
    public static final int SBB_AX_IMM16 = 61;

    /**
     * SBB_EAX_IMM32: Subtract with borrow a 32-bit immediate value from the EAX register.
     */
    public static final int SBB_EAX_IMM32 = 62;

    /**
     * SBB_RAX_IMM32: Subtract with borrow a 32-bit immediate value from the RAX register.
     */
    public static final int SBB_RAX_IMM32 = 63;

    /**
     * PUSHW_DS: Push the DS segment register (word-sized).
     */
    public static final int PUSHW_DS = 64;

    /**
     * PUSHD_DS: Push the DS segment register (double word-sized).
     */
    public static final int PUSHD_DS = 65;

    /**
     * POPW_DS: Pop the DS segment register (word-sized).
     */
    public static final int POPW_DS = 66;

    /**
     * POPD_DS: Pop the DS segment register (double word-sized).
     */
    public static final int POPD_DS = 67;

    /**
     * AND_RM8_R8: Perform a bitwise AND between an 8-bit register and an 8-bit memory operand.
     */
    public static final int AND_RM8_R8 = 68;

    /**
     * AND_RM16_R16: Perform a bitwise AND between a 16-bit register and a 16-bit memory operand.
     */
    public static final int AND_RM16_R16 = 69;

    /**
     * AND_RM32_R32: Perform a bitwise AND between a 32-bit register and a 32-bit memory operand.
     */
    public static final int AND_RM32_R32 = 70;

    /**
     * AND_RM64_R64: Perform a bitwise AND between a 64-bit register and a 64-bit memory operand.
     */
    public static final int AND_RM64_R64 = 71;

    /**
     * AND_R8_RM8: Perform a bitwise AND between an 8-bit register and an 8-bit memory operand.
     */
    public static final int AND_R8_RM8 = 72;

    /**
     * AND_R16_RM16: Perform a bitwise AND between a 16-bit register and a 16-bit memory operand.
     */
    public static final int AND_R16_RM16 = 73;

    /**
     * AND_R32_RM32: Perform a bitwise AND between a 32-bit register and a 32-bit memory operand.
     */
    public static final int AND_R32_RM32 = 74;

    /**
     * AND_R64_RM64: Perform a bitwise AND between a 64-bit register and a 64-bit memory operand.
     */
    public static final int AND_R64_RM64 = 75;

    /**
     * AND_AL_IMM8: Perform a bitwise AND between the AL register and an 8-bit immediate value.
     */
    public static final int AND_AL_IMM8 = 76;

    /**
     * AND_AX_IMM16: Perform a bitwise AND between the AX register and a 16-bit immediate value.
     */
    public static final int AND_AX_IMM16 = 77;

    /**
     * AND_EAX_IMM32: Perform a bitwise AND between the EAX register and a 32-bit immediate value.
     */
    public static final int AND_EAX_IMM32 = 78;

    /**
     * AND_RAX_IMM32: Perform a bitwise AND between the RAX register and a 32-bit immediate value.
     */
    public static final int AND_RAX_IMM32 = 79;

    /**
     * DAA: Decimal Adjust AL after Addition.
     */
    public static final int DAA = 80;

    /**
     * SUB_RM8_R8: Subtract an 8-bit register from an 8-bit memory operand.
     */
    public static final int SUB_RM8_R8 = 81;

    /**
     * SUB_RM16_R16: Subtract a 16-bit register from a 16-bit memory operand.
     */
    public static final int SUB_RM16_R16 = 82;

    /**
     * SUB_RM32_R32: Subtract a 32-bit register from a 32-bit memory operand.
     */
    public static final int SUB_RM32_R32 = 83;

    /**
     * SUB_RM64_R64: Subtract a 64-bit register from a 64-bit memory operand.
     */
    public static final int SUB_RM64_R64 = 84;

    /**
     * SUB_R8_RM8: Subtract an 8-bit register from an 8-bit memory operand.
     */
    public static final int SUB_R8_RM8 = 85;

    /**
     * SUB_R16_RM16: Subtract a 16-bit register from a 16-bit memory operand.
     */
    public static final int SUB_R16_RM16 = 86;

    /**
     * SUB_R32_RM32: Subtract a 32-bit register from a 32-bit memory operand.
     */
    public static final int SUB_R32_RM32 = 87;

    /**
     * SUB_R64_RM64: Subtract a 64-bit register from a 64-bit memory operand.
     */
    public static final int SUB_R64_RM64 = 88;

    /**
     * SUB_AL_IMM8: Subtract an 8-bit immediate value from the AL register.
     */
    public static final int SUB_AL_IMM8 = 89;

    /**
     * SUB_AX_IMM16: Subtract a 16-bit immediate value from the AX register.
     */
    public static final int SUB_AX_IMM16 = 90;

    /**
     * SUB_EAX_IMM32: Subtract a 32-bit immediate value from the EAX register.
     */
    public static final int SUB_EAX_IMM32 = 91;

    /**
     * SUB_RAX_IMM32: Subtract a 32-bit immediate value from the RAX register.
     */
    public static final int SUB_RAX_IMM32 = 92;

    /**
     * DAS: Decimal Adjust AL after Subtraction.
     */
    public static final int DAS = 93;

    /**
     * XOR_RM8_R8: Perform a bitwise XOR between an 8-bit register and an 8-bit memory operand.
     */
    public static final int XOR_RM8_R8 = 94;

    /**
     * XOR_RM16_R16: Perform a bitwise XOR between a 16-bit register and a 16-bit memory operand.
     */
    public static final int XOR_RM16_R16 = 95;

    /**
     * XOR_RM32_R32: Perform a bitwise XOR between a 32-bit register and a 32-bit memory operand.
     */
    public static final int XOR_RM32_R32 = 96;

    /**
     * XOR_RM64_R64: Perform a bitwise XOR between a 64-bit register and a 64-bit memory operand.
     */
    public static final int XOR_RM64_R64 = 97;

    /**
     * XOR_R8_RM8: Perform a bitwise XOR between an 8-bit register and an 8-bit memory operand.
     */
    public static final int XOR_R8_RM8 = 98;

    /**
     * XOR_R16_RM16: Perform a bitwise XOR between a 16-bit register and a 16-bit memory operand.
     */
    public static final int XOR_R16_RM16 = 99;

    /**
     * XOR_R32_RM32: Perform a bitwise XOR between a 32-bit register and a 32-bit memory operand.
     */
    public static final int XOR_R32_RM32 = 100;

    /**
     * XOR_R64_RM64: Perform a bitwise XOR between a 64-bit register and a 64-bit memory operand.
     */
    public static final int XOR_R64_RM64 = 101;

    /**
     * XOR_AL_IMM8: Perform a bitwise XOR between the AL register and an 8-bit immediate value.
     */
    public static final int XOR_AL_IMM8 = 102;

    /**
     * XOR_AX_IMM16: Perform a bitwise XOR between the AX register and a 16-bit immediate value.
     */
    public static final int XOR_AX_IMM16 = 103;

    /**
     * XOR_EAX_IMM32: Perform a bitwise XOR between the EAX register and a 32-bit immediate value.
     */
    public static final int XOR_EAX_IMM32 = 104;

    /**
     * XOR_RAX_IMM32: Perform a bitwise XOR between the RAX register and a 32-bit immediate value.
     */
    public static final int XOR_RAX_IMM32 = 105;

    /**
     * AAA: ASCII Adjust AL After Addition. Adjust the AL register after an addition to ensure valid BCD (Binary-Coded Decimal) representation.
     */
    public static final int AAA = 106;

    /**
     * CMP_RM8_R8: Compare a 8-bit memory operand with an 8-bit register.
     */
    public static final int CMP_RM8_R8 = 107;

    /**
     * CMP_RM16_R16: Compare a 16-bit memory operand with a 16-bit register.
     */
    public static final int CMP_RM16_R16 = 108;

    /**
     * CMP_RM32_R32: Compare a 32-bit memory operand with a 32-bit register.
     */
    public static final int CMP_RM32_R32 = 109;

    /**
     * CMP_RM64_R64: Compare a 64-bit memory operand with a 64-bit register.
     */
    public static final int CMP_RM64_R64 = 110;

    /**
     * CMP_R8_RM8: Compare a 8-bit register with an 8-bit memory operand.
     */
    public static final int CMP_R8_RM8 = 111;

    /**
     * CMP_R16_RM16: Compare a 16-bit register with a 16-bit memory operand.
     */
    public static final int CMP_R16_RM16 = 112;

    /**
     * CMP_R32_RM32: Compare a 32-bit register with a 32-bit memory operand.
     */
    public static final int CMP_R32_RM32 = 113;

    /**
     * CMP_R64_RM64: Compare a 64-bit register with a 64-bit memory operand.
     */
    public static final int CMP_R64_RM64 = 114;

    /**
     * CMP_AL_IMM8: Compare the AL register with an 8-bit immediate value.
     */
    public static final int CMP_AL_IMM8 = 115;

    /**
     * CMP_AX_IMM16: Compare the AX register with a 16-bit immediate value.
     */
    public static final int CMP_AX_IMM16 = 116;

    /**
     * CMP_EAX_IMM32: Compare the EAX register with a 32-bit immediate value.
     */
    public static final int CMP_EAX_IMM32 = 117;

    /**
     * CMP_RAX_IMM32: Compare the RAX register with a 32-bit immediate value.
     */
    public static final int CMP_RAX_IMM32 = 118;

    /**
     * AAS: ASCII Adjust AX After Subtraction. Adjust the AX register after a subtraction to ensure valid BCD representation.
     */
    public static final int AAS = 119;

    /**
     * INC_R16: Increment a 16-bit register by 1.
     */
    public static final int INC_R16 = 120;

    /**
     * INC_R32: Increment a 32-bit register by 1.
     */
    public static final int INC_R32 = 121;

    /**
     * DEC_R16: Decrement a 16-bit register by 1.
     */
    public static final int DEC_R16 = 122;

    /**
     * DEC_R32: Decrement a 32-bit register by 1.
     */
    public static final int DEC_R32 = 123;

    /**
     * PUSH_R16: Push a 16-bit register onto the stack.
     */
    public static final int PUSH_R16 = 124;

    /**
     * PUSH_R32: Push a 32-bit register onto the stack.
     */
    public static final int PUSH_R32 = 125;

    /**
     * PUSH_R64: Push a 64-bit register onto the stack.
     */
    public static final int PUSH_R64 = 126;

    /**
     * POP_R16: Pop a 16-bit value from the stack into a 16-bit register.
     */
    public static final int POP_R16 = 127;

    /**
     * POP_R32: Pop a 32-bit value from the stack into a 32-bit register.
     */
    public static final int POP_R32 = 128;

    /**
     * POP_R64: Pop a 64-bit value from the stack into a 64-bit register.
     */
    public static final int POP_R64 = 129;

    /**
     * PUSHAW: Push all general-purpose 16-bit registers onto the stack.
     */
    public static final int PUSHAW = 130;

    /**
     * PUSHAD: Push all general-purpose 32-bit registers onto the stack.
     */
    public static final int PUSHAD = 131;

    /**
     * POPAW: Pop all general-purpose 16-bit registers from the stack.
     */
    public static final int POPAW = 132;

    /**
     * POPAD: Pop all general-purpose 32-bit registers from the stack.
     */
    public static final int POPAD = 133;

    /**
     * BOUND_R16_M1616: Check if a 16-bit register is within the bounds specified by two 16-bit values in memory.
     */
    public static final int BOUND_R16_M1616 = 134;

    /**
     * BOUND_R32_M3232: Check if a 32-bit register is within the bounds specified by two 32-bit values in memory.
     */
    public static final int BOUND_R32_M3232 = 135;

    /**
     * ARPL_RM16_R16: Adjust the privilege level of a 16-bit memory operand to match that of a 16-bit register.
     */
    public static final int ARPL_RM16_R16 = 136;

    /**
     * ARPL_R32M16_R32: Adjust the privilege level of a 32-bit register and 16-bit memory operand.
     */
    public static final int ARPL_R32M16_R32 = 137;

    /**
     * MOVSXD_R16_RM16: Move a sign-extended 16-bit memory operand into a 16-bit register.
     */
    public static final int MOVSXD_R16_RM16 = 138;

    /**
     * MOVSXD_R32_RM32: Move a sign-extended 32-bit memory operand into a 32-bit register.
     */
    public static final int MOVSXD_R32_RM32 = 139;

    /**
     * MOVSXD_R64_RM32: Move a sign-extended 32-bit memory operand into a 64-bit register.
     */
    public static final int MOVSXD_R64_RM32 = 140;

    /**
     * PUSH_IMM16: Push a 16-bit immediate value onto the stack.
     */
    public static final int PUSH_IMM16 = 141;

    /**
     * PUSHD_IMM32: Push a 32-bit immediate value onto the stack.
     */
    public static final int PUSHD_IMM32 = 142;

    /**
     * PUSHQ_IMM32: Push a 32-bit immediate value onto the stack (used for 64-bit environments).
     */
    public static final int PUSHQ_IMM32 = 143;

    /**
     * IMUL_R16_RM16_IMM16: Perform a signed multiplication of a 16-bit register and a 16-bit immediate value.
     */
    public static final int IMUL_R16_RM16_IMM16 = 144;

    /**
     * IMUL_R32_RM32_IMM32: Perform a signed multiplication of a 32-bit register and a 32-bit immediate value.
     */
    public static final int IMUL_R32_RM32_IMM32 = 145;

    /**
     * IMUL_R64_RM64_IMM32: Perform a signed multiplication of a 64-bit register and a 32-bit immediate value.
     */
    public static final int IMUL_R64_RM64_IMM32 = 146;

    /**
     * PUSHW_IMM8: Push an 8-bit immediate value onto the stack (used for 16-bit environments).
     */
    public static final int PUSHW_IMM8 = 147;

    /**
     * PUSHD_IMM8: Push an 8-bit immediate value onto the stack (used for 32-bit environments).
     */
    public static final int PUSHD_IMM8 = 148;

    /**
     * PUSHQ_IMM8: Push an 8-bit immediate value onto the stack (used for 64-bit environments).
     */
    public static final int PUSHQ_IMM8 = 149;

    /**
     * IMUL_R16_RM16_IMM8: Perform a signed multiplication of a 16-bit register and an 8-bit immediate value.
     */
    public static final int IMUL_R16_RM16_IMM8 = 150;

    /**
     * IMUL_R32_RM32_IMM8: Perform a signed multiplication of a 32-bit register and an 8-bit immediate value.
     */
    public static final int IMUL_R32_RM32_IMM8 = 151;

    /**
     * IMUL_R64_RM64_IMM8: Perform a signed multiplication of a 64-bit register and an 8-bit immediate value.
     */
    public static final int IMUL_R64_RM64_IMM8 = 152;

    /**
     * INSB_M8_DX: Input a byte from port specified in DX and store it at the address specified by the operand.
     */
    public static final int INSB_M8_DX = 153;

    /**
     * INSW_M16_DX: Input a word from port specified in DX and store it at the address specified by the operand.
     */
    public static final int INSW_M16_DX = 154;

    /**
     * INSD_M32_DX: Input a double word from port specified in DX and store it at the address specified by the operand.
     */
    public static final int INSD_M32_DX = 155;

    /**
     * OUTSB_DX_M8: Output a byte from the operand to the port specified in DX.
     */
    public static final int OUTSB_DX_M8 = 156;

    /**
     * OUTSW_DX_M16: Output a word from the operand to the port specified in DX.
     */
    public static final int OUTSW_DX_M16 = 157;

    /**
     * OUTSD_DX_M32: Output a double word from the operand to the port specified in DX.
     */
    public static final int OUTSD_DX_M32 = 158;

    /**
     * JO_REL8_16: Jump to the address specified by the 8-bit signed displacement if the overflow flag (OF) is set.
     */
    public static final int JO_REL8_16 = 159;

    /**
     * JO_REL8_32: Jump to the address specified by the 8-bit signed displacement if the overflow flag (OF) is set.
     */
    public static final int JO_REL8_32 = 160;

    /**
     * JO_REL8_64: Jump to the address specified by the 8-bit signed displacement if the overflow flag (OF) is set.
     */
    public static final int JO_REL8_64 = 161;

    /**
     * JNO_REL8_16: Jump to the address specified by the 8-bit signed displacement if the overflow flag (OF) is not set.
     */
    public static final int JNO_REL8_16 = 162;

    /**
     * JNO_REL8_32: Jump to the address specified by the 8-bit signed displacement if the overflow flag (OF) is not set.
     */
    public static final int JNO_REL8_32 = 163;

    /**
     * JNO_REL8_64: Jump to the address specified by the 8-bit signed displacement if the overflow flag (OF) is not set.
     */
    public static final int JNO_REL8_64 = 164;

    /**
     * JB_REL8_16: Jump to the address specified by the 8-bit signed displacement if the carry flag (CF) is set.
     */
    public static final int JB_REL8_16 = 165;

    /**
     * JB_REL8_32: Jump to the address specified by the 8-bit signed displacement if the carry flag (CF) is set.
     */
    public static final int JB_REL8_32 = 166;

    /**
     * JB_REL8_64: Jump to the address specified by the 8-bit signed displacement if the carry flag (CF) is set.
     */
    public static final int JB_REL8_64 = 167;

    /**
     * JAE_REL8_16: Jump to the address specified by the 8-bit signed displacement if the carry flag (CF) is not set.
     */
    public static final int JAE_REL8_16 = 168;

    /**
     * JAE_REL8_32: Jump to the address specified by the 8-bit signed displacement if the carry flag (CF) is not set.
     */
    public static final int JAE_REL8_32 = 169;

    /**
     * JAE_REL8_64: Jump to the address specified by the 8-bit signed displacement if the carry flag (CF) is not set.
     */
    public static final int JAE_REL8_64 = 170;

    /**
     * JE_REL8_16: Jump to the address specified by the 8-bit signed displacement if the zero flag (ZF) is set.
     */
    public static final int JE_REL8_16 = 171;

    /**
     * JE_REL8_32: Jump to the address specified by the 8-bit signed displacement if the zero flag (ZF) is set.
     */
    public static final int JE_REL8_32 = 172;

    /**
     * JE_REL8_64: Jump to the address specified by the 8-bit signed displacement if the zero flag (ZF) is set.
     */
    public static final int JE_REL8_64 = 173;

    /**
     * JNE_REL8_16: Jump to the address specified by the 8-bit signed displacement if the zero flag (ZF) is not set.
     */
    public static final int JNE_REL8_16 = 174;

    /**
     * JNE_REL8_32: Jump to the address specified by the 8-bit signed displacement if the zero flag (ZF) is not set.
     */
    public static final int JNE_REL8_32 = 175;

    /**
     * JNE_REL8_64: Jump to the address specified by the 8-bit signed displacement if the zero flag (ZF) is not set.
     */
    public static final int JNE_REL8_64 = 176;

    /**
     * JBE_REL8_16: Jump to the address specified by the 8-bit signed displacement if the carry flag (CF) or the zero flag (ZF) is set.
     */
    public static final int JBE_REL8_16 = 177;

    /**
     * JBE_REL8_32: Jump to the address specified by the 8-bit signed displacement if the carry flag (CF) or the zero flag (ZF) is set.
     */
    public static final int JBE_REL8_32 = 178;

    /**
     * JBE_REL8_64: Jump to the address specified by the 8-bit signed displacement if the carry flag (CF) or the zero flag (ZF) is set.
     */
    public static final int JBE_REL8_64 = 179;

    /**
     * JA_REL8_16: Jump to the address specified by the 8-bit signed displacement if neither the carry flag (CF) nor the zero flag (ZF) is set.
     */
    public static final int JA_REL8_16 = 180;

    /**
     * JA_REL8_32: Jump to the address specified by the 8-bit signed displacement if neither the carry flag (CF) nor the zero flag (ZF) is set.
     */
    public static final int JA_REL8_32 = 181;

    /**
     * JA_REL8_64: Jump to the address specified by the 8-bit signed displacement if neither the carry flag (CF) nor the zero flag (ZF) is set.
     */
    public static final int JA_REL8_64 = 182;

    /**
     * JS_REL8_16: Jump to the address specified by the 8-bit signed displacement if the sign flag (SF) is set.
     */
    public static final int JS_REL8_16 = 183;

    /**
     * JS_REL8_32: Jump to the address specified by the 8-bit signed displacement if the sign flag (SF) is set.
     */
    public static final int JS_REL8_32 = 184;

    /**
     * JS_REL8_64: Jump to the address specified by the 8-bit signed displacement if the sign flag (SF) is set.
     */
    public static final int JS_REL8_64 = 185;

    /**
     * JNS_REL8_16: Jump to the address specified by the 8-bit signed displacement if the sign flag (SF) is not set.
     */
    public static final int JNS_REL8_16 = 186;

    /**
     * JNS_REL8_32: Jump to the address specified by the 8-bit signed displacement if the sign flag (SF) is not set.
     */
    public static final int JNS_REL8_32 = 187;

    /**
     * JNS_REL8_64: Jump to the address specified by the 8-bit signed displacement if the sign flag (SF) is not set.
     */
    public static final int JNS_REL8_64 = 188;

    /**
     * JP_REL8_16: Jump to the address specified by the 8-bit signed displacement if the parity flag (PF) is set.
     */
    public static final int JP_REL8_16 = 189;

    /**
     * JP_REL8_32: Jump to the address specified by the 8-bit signed displacement if the parity flag (PF) is set.
     */
    public static final int JP_REL8_32 = 190;

    /**
     * JP_REL8_64: Jump to the address specified by the 8-bit signed displacement if the parity flag (PF) is set.
     */
    public static final int JP_REL8_64 = 191;

    /**
     * JNP_REL8_16: Jump to the address specified by the 8-bit signed displacement if the parity flag (PF) is not set.
     */
    public static final int JNP_REL8_16 = 192;

    /**
     * JNP_REL8_32: Jump to the address specified by the 8-bit signed displacement if the parity flag (PF) is not set.
     */
    public static final int JNP_REL8_32 = 193;

    /**
     * JNP_REL8_64: Jump to the address specified by the 8-bit signed displacement if the parity flag (PF) is not set.
     */
    public static final int JNP_REL8_64 = 194;

    /**
     * JL_REL8_16: Jump to the address specified by the 8-bit signed displacement if the less flag (SF != OF) is set.
     */
    public static final int JL_REL8_16 = 195;

    /**
     * JL_REL8_32: Jump to the address specified by the 8-bit signed displacement if the less flag (SF != OF) is set.
     */
    public static final int JL_REL8_32 = 196;

    /**
     * JL_REL8_64: Jump to the address specified by the 8-bit signed displacement if the less flag (SF != OF) is set.
     */
    public static final int JL_REL8_64 = 197;

    /**
     * JGE_REL8_16: Jump to the address specified by the 8-bit signed displacement if the greater or equal flag (SF == OF) is set.
     */
    public static final int JGE_REL8_16 = 198;

    /**
     * JGE_REL8_32: Jump to the address specified by the 8-bit signed displacement if the greater or equal flag (SF == OF) is set.
     */
    public static final int JGE_REL8_32 = 199;

    /**
     * JGE_REL8_64: Jump to the address specified by the 8-bit signed displacement if the greater or equal flag (SF == OF) is set.
     */
    public static final int JGE_REL8_64 = 200;

    /**
     * JLE_REL8_16: Jump to the address specified by the 8-bit signed displacement if the less or equal flag (ZF == 1 or SF != OF) is set.
     */
    public static final int JLE_REL8_16 = 201;

    /**
     * JLE_REL8_32: Jump to the address specified by the 8-bit signed displacement if the less or equal flag (ZF == 1 or SF != OF) is set.
     */
    public static final int JLE_REL8_32 = 202;

    /**
     * JLE_REL8_64: Jump to the address specified by the 8-bit signed displacement if the less or equal flag (ZF == 1 or SF != OF) is set.
     */
    public static final int JLE_REL8_64 = 203;

    /**
     * JG_REL8_16: Jump to the address specified by the 8-bit signed displacement if the greater flag (SF == OF) is set.
     */
    public static final int JG_REL8_16 = 204;

    /**
     * JG_REL8_32: Jump to the address specified by the 8-bit signed displacement if the greater flag (SF == OF) is set.
     */
    public static final int JG_REL8_32 = 205;

    /**
     * JG_REL8_64: Jump to the address specified by the 8-bit signed displacement if the greater flag (SF == OF) is set.
     */
    public static final int JG_REL8_64 = 206;

    /**
     * ADD_RM8_IMM8: Add the immediate value to the value at the specified 8-bit memory location.
     */
    public static final int ADD_RM8_IMM8 = 207;

    /**
     * OR_RM8_IMM8: Perform a bitwise OR between the immediate value and the value at the specified 8-bit memory location.
     */
    public static final int OR_RM8_IMM8 = 208;

    /**
     * ADC_RM8_IMM8: Add the immediate value and carry to the value at the specified 8-bit memory location.
     */
    public static final int ADC_RM8_IMM8 = 209;

    /**
     * SBB_RM8_IMM8: Subtract the immediate value and borrow from the value at the specified 8-bit memory location.
     */
    public static final int SBB_RM8_IMM8 = 210;

    /**
     * AND_RM8_IMM8: Perform a bitwise AND between the immediate value and the value at the specified 8-bit memory location.
     */
    public static final int AND_RM8_IMM8 = 211;

    /**
     * SUB_RM8_IMM8: Subtract the immediate value from the value at the specified 8-bit memory location.
     */
    public static final int SUB_RM8_IMM8 = 212;

    /**
     * XOR_RM8_IMM8: Perform a bitwise XOR between the immediate value and the value at the specified 8-bit memory location.
     */
    public static final int XOR_RM8_IMM8 = 213;

    /**
     * CMP_RM8_IMM8: Compare the immediate value with the value at the specified 8-bit memory location.
     */
    public static final int CMP_RM8_IMM8 = 214;

    /**
     * ADD_RM16_IMM16: Add the 16-bit immediate value to the value at the specified 16-bit memory location.
     */
    public static final int ADD_RM16_IMM16 = 215;

    /**
     * ADD_RM32_IMM32: Add the 32-bit immediate value to the value at the specified 32-bit memory location.
     */
    public static final int ADD_RM32_IMM32 = 216;

    /**
     * ADD_RM64_IMM32: Add the 32-bit immediate value to the value at the specified 64-bit memory location.
     */
    public static final int ADD_RM64_IMM32 = 217;

    /**
     * OR_RM16_IMM16: Perform a bitwise OR between the 16-bit immediate value and the value at the specified 16-bit memory location.
     */
    public static final int OR_RM16_IMM16 = 218;

    /**
     * OR_RM32_IMM32: Perform a bitwise OR between the 32-bit immediate value and the value at the specified 32-bit memory location.
     */
    public static final int OR_RM32_IMM32 = 219;

    /**
     * OR_RM64_IMM32: Perform a bitwise OR between the 32-bit immediate value and the value at the specified 64-bit memory location.
     */
    public static final int OR_RM64_IMM32 = 220;

    /**
     * ADC_RM16_IMM16: Add the 16-bit immediate value and carry to the value at the specified 16-bit memory location.
     */
    public static final int ADC_RM16_IMM16 = 221;

    /**
     * ADC_RM32_IMM32: Add the 32-bit immediate value and carry to the value at the specified 32-bit memory location.
     */
    public static final int ADC_RM32_IMM32 = 222;

    /**
     * ADC_RM64_IMM32: Add the 32-bit immediate value and carry to the value at the specified 64-bit memory location.
     */
    public static final int ADC_RM64_IMM32 = 223;

    /**
     * SBB_RM16_IMM16: Subtract the 16-bit immediate value and borrow from the value at the specified 16-bit memory location.
     */
    public static final int SBB_RM16_IMM16 = 224;

    /**
     * SBB_RM32_IMM32: Subtract the 32-bit immediate value and borrow from the value at the specified 32-bit memory location.
     */
    public static final int SBB_RM32_IMM32 = 225;

    /**
     * SBB_RM64_IMM32: Subtract the 32-bit immediate value and borrow from the value at the specified 64-bit memory location.
     */
    public static final int SBB_RM64_IMM32 = 226;

    /**
     * AND_RM16_IMM16: Perform a bitwise AND between the 16-bit immediate value and the value at the specified 16-bit memory location.
     */
    public static final int AND_RM16_IMM16 = 227;

    /**
     * AND_RM32_IMM32: Perform a bitwise AND between the 32-bit immediate value and the value at the specified 32-bit memory location.
     */
    public static final int AND_RM32_IMM32 = 228;

    /**
     * AND_RM64_IMM32: Perform a bitwise AND between the 32-bit immediate value and the value at the specified 64-bit memory location.
     */
    public static final int AND_RM64_IMM32 = 229;

    /**
     * SUB_RM16_IMM16: Subtract the 16-bit immediate value from the value at the specified 16-bit memory location.
     */
    public static final int SUB_RM16_IMM16 = 230;

    /**
     * SUB_RM32_IMM32: Subtract the 32-bit immediate value from the value at the specified 32-bit memory location.
     */
    public static final int SUB_RM32_IMM32 = 231;

    /**
     * SUB_RM64_IMM32: Subtract the 32-bit immediate value from the value at the specified 64-bit memory location.
     */
    public static final int SUB_RM64_IMM32 = 232;

    /**
     * XOR_RM16_IMM16: Perform a bitwise XOR between the 16-bit immediate value and the value at the specified 16-bit memory location.
     */
    public static final int XOR_RM16_IMM16 = 233;

    /**
     * XOR_RM32_IMM32: Perform a bitwise XOR between the 32-bit immediate value and the value at the specified 32-bit memory location.
     */
    public static final int XOR_RM32_IMM32 = 234;

    /**
     * XOR_RM64_IMM32: Perform a bitwise XOR between the 32-bit immediate value and the value at the specified 64-bit memory location.
     */
    public static final int XOR_RM64_IMM32 = 235;

    /**
     * CMP_RM16_IMM16: Compare the 16-bit immediate value with the value at the specified 16-bit memory location.
     */
    public static final int CMP_RM16_IMM16 = 236;

    /**
     * CMP_RM32_IMM32: Compare the 32-bit immediate value with the value at the specified 32-bit memory location.
     */
    public static final int CMP_RM32_IMM32 = 237;

    /**
     * CMP_RM64_IMM32: Compare the 32-bit immediate value with the value at the specified 64-bit memory location.
     */
    public static final int CMP_RM64_IMM32 = 238;

    /**
     * ADD_RM8_IMM8_82: Add the 8-bit immediate value to the value at the specified 8-bit memory location.
     */
    public static final int ADD_RM8_IMM8_82 = 239;

    /**
     * OR_RM8_IMM8_82: Perform a bitwise OR between the 8-bit immediate value and the value at the specified 8-bit memory location.
     */
    public static final int OR_RM8_IMM8_82 = 240;

    /**
     * ADC_RM8_IMM8_82: Add the 8-bit immediate value and carry to the value at the specified 8-bit memory location.
     */
    public static final int ADC_RM8_IMM8_82 = 241;

    /**
     * SBB_RM8_IMM8_82: Subtract the 8-bit immediate value and borrow from the value at the specified 8-bit memory location.
     */
    public static final int SBB_RM8_IMM8_82 = 242;

    /**
     * AND_RM8_IMM8_82: Perform a bitwise AND between the 8-bit immediate value and the value at the specified 8-bit memory location.
     */
    public static final int AND_RM8_IMM8_82 = 243;

    /**
     * SUB_RM8_IMM8_82: Subtract the 8-bit immediate value from the value at the specified 8-bit memory location.
     */
    public static final int SUB_RM8_IMM8_82 = 244;

    /**
     * XOR_RM8_IMM8_82: Perform a bitwise XOR between the 8-bit immediate value and the value at the specified 8-bit memory location.
     */
    public static final int XOR_RM8_IMM8_82 = 245;

    /**
     * CMP_RM8_IMM8_82: Compare the 8-bit immediate value with the value at the specified 8-bit memory location.
     */
    public static final int CMP_RM8_IMM8_82 = 246;

    /**
     * ADD_RM16_IMM8: Add the 8-bit immediate value to the value at the specified 16-bit memory location.
     */
    public static final int ADD_RM16_IMM8 = 247;

    /**
     * ADD_RM32_IMM8: Add the 8-bit immediate value to the value at the specified 32-bit memory location.
     */
    public static final int ADD_RM32_IMM8 = 248;

    /**
     * ADD_RM64_IMM8: Add the 8-bit immediate value to the value at the specified 64-bit memory location.
     */
    public static final int ADD_RM64_IMM8 = 249;

    /**
     * OR_RM16_IMM8: Perform a bitwise OR between the 8-bit immediate value and the value at the specified 16-bit memory location.
     */
    public static final int OR_RM16_IMM8 = 250;

    /**
     * OR_RM32_IMM8: Perform a bitwise OR operation between a 32-bit register/memory and an 8-bit immediate value.
     */
    public static final int OR_RM32_IMM8 = 251;

    /**
     * OR_RM64_IMM8: Perform a bitwise OR operation between a 64-bit register/memory and an 8-bit immediate value.
     */
    public static final int OR_RM64_IMM8 = 252;

    /**
     * ADC_RM16_IMM8: Add with carry a 16-bit register/memory and an 8-bit immediate value.
     */
    public static final int ADC_RM16_IMM8 = 253;

    /**
     * ADC_RM32_IMM8: Add with carry a 32-bit register/memory and an 8-bit immediate value.
     */
    public static final int ADC_RM32_IMM8 = 254;

    /**
     * ADC_RM64_IMM8: Add with carry a 64-bit register/memory and an 8-bit immediate value.
     */
    public static final int ADC_RM64_IMM8 = 255;

    /**
     * SBB_RM16_IMM8: Subtract with borrow a 16-bit register/memory and an 8-bit immediate value.
     */
    public static final int SBB_RM16_IMM8 = 256;

    /**
     * SBB_RM32_IMM8: Subtract with borrow a 32-bit register/memory and an 8-bit immediate value.
     */
    public static final int SBB_RM32_IMM8 = 257;

    /**
     * SBB_RM64_IMM8: Subtract with borrow a 64-bit register/memory and an 8-bit immediate value.
     */
    public static final int SBB_RM64_IMM8 = 258;

    /**
     * AND_RM16_IMM8: Perform a bitwise AND operation between a 16-bit register/memory and an 8-bit immediate value.
     */
    public static final int AND_RM16_IMM8 = 259;

    /**
     * AND_RM32_IMM8: Perform a bitwise AND operation between a 32-bit register/memory and an 8-bit immediate value.
     */
    public static final int AND_RM32_IMM8 = 260;

    /**
     * AND_RM64_IMM8: Perform a bitwise AND operation between a 64-bit register/memory and an 8-bit immediate value.
     */
    public static final int AND_RM64_IMM8 = 261;

    /**
     * SUB_RM16_IMM8: Subtract a 16-bit immediate value from a 16-bit register/memory.
     */
    public static final int SUB_RM16_IMM8 = 262;

    /**
     * SUB_RM32_IMM8: Subtract a 32-bit immediate value from a 32-bit register/memory.
     */
    public static final int SUB_RM32_IMM8 = 263;

    /**
     * SUB_RM64_IMM8: Subtract a 64-bit immediate value from a 64-bit register/memory.
     */
    public static final int SUB_RM64_IMM8 = 264;

    /**
     * XOR_RM16_IMM8: Perform a bitwise XOR operation between a 16-bit register/memory and an 8-bit immediate value.
     */
    public static final int XOR_RM16_IMM8 = 265;

    /**
     * XOR_RM32_IMM8: Perform a bitwise XOR operation between a 32-bit register/memory and an 8-bit immediate value.
     */
    public static final int XOR_RM32_IMM8 = 266;

    /**
     * XOR_RM64_IMM8: Perform a bitwise XOR operation between a 64-bit register/memory and an 8-bit immediate value.
     */
    public static final int XOR_RM64_IMM8 = 267;

    /**
     * CMP_RM16_IMM8: Compare a 16-bit register/memory with an 8-bit immediate value.
     */
    public static final int CMP_RM16_IMM8 = 268;

    /**
     * CMP_RM32_IMM8: Compare a 32-bit register/memory with an 8-bit immediate value.
     */
    public static final int CMP_RM32_IMM8 = 269;

    /**
     * CMP_RM64_IMM8: Compare a 64-bit register/memory with an 8-bit immediate value.
     */
    public static final int CMP_RM64_IMM8 = 270;

    /**
     * TEST_RM8_R8: Perform a bitwise AND operation between a 8-bit register/memory and a 8-bit register.
     */
    public static final int TEST_RM8_R8 = 271;

    /**
     * TEST_RM16_R16: Perform a bitwise AND operation between a 16-bit register/memory and a 16-bit register.
     */
    public static final int TEST_RM16_R16 = 272;

    /**
     * TEST_RM32_R32: Perform a bitwise AND operation between a 32-bit register/memory and a 32-bit register.
     */
    public static final int TEST_RM32_R32 = 273;

    /**
     * TEST_RM64_R64: Perform a bitwise AND operation between a 64-bit register/memory and a 64-bit register.
     */
    public static final int TEST_RM64_R64 = 274;

    /**
     * XCHG_RM8_R8: Exchange the values of two 8-bit registers/memory.
     */
    public static final int XCHG_RM8_R8 = 275;

    /**
     * XCHG_RM16_R16: Exchange the values of two 16-bit registers/memory.
     */
    public static final int XCHG_RM16_R16 = 276;

    /**
     * XCHG_RM32_R32: Exchange the values of two 32-bit registers/memory.
     */
    public static final int XCHG_RM32_R32 = 277;

    /**
     * XCHG_RM64_R64: Exchange the values of two 64-bit registers/memory.
     */
    public static final int XCHG_RM64_R64 = 278;

    /**
     * MOV_RM8_R8: Move the value from a 8-bit register to a 8-bit register/memory.
     */
    public static final int MOV_RM8_R8 = 279;

    /**
     * MOV_RM16_R16: Move the value from a 16-bit register to a 16-bit register/memory.
     */
    public static final int MOV_RM16_R16 = 280;

    /**
     * MOV_RM32_R32: Move the value from a 32-bit register to a 32-bit register/memory.
     */
    public static final int MOV_RM32_R32 = 281;

    /**
     * MOV_RM64_R64: Move the value from a 64-bit register to a 64-bit register/memory.
     */
    public static final int MOV_RM64_R64 = 282;

    /**
     * MOV_R8_RM8: Move the value from a 8-bit register to a 8-bit register/memory.
     */
    public static final int MOV_R8_RM8 = 283;

    /**
     * MOV_R16_RM16: Move the value from a 16-bit register to a 16-bit register/memory.
     */
    public static final int MOV_R16_RM16 = 284;

    /**
     * MOV_R32_RM32: Move the value from a 32-bit register to a 32-bit register/memory.
     */
    public static final int MOV_R32_RM32 = 285;

    /**
     * MOV_R64_RM64: Move the value from a 64-bit register to a 64-bit register/memory.
     */
    public static final int MOV_R64_RM64 = 286;

    /**
     * MOV_RM16_SREG: Move the value from a 16-bit register/memory to a segment register.
     */
    public static final int MOV_RM16_SREG = 287;

    /**
     * MOV_R32M16_SREG: Move the value from a 32-bit or 16-bit register/memory to a segment register.
     */
    public static final int MOV_R32M16_SREG = 288;

    /**
     * MOV_R64M16_SREG: Move the value from a 64-bit or 16-bit register/memory to a segment register.
     */
    public static final int MOV_R64M16_SREG = 289;

    /**
     * LEA_R16_M: Load the effective address of a memory operand into a 16-bit register.
     */
    public static final int LEA_R16_M = 290;

    /**
     * LEA_R32_M: Load the effective address of a memory operand into a 32-bit register.
     */
    public static final int LEA_R32_M = 291;

    /**
     * LEA_R64_M: Load the effective address of a memory operand into a 64-bit register.
     */
    public static final int LEA_R64_M = 292;

    /**
     * MOV_SREG_RM16: Move the value from a segment register to a 16-bit register/memory.
     */
    public static final int MOV_SREG_RM16 = 293;

    /**
     * MOV_SREG_R32M16: Move the value from a segment register to a 32-bit or 16-bit register/memory.
     */
    public static final int MOV_SREG_R32M16 = 294;

    /**
     * MOV_SREG_R64M16: Move the value from a segment register to a 64-bit or 16-bit register/memory.
     */
    public static final int MOV_SREG_R64M16 = 295;

    /**
     * POP_RM16: Pop a 16-bit value from the stack into a 16-bit register/memory.
     */
    public static final int POP_RM16 = 296;

    /**
     * POP_RM32: Pop a 32-bit value from the stack into a 32-bit register/memory.
     */
    public static final int POP_RM32 = 297;

    /**
     * POP_RM64: Pop a 64-bit value from the stack into a 64-bit register/memory.
     */
    public static final int POP_RM64 = 298;

    /**
     * NOPW: No operation (16-bit version).
     */
    public static final int NOPW = 299;

    /**
     * NOPD: No operation (32-bit version).
     */
    public static final int NOPD = 300;

    /**
     * NOPQ: No operation (64-bit version).
     */
    public static final int NOPQ = 301;

    /**
     * XCHG_R16_AX: Exchange the contents of a 16-bit register with the AX register.
     */
    public static final int XCHG_R16_AX = 302;

    /**
     * XCHG_R32_EAX: Exchange the contents of a 32-bit register with the EAX register.
     */
    public static final int XCHG_R32_EAX = 303;

    /**
     * XCHG_R64_RAX: Exchange the contents of a 64-bit register with the RAX register.
     */
    public static final int XCHG_R64_RAX = 304;

    /**
     * PAUSE: Hint to the processor to pause execution until the next instruction.
     */
    public static final int PAUSE = 305;

    /**
     * CBW: Convert byte to word (sign-extend AL to AX).
     */
    public static final int CBW = 306;

    /**
     * CWDE: Convert word to double word (sign-extend AX to EAX).
     */
    public static final int CWDE = 307;

    /**
     * CDQE: Convert double word to quad word (sign-extend EAX to RAX).
     */
    public static final int CDQE = 308;

    /**
     * CWD: Convert word to double word (sign-extend AX to DX:AX).
     */
    public static final int CWD = 309;

    /**
     * CDQ: Convert double word to quad word (sign-extend EAX to EDX:EAX).
     */
    public static final int CDQ = 310;

    /**
     * CQO: Convert quad word to octa word (sign-extend RAX to RDX:RAX).
     */
    public static final int CQO = 311;

    /**
     * CALL_PTR1616: Call a procedure at the address specified by the 16-bit segment and offset.
     */
    public static final int CALL_PTR1616 = 312;

    /**
     * CALL_PTR1632: Call a procedure at the address specified by the 16-bit segment and 32-bit offset.
     */
    public static final int CALL_PTR1632 = 313;

    /**
     * WAIT: Wait for the processor to complete pending floating-point operations.
     */
    public static final int WAIT = 314;

    /**
     * PUSHFW: Push the FLAGS register onto the stack (16-bit version).
     */
    public static final int PUSHFW = 315;

    /**
     * PUSHFD: Push the EFLAGS register onto the stack (32-bit version).
     */
    public static final int PUSHFD = 316;

    /**
     * PUSHFQ: Push the RFLAGS register onto the stack (64-bit version).
     */
    public static final int PUSHFQ = 317;

    /**
     * POPFW: Pop the FLAGS register from the stack (16-bit version).
     */
    public static final int POPFW = 318;

    /**
     * POPFD: Pop the EFLAGS register from the stack (32-bit version).
     */
    public static final int POPFD = 319;

    /**
     * POPFQ: Pop the RFLAGS register from the stack (64-bit version).
     */
    public static final int POPFQ = 320;

    /**
     * SAHF: Store the AH byte of the FLAGS register into the AH byte of the FLAGS register.
     */
    public static final int SAHF = 321;

    /**
     * LAHF: Load the AH byte of the FLAGS register into the AH byte of the FLAGS register.
     */
    public static final int LAHF = 322;

    /**
     * MOV_AL_MOFFS8: Move the 8-bit value at the specified memory offset into the AL register.
     */
    public static final int MOV_AL_MOFFS8 = 323;

    /**
     * MOV_AX_MOFFS16: Move the 16-bit value at the specified memory offset into the AX register.
     */
    public static final int MOV_AX_MOFFS16 = 324;

    /**
     * MOV_EAX_MOFFS32: Move the 32-bit value at the specified memory offset into the EAX register.
     */
    public static final int MOV_EAX_MOFFS32 = 325;

    /**
     * MOV_RAX_MOFFS64: Move the 64-bit value at the specified memory offset into the RAX register.
     */
    public static final int MOV_RAX_MOFFS64 = 326;

    /**
     * MOV_MOFFS8_AL: Move the contents of the AL register to the 8-bit memory offset.
     */
    public static final int MOV_MOFFS8_AL = 327;

    /**
     * MOV_MOFFS16_AX: Move the contents of the AX register to the 16-bit memory offset.
     */
    public static final int MOV_MOFFS16_AX = 328;

    /**
     * MOV_MOFFS32_EAX: Move the contents of the EAX register to the 32-bit memory offset.
     */
    public static final int MOV_MOFFS32_EAX = 329;

    /**
     * MOV_MOFFS64_RAX: Move the contents of the RAX register to the 64-bit memory offset.
     */
    public static final int MOV_MOFFS64_RAX = 330;

    /**
     * MOVSB_M8_M8: Move a byte from the source memory to the destination memory.
     */
    public static final int MOVSB_M8_M8 = 331;

    /**
     * MOVSW_M16_M16: Move a word from the source memory to the destination memory.
     */
    public static final int MOVSW_M16_M16 = 332;

    /**
     * MOVSD_M32_M32: Move a double word from the source memory to the destination memory.
     */
    public static final int MOVSD_M32_M32 = 333;

    /**
     * MOVSQ_M64_M64: Move a quad word from the source memory to the destination memory.
     */
    public static final int MOVSQ_M64_M64 = 334;

    /**
     * CMPSB_M8_M8: Compare a byte from the source memory with a byte from the destination memory.
     */
    public static final int CMPSB_M8_M8 = 335;

    /**
     * CMPSW_M16_M16: Compare a word from the source memory with a word from the destination memory.
     */
    public static final int CMPSW_M16_M16 = 336;

    /**
     * CMPSD_M32_M32: Compare a double word from the source memory with a double word from the destination memory.
     */
    public static final int CMPSD_M32_M32 = 337;

    /**
     * CMPSQ_M64_M64: Compare a quad word from the source memory with a quad word from the destination memory.
     */
    public static final int CMPSQ_M64_M64 = 338;

    /**
     * TEST_AL_IMM8: Test the AL register with an immediate 8-bit value.
     */
    public static final int TEST_AL_IMM8 = 339;

    /**
     * TEST_AX_IMM16: Test the AX register with an immediate 16-bit value.
     */
    public static final int TEST_AX_IMM16 = 340;

    /**
     * TEST_EAX_IMM32: Test the EAX register with an immediate 32-bit value.
     */
    public static final int TEST_EAX_IMM32 = 341;

    /**
     * TEST_RAX_IMM32: Test the RAX register with an immediate 32-bit value.
     */
    public static final int TEST_RAX_IMM32 = 342;

    /**
     * STOSB_M8_AL: Store the byte from the AL register into the destination memory.
     */
    public static final int STOSB_M8_AL = 343;

    /**
     * STOSW_M16_AX: Store the word from the AX register into the destination memory.
     */
    public static final int STOSW_M16_AX = 344;

    /**
     * STOSD_M32_EAX: Store the double word from the EAX register into the destination memory.
     */
    public static final int STOSD_M32_EAX = 345;

    /**
     * STOSQ_M64_RAX: Store the quad word from the RAX register into the destination memory.
     */
    public static final int STOSQ_M64_RAX = 346;

    /**
     * LODSB_AL_M8: Load a byte from the source memory into the AL register.
     */
    public static final int LODSB_AL_M8 = 347;

    /**
     * LODSW_AX_M16: Load a word from the source memory into the AX register.
     */
    public static final int LODSW_AX_M16 = 348;

    /**
     * LODSD_EAX_M32: Load a double word from the source memory into the EAX register.
     */
    public static final int LODSD_EAX_M32 = 349;

    /**
     * LODSQ_RAX_M64: Load a quad word from the source memory into the RAX register.
     */
    public static final int LODSQ_RAX_M64 = 350;

    /**
     * SCASB_AL_M8: Scan a byte from the AL register against the memory.
     */
    public static final int SCASB_AL_M8 = 351;

    /**
     * SCASW_AX_M16: Scan a word from the AX register against the memory.
     */
    public static final int SCASW_AX_M16 = 352;

    /**
     * SCASD_EAX_M32: Scan a double word from the EAX register against the memory.
     */
    public static final int SCASD_EAX_M32 = 353;

    /**
     * SCASQ_RAX_M64: Scan a quad word from the RAX register against the memory.
     */
    public static final int SCASQ_RAX_M64 = 354;

    /**
     * MOV_R8_IMM8: Move an immediate 8-bit value into the R8 register.
     */
    public static final int MOV_R8_IMM8 = 355;

    /**
     * MOV_R16_IMM16: Move an immediate 16-bit value into the R16 register.
     */
    public static final int MOV_R16_IMM16 = 356;

    /**
     * MOV_R32_IMM32: Move an immediate 32-bit value into the R32 register.
     */
    public static final int MOV_R32_IMM32 = 357;

    /**
     * MOV_R64_IMM64: Move an immediate 64-bit value into the R64 register.
     */
    public static final int MOV_R64_IMM64 = 358;

    /**
     * ROL_RM8_IMM8: Rotate left a byte in memory or register by an immediate 8-bit value.
     */
    public static final int ROL_RM8_IMM8 = 359;

    /**
     * ROR_RM8_IMM8: Rotate right a byte in memory or register by an immediate 8-bit value.
     */
    public static final int ROR_RM8_IMM8 = 360;

    /**
     * RCL_RM8_IMM8: Rotate left through carry a byte in memory or register by an immediate 8-bit value.
     */
    public static final int RCL_RM8_IMM8 = 361;

    /**
     * RCR_RM8_IMM8: Rotate right through carry a byte in memory or register by an immediate 8-bit value.
     */
    public static final int RCR_RM8_IMM8 = 362;

    /**
     * SHL_RM8_IMM8: Shift left a byte in memory or register by an immediate 8-bit value.
     */
    public static final int SHL_RM8_IMM8 = 363;

    /**
     * SHR_RM8_IMM8: Shift right a byte in memory or register by an immediate 8-bit value.
     */
    public static final int SHR_RM8_IMM8 = 364;

    /**
     * SAL_RM8_IMM8: Shift arithmetic left a byte in memory or register by an immediate 8-bit value.
     */
    public static final int SAL_RM8_IMM8 = 365;

    /**
     * SAR_RM8_IMM8: Shift arithmetic right a byte in memory or register by an immediate 8-bit value.
     */
    public static final int SAR_RM8_IMM8 = 366;

    /**
     * ROL_RM16_IMM8: Rotate left a word in memory or register by an immediate 8-bit value.
     */
    public static final int ROL_RM16_IMM8 = 367;

    /**
     * ROL_RM32_IMM8: Rotate left a double word in memory or register by an immediate 8-bit value.
     */
    public static final int ROL_RM32_IMM8 = 368;

    /**
     * ROL_RM64_IMM8: Rotate left a quad word in memory or register by an immediate 8-bit value.
     */
    public static final int ROL_RM64_IMM8 = 369;

    /**
     * ROR_RM16_IMM8: Rotate right a word in memory or register by an immediate 8-bit value.
     */
    public static final int ROR_RM16_IMM8 = 370;

    /**
     * ROR_RM32_IMM8: Rotate right a double word in memory or register by an immediate 8-bit value.
     */
    public static final int ROR_RM32_IMM8 = 371;

    /**
     * ROR_RM64_IMM8: Rotate right a quad word in memory or register by an immediate 8-bit value.
     */
    public static final int ROR_RM64_IMM8 = 372;

    /**
     * RCL_RM16_IMM8: Rotate left through carry a word in memory or register by an immediate 8-bit value.
     */
    public static final int RCL_RM16_IMM8 = 373;

    /**
     * RCL_RM32_IMM8: Rotate left through carry a double word in memory or register by an immediate 8-bit value.
     */
    public static final int RCL_RM32_IMM8 = 374;

    /**
     * RCL_RM64_IMM8: Rotate left through carry a quad word in memory or register by an immediate 8-bit value.
     */
    public static final int RCL_RM64_IMM8 = 375;

    /**
     * RCR_RM16_IMM8: Rotate right through carry a word in memory or register by an immediate 8-bit value.
     */
    public static final int RCR_RM16_IMM8 = 376;

    /**
     * RCR_RM32_IMM8: Rotate right through carry a double word in memory or register by an immediate 8-bit value.
     */
    public static final int RCR_RM32_IMM8 = 377;

    /**
     * RCR_RM64_IMM8: Rotate right through carry a quad word in memory or register by an immediate 8-bit value.
     */
    public static final int RCR_RM64_IMM8 = 378;

    /**
     * SHL_RM16_IMM8: Shift left a word in memory or register by an immediate 8-bit value.
     */
    public static final int SHL_RM16_IMM8 = 379;

    /**
     * SHL_RM32_IMM8: Shift left a double word in memory or register by an immediate 8-bit value.
     */
    public static final int SHL_RM32_IMM8 = 380;

    /**
     * SHL_RM64_IMM8: Shift left a quad word in memory or register by an immediate 8-bit value.
     */
    public static final int SHL_RM64_IMM8 = 381;

    /**
     * SHR_RM16_IMM8: Shift right a word in memory or register by an immediate 8-bit value.
     */
    public static final int SHR_RM16_IMM8 = 382;

    /**
     * SHR_RM32_IMM8: Shift right a double word in memory or register by an immediate 8-bit value.
     */
    public static final int SHR_RM32_IMM8 = 383;

    /**
     * SHR_RM64_IMM8: Shift right a quad word in memory or register by an immediate 8-bit value.
     */
    public static final int SHR_RM64_IMM8 = 384;

    /**
     * SAL_RM16_IMM8: Shift arithmetic left a word in memory or register by an immediate 8-bit value.
     */
    public static final int SAL_RM16_IMM8 = 385;

    /**
     * SAL_RM32_IMM8: Shift arithmetic left a double word in memory or register by an immediate 8-bit value.
     */
    public static final int SAL_RM32_IMM8 = 386;

    /**
     * SAL_RM64_IMM8: Shift arithmetic left a quad word in memory or register by an immediate 8-bit value.
     */
    public static final int SAL_RM64_IMM8 = 387;

    /**
     * SAR_RM16_IMM8: Shift arithmetic right a word in memory or register by an immediate 8-bit value.
     */
    public static final int SAR_RM16_IMM8 = 388;

    /**
     * SAR_RM32_IMM8: Shift arithmetic right a double word in memory or register by an immediate 8-bit value.
     */
    public static final int SAR_RM32_IMM8 = 389;

    /**
     * SAR_RM64_IMM8: Shift arithmetic right a quad word in memory or register by an immediate 8-bit value.
     */
    public static final int SAR_RM64_IMM8 = 390;

    /**
     * RETNW_IMM16: Return from procedure with an immediate 16-bit value.
     */
    public static final int RETNW_IMM16 = 391;

    /**
     * RETND_IMM16: Return from procedure with an immediate 16-bit value (32-bit mode).
     */
    public static final int RETND_IMM16 = 392;

    /**
     * RETNQ_IMM16: Return from procedure with an immediate 16-bit value (64-bit mode).
     */
    public static final int RETNQ_IMM16 = 393;

    /**
     * RETNW: Return from procedure.
     */
    public static final int RETNW = 394;

    /**
     * RETND: Return from procedure (32-bit mode).
     */
    public static final int RETND = 395;

    /**
     * RETNQ: Return from procedure (64-bit mode).
     */
    public static final int RETNQ = 396;

    /**
     * LES_R16_M1616: Load far pointer to the R16 register from memory.
     */
    public static final int LES_R16_M1616 = 397;

    /**
     * LES_R32_M1632: Load far pointer to the R32 register from memory.
     */
    public static final int LES_R32_M1632 = 398;

    /**
     * LDS_R16_M1616: Load far pointer to the R16 register from memory.
     */
    public static final int LDS_R16_M1616 = 399;

    /**
     * LDS_R32_M1632: Load far pointer to the R32 register from memory.
     */
    public static final int LDS_R32_M1632 = 400;

    /**
     * MOV_RM8_IMM8: Move an 8-bit immediate value into a register/memory operand.
     */
    public static final int MOV_RM8_IMM8 = 401;

    /**
     * XABORT_IMM8: Abort transactional execution with an 8-bit immediate value.
     */
    public static final int XABORT_IMM8 = 402;

    /**
     * MOV_RM16_IMM16: Move a 16-bit immediate value into a register/memory operand.
     */
    public static final int MOV_RM16_IMM16 = 403;

    /**
     * MOV_RM32_IMM32: Move a 32-bit immediate value into a register/memory operand.
     */
    public static final int MOV_RM32_IMM32 = 404;

    /**
     * MOV_RM64_IMM32: Move a 32-bit immediate value into a 64-bit register/memory operand.
     */
    public static final int MOV_RM64_IMM32 = 405;

    /**
     * XBEGIN_REL16: Begin a transaction with a relative 16-bit offset.
     */
    public static final int XBEGIN_REL16 = 406;

    /**
     * XBEGIN_REL32: Begin a transaction with a relative 32-bit offset.
     */
    public static final int XBEGIN_REL32 = 407;

    /**
     * ENTERW_IMM16_IMM8: Set up a stack frame with 16-bit immediate values for the number of words and stack size.
     */
    public static final int ENTERW_IMM16_IMM8 = 408;

    /**
     * ENTERD_IMM16_IMM8: Set up a stack frame with 32-bit immediate values for the number of words and stack size.
     */
    public static final int ENTERD_IMM16_IMM8 = 409;

    /**
     * ENTERQ_IMM16_IMM8: Set up a stack frame with 64-bit immediate values for the number of words and stack size.
     */
    public static final int ENTERQ_IMM16_IMM8 = 410;

    /**
     * LEAVEW: Leave the current stack frame (16-bit operation).
     */
    public static final int LEAVEW = 411;

    /**
     * LEAVED: Leave the current stack frame (32-bit operation).
     */
    public static final int LEAVED = 412;

    /**
     * LEAVEQ: Leave the current stack frame (64-bit operation).
     */
    public static final int LEAVEQ = 413;

    /**
     * RETFW_IMM16: Return from a procedure with a 16-bit immediate return address.
     */
    public static final int RETFW_IMM16 = 414;

    /**
     * RETFD_IMM16: Return from a procedure with a 32-bit immediate return address.
     */
    public static final int RETFD_IMM16 = 415;

    /**
     * RETFQ_IMM16: Return from a procedure with a 64-bit immediate return address.
     */
    public static final int RETFQ_IMM16 = 416;

    /**
     * RETFW: Return from a procedure with a 16-bit return address.
     */
    public static final int RETFW = 417;

    /**
     * RETFD: Return from a procedure with a 32-bit return address.
     */
    public static final int RETFD = 418;

    /**
     * RETFQ: Return from a procedure with a 64-bit return address.
     */
    public static final int RETFQ = 419;

    /**
     * INT3: Trigger a breakpoint interrupt.
     */
    public static final int INT3 = 420;

    /**
     * INT_IMM8: Trigger an interrupt with an 8-bit immediate value.
     */
    public static final int INT_IMM8 = 421;

    /**
     * INTO: Trigger an interrupt on overflow.
     */
    public static final int INTO = 422;

    /**
     * IRETW: Return from an interrupt procedure (16-bit operation).
     */
    public static final int IRETW = 423;

    /**
     * IRETD: Return from an interrupt procedure (32-bit operation).
     */
    public static final int IRETD = 424;

    /**
     * IRETQ: Return from an interrupt procedure (64-bit operation).
     */
    public static final int IRETQ = 425;

    /**
     * ROL_RM8_1: Rotate an 8-bit operand left by 1 bit.
     */
    public static final int ROL_RM8_1 = 426;

    /**
     * ROR_RM8_1: Rotate an 8-bit operand right by 1 bit.
     */
    public static final int ROR_RM8_1 = 427;

    /**
     * RCL_RM8_1: Rotate an 8-bit operand left through the carry flag by 1 bit.
     */
    public static final int RCL_RM8_1 = 428;

    /**
     * RCR_RM8_1: Rotate an 8-bit operand right through the carry flag by 1 bit.
     */
    public static final int RCR_RM8_1 = 429;

    /**
     * SHL_RM8_1: Shift an 8-bit operand left by 1 bit.
     */
    public static final int SHL_RM8_1 = 430;

    /**
     * SHR_RM8_1: Shift an 8-bit operand right by 1 bit.
     */
    public static final int SHR_RM8_1 = 431;

    /**
     * SAL_RM8_1: Shift an 8-bit operand left (same as SHL) by 1 bit.
     */
    public static final int SAL_RM8_1 = 432;

    /**
     * SAR_RM8_1: Shift an 8-bit operand right through the carry flag by 1 bit.
     */
    public static final int SAR_RM8_1 = 433;

    /**
     * ROL_RM16_1: Rotate a 16-bit operand left by 1 bit.
     */
    public static final int ROL_RM16_1 = 434;

    /**
     * ROL_RM32_1: Rotate a 32-bit operand left by 1 bit.
     */
    public static final int ROL_RM32_1 = 435;

    /**
     * ROL_RM64_1: Rotate a 64-bit operand left by 1 bit.
     */
    public static final int ROL_RM64_1 = 436;

    /**
     * ROR_RM16_1: Rotate a 16-bit operand right by 1 bit.
     */
    public static final int ROR_RM16_1 = 437;

    /**
     * ROR_RM32_1: Rotate a 32-bit operand right by 1 bit.
     */
    public static final int ROR_RM32_1 = 438;

    /**
     * ROR_RM64_1: Rotate a 64-bit operand right by 1 bit.
     */
    public static final int ROR_RM64_1 = 439;

    /**
     * RCL_RM16_1: Rotate a 16-bit operand left through the carry flag by 1 bit.
     */
    public static final int RCL_RM16_1 = 440;

    /**
     * RCL_RM32_1: Rotate a 32-bit operand left through the carry flag by 1 bit.
     */
    public static final int RCL_RM32_1 = 441;

    /**
     * RCL_RM64_1: Rotate a 64-bit operand left through the carry flag by 1 bit.
     */
    public static final int RCL_RM64_1 = 442;

    /**
     * RCR_RM16_1: Rotate a 16-bit operand right through the carry flag by 1 bit.
     */
    public static final int RCR_RM16_1 = 443;

    /**
     * RCR_RM32_1: Rotate a 32-bit operand right through the carry flag by 1 bit.
     */
    public static final int RCR_RM32_1 = 444;

    /**
     * RCR_RM64_1: Rotate a 64-bit operand right through the carry flag by 1 bit.
     */
    public static final int RCR_RM64_1 = 445;

    /**
     * SHL_RM16_1: Shift a 16-bit operand left by 1 bit.
     */
    public static final int SHL_RM16_1 = 446;

    /**
     * SHL_RM32_1: Shift a 32-bit operand left by 1 bit.
     */
    public static final int SHL_RM32_1 = 447;

    /**
     * SHL_RM64_1: Shift a 64-bit operand left by 1 bit.
     */
    public static final int SHL_RM64_1 = 448;

    /**
     * SHR_RM16_1: Shift a 16-bit operand right by 1 bit.
     */
    public static final int SHR_RM16_1 = 449;

    /**
     * SHR_RM32_1: Shift a 32-bit operand right by 1 bit.
     */
    public static final int SHR_RM32_1 = 450;

    /**
     * SHR_RM64_1: Perform a logical shift right by 1 on the 64-bit operand.
     */
    public static final int SHR_RM64_1 = 451;

    /**
     * SAL_RM16_1: Perform an arithmetic shift left by 1 on the 16-bit operand.
     */
    public static final int SAL_RM16_1 = 452;

    /**
     * SAL_RM32_1: Perform an arithmetic shift left by 1 on the 32-bit operand.
     */
    public static final int SAL_RM32_1 = 453;

    /**
     * SAL_RM64_1: Perform an arithmetic shift left by 1 on the 64-bit operand.
     */
    public static final int SAL_RM64_1 = 454;

    /**
     * SAR_RM16_1: Perform an arithmetic shift right by 1 on the 16-bit operand.
     */
    public static final int SAR_RM16_1 = 455;

    /**
     * SAR_RM32_1: Perform an arithmetic shift right by 1 on the 32-bit operand.
     */
    public static final int SAR_RM32_1 = 456;

    /**
     * SAR_RM64_1: Perform an arithmetic shift right by 1 on the 64-bit operand.
     */
    public static final int SAR_RM64_1 = 457;

    /**
     * ROL_RM8_CL: Perform a rotate left through carry on the 8-bit operand with CL register as the shift count.
     */
    public static final int ROL_RM8_CL = 458;

    /**
     * ROR_RM8_CL: Perform a rotate right through carry on the 8-bit operand with CL register as the shift count.
     */
    public static final int ROR_RM8_CL = 459;

    /**
     * RCL_RM8_CL: Perform a rotate left through carry on the 8-bit operand with CL register as the shift count.
     */
    public static final int RCL_RM8_CL = 460;

    /**
     * RCR_RM8_CL: Perform a rotate right through carry on the 8-bit operand with CL register as the shift count.
     */
    public static final int RCR_RM8_CL = 461;

    /**
     * SHL_RM8_CL: Perform a logical shift left on the 8-bit operand with CL register as the shift count.
     */
    public static final int SHL_RM8_CL = 462;

    /**
     * SHR_RM8_CL: Perform a logical shift right on the 8-bit operand with CL register as the shift count.
     */
    public static final int SHR_RM8_CL = 463;

    /**
     * SAL_RM8_CL: Perform an arithmetic shift left on the 8-bit operand with CL register as the shift count.
     */
    public static final int SAL_RM8_CL = 464;

    /**
     * SAR_RM8_CL: Perform an arithmetic shift right on the 8-bit operand with CL register as the shift count.
     */
    public static final int SAR_RM8_CL = 465;

    /**
     * ROL_RM16_CL: Perform a rotate left through carry on the 16-bit operand with CL register as the shift count.
     */
    public static final int ROL_RM16_CL = 466;

    /**
     * ROL_RM32_CL: Perform a rotate left through carry on the 32-bit operand with CL register as the shift count.
     */
    public static final int ROL_RM32_CL = 467;

    /**
     * ROL_RM64_CL: Perform a rotate left through carry on the 64-bit operand with CL register as the shift count.
     */
    public static final int ROL_RM64_CL = 468;

    /**
     * ROR_RM16_CL: Perform a rotate right through carry on the 16-bit operand with CL register as the shift count.
     */
    public static final int ROR_RM16_CL = 469;

    /**
     * ROR_RM32_CL: Perform a rotate right through carry on the 32-bit operand with CL register as the shift count.
     */
    public static final int ROR_RM32_CL = 470;

    /**
     * ROR_RM64_CL: Perform a rotate right through carry on the 64-bit operand with CL register as the shift count.
     */
    public static final int ROR_RM64_CL = 471;

    /**
     * RCL_RM16_CL: Perform a rotate left through carry on the 16-bit operand with CL register as the shift count.
     */
    public static final int RCL_RM16_CL = 472;

    /**
     * RCL_RM32_CL: Perform a rotate left through carry on the 32-bit operand with CL register as the shift count.
     */
    public static final int RCL_RM32_CL = 473;

    /**
     * RCL_RM64_CL: Perform a rotate left through carry on the 64-bit operand with CL register as the shift count.
     */
    public static final int RCL_RM64_CL = 474;

    /**
     * RCR_RM16_CL: Perform a rotate right through carry on the 16-bit operand with CL register as the shift count.
     */
    public static final int RCR_RM16_CL = 475;

    /**
     * RCR_RM32_CL: Perform a rotate right through carry on the 32-bit operand with CL register as the shift count.
     */
    public static final int RCR_RM32_CL = 476;

    /**
     * RCR_RM64_CL: Perform a rotate right through carry on the 64-bit operand with CL register as the shift count.
     */
    public static final int RCR_RM64_CL = 477;

    /**
     * SHL_RM16_CL: Perform a logical shift left on the 16-bit operand with CL register as the shift count.
     */
    public static final int SHL_RM16_CL = 478;

    /**
     * SHL_RM32_CL: Perform a logical shift left on the 32-bit operand with CL register as the shift count.
     */
    public static final int SHL_RM32_CL = 479;

    /**
     * SHL_RM64_CL: Perform a logical shift left on the 64-bit operand with CL register as the shift count.
     */
    public static final int SHL_RM64_CL = 480;

    /**
     * SHR_RM16_CL: Perform a logical shift right on the 16-bit operand with CL register as the shift count.
     */
    public static final int SHR_RM16_CL = 481;

    /**
     * SHR_RM32_CL: Perform a logical shift right on the 32-bit operand with CL register as the shift count.
     */
    public static final int SHR_RM32_CL = 482;

    /**
     * SHR_RM64_CL: Perform a logical shift right on the 64-bit operand with CL register as the shift count.
     */
    public static final int SHR_RM64_CL = 483;

    /**
     * SAL_RM16_CL: Perform an arithmetic shift left on the 16-bit operand with CL register as the shift count.
     */
    public static final int SAL_RM16_CL = 484;

    /**
     * SAL_RM32_CL: Perform an arithmetic shift left on the 32-bit operand with CL register as the shift count.
     */
    public static final int SAL_RM32_CL = 485;

    /**
     * SAL_RM64_CL: Perform an arithmetic shift left on the 64-bit operand with CL register as the shift count.
     */
    public static final int SAL_RM64_CL = 486;

    /**
     * SAR_RM16_CL: Perform an arithmetic shift right on the 16-bit operand with CL register as the shift count.
     */
    public static final int SAR_RM16_CL = 487;

    /**
     * SAR_RM32_CL: Perform an arithmetic shift right on the 32-bit operand with CL register as the shift count.
     */
    public static final int SAR_RM32_CL = 488;

    /**
     * SAR_RM64_CL: Perform an arithmetic shift right on the 64-bit operand with CL register as the shift count.
     */
    public static final int SAR_RM64_CL = 489;

    /**
     * AAM_IMM8: ASCII adjust AX after multiply by the immediate 8-bit value.
     */
    public static final int AAM_IMM8 = 490;

    /**
     * AAD_IMM8: ASCII adjust AX before division by the immediate 8-bit value.
     */
    public static final int AAD_IMM8 = 491;

    /**
     * SALC: Set AL based on the carry flag.
     */
    public static final int SALC = 492;

    /**
     * XLAT_M8: Translate a byte from memory based on AL register value.
     */
    public static final int XLAT_M8 = 493;

    /**
     * FADD_M32FP: Add a floating point value from memory to the ST(0) register.
     */
    public static final int FADD_M32FP = 494;

    /**
     * FMUL_M32FP: Multiply a floating point value from memory with the ST(0) register.
     */
    public static final int FMUL_M32FP = 495;

    /**
     * FCOM_M32FP: Compare a floating point value from memory with the ST(0) register.
     */
    public static final int FCOM_M32FP = 496;

    /**
     * FCOMP_M32FP: Compare and pop a floating point value from memory with the ST(0) register.
     */
    public static final int FCOMP_M32FP = 497;

    /**
     * FSUB_M32FP: Subtract a floating point value from memory from the ST(0) register.
     */
    public static final int FSUB_M32FP = 498;

    /**
     * FSUBR_M32FP: Subtract a floating point value from memory from the ST(0) register and reverse the operands.
     */
    public static final int FSUBR_M32FP = 499;

    /**
     * FDIV_M32FP: Divide a floating point value from memory by the ST(0) register.
     */
    public static final int FDIV_M32FP = 500;
}