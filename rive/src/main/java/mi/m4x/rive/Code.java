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
    public static final int INVALID;

    /**
     * DECLAREBYTE: Declares a byte-sized value.
     */
    public static final int DECLAREBYTE;

    /**
     * DECLAREWORD: Declares a word-sized value (16 bits).
     */
    public static final int DECLAREWORD;

    /**
     * DECLAREDWORD: Declares a double-word-sized value (32 bits).
     */
    public static final int DECLAREDWORD;

    /**
     * DECLAREQWORD: Declares a quad-word-sized value (64 bits).
     */
    public static final int DECLAREQWORD;

    /**
     * ADD_RM8_R8: Add an 8-bit register to an 8-bit memory operand.
     */
    public static final int ADD_RM8_R8;

    /**
     * ADD_RM16_R16: Add a 16-bit register to a 16-bit memory operand.
     */
    public static final int ADD_RM16_R16;

    /**
     * ADD_RM32_R32: Add a 32-bit register to a 32-bit memory operand.
     */
    public static final int ADD_RM32_R32;

    /**
     * ADD_RM64_R64: Add a 64-bit register to a 64-bit memory operand.
     */
    public static final int ADD_RM64_R64;

    /**
     * ADD_R8_RM8: Add an 8-bit register to an 8-bit memory operand.
     */
    public static final int ADD_R8_RM8;

    /**
     * ADD_R16_RM16: Add a 16-bit register to a 16-bit memory operand.
     */
    public static final int ADD_R16_RM16;

    /**
     * ADD_R32_RM32: Add a 32-bit register to a 32-bit memory operand.
     */
    public static final int ADD_R32_RM32;

    /**
     * ADD_R64_RM64: Add a 64-bit register to a 64-bit memory operand.
     */
    public static final int ADD_R64_RM64;

    /**
     * ADD_AL_IMM8: Add an 8-bit immediate value to the AL register.
     */
    public static final int ADD_AL_IMM8;

    /**
     * ADD_AX_IMM16: Add a 16-bit immediate value to the AX register.
     */
    public static final int ADD_AX_IMM16;

    /**
     * ADD_EAX_IMM32: Add a 32-bit immediate value to the EAX register.
     */
    public static final int ADD_EAX_IMM32;

    /**
     * ADD_RAX_IMM64: Add a 64-bit immediate value to the RAX register.
     */
    public static final int ADD_RAX_IMM64;

    /**
     * ADD_RM8_IMM8: Add the immediate value to the value at the specified 8-bit memory location.
     */
    public static final int ADD_RM8_IMM8;

    /**
     * ADD_RM16_IMM16: Add the 16-bit immediate value to the value at the specified 16-bit memory location.
     */
    public static final int ADD_RM16_IMM16;

    /**
     * ADD_RM32_IMM32: Add the 32-bit immediate value to the value at the specified 32-bit memory location.
     */
    public static final int ADD_RM32_IMM32;

    /**
     * ADD_RM64_IMM32: Add the 32-bit immediate value to the value at the specified 64-bit memory location.
     */
    public static final int ADD_RM64_IMM32;

    /**
     * ADD_RM8_IMM8_82: Add the 8-bit immediate value to the value at the specified 8-bit memory location.
     */
    public static final int ADD_RM8_IMM8_82;

    /**
     * ADD_RM16_IMM8: Add the 8-bit immediate value to the value at the specified 16-bit memory location.
     */
    public static final int ADD_RM16_IMM8;

    /**
     * ADD_RM32_IMM8: Add the 8-bit immediate value to the value at the specified 32-bit memory location.
     */
    public static final int ADD_RM32_IMM8;

    /**
     * ADD_RM64_IMM8: Add the 8-bit immediate value to the value at the specified 64-bit memory location.
     */
    public static final int ADD_RM64_IMM8;

    /**
     * OR_RM8_R8: Perform a bitwise OR between an 8-bit register and an 8-bit memory operand.
     */
    public static final int OR_RM8_R8;

    /**
     * OR_RM16_R16: Perform a bitwise OR between a 16-bit register and a 16-bit memory operand.
     */
    public static final int OR_RM16_R16;

    /**
     * OR_RM32_R32: Perform a bitwise OR between a 32-bit register and a 32-bit memory operand.
     */
    public static final int OR_RM32_R32;

    /**
     * OR_RM64_R64: Perform a bitwise OR between a 64-bit register and a 64-bit memory operand.
     */
    public static final int OR_RM64_R64;

    /**
     * OR_R8_RM8: Perform a bitwise OR between an 8-bit register and an 8-bit memory operand.
     */
    public static final int OR_R8_RM8;

    /**
     * OR_R16_RM16: Perform a bitwise OR between a 16-bit register and a 16-bit memory operand.
     */
    public static final int OR_R16_RM16;

    /**
     * OR_R32_RM32: Perform a bitwise OR between a 32-bit register and a 32-bit memory operand.
     */
    public static final int OR_R32_RM32;

    /**
     * OR_R64_RM64: Perform a bitwise OR between a 64-bit register and a 64-bit memory operand.
     */
    public static final int OR_R64_RM64;

    /**
     * OR_AL_IMM8: Perform a bitwise OR between the AL register and an 8-bit immediate value.
     */
    public static final int OR_AL_IMM8;

    /**
     * OR_AX_IMM16: Perform a bitwise OR between the AX register and a 16-bit immediate value.
     */
    public static final int OR_AX_IMM16;

    /**
     * OR_EAX_IMM32: Perform a bitwise OR between the EAX register and a 32-bit immediate value.
     */
    public static final int OR_EAX_IMM32;

    /**
     * OR_RAX_IMM32: Perform a bitwise OR between the RAX register and a 32-bit immediate value.
     */
    public static final int OR_RAX_IMM32;

    /**
     * OR_RM8_IMM8: Perform a bitwise OR between the immediate value and the value at the specified 8-bit memory location.
     */
    public static final int OR_RM8_IMM8;

    /**
     * OR_RM16_IMM16: Perform a bitwise OR between the 16-bit immediate value and the value at the specified 16-bit memory location.
     */
    public static final int OR_RM16_IMM16;

    /**
     * OR_RM32_IMM32: Perform a bitwise OR between the 32-bit immediate value and the value at the specified 32-bit memory location.
     */
    public static final int OR_RM32_IMM32;

    /**
     * OR_RM64_IMM32: Perform a bitwise OR between the 32-bit immediate value and the value at the specified 64-bit memory location.
     */
    public static final int OR_RM64_IMM32;

    /**
     * OR_RM8_IMM8_82: Perform a bitwise OR between the 8-bit immediate value and the value at the specified 8-bit memory location.
     */
    public static final int OR_RM8_IMM8_82;

    /**
     * OR_RM16_IMM8: Perform a bitwise OR between the 8-bit immediate value and the value at the specified 16-bit memory location.
     */
    public static final int OR_RM16_IMM8;

    /**
     * OR_RM32_IMM8: Perform a bitwise OR operation between a 32-bit register/memory and an 8-bit immediate value.
     */
    public static final int OR_RM32_IMM8;

    /**
     * OR_RM64_IMM8: Perform a bitwise OR operation between a 64-bit register/memory and an 8-bit immediate value.
     */
    public static final int OR_RM64_IMM8;

    /**
     * ADC_RM8_R8: Add with carry (ADC) between an 8-bit register and an 8-bit memory operand.
     */
    public static final int ADC_RM8_R8;

    /**
     * ADC_RM16_R16: Add with carry (ADC) between a 16-bit register and a 16-bit memory operand.
     */
    public static final int ADC_RM16_R16;

    /**
     * ADC_RM32_R32: Add with carry (ADC) between a 32-bit register and a 32-bit memory operand.
     */
    public static final int ADC_RM32_R32;

    /**
     * ADC_RM64_R64: Add with carry (ADC) between a 64-bit register and a 64-bit memory operand.
     */
    public static final int ADC_RM64_R64;

    /**
     * ADC_R8_RM8: Add with carry (ADC) between an 8-bit register and an 8-bit memory operand.
     */
    public static final int ADC_R8_RM8;

    /**
     * ADC_R16_RM16: Add with carry (ADC) between a 16-bit register and a 16-bit memory operand.
     */
    public static final int ADC_R16_RM16;

    /**
     * ADC_R32_RM32: Add with carry (ADC) between a 32-bit register and a 32-bit memory operand.
     */
    public static final int ADC_R32_RM32;

    /**
     * ADC_R64_RM64: Add with carry (ADC) between a 64-bit register and a 64-bit memory operand.
     */
    public static final int ADC_R64_RM64;

    /**
     * ADC_AL_IMM8: Add with carry (ADC) between the AL register and an 8-bit immediate value.
     */
    public static final int ADC_AL_IMM8;

    /**
     * ADC_AX_IMM16: Add with carry (ADC) between the AX register and a 16-bit immediate value.
     */
    public static final int ADC_AX_IMM16;

    /**
     * ADC_EAX_IMM32: Add with carry (ADC) between the EAX register and a 32-bit immediate value.
     */
    public static final int ADC_EAX_IMM32;

    /**
     * ADC_RAX_IMM32: Add with carry (ADC) between the RAX register and a 32-bit immediate value.
     */
    public static final int ADC_RAX_IMM32;

    /**
     * ADC_RM8_IMM8: Add the immediate value and carry to the value at the specified 8-bit memory location.
     */
    public static final int ADC_RM8_IMM8;

    /**
     * ADC_RM16_IMM16: Add the 16-bit immediate value and carry to the value at the specified 16-bit memory location.
     */
    public static final int ADC_RM16_IMM16;

    /**
     * ADC_RM32_IMM32: Add the 32-bit immediate value and carry to the value at the specified 32-bit memory location.
     */
    public static final int ADC_RM32_IMM32;

    /**
     * ADC_RM64_IMM32: Add the 32-bit immediate value and carry to the value at the specified 64-bit memory location.
     */
    public static final int ADC_RM64_IMM32;

    /**
     * ADC_RM8_IMM8_82: Add the 8-bit immediate value and carry to the value at the specified 8-bit memory location.
     */
    public static final int ADC_RM8_IMM8_82;

    /**
     * ADC_RM16_IMM8: Add with carry a 16-bit register/memory and an 8-bit immediate value.
     */
    public static final int ADC_RM16_IMM8;

    /**
     * ADC_RM32_IMM8: Add with carry a 32-bit register/memory and an 8-bit immediate value.
     */
    public static final int ADC_RM32_IMM8;

    /**
     * ADC_RM64_IMM8: Add with carry a 64-bit register/memory and an 8-bit immediate value.
     */
    public static final int ADC_RM64_IMM8;

    /**
     * SBB_RM8_R8: Subtract with borrow an 8-bit register from an 8-bit memory operand.
     */
    public static final int SBB_RM8_R8;

    /**
     * SBB_RM16_R16: Subtract with borrow a 16-bit register from a 16-bit memory operand.
     */
    public static final int SBB_RM16_R16;

    /**
     * SBB_RM32_R32: Subtract with borrow a 32-bit register from a 32-bit memory operand.
     */
    public static final int SBB_RM32_R32;

    /**
     * SBB_RM64_R64: Subtract with borrow a 64-bit register from a 64-bit memory operand.
     */
    public static final int SBB_RM64_R64;

    /**
     * SBB_R8_RM8: Subtract with borrow an 8-bit register from an 8-bit memory operand.
     */
    public static final int SBB_R8_RM8;

    /**
     * SBB_R16_RM16: Subtract with borrow a 16-bit register from a 16-bit memory operand.
     */
    public static final int SBB_R16_RM16;

    /**
     * SBB_R32_RM32: Subtract with borrow a 32-bit register from a 32-bit memory operand.
     */
    public static final int SBB_R32_RM32;

    /**
     * SBB_R64_RM64: Subtract with borrow a 64-bit register from a 64-bit memory operand.
     */
    public static final int SBB_R64_RM64;

    /**
     * SBB_AL_IMM8: Subtract with borrow an 8-bit immediate value from the AL register.
     */
    public static final int SBB_AL_IMM8;

    /**
     * SBB_AX_IMM16: Subtract with borrow a 16-bit immediate value from the AX register.
     */
    public static final int SBB_AX_IMM16;

    /**
     * SBB_EAX_IMM32: Subtract with borrow a 32-bit immediate value from the EAX register.
     */
    public static final int SBB_EAX_IMM32;

    /**
     * SBB_RAX_IMM32: Subtract with borrow a 32-bit immediate value from the RAX register.
     */
    public static final int SBB_RAX_IMM32;

    /**
     * SBB_RM8_IMM8: Subtract the immediate value and borrow from the value at the specified 8-bit memory location.
     */
    public static final int SBB_RM8_IMM8;

    /**
     * SBB_RM16_IMM16: Subtract the 16-bit immediate value and borrow from the value at the specified 16-bit memory location.
     */
    public static final int SBB_RM16_IMM16;

    /**
     * SBB_RM32_IMM32: Subtract the 32-bit immediate value and borrow from the value at the specified 32-bit memory location.
     */
    public static final int SBB_RM32_IMM32;

    /**
     * SBB_RM64_IMM32: Subtract the 32-bit immediate value and borrow from the value at the specified 64-bit memory location.
     */
    public static final int SBB_RM64_IMM32;

    /**
     * SBB_RM8_IMM8_82: Subtract the 8-bit immediate value and borrow from the value at the specified 8-bit memory location.
     */
    public static final int SBB_RM8_IMM8_82;

    /**
     * SBB_RM16_IMM8: Subtract with borrow a 16-bit register/memory and an 8-bit immediate value.
     */
    public static final int SBB_RM16_IMM8;

    /**
     * SBB_RM32_IMM8: Subtract with borrow a 32-bit register/memory and an 8-bit immediate value.
     */
    public static final int SBB_RM32_IMM8;

    /**
     * SBB_RM64_IMM8: Subtract with borrow a 64-bit register/memory and an 8-bit immediate value.
     */
    public static final int SBB_RM64_IMM8;

    /**
     * AND_RM8_R8: Perform a bitwise AND between an 8-bit register and an 8-bit memory operand.
     */
    public static final int AND_RM8_R8;

    /**
     * AND_RM16_R16: Perform a bitwise AND between a 16-bit register and a 16-bit memory operand.
     */
    public static final int AND_RM16_R16;

    /**
     * AND_RM32_R32: Perform a bitwise AND between a 32-bit register and a 32-bit memory operand.
     */
    public static final int AND_RM32_R32;

    /**
     * AND_RM64_R64: Perform a bitwise AND between a 64-bit register and a 64-bit memory operand.
     */
    public static final int AND_RM64_R64;

    /**
     * AND_R8_RM8: Perform a bitwise AND between an 8-bit register and an 8-bit memory operand.
     */
    public static final int AND_R8_RM8;

    /**
     * AND_R16_RM16: Perform a bitwise AND between a 16-bit register and a 16-bit memory operand.
     */
    public static final int AND_R16_RM16;

    /**
     * AND_R32_RM32: Perform a bitwise AND between a 32-bit register and a 32-bit memory operand.
     */
    public static final int AND_R32_RM32;

    /**
     * AND_R64_RM64: Perform a bitwise AND between a 64-bit register and a 64-bit memory operand.
     */
    public static final int AND_R64_RM64;

    /**
     * AND_AL_IMM8: Perform a bitwise AND between the AL register and an 8-bit immediate value.
     */
    public static final int AND_AL_IMM8;

    /**
     * AND_AX_IMM16: Perform a bitwise AND between the AX register and a 16-bit immediate value.
     */
    public static final int AND_AX_IMM16;

    /**
     * AND_EAX_IMM32: Perform a bitwise AND between the EAX register and a 32-bit immediate value.
     */
    public static final int AND_EAX_IMM32;

    /**
     * AND_RAX_IMM32: Perform a bitwise AND between the RAX register and a 32-bit immediate value.
     */
    public static final int AND_RAX_IMM32;

    /**
     * AND_RM8_IMM8: Perform a bitwise AND between the immediate value and the value at the specified 8-bit memory location.
     */
    public static final int AND_RM8_IMM8;

    /**
     * AND_RM16_IMM16: Perform a bitwise AND between the 16-bit immediate value and the value at the specified 16-bit memory location.
     */
    public static final int AND_RM16_IMM16;

    /**
     * AND_RM32_IMM32: Perform a bitwise AND between the 32-bit immediate value and the value at the specified 32-bit memory location.
     */
    public static final int AND_RM32_IMM32;

    /**
     * AND_RM64_IMM32: Perform a bitwise AND between the 32-bit immediate value and the value at the specified 64-bit memory location.
     */
    public static final int AND_RM64_IMM32;

    /**
     * AND_RM8_IMM8_82: Perform a bitwise AND between the 8-bit immediate value and the value at the specified 8-bit memory location.
     */
    public static final int AND_RM8_IMM8_82;

    /**
     * AND_RM16_IMM8: Perform a bitwise AND operation between a 16-bit register/memory and an 8-bit immediate value.
     */
    public static final int AND_RM16_IMM8;

    /**
     * AND_RM32_IMM8: Perform a bitwise AND operation between a 32-bit register/memory and an 8-bit immediate value.
     */
    public static final int AND_RM32_IMM8;

    /**
     * AND_RM64_IMM8: Perform a bitwise AND operation between a 64-bit register/memory and an 8-bit immediate value.
     */
    public static final int AND_RM64_IMM8;

    /**
     * SUB_RM8_R8: Subtract an 8-bit register from an 8-bit memory operand.
     */
    public static final int SUB_RM8_R8;

    /**
     * SUB_RM16_R16: Subtract a 16-bit register from a 16-bit memory operand.
     */
    public static final int SUB_RM16_R16;

    /**
     * SUB_RM32_R32: Subtract a 32-bit register from a 32-bit memory operand.
     */
    public static final int SUB_RM32_R32;

    /**
     * SUB_RM64_R64: Subtract a 64-bit register from a 64-bit memory operand.
     */
    public static final int SUB_RM64_R64;

    /**
     * SUB_R8_RM8: Subtract an 8-bit register from an 8-bit memory operand.
     */
    public static final int SUB_R8_RM8;

    /**
     * SUB_R16_RM16: Subtract a 16-bit register from a 16-bit memory operand.
     */
    public static final int SUB_R16_RM16;

    /**
     * SUB_R32_RM32: Subtract a 32-bit register from a 32-bit memory operand.
     */
    public static final int SUB_R32_RM32;

    /**
     * SUB_R64_RM64: Subtract a 64-bit register from a 64-bit memory operand.
     */
    public static final int SUB_R64_RM64;

    /**
     * SUB_AL_IMM8: Subtract an 8-bit immediate value from the AL register.
     */
    public static final int SUB_AL_IMM8;

    /**
     * SUB_AX_IMM16: Subtract a 16-bit immediate value from the AX register.
     */
    public static final int SUB_AX_IMM16;

    /**
     * SUB_EAX_IMM32: Subtract a 32-bit immediate value from the EAX register.
     */
    public static final int SUB_EAX_IMM32;

    /**
     * SUB_RAX_IMM32: Subtract a 32-bit immediate value from the RAX register.
     */
    public static final int SUB_RAX_IMM32;

    /**
     * SUB_RM8_IMM8: Subtract the immediate value from the value at the specified 8-bit memory location.
     */
    public static final int SUB_RM8_IMM8;

    /**
     * SUB_RM16_IMM16: Subtract the 16-bit immediate value from the value at the specified 16-bit memory location.
     */
    public static final int SUB_RM16_IMM16;

    /**
     * SUB_RM32_IMM32: Subtract the 32-bit immediate value from the value at the specified 32-bit memory location.
     */
    public static final int SUB_RM32_IMM32;

    /**
     * SUB_RM64_IMM32: Subtract the 32-bit immediate value from the value at the specified 64-bit memory location.
     */
    public static final int SUB_RM64_IMM32;

    /**
     * SUB_RM8_IMM8_82: Subtract the 8-bit immediate value from the value at the specified 8-bit memory location.
     */
    public static final int SUB_RM8_IMM8_82;

    /**
     * SUB_RM16_IMM8: Subtract a 16-bit immediate value from a 16-bit register/memory.
     */
    public static final int SUB_RM16_IMM8;

    /**
     * SUB_RM32_IMM8: Subtract a 32-bit immediate value from a 32-bit register/memory.
     */
    public static final int SUB_RM32_IMM8;

    /**
     * SUB_RM64_IMM8: Subtract a 64-bit immediate value from a 64-bit register/memory.
     */
    public static final int SUB_RM64_IMM8;

    /**
     * XOR_RM8_R8: Perform a bitwise XOR between an 8-bit register and an 8-bit memory operand.
     */
    public static final int XOR_RM8_R8;

    /**
     * XOR_RM16_R16: Perform a bitwise XOR between a 16-bit register and a 16-bit memory operand.
     */
    public static final int XOR_RM16_R16;

    /**
     * XOR_RM32_R32: Perform a bitwise XOR between a 32-bit register and a 32-bit memory operand.
     */
    public static final int XOR_RM32_R32;

    /**
     * XOR_RM64_R64: Perform a bitwise XOR between a 64-bit register and a 64-bit memory operand.
     */
    public static final int XOR_RM64_R64;

    /**
     * XOR_R8_RM8: Perform a bitwise XOR between an 8-bit register and an 8-bit memory operand.
     */
    public static final int XOR_R8_RM8;

    /**
     * XOR_R16_RM16: Perform a bitwise XOR between a 16-bit register and a 16-bit memory operand.
     */
    public static final int XOR_R16_RM16;

    /**
     * XOR_R32_RM32: Perform a bitwise XOR between a 32-bit register and a 32-bit memory operand.
     */
    public static final int XOR_R32_RM32;

    /**
     * XOR_R64_RM64: Perform a bitwise XOR between a 64-bit register and a 64-bit memory operand.
     */
    public static final int XOR_R64_RM64;

    /**
     * XOR_AL_IMM8: Perform a bitwise XOR between the AL register and an 8-bit immediate value.
     */
    public static final int XOR_AL_IMM8;

    /**
     * XOR_AX_IMM16: Perform a bitwise XOR between the AX register and a 16-bit immediate value.
     */
    public static final int XOR_AX_IMM16;

    /**
     * XOR_EAX_IMM32: Perform a bitwise XOR between the EAX register and a 32-bit immediate value.
     */
    public static final int XOR_EAX_IMM32;

    /**
     * XOR_RAX_IMM32: Perform a bitwise XOR between the RAX register and a 32-bit immediate value.
     */
    public static final int XOR_RAX_IMM32;

    /**
     * XOR_RM8_IMM8: Perform a bitwise XOR between the immediate value and the value at the specified 8-bit memory location.
     */
    public static final int XOR_RM8_IMM8;

    /**
     * XOR_RM16_IMM16: Perform a bitwise XOR between the 16-bit immediate value and the value at the specified 16-bit memory location.
     */
    public static final int XOR_RM16_IMM16;

    /**
     * XOR_RM32_IMM32: Perform a bitwise XOR between the 32-bit immediate value and the value at the specified 32-bit memory location.
     */
    public static final int XOR_RM32_IMM32;

    /**
     * XOR_RM64_IMM32: Perform a bitwise XOR between the 32-bit immediate value and the value at the specified 64-bit memory location.
     */
    public static final int XOR_RM64_IMM32;

    /**
     * XOR_RM8_IMM8_82: Perform a bitwise XOR between the 8-bit immediate value and the value at the specified 8-bit memory location.
     */
    public static final int XOR_RM8_IMM8_82;

    /**
     * XOR_RM16_IMM8: Perform a bitwise XOR operation between a 16-bit register/memory and an 8-bit immediate value.
     */
    public static final int XOR_RM16_IMM8;

    /**
     * XOR_RM32_IMM8: Perform a bitwise XOR operation between a 32-bit register/memory and an 8-bit immediate value.
     */
    public static final int XOR_RM32_IMM8;

    /**
     * XOR_RM64_IMM8: Perform a bitwise XOR operation between a 64-bit register/memory and an 8-bit immediate value.
     */
    public static final int XOR_RM64_IMM8;

    /**
     * CMP_RM8_R8: Compare a 8-bit memory operand with an 8-bit register.
     */
    public static final int CMP_RM8_R8;

    /**
     * CMP_RM16_R16: Compare a 16-bit memory operand with a 16-bit register.
     */
    public static final int CMP_RM16_R16;

    /**
     * CMP_RM32_R32: Compare a 32-bit memory operand with a 32-bit register.
     */
    public static final int CMP_RM32_R32;

    /**
     * CMP_RM64_R64: Compare a 64-bit memory operand with a 64-bit register.
     */
    public static final int CMP_RM64_R64;

    /**
     * CMP_R8_RM8: Compare a 8-bit register with an 8-bit memory operand.
     */
    public static final int CMP_R8_RM8;

    /**
     * CMP_R16_RM16: Compare a 16-bit register with a 16-bit memory operand.
     */
    public static final int CMP_R16_RM16;

    /**
     * CMP_R32_RM32: Compare a 32-bit register with a 32-bit memory operand.
     */
    public static final int CMP_R32_RM32;

    /**
     * CMP_R64_RM64: Compare a 64-bit register with a 64-bit memory operand.
     */
    public static final int CMP_R64_RM64;

    /**
     * CMP_AL_IMM8: Compare the AL register with an 8-bit immediate value.
     */
    public static final int CMP_AL_IMM8;

    /**
     * CMP_AX_IMM16: Compare the AX register with a 16-bit immediate value.
     */
    public static final int CMP_AX_IMM16;

    /**
     * CMP_EAX_IMM32: Compare the EAX register with a 32-bit immediate value.
     */
    public static final int CMP_EAX_IMM32;

    /**
     * CMP_RAX_IMM32: Compare the RAX register with a 32-bit immediate value.
     */
    public static final int CMP_RAX_IMM32;

    /**
     * CMP_RM8_IMM8: Compare the immediate value with the value at the specified 8-bit memory location.
     */
    public static final int CMP_RM8_IMM8;

    /**
     * CMP_RM16_IMM16: Compare the 16-bit immediate value with the value at the specified 16-bit memory location.
     */
    public static final int CMP_RM16_IMM16;

    /**
     * CMP_RM32_IMM32: Compare the 32-bit immediate value with the value at the specified 32-bit memory location.
     */
    public static final int CMP_RM32_IMM32;

    /**
     * CMP_RM64_IMM32: Compare the 32-bit immediate value with the value at the specified 64-bit memory location.
     */
    public static final int CMP_RM64_IMM32;

    /**
     * CMP_RM8_IMM8_82: Compare the 8-bit immediate value with the value at the specified 8-bit memory location.
     */
    public static final int CMP_RM8_IMM8_82;

    /**
     * CMP_RM16_IMM8: Compare a 16-bit register/memory with an 8-bit immediate value.
     */
    public static final int CMP_RM16_IMM8;

    /**
     * CMP_RM32_IMM8: Compare a 32-bit register/memory with an 8-bit immediate value.
     */
    public static final int CMP_RM32_IMM8;

    /**
     * CMP_RM64_IMM8: Compare a 64-bit register/memory with an 8-bit immediate value.
     */
    public static final int CMP_RM64_IMM8;

    /**
     * TEST_RM8_R8: Perform a bitwise AND operation between a 8-bit register/memory and a 8-bit register.
     */
    public static final int TEST_RM8_R8;

    /**
     * TEST_RM16_R16: Perform a bitwise AND operation between a 16-bit register/memory and a 16-bit register.
     */
    public static final int TEST_RM16_R16;

    /**
     * TEST_RM32_R32: Perform a bitwise AND operation between a 32-bit register/memory and a 32-bit register.
     */
    public static final int TEST_RM32_R32;

    /**
     * TEST_RM64_R64: Perform a bitwise AND operation between a 64-bit register/memory and a 64-bit register.
     */
    public static final int TEST_RM64_R64;

    /**
     * TEST_AL_IMM8: Test the AL register with an immediate 8-bit value.
     */
    public static final int TEST_AL_IMM8;

    /**
     * TEST_AX_IMM16: Test the AX register with an immediate 16-bit value.
     */
    public static final int TEST_AX_IMM16;

    /**
     * TEST_EAX_IMM32: Test the EAX register with an immediate 32-bit value.
     */
    public static final int TEST_EAX_IMM32;

    /**
     * TEST_RAX_IMM32: Test the RAX register with an immediate 32-bit value.
     */
    public static final int TEST_RAX_IMM32;

    /**
     * MOV_RM8_R8: Move the value from a 8-bit register to a 8-bit register/memory.
     */
    public static final int MOV_RM8_R8;

    /**
     * MOV_RM16_R16: Move the value from a 16-bit register to a 16-bit register/memory.
     */
    public static final int MOV_RM16_R16;

    /**
     * MOV_RM32_R32: Move the value from a 32-bit register to a 32-bit register/memory.
     */
    public static final int MOV_RM32_R32;

    /**
     * MOV_RM64_R64: Move the value from a 64-bit register to a 64-bit register/memory.
     */
    public static final int MOV_RM64_R64;

    /**
     * MOV_R8_RM8: Move the value from a 8-bit register to a 8-bit register/memory.
     */
    public static final int MOV_R8_RM8;

    /**
     * MOV_R16_RM16: Move the value from a 16-bit register to a 16-bit register/memory.
     */
    public static final int MOV_R16_RM16;

    /**
     * MOV_R32_RM32: Move the value from a 32-bit register to a 32-bit register/memory.
     */
    public static final int MOV_R32_RM32;

    /**
     * MOV_R64_RM64: Move the value from a 64-bit register to a 64-bit register/memory.
     */
    public static final int MOV_R64_RM64;

    /**
     * MOV_RM8_IMM8: Move an 8-bit immediate value into a register/memory operand.
     */
    public static final int MOV_RM8_IMM8;

    /**
     * MOV_RM16_IMM16: Move a 16-bit immediate value into a register/memory operand.
     */
    public static final int MOV_RM16_IMM16;

    /**
     * MOV_RM32_IMM32: Move a 32-bit immediate value into a register/memory operand.
     */
    public static final int MOV_RM32_IMM32;

    /**
     * MOV_RM64_IMM32: Move a 32-bit immediate value into a 64-bit register/memory operand.
     */
    public static final int MOV_RM64_IMM32;

    /**
     * MOV_R8_IMM8: Move an immediate 8-bit value into the R8 register.
     */
    public static final int MOV_R8_IMM8;

    /**
     * MOV_R16_IMM16: Move an immediate 16-bit value into the R16 register.
     */
    public static final int MOV_R16_IMM16;

    /**
     * MOV_R32_IMM32: Move an immediate 32-bit value into the R32 register.
     */
    public static final int MOV_R32_IMM32;

    /**
     * MOV_R64_IMM64: Move an immediate 64-bit value into the R64 register.
     */
    public static final int MOV_R64_IMM64;

    /**
     * MOV_AL_MOFFS8: Move the 8-bit value at the specified memory offset into the AL register.
     */
    public static final int MOV_AL_MOFFS8;

    /**
     * MOV_AX_MOFFS16: Move the 16-bit value at the specified memory offset into the AX register.
     */
    public static final int MOV_AX_MOFFS16;

    /**
     * MOV_EAX_MOFFS32: Move the 32-bit value at the specified memory offset into the EAX register.
     */
    public static final int MOV_EAX_MOFFS32;

    /**
     * MOV_RAX_MOFFS64: Move the 64-bit value at the specified memory offset into the RAX register.
     */
    public static final int MOV_RAX_MOFFS64;

    /**
     * MOV_MOFFS8_AL: Move the contents of the AL register to the 8-bit memory offset.
     */
    public static final int MOV_MOFFS8_AL;

    /**
     * MOV_MOFFS16_AX: Move the contents of the AX register to the 16-bit memory offset.
     */
    public static final int MOV_MOFFS16_AX;

    /**
     * MOV_MOFFS32_EAX: Move the contents of the EAX register to the 32-bit memory offset.
     */
    public static final int MOV_MOFFS32_EAX;

    /**
     * MOV_MOFFS64_RAX: Move the contents of the RAX register to the 64-bit memory offset.
     */
    public static final int MOV_MOFFS64_RAX;

    /**
     * MOV_RM16_SREG: Move the value from a 16-bit register/memory to a segment register.
     */
    public static final int MOV_RM16_SREG;

    /**
     * MOV_R32M16_SREG: Move the value from a 32-bit or 16-bit register/memory to a segment register.
     */
    public static final int MOV_R32M16_SREG;

    /**
     * MOV_R64M16_SREG: Move the value from a 64-bit or 16-bit register/memory to a segment register.
     */
    public static final int MOV_R64M16_SREG;

    /**
     * MOV_SREG_RM16: Move the value from a segment register to a 16-bit register/memory.
     */
    public static final int MOV_SREG_RM16;

    /**
     * MOV_SREG_R32M16: Move the value from a segment register to a 32-bit or 16-bit register/memory.
     */
    public static final int MOV_SREG_R32M16;

    /**
     * MOV_SREG_R64M16: Move the value from a segment register to a 64-bit or 16-bit register/memory.
     */
    public static final int MOV_SREG_R64M16;

    /**
     * INC_R16: Increment a 16-bit register by 1.
     */
    public static final int INC_R16;

    /**
     * INC_R32: Increment a 32-bit register by 1.
     */
    public static final int INC_R32;

    /**
     * DEC_R16: Decrement a 16-bit register by 1.
     */
    public static final int DEC_R16;

    /**
     * DEC_R32: Decrement a 32-bit register by 1.
     */
    public static final int DEC_R32;

    /**
     * PUSH_R16: Push a 16-bit register onto the stack.
     */
    public static final int PUSH_R16;

    /**
     * PUSH_R32: Push a 32-bit register onto the stack.
     */
    public static final int PUSH_R32;

    /**
     * PUSH_R64: Push a 64-bit register onto the stack.
     */
    public static final int PUSH_R64;

    /**
     * POP_R16: Pop a 16-bit value from the stack into a 16-bit register.
     */
    public static final int POP_R16;

    /**
     * POP_R32: Pop a 32-bit value from the stack into a 32-bit register.
     */
    public static final int POP_R32;

    /**
     * POP_R64: Pop a 64-bit value from the stack into a 64-bit register.
     */
    public static final int POP_R64;

    /**
     * PUSHW_ES: Push the ES segment register (word-sized).
     */
    public static final int PUSHW_ES;

    /**
     * PUSHD_ES: Push the ES segment register (double word-sized).
     */
    public static final int PUSHD_ES;

    /**
     * POPW_ES: Pop the ES segment register (word-sized).
     */
    public static final int POPW_ES;

    /**
     * POPD_ES: Pop the ES segment register (double word-sized).
     */
    public static final int POPD_ES;

    /**
     * PUSHW_CS: Push the value of the CS (Code Segment) register onto the stack (16-bit operation).
     */
    public static final int PUSHW_CS;

    /**
     * PUSHD_CS: Push the value of the CS (Code Segment) register onto the stack (32-bit operation).
     */
    public static final int PUSHD_CS;

    /**
     * POPW_CS: Pop the value from the stack into the CS (Code Segment) register (16-bit operation).
     */
    public static final int POPW_CS;

    /**
     * PUSHW_SS: Push the value of the SS (Stack Segment) register onto the stack (16-bit operation).
     */
    public static final int PUSHW_SS;

    /**
     * PUSHD_SS: Push the value of the SS (Stack Segment) register onto the stack (32-bit operation).
     */
    public static final int PUSHD_SS;

    /**
     * POPW_SS: Pop the SS segment register (word-sized).
     */
    public static final int POPW_SS;

    /**
     * POPD_SS: Pop the SS segment register (double word-sized).
     */
    public static final int POPD_SS;

    /**
     * PUSHW_DS: Push the DS segment register (word-sized).
     */
    public static final int PUSHW_DS;

    /**
     * PUSHD_DS: Push the DS segment register (double word-sized).
     */
    public static final int PUSHD_DS;

    /**
     * POPW_DS: Pop the DS segment register (word-sized).
     */
    public static final int POPW_DS;

    /**
     * POPD_DS: Pop the DS segment register (double word-sized).
     */
    public static final int POPD_DS;

    /**
     * PUSH_IMM16: Push a 16-bit immediate value onto the stack.
     */
    public static final int PUSH_IMM16;

    /**
     * PUSHD_IMM32: Push a 32-bit immediate value onto the stack.
     */
    public static final int PUSHD_IMM32;

    /**
     * PUSHQ_IMM32: Push a 32-bit immediate value onto the stack (used for 64-bit environments).
     */
    public static final int PUSHQ_IMM32;

    /**
     * PUSHW_IMM8: Push an 8-bit immediate value onto the stack (used for 16-bit environments).
     */
    public static final int PUSHW_IMM8;

    /**
     * PUSHD_IMM8: Push an 8-bit immediate value onto the stack (used for 32-bit environments).
     */
    public static final int PUSHD_IMM8;

    /**
     * PUSHQ_IMM8: Push an 8-bit immediate value onto the stack (used for 64-bit environments).
     */
    public static final int PUSHQ_IMM8;

    /**
     * POP_RM16: Pop a 16-bit value from the stack into a 16-bit register/memory.
     */
    public static final int POP_RM16;

    /**
     * POP_RM32: Pop a 32-bit value from the stack into a 32-bit register/memory.
     */
    public static final int POP_RM32;

    /**
     * POP_RM64: Pop a 64-bit value from the stack into a 64-bit register/memory.
     */
    public static final int POP_RM64;

    /**
     * PUSHFW: Push the FLAGS register onto the stack (16-bit version).
     */
    public static final int PUSHFW;

    /**
     * PUSHFD: Push the EFLAGS register onto the stack (32-bit version).
     */
    public static final int PUSHFD;

    /**
     * PUSHFQ: Push the RFLAGS register onto the stack (64-bit version).
     */
    public static final int PUSHFQ;

    /**
     * POPFW: Pop the FLAGS register from the stack (16-bit version).
     */
    public static final int POPFW;

    /**
     * POPFD: Pop the EFLAGS register from the stack (32-bit version).
     */
    public static final int POPFD;

    /**
     * POPFQ: Pop the RFLAGS register from the stack (64-bit version).
     */
    public static final int POPFQ;

    /**
     * PUSHAW: Push all general-purpose 16-bit registers onto the stack.
     */
    public static final int PUSHAW;

    /**
     * PUSHAD: Push all general-purpose 32-bit registers onto the stack.
     */
    public static final int PUSHAD;

    /**
     * POPAW: Pop all general-purpose 16-bit registers from the stack.
     */
    public static final int POPAW;

    /**
     * POPAD: Pop all general-purpose 32-bit registers from the stack.
     */
    public static final int POPAD;

    /**
     * LEA_R16_M: Load the effective address of a memory operand into a 16-bit register.
     */
    public static final int LEA_R16_M;

    /**
     * LEA_R32_M: Load the effective address of a memory operand into a 32-bit register.
     */
    public static final int LEA_R32_M;

    /**
     * LEA_R64_M: Load the effective address of a memory operand into a 64-bit register.
     */
    public static final int LEA_R64_M;

    /**
     * XCHG_RM8_R8: Exchange the values of two 8-bit registers/memory.
     */
    public static final int XCHG_RM8_R8;

    /**
     * XCHG_RM16_R16: Exchange the values of two 16-bit registers/memory.
     */
    public static final int XCHG_RM16_R16;

    /**
     * XCHG_RM32_R32: Exchange the values of two 32-bit registers/memory.
     */
    public static final int XCHG_RM32_R32;

    /**
     * XCHG_RM64_R64: Exchange the values of two 64-bit registers/memory.
     */
    public static final int XCHG_RM64_R64;

    /**
     * XCHG_R16_AX: Exchange the contents of a 16-bit register with the AX register.
     */
    public static final int XCHG_R16_AX;

    /**
     * XCHG_R32_EAX: Exchange the contents of a 32-bit register with the EAX register.
     */
    public static final int XCHG_R32_EAX;

    /**
     * XCHG_R64_RAX: Exchange the contents of a 64-bit register with the RAX register.
     */
    public static final int XCHG_R64_RAX;

    /**
     * ROL_RM8_IMM8: Rotate left a byte in memory or register by an immediate 8-bit value.
     */
    public static final int ROL_RM8_IMM8;

    /**
     * ROR_RM8_IMM8: Rotate right a byte in memory or register by an immediate 8-bit value.
     */
    public static final int ROR_RM8_IMM8;

    /**
     * RCL_RM8_IMM8: Rotate left through carry a byte in memory or register by an immediate 8-bit value.
     */
    public static final int RCL_RM8_IMM8;

    /**
     * RCR_RM8_IMM8: Rotate right through carry a byte in memory or register by an immediate 8-bit value.
     */
    public static final int RCR_RM8_IMM8;

    /**
     * SHL_RM8_IMM8: Shift left a byte in memory or register by an immediate 8-bit value.
     */
    public static final int SHL_RM8_IMM8;

    /**
     * SHR_RM8_IMM8: Shift right a byte in memory or register by an immediate 8-bit value.
     */
    public static final int SHR_RM8_IMM8;

    /**
     * SAL_RM8_IMM8: Shift arithmetic left a byte in memory or register by an immediate 8-bit value.
     */
    public static final int SAL_RM8_IMM8;

    /**
     * SAR_RM8_IMM8: Shift arithmetic right a byte in memory or register by an immediate 8-bit value.
     */
    public static final int SAR_RM8_IMM8;

    /**
     * ROL_RM16_IMM8: Rotate left a word in memory or register by an immediate 8-bit value.
     */
    public static final int ROL_RM16_IMM8;

    /**
     * ROL_RM32_IMM8: Rotate left a double word in memory or register by an immediate 8-bit value.
     */
    public static final int ROL_RM32_IMM8;

    /**
     * ROL_RM64_IMM8: Rotate left a quad word in memory or register by an immediate 8-bit value.
     */
    public static final int ROL_RM64_IMM8;

    /**
     * ROR_RM16_IMM8: Rotate right a word in memory or register by an immediate 8-bit value.
     */
    public static final int ROR_RM16_IMM8;

    /**
     * ROR_RM32_IMM8: Rotate right a double word in memory or register by an immediate 8-bit value.
     */
    public static final int ROR_RM32_IMM8;

    /**
     * ROR_RM64_IMM8: Rotate right a quad word in memory or register by an immediate 8-bit value.
     */
    public static final int ROR_RM64_IMM8;

    /**
     * RCL_RM16_IMM8: Rotate left through carry a word in memory or register by an immediate 8-bit value.
     */
    public static final int RCL_RM16_IMM8;

    /**
     * RCL_RM32_IMM8: Rotate left through carry a double word in memory or register by an immediate 8-bit value.
     */
    public static final int RCL_RM32_IMM8;

    /**
     * RCL_RM64_IMM8: Rotate left through carry a quad word in memory or register by an immediate 8-bit value.
     */
    public static final int RCL_RM64_IMM8;

    /**
     * RCR_RM16_IMM8: Rotate right through carry a word in memory or register by an immediate 8-bit value.
     */
    public static final int RCR_RM16_IMM8;

    /**
     * RCR_RM32_IMM8: Rotate right through carry a double word in memory or register by an immediate 8-bit value.
     */
    public static final int RCR_RM32_IMM8;

    /**
     * RCR_RM64_IMM8: Rotate right through carry a quad word in memory or register by an immediate 8-bit value.
     */
    public static final int RCR_RM64_IMM8;

    /**
     * SHL_RM16_IMM8: Shift left a word in memory or register by an immediate 8-bit value.
     */
    public static final int SHL_RM16_IMM8;

    /**
     * SHL_RM32_IMM8: Shift left a double word in memory or register by an immediate 8-bit value.
     */
    public static final int SHL_RM32_IMM8;

    /**
     * SHL_RM64_IMM8: Shift left a quad word in memory or register by an immediate 8-bit value.
     */
    public static final int SHL_RM64_IMM8;

    /**
     * SHR_RM16_IMM8: Shift right a word in memory or register by an immediate 8-bit value.
     */
    public static final int SHR_RM16_IMM8;

    /**
     * SHR_RM32_IMM8: Shift right a double word in memory or register by an immediate 8-bit value.
     */
    public static final int SHR_RM32_IMM8;

    /**
     * SHR_RM64_IMM8: Shift right a quad word in memory or register by an immediate 8-bit value.
     */
    public static final int SHR_RM64_IMM8;

    /**
     * SAL_RM16_IMM8: Shift arithmetic left a word in memory or register by an immediate 8-bit value.
     */
    public static final int SAL_RM16_IMM8;

    /**
     * SAL_RM32_IMM8: Shift arithmetic left a double word in memory or register by an immediate 8-bit value.
     */
    public static final int SAL_RM32_IMM8;

    /**
     * SAL_RM64_IMM8: Shift arithmetic left a quad word in memory or register by an immediate 8-bit value.
     */
    public static final int SAL_RM64_IMM8;

    /**
     * SAR_RM16_IMM8: Shift arithmetic right a word in memory or register by an immediate 8-bit value.
     */
    public static final int SAR_RM16_IMM8;

    /**
     * SAR_RM32_IMM8: Shift arithmetic right a double word in memory or register by an immediate 8-bit value.
     */
    public static final int SAR_RM32_IMM8;

    /**
     * SAR_RM64_IMM8: Shift arithmetic right a quad word in memory or register by an immediate 8-bit value.
     */
    public static final int SAR_RM64_IMM8;

    /**
     * ROL_RM8_1: Rotate an 8-bit operand left by 1 bit.
     */
    public static final int ROL_RM8_1;

    /**
     * ROR_RM8_1: Rotate an 8-bit operand right by 1 bit.
     */
    public static final int ROR_RM8_1;

    /**
     * RCL_RM8_1: Rotate an 8-bit operand left through the carry flag by 1 bit.
     */
    public static final int RCL_RM8_1;

    /**
     * RCR_RM8_1: Rotate an 8-bit operand right through the carry flag by 1 bit.
     */
    public static final int RCR_RM8_1;

    /**
     * SHL_RM8_1: Shift an 8-bit operand left by 1 bit.
     */
    public static final int SHL_RM8_1;

    /**
     * SHR_RM8_1: Shift an 8-bit operand right by 1 bit.
     */
    public static final int SHR_RM8_1;

    /**
     * SAL_RM8_1: Shift an 8-bit operand left (same as SHL) by 1 bit.
     */
    public static final int SAL_RM8_1;

    /**
     * SAR_RM8_1: Shift an 8-bit operand right through the carry flag by 1 bit.
     */
    public static final int SAR_RM8_1;

    /**
     * ROL_RM16_1: Rotate a 16-bit operand left by 1 bit.
     */
    public static final int ROL_RM16_1;

    /**
     * ROL_RM32_1: Rotate a 32-bit operand left by 1 bit.
     */
    public static final int ROL_RM32_1;

    /**
     * ROL_RM64_1: Rotate a 64-bit operand left by 1 bit.
     */
    public static final int ROL_RM64_1;

    /**
     * ROR_RM16_1: Rotate a 16-bit operand right by 1 bit.
     */
    public static final int ROR_RM16_1;

    /**
     * ROR_RM32_1: Rotate a 32-bit operand right by 1 bit.
     */
    public static final int ROR_RM32_1;

    /**
     * ROR_RM64_1: Rotate a 64-bit operand right by 1 bit.
     */
    public static final int ROR_RM64_1;

    /**
     * RCL_RM16_1: Rotate a 16-bit operand left through the carry flag by 1 bit.
     */
    public static final int RCL_RM16_1;

    /**
     * RCL_RM32_1: Rotate a 32-bit operand left through the carry flag by 1 bit.
     */
    public static final int RCL_RM32_1;

    /**
     * RCL_RM64_1: Rotate a 64-bit operand left through the carry flag by 1 bit.
     */
    public static final int RCL_RM64_1;

    /**
     * RCR_RM16_1: Rotate a 16-bit operand right through the carry flag by 1 bit.
     */
    public static final int RCR_RM16_1;

    /**
     * RCR_RM32_1: Rotate a 32-bit operand right through the carry flag by 1 bit.
     */
    public static final int RCR_RM32_1;

    /**
     * RCR_RM64_1: Rotate a 64-bit operand right through the carry flag by 1 bit.
     */
    public static final int RCR_RM64_1;

    /**
     * SHL_RM16_1: Shift a 16-bit operand left by 1 bit.
     */
    public static final int SHL_RM16_1;

    /**
     * SHL_RM32_1: Shift a 32-bit operand left by 1 bit.
     */
    public static final int SHL_RM32_1;

    /**
     * SHL_RM64_1: Shift a 64-bit operand left by 1 bit.
     */
    public static final int SHL_RM64_1;

    /**
     * SHR_RM16_1: Shift a 16-bit operand right by 1 bit.
     */
    public static final int SHR_RM16_1;

    /**
     * SHR_RM32_1: Shift a 32-bit operand right by 1 bit.
     */
    public static final int SHR_RM32_1;

    /**
     * SHR_RM64_1: Perform a logical shift right by 1 on the 64-bit operand.
     */
    public static final int SHR_RM64_1;

    /**
     * SAL_RM16_1: Perform an arithmetic shift left by 1 on the 16-bit operand.
     */
    public static final int SAL_RM16_1;

    /**
     * SAL_RM32_1: Perform an arithmetic shift left by 1 on the 32-bit operand.
     */
    public static final int SAL_RM32_1;

    /**
     * SAL_RM64_1: Perform an arithmetic shift left by 1 on the 64-bit operand.
     */
    public static final int SAL_RM64_1;

    /**
     * SAR_RM16_1: Perform an arithmetic shift right by 1 on the 16-bit operand.
     */
    public static final int SAR_RM16_1;

    /**
     * SAR_RM32_1: Perform an arithmetic shift right by 1 on the 32-bit operand.
     */
    public static final int SAR_RM32_1;

    /**
     * SAR_RM64_1: Perform an arithmetic shift right by 1 on the 64-bit operand.
     */
    public static final int SAR_RM64_1;

    /**
     * ROL_RM8_CL: Perform a rotate left through carry on the 8-bit operand with CL register as the shift count.
     */
    public static final int ROL_RM8_CL;

    /**
     * ROR_RM8_CL: Perform a rotate right through carry on the 8-bit operand with CL register as the shift count.
     */
    public static final int ROR_RM8_CL;

    /**
     * RCL_RM8_CL: Perform a rotate left through carry on the 8-bit operand with CL register as the shift count.
     */
    public static final int RCL_RM8_CL;

    /**
     * RCR_RM8_CL: Perform a rotate right through carry on the 8-bit operand with CL register as the shift count.
     */
    public static final int RCR_RM8_CL;

    /**
     * SHL_RM8_CL: Perform a logical shift left on the 8-bit operand with CL register as the shift count.
     */
    public static final int SHL_RM8_CL;

    /**
     * SHR_RM8_CL: Perform a logical shift right on the 8-bit operand with CL register as the shift count.
     */
    public static final int SHR_RM8_CL;

    /**
     * SAL_RM8_CL: Perform an arithmetic shift left on the 8-bit operand with CL register as the shift count.
     */
    public static final int SAL_RM8_CL;

    /**
     * SAR_RM8_CL: Perform an arithmetic shift right on the 8-bit operand with CL register as the shift count.
     */
    public static final int SAR_RM8_CL;

    /**
     * ROL_RM16_CL: Perform a rotate left through carry on the 16-bit operand with CL register as the shift count.
     */
    public static final int ROL_RM16_CL;

    /**
     * ROL_RM32_CL: Perform a rotate left through carry on the 32-bit operand with CL register as the shift count.
     */
    public static final int ROL_RM32_CL;

    /**
     * ROL_RM64_CL: Perform a rotate left through carry on the 64-bit operand with CL register as the shift count.
     */
    public static final int ROL_RM64_CL;

    /**
     * ROR_RM16_CL: Perform a rotate right through carry on the 16-bit operand with CL register as the shift count.
     */
    public static final int ROR_RM16_CL;

    /**
     * ROR_RM32_CL: Perform a rotate right through carry on the 32-bit operand with CL register as the shift count.
     */
    public static final int ROR_RM32_CL;

    /**
     * ROR_RM64_CL: Perform a rotate right through carry on the 64-bit operand with CL register as the shift count.
     */
    public static final int ROR_RM64_CL;

    /**
     * RCL_RM16_CL: Perform a rotate left through carry on the 16-bit operand with CL register as the shift count.
     */
    public static final int RCL_RM16_CL;

    /**
     * RCL_RM32_CL: Perform a rotate left through carry on the 32-bit operand with CL register as the shift count.
     */
    public static final int RCL_RM32_CL;

    /**
     * RCL_RM64_CL: Perform a rotate left through carry on the 64-bit operand with CL register as the shift count.
     */
    public static final int RCL_RM64_CL;

    /**
     * RCR_RM16_CL: Perform a rotate right through carry on the 16-bit operand with CL register as the shift count.
     */
    public static final int RCR_RM16_CL;

    /**
     * RCR_RM32_CL: Perform a rotate right through carry on the 32-bit operand with CL register as the shift count.
     */
    public static final int RCR_RM32_CL;

    /**
     * RCR_RM64_CL: Perform a rotate right through carry on the 64-bit operand with CL register as the shift count.
     */
    public static final int RCR_RM64_CL;

    /**
     * SHL_RM16_CL: Perform a logical shift left on the 16-bit operand with CL register as the shift count.
     */
    public static final int SHL_RM16_CL;

    /**
     * SHL_RM32_CL: Perform a logical shift left on the 32-bit operand with CL register as the shift count.
     */
    public static final int SHL_RM32_CL;

    /**
     * SHL_RM64_CL: Perform a logical shift left on the 64-bit operand with CL register as the shift count.
     */
    public static final int SHL_RM64_CL;

    /**
     * SHR_RM16_CL: Perform a logical shift right on the 16-bit operand with CL register as the shift count.
     */
    public static final int SHR_RM16_CL;

    /**
     * SHR_RM32_CL: Perform a logical shift right on the 32-bit operand with CL register as the shift count.
     */
    public static final int SHR_RM32_CL;

    /**
     * SHR_RM64_CL: Perform a logical shift right on the 64-bit operand with CL register as the shift count.
     */
    public static final int SHR_RM64_CL;

    /**
     * SAL_RM16_CL: Perform an arithmetic shift left on the 16-bit operand with CL register as the shift count.
     */
    public static final int SAL_RM16_CL;

    /**
     * SAL_RM32_CL: Perform an arithmetic shift left on the 32-bit operand with CL register as the shift count.
     */
    public static final int SAL_RM32_CL;

    /**
     * SAL_RM64_CL: Perform an arithmetic shift left on the 64-bit operand with CL register as the shift count.
     */
    public static final int SAL_RM64_CL;

    /**
     * SAR_RM16_CL: Perform an arithmetic shift right on the 16-bit operand with CL register as the shift count.
     */
    public static final int SAR_RM16_CL;

    /**
     * SAR_RM32_CL: Perform an arithmetic shift right on the 32-bit operand with CL register as the shift count.
     */
    public static final int SAR_RM32_CL;

    /**
     * SAR_RM64_CL: Perform an arithmetic shift right on the 64-bit operand with CL register as the shift count.
     */
    public static final int SAR_RM64_CL;

    /**
     * MOVSB_M8_M8: Move a byte from the source memory to the destination memory.
     */
    public static final int MOVSB_M8_M8;

    /**
     * MOVSW_M16_M16: Move a word from the source memory to the destination memory.
     */
    public static final int MOVSW_M16_M16;

    /**
     * MOVSD_M32_M32: Move a double word from the source memory to the destination memory.
     */
    public static final int MOVSD_M32_M32;

    /**
     * MOVSQ_M64_M64: Move a quad word from the source memory to the destination memory.
     */
    public static final int MOVSQ_M64_M64;

    /**
     * CMPSB_M8_M8: Compare a byte from the source memory with a byte from the destination memory.
     */
    public static final int CMPSB_M8_M8;

    /**
     * CMPSW_M16_M16: Compare a word from the source memory with a word from the destination memory.
     */
    public static final int CMPSW_M16_M16;

    /**
     * CMPSD_M32_M32: Compare a double word from the source memory with a double word from the destination memory.
     */
    public static final int CMPSD_M32_M32;

    /**
     * CMPSQ_M64_M64: Compare a quad word from the source memory with a quad word from the destination memory.
     */
    public static final int CMPSQ_M64_M64;

    /**
     * STOSB_M8_AL: Store the byte from the AL register into the destination memory.
     */
    public static final int STOSB_M8_AL;

    /**
     * STOSW_M16_AX: Store the word from the AX register into the destination memory.
     */
    public static final int STOSW_M16_AX;

    /**
     * STOSD_M32_EAX: Store the double word from the EAX register into the destination memory.
     */
    public static final int STOSD_M32_EAX;

    /**
     * STOSQ_M64_RAX: Store the quad word from the RAX register into the destination memory.
     */
    public static final int STOSQ_M64_RAX;

    /**
     * LODSB_AL_M8: Load a byte from the source memory into the AL register.
     */
    public static final int LODSB_AL_M8;

    /**
     * LODSW_AX_M16: Load a word from the source memory into the AX register.
     */
    public static final int LODSW_AX_M16;

    /**
     * LODSD_EAX_M32: Load a double word from the source memory into the EAX register.
     */
    public static final int LODSD_EAX_M32;

    /**
     * LODSQ_RAX_M64: Load a quad word from the source memory into the RAX register.
     */
    public static final int LODSQ_RAX_M64;

    /**
     * SCASB_AL_M8: Scan a byte from the AL register against the memory.
     */
    public static final int SCASB_AL_M8;

    /**
     * SCASW_AX_M16: Scan a word from the AX register against the memory.
     */
    public static final int SCASW_AX_M16;

    /**
     * SCASD_EAX_M32: Scan a double word from the EAX register against the memory.
     */
    public static final int SCASD_EAX_M32;

    /**
     * SCASQ_RAX_M64: Scan a quad word from the RAX register against the memory.
     */
    public static final int SCASQ_RAX_M64;

    /**
     * RETNW_IMM16: Return from procedure with an immediate 16-bit value.
     */
    public static final int RETNW_IMM16;

    /**
     * RETND_IMM16: Return from procedure with an immediate 16-bit value (32-bit mode).
     */
    public static final int RETND_IMM16;

    /**
     * RETNQ_IMM16: Return from procedure with an immediate 16-bit value (64-bit mode).
     */
    public static final int RETNQ_IMM16;

    /**
     * RETNW: Return from procedure.
     */
    public static final int RETNW;

    /**
     * RETND: Return from procedure (32-bit mode).
     */
    public static final int RETND;

    /**
     * RETNQ: Return from procedure (64-bit mode).
     */
    public static final int RETNQ;

    /**
     * RETFW_IMM16: Return from a procedure with a 16-bit immediate return address.
     */
    public static final int RETFW_IMM16;

    /**
     * RETFD_IMM16: Return from a procedure with a 32-bit immediate return address.
     */
    public static final int RETFD_IMM16;

    /**
     * RETFQ_IMM16: Return from a procedure with a 64-bit immediate return address.
     */
    public static final int RETFQ_IMM16;

    /**
     * RETFW: Return from a procedure with a 16-bit return address.
     */
    public static final int RETFW;

    /**
     * RETFD: Return from a procedure with a 32-bit return address.
     */
    public static final int RETFD;

    /**
     * RETFQ: Return from a procedure with a 64-bit return address.
     */
    public static final int RETFQ;

    /**
     * LES_R16_M1616: Load far pointer to the R16 register from memory.
     */
    public static final int LES_R16_M1616;

    /**
     * LES_R32_M1632: Load far pointer to the R32 register from memory.
     */
    public static final int LES_R32_M1632;

    /**
     * LDS_R16_M1616: Load far pointer to the R16 register from memory.
     */
    public static final int LDS_R16_M1616;

    /**
     * LDS_R32_M1632: Load far pointer to the R32 register from memory.
     */
    public static final int LDS_R32_M1632;

    /**
     * BOUND_R16_M1616: Check if a 16-bit register is within the bounds specified by two 16-bit values in memory.
     */
    public static final int BOUND_R16_M1616;

    /**
     * BOUND_R32_M3232: Check if a 32-bit register is within the bounds specified by two 32-bit values in memory.
     */
    public static final int BOUND_R32_M3232;

    /**
     * ARPL_RM16_R16: Adjust the privilege level of a 16-bit memory operand to match that of a 16-bit register.
     */
    public static final int ARPL_RM16_R16;

    /**
     * ARPL_R32M16_R32: Adjust the privilege level of a 32-bit register and 16-bit memory operand.
     */
    public static final int ARPL_R32M16_R32;

    /**
     * MOVSXD_R16_RM16: Move a sign-extended 16-bit memory operand into a 16-bit register.
     */
    public static final int MOVSXD_R16_RM16;

    /**
     * MOVSXD_R32_RM32: Move a sign-extended 32-bit memory operand into a 32-bit register.
     */
    public static final int MOVSXD_R32_RM32;

    /**
     * MOVSXD_R64_RM32: Move a sign-extended 32-bit memory operand into a 64-bit register.
     */
    public static final int MOVSXD_R64_RM32;

    /**
     * IMUL_R16_RM16_IMM16: Perform a signed multiplication of a 16-bit register and a 16-bit immediate value.
     */
    public static final int IMUL_R16_RM16_IMM16;

    /**
     * IMUL_R32_RM32_IMM32: Perform a signed multiplication of a 32-bit register and a 32-bit immediate value.
     */
    public static final int IMUL_R32_RM32_IMM32;

    /**
     * IMUL_R64_RM64_IMM32: Perform a signed multiplication of a 64-bit register and a 32-bit immediate value.
     */
    public static final int IMUL_R64_RM64_IMM32;

    /**
     * IMUL_R16_RM16_IMM8: Perform a signed multiplication of a 16-bit register and an 8-bit immediate value.
     */
    public static final int IMUL_R16_RM16_IMM8;

    /**
     * IMUL_R32_RM32_IMM8: Perform a signed multiplication of a 32-bit register and an 8-bit immediate value.
     */
    public static final int IMUL_R32_RM32_IMM8;

    /**
     * IMUL_R64_RM64_IMM8: Perform a signed multiplication of a 64-bit register and an 8-bit immediate value.
     */
    public static final int IMUL_R64_RM64_IMM8;

    /**
     * INSB_M8_DX: Input a byte from port specified in DX and store it at the address specified by the operand.
     */
    public static final int INSB_M8_DX;

    /**
     * INSW_M16_DX: Input a word from port specified in DX and store it at the address specified by the operand.
     */
    public static final int INSW_M16_DX;

    /**
     * INSD_M32_DX: Input a double word from port specified in DX and store it at the address specified by the operand.
     */
    public static final int INSD_M32_DX;

    /**
     * OUTSB_DX_M8: Output a byte from the operand to the port specified in DX.
     */
    public static final int OUTSB_DX_M8;

    /**
     * OUTSW_DX_M16: Output a word from the operand to the port specified in DX.
     */
    public static final int OUTSW_DX_M16;

    /**
     * OUTSD_DX_M32: Output a double word from the operand to the port specified in DX.
     */
    public static final int OUTSD_DX_M32;

    /**
     * JO_REL8_16: Jump to the address specified by the 8-bit signed displacement if the overflow flag (OF) is set.
     */
    public static final int JO_REL8_16;

    /**
     * JO_REL8_32: Jump to the address specified by the 8-bit signed displacement if the overflow flag (OF) is set.
     */
    public static final int JO_REL8_32;

    /**
     * JO_REL8_64: Jump to the address specified by the 8-bit signed displacement if the overflow flag (OF) is set.
     */
    public static final int JO_REL8_64;

    /**
     * JNO_REL8_16: Jump to the address specified by the 8-bit signed displacement if the overflow flag (OF) is not set.
     */
    public static final int JNO_REL8_16;

    /**
     * JNO_REL8_32: Jump to the address specified by the 8-bit signed displacement if the overflow flag (OF) is not set.
     */
    public static final int JNO_REL8_32;

    /**
     * JNO_REL8_64: Jump to the address specified by the 8-bit signed displacement if the overflow flag (OF) is not set.
     */
    public static final int JNO_REL8_64;

    /**
     * JB_REL8_16: Jump to the address specified by the 8-bit signed displacement if the carry flag (CF) is set.
     */
    public static final int JB_REL8_16;

    /**
     * JB_REL8_32: Jump to the address specified by the 8-bit signed displacement if the carry flag (CF) is set.
     */
    public static final int JB_REL8_32;

    /**
     * JB_REL8_64: Jump to the address specified by the 8-bit signed displacement if the carry flag (CF) is set.
     */
    public static final int JB_REL8_64;

    /**
     * JAE_REL8_16: Jump to the address specified by the 8-bit signed displacement if the carry flag (CF) is not set.
     */
    public static final int JAE_REL8_16;

    /**
     * JAE_REL8_32: Jump to the address specified by the 8-bit signed displacement if the carry flag (CF) is not set.
     */
    public static final int JAE_REL8_32;

    /**
     * JAE_REL8_64: Jump to the address specified by the 8-bit signed displacement if the carry flag (CF) is not set.
     */
    public static final int JAE_REL8_64;

    /**
     * JE_REL8_16: Jump to the address specified by the 8-bit signed displacement if the zero flag (ZF) is set.
     */
    public static final int JE_REL8_16;

    /**
     * JE_REL8_32: Jump to the address specified by the 8-bit signed displacement if the zero flag (ZF) is set.
     */
    public static final int JE_REL8_32;

    /**
     * JE_REL8_64: Jump to the address specified by the 8-bit signed displacement if the zero flag (ZF) is set.
     */
    public static final int JE_REL8_64;

    /**
     * JNE_REL8_16: Jump to the address specified by the 8-bit signed displacement if the zero flag (ZF) is not set.
     */
    public static final int JNE_REL8_16;

    /**
     * JNE_REL8_32: Jump to the address specified by the 8-bit signed displacement if the zero flag (ZF) is not set.
     */
    public static final int JNE_REL8_32;

    /**
     * JNE_REL8_64: Jump to the address specified by the 8-bit signed displacement if the zero flag (ZF) is not set.
     */
    public static final int JNE_REL8_64;

    /**
     * JBE_REL8_16: Jump to the address specified by the 8-bit signed displacement if the carry flag (CF) or the zero flag (ZF) is set.
     */
    public static final int JBE_REL8_16;

    /**
     * JBE_REL8_32: Jump to the address specified by the 8-bit signed displacement if the carry flag (CF) or the zero flag (ZF) is set.
     */
    public static final int JBE_REL8_32;

    /**
     * JBE_REL8_64: Jump to the address specified by the 8-bit signed displacement if the carry flag (CF) or the zero flag (ZF) is set.
     */
    public static final int JBE_REL8_64;

    /**
     * JA_REL8_16: Jump to the address specified by the 8-bit signed displacement if neither the carry flag (CF) nor the zero flag (ZF) is set.
     */
    public static final int JA_REL8_16;

    /**
     * JA_REL8_32: Jump to the address specified by the 8-bit signed displacement if neither the carry flag (CF) nor the zero flag (ZF) is set.
     */
    public static final int JA_REL8_32;

    /**
     * JA_REL8_64: Jump to the address specified by the 8-bit signed displacement if neither the carry flag (CF) nor the zero flag (ZF) is set.
     */
    public static final int JA_REL8_64;

    /**
     * JS_REL8_16: Jump to the address specified by the 8-bit signed displacement if the sign flag (SF) is set.
     */
    public static final int JS_REL8_16;

    /**
     * JS_REL8_32: Jump to the address specified by the 8-bit signed displacement if the sign flag (SF) is set.
     */
    public static final int JS_REL8_32;

    /**
     * JS_REL8_64: Jump to the address specified by the 8-bit signed displacement if the sign flag (SF) is set.
     */
    public static final int JS_REL8_64;

    /**
     * JNS_REL8_16: Jump to the address specified by the 8-bit signed displacement if the sign flag (SF) is not set.
     */
    public static final int JNS_REL8_16;

    /**
     * JNS_REL8_32: Jump to the address specified by the 8-bit signed displacement if the sign flag (SF) is not set.
     */
    public static final int JNS_REL8_32;

    /**
     * JNS_REL8_64: Jump to the address specified by the 8-bit signed displacement if the sign flag (SF) is not set.
     */
    public static final int JNS_REL8_64;

    /**
     * JP_REL8_16: Jump to the address specified by the 8-bit signed displacement if the parity flag (PF) is set.
     */
    public static final int JP_REL8_16;

    /**
     * JP_REL8_32: Jump to the address specified by the 8-bit signed displacement if the parity flag (PF) is set.
     */
    public static final int JP_REL8_32;

    /**
     * JP_REL8_64: Jump to the address specified by the 8-bit signed displacement if the parity flag (PF) is set.
     */
    public static final int JP_REL8_64;

    /**
     * JNP_REL8_16: Jump to the address specified by the 8-bit signed displacement if the parity flag (PF) is not set.
     */
    public static final int JNP_REL8_16;

    /**
     * JNP_REL8_32: Jump to the address specified by the 8-bit signed displacement if the parity flag (PF) is not set.
     */
    public static final int JNP_REL8_32;

    /**
     * JNP_REL8_64: Jump to the address specified by the 8-bit signed displacement if the parity flag (PF) is not set.
     */
    public static final int JNP_REL8_64;

    /**
     * JL_REL8_16: Jump to the address specified by the 8-bit signed displacement if the less flag (SF != OF) is set.
     */
    public static final int JL_REL8_16;

    /**
     * JL_REL8_32: Jump to the address specified by the 8-bit signed displacement if the less flag (SF != OF) is set.
     */
    public static final int JL_REL8_32;

    /**
     * JL_REL8_64: Jump to the address specified by the 8-bit signed displacement if the less flag (SF != OF) is set.
     */
    public static final int JL_REL8_64;

    /**
     * JGE_REL8_16: Jump to the address specified by the 8-bit signed displacement if the greater or equal flag (SF == OF) is set.
     */
    public static final int JGE_REL8_16;

    /**
     * JGE_REL8_32: Jump to the address specified by the 8-bit signed displacement if the greater or equal flag (SF == OF) is set.
     */
    public static final int JGE_REL8_32;

    /**
     * JGE_REL8_64: Jump to the address specified by the 8-bit signed displacement if the greater or equal flag (SF == OF) is set.
     */
    public static final int JGE_REL8_64;

    /**
     * JLE_REL8_16: Jump to the address specified by the 8-bit signed displacement if the less or equal flag (ZF == 1 or SF != OF) is set.
     */
    public static final int JLE_REL8_16;

    /**
     * JLE_REL8_32: Jump to the address specified by the 8-bit signed displacement if the less or equal flag (ZF == 1 or SF != OF) is set.
     */
    public static final int JLE_REL8_32;

    /**
     * JLE_REL8_64: Jump to the address specified by the 8-bit signed displacement if the less or equal flag (ZF == 1 or SF != OF) is set.
     */
    public static final int JLE_REL8_64;

    /**
     * JG_REL8_16: Jump to the address specified by the 8-bit signed displacement if the greater flag (SF == OF) is set.
     */
    public static final int JG_REL8_16;

    /**
     * JG_REL8_32: Jump to the address specified by the 8-bit signed displacement if the greater flag (SF == OF) is set.
     */
    public static final int JG_REL8_32;

    /**
     * JG_REL8_64: Jump to the address specified by the 8-bit signed displacement if the greater flag (SF == OF) is set.
     */
    public static final int JG_REL8_64;

    /**
     * NOPW: No operation (16-bit version).
     */
    public static final int NOPW;

    /**
     * NOPD: No operation (32-bit version).
     */
    public static final int NOPD;

    /**
     * NOPQ: No operation (64-bit version).
     */
    public static final int NOPQ;

    /**
     * XBEGIN_REL16: Begin a transaction with a relative 16-bit offset.
     */
    public static final int XBEGIN_REL16;

    /**
     * XBEGIN_REL32: Begin a transaction with a relative 32-bit offset.
     */
    public static final int XBEGIN_REL32;

    /**
     * ENTERW_IMM16_IMM8: Set up a stack frame with 16-bit immediate values for the number of words and stack size.
     */
    public static final int ENTERW_IMM16_IMM8;

    /**
     * ENTERD_IMM16_IMM8: Set up a stack frame with 32-bit immediate values for the number of words and stack size.
     */
    public static final int ENTERD_IMM16_IMM8;

    /**
     * ENTERQ_IMM16_IMM8: Set up a stack frame with 64-bit immediate values for the number of words and stack size.
     */
    public static final int ENTERQ_IMM16_IMM8;

    /**
     * LEAVEW: Leave the current stack frame (16-bit operation).
     */
    public static final int LEAVEW;

    /**
     * LEAVED: Leave the current stack frame (32-bit operation).
     */
    public static final int LEAVED;

    /**
     * LEAVEQ: Leave the current stack frame (64-bit operation).
     */
    public static final int LEAVEQ;

    /**
     * DAA: Decimal Adjust AL after Addition.
     */
    public static final int DAA;

    /**
     * DAS: Decimal Adjust AL after Subtraction.
     */
    public static final int DAS;

    /**
     * AAA: ASCII Adjust AL After Addition. Adjust the AL register after an addition to ensure valid BCD (Binary-Coded Decimal) representation.
     */
    public static final int AAA;

    /**
     * AAS: ASCII Adjust AX After Subtraction. Adjust the AX register after a subtraction to ensure valid BCD representation.
     */
    public static final int AAS;

    /**
     * AAM_IMM8: ASCII adjust AX after multiply by the immediate 8-bit value.
     */
    public static final int AAM_IMM8;

    /**
     * AAD_IMM8: ASCII adjust AX before division by the immediate 8-bit value.
     */
    public static final int AAD_IMM8;

    /**
     * SALC: Set AL based on the carry flag.
     */
    public static final int SALC;

    /**
     * PAUSE: Hint to the processor to pause execution until the next instruction.
     */
    public static final int PAUSE;

    /**
     * WAIT: Wait for the processor to complete pending floating-point operations.
     */
    public static final int WAIT;

    /**
     * SAHF: Store the AH byte of the FLAGS register into the AH byte of the FLAGS register.
     */
    public static final int SAHF;

    /**
     * LAHF: Load the AH byte of the FLAGS register into the AH byte of the FLAGS register.
     */
    public static final int LAHF;

    /**
     * XLAT_M8: Translate a byte from memory based on AL register value.
     */
    public static final int XLAT_M8;

    /**
     * CBW: Convert byte to word (sign-extend AL to AX).
     */
    public static final int CBW;

    /**
     * CWDE: Convert word to double word (sign-extend AX to EAX).
     */
    public static final int CWDE;

    /**
     * CDQE: Convert double word to quad word (sign-extend EAX to RAX).
     */
    public static final int CDQE;

    /**
     * CWD: Convert word to double word (sign-extend AX to DX:AX).
     */
    public static final int CWD;

    /**
     * CDQ: Convert double word to quad word (sign-extend EAX to EDX:EAX).
     */
    public static final int CDQ;

    /**
     * CQO: Convert quad word to octa word (sign-extend RAX to RDX:RAX).
     */
    public static final int CQO;

    /**
     * CALL_PTR1616: Call a procedure at the address specified by the 16-bit segment and offset.
     */
    public static final int CALL_PTR1616;

    /**
     * CALL_PTR1632: Call a procedure at the address specified by the 16-bit segment and 32-bit offset.
     */
    public static final int CALL_PTR1632;

    /**
     * INT3: Trigger a breakpoint interrupt.
     */
    public static final int INT3;

    /**
     * INT_IMM8: Trigger an interrupt with an 8-bit immediate value.
     */
    public static final int INT_IMM8;

    /**
     * INTO: Trigger an interrupt on overflow.
     */
    public static final int INTO;

    /**
     * IRETW: Return from an interrupt procedure (16-bit operation).
     */
    public static final int IRETW;

    /**
     * IRETD: Return from an interrupt procedure (32-bit operation).
     */
    public static final int IRETD;

    /**
     * IRETQ: Return from an interrupt procedure (64-bit operation).
     */
    public static final int IRETQ;

    /**
     * XABORT_IMM8: Abort transactional execution with an 8-bit immediate value.
     */
    public static final int XABORT_IMM8;

    /**
     * FADD_M32FP: Add a floating point value from memory to the ST(0) register.
     */
    public static final int FADD_M32FP;

    /**
     * FMUL_M32FP: Multiply a floating point value from memory with the ST(0) register.
     */
    public static final int FMUL_M32FP;

    /**
     * FCOM_M32FP: Compare a floating point value from memory with the ST(0) register.
     */
    public static final int FCOM_M32FP;

    /**
     * FCOMP_M32FP: Compare and pop a floating point value from memory with the ST(0) register.
     */
    public static final int FCOMP_M32FP;

    /**
     * FSUB_M32FP: Subtract a floating point value from memory from the ST(0) register.
     */
    public static final int FSUB_M32FP;

    /**
     * FSUBR_M32FP: Subtract a floating point value from memory from the ST(0) register and reverse the operands.
     */
    public static final int FSUBR_M32FP;

    /**
     * FDIV_M32FP: Divide a floating point value from memory by the ST(0) register.
     */
    public static final int FDIV_M32FP;

    static {
        int i = 0;

        // Invalid and declaration-related constants
        INVALID = i++;
        DECLAREBYTE = i++;
        DECLAREWORD = i++;
        DECLAREDWORD = i++;
        DECLAREQWORD = i++;

        // ADD operations
        ADD_RM8_R8 = i++;
        ADD_RM16_R16 = i++;
        ADD_RM32_R32 = i++;
        ADD_RM64_R64 = i++;
        ADD_R8_RM8 = i++;
        ADD_R16_RM16 = i++;
        ADD_R32_RM32 = i++;
        ADD_R64_RM64 = i++;
        ADD_AL_IMM8 = i++;
        ADD_AX_IMM16 = i++;
        ADD_EAX_IMM32 = i++;
        ADD_RAX_IMM64 = i++;
        ADD_RM8_IMM8 = i++;
        ADD_RM16_IMM16 = i++;
        ADD_RM32_IMM32 = i++;
        ADD_RM64_IMM32 = i++;
        ADD_RM8_IMM8_82 = i++;
        ADD_RM16_IMM8 = i++;
        ADD_RM32_IMM8 = i++;
        ADD_RM64_IMM8 = i++;

        // OR operations
        OR_RM8_R8 = i++;
        OR_RM16_R16 = i++;
        OR_RM32_R32 = i++;
        OR_RM64_R64 = i++;
        OR_R8_RM8 = i++;
        OR_R16_RM16 = i++;
        OR_R32_RM32 = i++;
        OR_R64_RM64 = i++;
        OR_AL_IMM8 = i++;
        OR_AX_IMM16 = i++;
        OR_EAX_IMM32 = i++;
        OR_RAX_IMM32 = i++;
        OR_RM8_IMM8 = i++;
        OR_RM16_IMM16 = i++;
        OR_RM32_IMM32 = i++;
        OR_RM64_IMM32 = i++;
        OR_RM8_IMM8_82 = i++;
        OR_RM16_IMM8 = i++;
        OR_RM32_IMM8 = i++;
        OR_RM64_IMM8 = i++;

        // ADC operations
        ADC_RM8_R8 = i++;
        ADC_RM16_R16 = i++;
        ADC_RM32_R32 = i++;
        ADC_RM64_R64 = i++;
        ADC_R8_RM8 = i++;
        ADC_R16_RM16 = i++;
        ADC_R32_RM32 = i++;
        ADC_R64_RM64 = i++;
        ADC_AL_IMM8 = i++;
        ADC_AX_IMM16 = i++;
        ADC_EAX_IMM32 = i++;
        ADC_RAX_IMM32 = i++;
        ADC_RM8_IMM8 = i++;
        ADC_RM16_IMM16 = i++;
        ADC_RM32_IMM32 = i++;
        ADC_RM64_IMM32 = i++;
        ADC_RM8_IMM8_82 = i++;
        ADC_RM16_IMM8 = i++;
        ADC_RM32_IMM8 = i++;
        ADC_RM64_IMM8 = i++;

        // SBB operations
        SBB_RM8_R8 = i++;
        SBB_RM16_R16 = i++;
        SBB_RM32_R32 = i++;
        SBB_RM64_R64 = i++;
        SBB_R8_RM8 = i++;
        SBB_R16_RM16 = i++;
        SBB_R32_RM32 = i++;
        SBB_R64_RM64 = i++;
        SBB_AL_IMM8 = i++;
        SBB_AX_IMM16 = i++;
        SBB_EAX_IMM32 = i++;
        SBB_RAX_IMM32 = i++;
        SBB_RM8_IMM8 = i++;
        SBB_RM16_IMM16 = i++;
        SBB_RM32_IMM32 = i++;
        SBB_RM64_IMM32 = i++;
        SBB_RM8_IMM8_82 = i++;
        SBB_RM16_IMM8 = i++;
        SBB_RM32_IMM8 = i++;
        SBB_RM64_IMM8 = i++;

        // AND operations
        AND_RM8_R8 = i++;
        AND_RM16_R16 = i++;
        AND_RM32_R32 = i++;
        AND_RM64_R64 = i++;
        AND_R8_RM8 = i++;
        AND_R16_RM16 = i++;
        AND_R32_RM32 = i++;
        AND_R64_RM64 = i++;
        AND_AL_IMM8 = i++;
        AND_AX_IMM16 = i++;
        AND_EAX_IMM32 = i++;
        AND_RAX_IMM32 = i++;
        AND_RM8_IMM8 = i++;
        AND_RM16_IMM16 = i++;
        AND_RM32_IMM32 = i++;
        AND_RM64_IMM32 = i++;
        AND_RM8_IMM8_82 = i++;
        AND_RM16_IMM8 = i++;
        AND_RM32_IMM8 = i++;
        AND_RM64_IMM8 = i++;

        // SUB operations
        SUB_RM8_R8 = i++;
        SUB_RM16_R16 = i++;
        SUB_RM32_R32 = i++;
        SUB_RM64_R64 = i++;
        SUB_R8_RM8 = i++;
        SUB_R16_RM16 = i++;
        SUB_R32_RM32 = i++;
        SUB_R64_RM64 = i++;
        SUB_AL_IMM8 = i++;
        SUB_AX_IMM16 = i++;
        SUB_EAX_IMM32 = i++;
        SUB_RAX_IMM32 = i++;
        SUB_RM8_IMM8 = i++;
        SUB_RM16_IMM16 = i++;
        SUB_RM32_IMM32 = i++;
        SUB_RM64_IMM32 = i++;
        SUB_RM8_IMM8_82 = i++;
        SUB_RM16_IMM8 = i++;
        SUB_RM32_IMM8 = i++;
        SUB_RM64_IMM8 = i++;

        // XOR operations
        XOR_RM8_R8 = i++;
        XOR_RM16_R16 = i++;
        XOR_RM32_R32 = i++;
        XOR_RM64_R64 = i++;
        XOR_R8_RM8 = i++;
        XOR_R16_RM16 = i++;
        XOR_R32_RM32 = i++;
        XOR_R64_RM64 = i++;
        XOR_AL_IMM8 = i++;
        XOR_AX_IMM16 = i++;
        XOR_EAX_IMM32 = i++;
        XOR_RAX_IMM32 = i++;
        XOR_RM8_IMM8 = i++;
        XOR_RM16_IMM16 = i++;
        XOR_RM32_IMM32 = i++;
        XOR_RM64_IMM32 = i++;
        XOR_RM8_IMM8_82 = i++;
        XOR_RM16_IMM8 = i++;
        XOR_RM32_IMM8 = i++;
        XOR_RM64_IMM8 = i++;

        // CMP operations
        CMP_RM8_R8 = i++;
        CMP_RM16_R16 = i++;
        CMP_RM32_R32 = i++;
        CMP_RM64_R64 = i++;
        CMP_R8_RM8 = i++;
        CMP_R16_RM16 = i++;
        CMP_R32_RM32 = i++;
        CMP_R64_RM64 = i++;
        CMP_AL_IMM8 = i++;
        CMP_AX_IMM16 = i++;
        CMP_EAX_IMM32 = i++;
        CMP_RAX_IMM32 = i++;
        CMP_RM8_IMM8 = i++;
        CMP_RM16_IMM16 = i++;
        CMP_RM32_IMM32 = i++;
        CMP_RM64_IMM32 = i++;
        CMP_RM8_IMM8_82 = i++;
        CMP_RM16_IMM8 = i++;
        CMP_RM32_IMM8 = i++;
        CMP_RM64_IMM8 = i++;

        // TEST operations
        TEST_RM8_R8 = i++;
        TEST_RM16_R16 = i++;
        TEST_RM32_R32 = i++;
        TEST_RM64_R64 = i++;
        TEST_AL_IMM8 = i++;
        TEST_AX_IMM16 = i++;
        TEST_EAX_IMM32 = i++;
        TEST_RAX_IMM32 = i++;

        // MOV operations
        MOV_RM8_R8 = i++;
        MOV_RM16_R16 = i++;
        MOV_RM32_R32 = i++;
        MOV_RM64_R64 = i++;
        MOV_R8_RM8 = i++;
        MOV_R16_RM16 = i++;
        MOV_R32_RM32 = i++;
        MOV_R64_RM64 = i++;
        MOV_RM8_IMM8 = i++;
        MOV_RM16_IMM16 = i++;
        MOV_RM32_IMM32 = i++;
        MOV_RM64_IMM32 = i++;
        MOV_R8_IMM8 = i++;
        MOV_R16_IMM16 = i++;
        MOV_R32_IMM32 = i++;
        MOV_R64_IMM64 = i++;
        MOV_AL_MOFFS8 = i++;
        MOV_AX_MOFFS16 = i++;
        MOV_EAX_MOFFS32 = i++;
        MOV_RAX_MOFFS64 = i++;
        MOV_MOFFS8_AL = i++;
        MOV_MOFFS16_AX = i++;
        MOV_MOFFS32_EAX = i++;
        MOV_MOFFS64_RAX = i++;
        MOV_RM16_SREG = i++;
        MOV_R32M16_SREG = i++;
        MOV_R64M16_SREG = i++;
        MOV_SREG_RM16 = i++;
        MOV_SREG_R32M16 = i++;
        MOV_SREG_R64M16 = i++;

        // INC and DEC operations
        INC_R16 = i++;
        INC_R32 = i++;
        DEC_R16 = i++;
        DEC_R32 = i++;

        // PUSH and POP operations
        PUSH_R16 = i++;
        PUSH_R32 = i++;
        PUSH_R64 = i++;
        POP_R16 = i++;
        POP_R32 = i++;
        POP_R64 = i++;
        PUSHW_ES = i++;
        PUSHD_ES = i++;
        POPW_ES = i++;
        POPD_ES = i++;
        PUSHW_CS = i++;
        PUSHD_CS = i++;
        POPW_CS = i++;
        PUSHW_SS = i++;
        PUSHD_SS = i++;
        POPW_SS = i++;
        POPD_SS = i++;
        PUSHW_DS = i++;
        PUSHD_DS = i++;
        POPW_DS = i++;
        POPD_DS = i++;
        PUSH_IMM16 = i++;
        PUSHD_IMM32 = i++;
        PUSHQ_IMM32 = i++;
        PUSHW_IMM8 = i++;
        PUSHD_IMM8 = i++;
        PUSHQ_IMM8 = i++;
        POP_RM16 = i++;
        POP_RM32 = i++;
        POP_RM64 = i++;
        PUSHFW = i++;
        PUSHFD = i++;
        PUSHFQ = i++;
        POPFW = i++;
        POPFD = i++;
        POPFQ = i++;
        PUSHAW = i++;
        PUSHAD = i++;
        POPAW = i++;
        POPAD = i++;

        // LEA operations
        LEA_R16_M = i++;
        LEA_R32_M = i++;
        LEA_R64_M = i++;

        // XCHG operations
        XCHG_RM8_R8 = i++;
        XCHG_RM16_R16 = i++;
        XCHG_RM32_R32 = i++;
        XCHG_RM64_R64 = i++;
        XCHG_R16_AX = i++;
        XCHG_R32_EAX = i++;
        XCHG_R64_RAX = i++;

        // ROTATE and SHIFT operations
        ROL_RM8_IMM8 = i++;
        ROR_RM8_IMM8 = i++;
        RCL_RM8_IMM8 = i++;
        RCR_RM8_IMM8 = i++;
        SHL_RM8_IMM8 = i++;
        SHR_RM8_IMM8 = i++;
        SAL_RM8_IMM8 = i++;
        SAR_RM8_IMM8 = i++;
        ROL_RM16_IMM8 = i++;
        ROL_RM32_IMM8 = i++;
        ROL_RM64_IMM8 = i++;
        ROR_RM16_IMM8 = i++;
        ROR_RM32_IMM8 = i++;
        ROR_RM64_IMM8 = i++;
        RCL_RM16_IMM8 = i++;
        RCL_RM32_IMM8 = i++;
        RCL_RM64_IMM8 = i++;
        RCR_RM16_IMM8 = i++;
        RCR_RM32_IMM8 = i++;
        RCR_RM64_IMM8 = i++;
        SHL_RM16_IMM8 = i++;
        SHL_RM32_IMM8 = i++;
        SHL_RM64_IMM8 = i++;
        SHR_RM16_IMM8 = i++;
        SHR_RM32_IMM8 = i++;
        SHR_RM64_IMM8 = i++;
        SAL_RM16_IMM8 = i++;
        SAL_RM32_IMM8 = i++;
        SAL_RM64_IMM8 = i++;
        SAR_RM16_IMM8 = i++;
        SAR_RM32_IMM8 = i++;
        SAR_RM64_IMM8 = i++;
        ROL_RM8_1 = i++;
        ROR_RM8_1 = i++;
        RCL_RM8_1 = i++;
        RCR_RM8_1 = i++;
        SHL_RM8_1 = i++;
        SHR_RM8_1 = i++;
        SAL_RM8_1 = i++;
        SAR_RM8_1 = i++;
        ROL_RM16_1 = i++;
        ROL_RM32_1 = i++;
        ROL_RM64_1 = i++;
        ROR_RM16_1 = i++;
        ROR_RM32_1 = i++;
        ROR_RM64_1 = i++;
        RCL_RM16_1 = i++;
        RCL_RM32_1 = i++;
        RCL_RM64_1 = i++;
        RCR_RM16_1 = i++;
        RCR_RM32_1 = i++;
        RCR_RM64_1 = i++;
        SHL_RM16_1 = i++;
        SHL_RM32_1 = i++;
        SHL_RM64_1 = i++;
        SHR_RM16_1 = i++;
        SHR_RM32_1 = i++;
        SHR_RM64_1 = i++;
        SAL_RM16_1 = i++;
        SAL_RM32_1 = i++;
        SAL_RM64_1 = i++;
        SAR_RM16_1 = i++;
        SAR_RM32_1 = i++;
        SAR_RM64_1 = i++;
        ROL_RM8_CL = i++;
        ROR_RM8_CL = i++;
        RCL_RM8_CL = i++;
        RCR_RM8_CL = i++;
        SHL_RM8_CL = i++;
        SHR_RM8_CL = i++;
        SAL_RM8_CL = i++;
        SAR_RM8_CL = i++;
        ROL_RM16_CL = i++;
        ROL_RM32_CL = i++;
        ROL_RM64_CL = i++;
        ROR_RM16_CL = i++;
        ROR_RM32_CL = i++;
        ROR_RM64_CL = i++;
        RCL_RM16_CL = i++;
        RCL_RM32_CL = i++;
        RCL_RM64_CL = i++;
        RCR_RM16_CL = i++;
        RCR_RM32_CL = i++;
        RCR_RM64_CL = i++;
        SHL_RM16_CL = i++;
        SHL_RM32_CL = i++;
        SHL_RM64_CL = i++;
        SHR_RM16_CL = i++;
        SHR_RM32_CL = i++;
        SHR_RM64_CL = i++;
        SAL_RM16_CL = i++;
        SAL_RM32_CL = i++;
        SAL_RM64_CL = i++;
        SAR_RM16_CL = i++;
        SAR_RM32_CL = i++;
        SAR_RM64_CL = i++;

        // String operations
        MOVSB_M8_M8 = i++;
        MOVSW_M16_M16 = i++;
        MOVSD_M32_M32 = i++;
        MOVSQ_M64_M64 = i++;
        CMPSB_M8_M8 = i++;
        CMPSW_M16_M16 = i++;
        CMPSD_M32_M32 = i++;
        CMPSQ_M64_M64 = i++;
        STOSB_M8_AL = i++;
        STOSW_M16_AX = i++;
        STOSD_M32_EAX = i++;
        STOSQ_M64_RAX = i++;
        LODSB_AL_M8 = i++;
        LODSW_AX_M16 = i++;
        LODSD_EAX_M32 = i++;
        LODSQ_RAX_M64 = i++;
        SCASB_AL_M8 = i++;
        SCASW_AX_M16 = i++;
        SCASD_EAX_M32 = i++;
        SCASQ_RAX_M64 = i++;

        // RET instructions
        RETNW_IMM16 = i++;
        RETND_IMM16 = i++;
        RETNQ_IMM16 = i++;
        RETNW = i++;
        RETND = i++;
        RETNQ = i++;
        RETFW_IMM16 = i++;
        RETFD_IMM16 = i++;
        RETFQ_IMM16 = i++;
        RETFW = i++;
        RETFD = i++;
        RETFQ = i++;

        // Segment override/legacy
        LES_R16_M1616 = i++;
        LES_R32_M1632 = i++;
        LDS_R16_M1616 = i++;
        LDS_R32_M1632 = i++;
        BOUND_R16_M1616 = i++;
        BOUND_R32_M3232 = i++;
        ARPL_RM16_R16 = i++;
        ARPL_R32M16_R32 = i++;

        // MOVSXD
        MOVSXD_R16_RM16 = i++;
        MOVSXD_R32_RM32 = i++;
        MOVSXD_R64_RM32 = i++;

        // IMUL forms
        IMUL_R16_RM16_IMM16 = i++;
        IMUL_R32_RM32_IMM32 = i++;
        IMUL_R64_RM64_IMM32 = i++;
        IMUL_R16_RM16_IMM8 = i++;
        IMUL_R32_RM32_IMM8 = i++;
        IMUL_R64_RM64_IMM8 = i++;

        // I/O operations
        INSB_M8_DX = i++;
        INSW_M16_DX = i++;
        INSD_M32_DX = i++;
        OUTSB_DX_M8 = i++;
        OUTSW_DX_M16 = i++;
        OUTSD_DX_M32 = i++;

        // Conditional short jumps (8-bit offset)
        JO_REL8_16 = i++;
        JO_REL8_32 = i++;
        JO_REL8_64 = i++;
        JNO_REL8_16 = i++;
        JNO_REL8_32 = i++;
        JNO_REL8_64 = i++;
        JB_REL8_16 = i++;
        JB_REL8_32 = i++;
        JB_REL8_64 = i++;
        JAE_REL8_16 = i++;
        JAE_REL8_32 = i++;
        JAE_REL8_64 = i++;
        JE_REL8_16 = i++;
        JE_REL8_32 = i++;
        JE_REL8_64 = i++;
        JNE_REL8_16 = i++;
        JNE_REL8_32 = i++;
        JNE_REL8_64 = i++;
        JBE_REL8_16 = i++;
        JBE_REL8_32 = i++;
        JBE_REL8_64 = i++;
        JA_REL8_16 = i++;
        JA_REL8_32 = i++;
        JA_REL8_64 = i++;
        JS_REL8_16 = i++;
        JS_REL8_32 = i++;
        JS_REL8_64 = i++;
        JNS_REL8_16 = i++;
        JNS_REL8_32 = i++;
        JNS_REL8_64 = i++;
        JP_REL8_16 = i++;
        JP_REL8_32 = i++;
        JP_REL8_64 = i++;
        JNP_REL8_16 = i++;
        JNP_REL8_32 = i++;
        JNP_REL8_64 = i++;
        JL_REL8_16 = i++;
        JL_REL8_32 = i++;
        JL_REL8_64 = i++;
        JGE_REL8_16 = i++;
        JGE_REL8_32 = i++;
        JGE_REL8_64 = i++;
        JLE_REL8_16 = i++;
        JLE_REL8_32 = i++;
        JLE_REL8_64 = i++;
        JG_REL8_16 = i++;
        JG_REL8_32 = i++;
        JG_REL8_64 = i++;

        // NOP / XBEGIN
        NOPW = i++;
        NOPD = i++;
        NOPQ = i++;
        XBEGIN_REL16 = i++;
        XBEGIN_REL32 = i++;

        // ENTER / LEAVE
        ENTERW_IMM16_IMM8 = i++;
        ENTERD_IMM16_IMM8 = i++;
        ENTERQ_IMM16_IMM8 = i++;
        LEAVEW = i++;
        LEAVED = i++;
        LEAVEQ = i++;

        // Misc legacy arithmetic/flags
        DAA = i++;
        DAS = i++;
        AAA = i++;
        AAS = i++;
        AAM_IMM8 = i++;
        AAD_IMM8 = i++;
        SALC = i++;

        // Misc system/flag
        PAUSE = i++;
        WAIT = i++;
        SAHF = i++;
        LAHF = i++;
        XLAT_M8 = i++;

        // CBW/CWD-family
        CBW = i++;
        CWDE = i++;
        CDQE = i++;
        CWD = i++;
        CDQ = i++;
        CQO = i++;

        // Call far pointer
        CALL_PTR1616 = i++;
        CALL_PTR1632 = i++;

        // Software interrupts and returns
        INT3 = i++;
        INT_IMM8 = i++;
        INTO = i++;
        IRETW = i++;
        IRETD = i++;
        IRETQ = i++;
        XABORT_IMM8 = i++;

        // Floating-point (x87)
        FADD_M32FP = i++;
        FMUL_M32FP = i++;
        FCOM_M32FP = i++;
        FCOMP_M32FP = i++;
        FSUB_M32FP = i++;
        FSUBR_M32FP = i++;
        FDIV_M32FP = i++;
    }
}