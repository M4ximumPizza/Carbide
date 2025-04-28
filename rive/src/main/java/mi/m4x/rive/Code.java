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

}
