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

    /**
     * F2XM1: Convert ST(0) to a floating point value and subtract 1.
     */
    public static final int F2XM1;

    /**
     * FABS: Take the absolute value of the floating point value in ST(0).
     */
    public static final int FABS;

    /**
     * FADD_M64FP: Add a 64-bit floating-point value in memory to ST(0).
     */
    public static final int FADD_M64FP;

    /**
     * FADD_ST0_STI: Add ST(i) to ST(0).
     */
    public static final int FADD_ST0_STI;

    /**
     * FADD_STI_ST0: Add ST(0) to ST(i).
     */
    public static final int FADD_STI_ST0;

    /**
     * FCHS: Change the sign of the value in ST(0).
     */
    public static final int FCHS;

    /**
     * FCLEX: Clear floating-point exception flags.
     */
    public static final int FCLEX;

    /**
     * FCMOVBE_ST0_STI: Move if below or equal (CF or ZF set).
     */
    public static final int FCMOVBE_ST0_STI;

    /**
     * FCMOVB_ST0_STI: Move if below (CF set).
     */
    public static final int FCMOVB_ST0_STI;

    /**
     * FCMOVE_ST0_STI: Move if equal (ZF set).
     */
    public static final int FCMOVE_ST0_STI;

    /**
     * FCMOVNBE_ST0_STI: Move if not below or equal (CF and ZF clear).
     */
    public static final int FCMOVNBE_ST0_STI;

    /**
     * FCMOVNB_ST0_STI: Move if not below (CF clear).
     */
    public static final int FCMOVNB_ST0_STI;

    /**
     * FCMOVNE_ST0_STI: Move if not equal (ZF clear).
     */
    public static final int FCMOVNE_ST0_STI;

    /**
     * FCMOVNU_ST0_STI: Move if not unordered (PF clear).
     */
    public static final int FCMOVNU_ST0_STI;

    /**
     * FCMOVU_ST0_STI: Move if unordered (PF set).
     */
    public static final int FCMOVU_ST0_STI;

    /**
     * FCOMI_ST0_STI: Compare ST(0) with ST(i) and set flags.
     */
    public static final int FCOMI_ST0_STI;

    /**
     * FCOMP_M64FP: Compare ST(0) with 64-bit float in memory and pop register stack.
     */
    public static final int FCOMP_M64FP;

    /**
     * FCOMP_ST0_STI: Compare ST(0) with ST(i) and pop register stack.
     */
    public static final int FCOMP_ST0_STI;

    /**
     * FCOMP_ST0_STI_DCD8: Duplicate encoding variant of FCOMP ST(i).
     */
    public static final int FCOMP_ST0_STI_DCD8;

    /**
     * FCOM_M64FP: Compare ST(0) with 64-bit float in memory.
     */
    public static final int FCOM_M64FP;

    /**
     * FCOM_ST0_STI: Compare ST(0) with ST(i).
     */
    public static final int FCOM_ST0_STI;

    /**
     * FCOM_ST0_STI_DCD0: Duplicate encoding variant of FCOM ST(i).
     */
    public static final int FCOM_ST0_STI_DCD0;

    /**
     * FCOS: Compute cosine of ST(0).
     */
    public static final int FCOS;

    /**
     * FDECSTP: Decrement the FPU register stack pointer.
     */
    public static final int FDECSTP;

    /**
     * FDISI: Disable FPU interrupts (obsolete).
     */
    public static final int FDISI;

    /**
     * FDIVR_M32FP: Divide ST(0) by 32-bit float in memory (reverse operands).
     */
    public static final int FDIVR_M32FP;

    /**
     * FDIVR_M64FP: Divide ST(0) by 64-bit float in memory (reverse operands).
     */
    public static final int FDIVR_M64FP;

    /**
     * FDIVR_ST0_STI: Divide ST(i) by ST(0).
     */
    public static final int FDIVR_ST0_STI;

    /**
     * FDIV_M64FP: Divide 64-bit float in memory by ST(0).
     */
    public static final int FDIV_M64FP;

    /**
     * FDIV_ST0_STI: Divide ST(0) by ST(i).
     */
    public static final int FDIV_ST0_STI;

    /**
     * FENI: Enable FPU interrupts (obsolete).
     */
    public static final int FENI;

    /**
     * FIADD_M32INT: Add 32-bit integer in memory to ST(0).
     */
    public static final int FIADD_M32INT;

    /**
     * FICOMP_M32INT: Compare 32-bit integer with ST(0) and pop.
     */
    public static final int FICOMP_M32INT;

    /**
     * FICOM_M32INT: Compare 32-bit integer with ST(0).
     */
    public static final int FICOM_M32INT;

    /**
     * FIDIVR_M32INT: Divide ST(0) by 32-bit integer in memory (reverse operands).
     */
    public static final int FIDIVR_M32INT;

    /**
     * FIDIV_M32INT: Divide 32-bit integer in memory by ST(0).
     */
    public static final int FIDIV_M32INT;

    /**
     * FILD_M32INT: Load 32-bit integer from memory into ST(0).
     */
    public static final int FILD_M32INT;

    /**
     * FIMUL_M32INT: Multiply ST(0) by 32-bit integer in memory.
     */
    public static final int FIMUL_M32INT;

    /**
     * FINCSTP: Increment the FPU register stack pointer.
     */
    public static final int FINCSTP;

    /**
     * FINIT: Initialize the FPU (reset control and status words).
     */
    public static final int FINIT;

    /**
     * FISTP_M32INT: Store ST(0) to 32-bit integer in memory and pop.
     */
    public static final int FISTP_M32INT;

    /**
     * FISTTP_M32INT: Store ST(0) to 32-bit integer in memory with truncation and pop.
     */
    public static final int FISTTP_M32INT;

    /**
     * FIST_M32INT: Store ST(0) to 32-bit integer in memory.
     */
    public static final int FIST_M32INT;

    /**
     * FISUBR_M32INT: Subtract ST(0) from 32-bit integer in memory.
     */
    public static final int FISUBR_M32INT;

    /**
     * FISUB_M32INT: Subtract 32-bit integer in memory from ST(0).
     */
    public static final int FISUB_M32INT;

    /**
     * FLD1: Load constant 1.0 into ST(0).
     */
    public static final int FLD1;

    /**
     * FLDCW_M2BYTE: Load x87 FPU control word from 2-byte memory location.
     */
    public static final int FLDCW_M2BYTE;

    /**
     * FLDENV_M14BYTE: Load x87 FPU environment from 14-byte memory region.
     */
    public static final int FLDENV_M14BYTE;

    /**
     * FLDENV_M28BYTE: Load x87 FPU environment from 28-byte memory region.
     */
    public static final int FLDENV_M28BYTE;

    /**
     * FLDL2E: Load constant log2(e) into ST(0).
     */
    public static final int FLDL2E;

    /**
     * FLDL2T: Load constant log2(10) into ST(0).
     */
    public static final int FLDL2T;

    /**
     * FLDLG2: Load constant log10(2) into ST(0).
     */
    public static final int FLDLG2;

    /**
     * FLDLN2: Load constant ln(2) into ST(0).
     */
    public static final int FLDLN2;

    /**
     * FLDPI: Load constant pi into ST(0).
     */
    public static final int FLDPI;

    /**
     * FLDZ: Load constant 0.0 into ST(0).
     */
    public static final int FLDZ;

    /**
     * FLD_M32FP: Load 32-bit floating-point value from memory into ST(0).
     */
    public static final int FLD_M32FP;

    /**
     * FLD_M80FP: Load 80-bit floating-point value from memory into ST(0).
     */
    public static final int FLD_M80FP;

    /**
     * FLD_STI: Push ST(i) onto the register stack.
     */
    public static final int FLD_STI;

    /**
     * FMUL_M64FP: Multiply ST(0) by 64-bit float in memory.
     */
    public static final int FMUL_M64FP;

    /**
     * FMUL_ST0_STI: Multiply ST(0) by ST(i).
     */
    public static final int FMUL_ST0_STI;

    /**
     * FMUL_STI_ST0: Multiply ST(i) by ST(0).
     */
    public static final int FMUL_STI_ST0;

    /**
     * FNCLEX: Clear exceptions without checking interrupt enable flag.
     */
    public static final int FNCLEX;

    /**
     * FNDISI: Disable interrupts (undocumented).
     */
    public static final int FNDISI;

    /**
     * FNENI: Enable interrupts (undocumented).
     */
    public static final int FNENI;

    /**
     * FNINIT: Initialize FPU without generating exceptions.
     */
    public static final int FNINIT;

    /**
     * FNOP: No operation (FPU).
     */
    public static final int FNOP;

    /**
     * FNSETPM: Set protected mode (undocumented).
     */
    public static final int FNSETPM;

    /**
     * FNSTCW_M2BYTE: Store control word to 2-byte memory.
     */
    public static final int FNSTCW_M2BYTE;

    /**
     * FNSTENV_M14BYTE: Store FPU environment to 14-byte memory.
     */
    public static final int FNSTENV_M14BYTE;

    /**
     * FNSTENV_M28BYTE: Store FPU environment to 28-byte memory.
     */
    public static final int FNSTENV_M28BYTE;

    /**
     * FPATAN: Replace ST(1) with arctangent of ST(1)/ST(0), pop stack.
     */
    public static final int FPATAN;

    /**
     * FPREM: Partial remainder (rounds toward zero).
     */
    public static final int FPREM;

    /**
     * FPREM1: Partial remainder (rounds to nearest).
     */
    public static final int FPREM1;

    /**
     * FPTAN: Replace ST(0) with tangent and push 1.0.
     */
    public static final int FPTAN;

    /**
     * FRNDINT: Round ST(0) to integer.
     */
    public static final int FRNDINT;

    /**
     * FRSTPM: Store x87 FPU state to memory and pop all registers (undocumented).
     */
    public static final int FRSTPM;

    /**
     * FSCALE: Scale ST(0) by ST(1).
     */
    public static final int FSCALE;

    /**
     * FSETPM: Set protected mode (obsolete).
     */
    public static final int FSETPM;

    /**
     * FSIN: Compute sine of ST(0).
     */
    public static final int FSIN;

    /**
     * FSINCOS: Compute sine and cosine of ST(0).
     */
    public static final int FSINCOS;

    /**
     * FSQRT: Compute square root of ST(0).
     */
    public static final int FSQRT;

    /**
     * FSTCW_M2BYTE: Store control word to 2-byte memory.
     */
    public static final int FSTCW_M2BYTE;

    /**
     * FSTENV_M14BYTE: Store FPU environment to 14-byte memory.
     */
    public static final int FSTENV_M14BYTE;

    /**
     * FSTENV_M28BYTE: Store FPU environment to 28-byte memory.
     */
    public static final int FSTENV_M28BYTE;

    /**
     * FSTPNCE_STI: Store ST(i) and pop register stack (noncanonical encoding).
     */
    public static final int FSTPNCE_STI;

    /**
     * FSTP_M32FP: Store ST(0) to 32-bit float in memory and pop.
     */
    public static final int FSTP_M32FP;

    /**
     * FSTP_M80FP: Store ST(0) to 80-bit float in memory and pop.
     */
    public static final int FSTP_M80FP;

    /**
     * FST_M32FP: Store ST(0) to 32-bit float in memory.
     */
    public static final int FST_M32FP;

    /**
     * FSUBR_M64FP: Subtract ST(0) from 64-bit float in memory.
     */
    public static final int FSUBR_M64FP;

    /**
     * FSUBR_ST0_STI: Subtract ST(0) from ST(i).
     */
    public static final int FSUBR_ST0_STI;

    /**
     * FSUB_M64FP: Subtract 64-bit float in memory from ST(0).
     */
    public static final int FSUB_M64FP;

    /**
     * FSUB_ST0_STI: Subtract ST(i) from ST(0).
     */
    public static final int FSUB_ST0_STI;

    /**
     * FTST: Compare ST(0) with 0.0 and set condition flags.
     */
    public static final int FTST;

    /**
     * FUCOMI_ST0_STI: Unordered compare ST(0) with ST(i) and set flags.
     */
    public static final int FUCOMI_ST0_STI;

    /**
     * FUCOMPP: Unordered compare ST(0) with ST(1) and pop twice.
     */
    public static final int FUCOMPP;

    /**
     * FXAM: Examine ST(0) and set condition flags.
     */
    public static final int FXAM;

    /**
     * FXCH_ST0_STI: Exchange ST(0) with ST(i).
     */
    public static final int FXCH_ST0_STI;

    /**
     * FXTRACT: Extract exponent and significand from ST(0).
     */
    public static final int FXTRACT;

    /**
     * FYL2X: Compute y * log2(x) with ST(1) = y and ST(0) = x.
     */
    public static final int FYL2X;

    /**
     * FYL2XP1: Compute y * log2(x + 1) with ST(1) = y and ST(0) = x.
     */
    public static final int FYL2XP1;

    /**
     * CALL_REL16: Call near, relative, displacement relative to the next instruction (16-bit).
     */
    public static final int CALL_REL16;

    /**
     * CALL_REL32_32: Call near, relative, displacement relative to the next instruction (32-bit in 32-bit mode).
     */
    public static final int CALL_REL32_32;

    /**
     * CALL_REL32_64: Call near, relative, displacement relative to the next instruction (32-bit in 64-bit mode).
     */
    public static final int CALL_REL32_64;

    /**
     * FADDP_STI_ST0: Add ST(0) to ST(i) and pop the FPU stack.
     */
    public static final int FADDP_STI_ST0;

    /**
     * FBLD_M80BCD: Load BCD value from memory into ST(0).
     */
    public static final int FBLD_M80BCD;

    /**
     * FBSTP_M80BCD: Store ST(0) into memory as BCD and pop the FPU stack.
     */
    public static final int FBSTP_M80BCD;

    /**
     * FCOMIP_ST0_STI: Compare ST(0) with ST(i) and set flags; then pop ST(0).
     */
    public static final int FCOMIP_ST0_STI;

    /**
     * FCOMPP: Compare ST(0) with ST(1), pop twice from the FPU stack.
     */
    public static final int FCOMPP;

    /**
     * FCOMP_ST0_STI_DED0: Compare ST(0) with ST(i) and pop ST(0).
     */
    public static final int FCOMP_ST0_STI_DED0;

    /**
     * FDIVP_STI_ST0: Divide ST(i) by ST(0), store result in ST(i), and pop ST(0).
     */
    public static final int FDIVP_STI_ST0;

    /**
     * FDIVRP_STI_ST0: Reverse divide ST(0) by ST(i), store in ST(i), and pop ST(0).
     */
    public static final int FDIVRP_STI_ST0;

    /**
     * FDIVR_STI_ST0: Reverse divide ST(0) by ST(i), store result in ST(0).
     */
    public static final int FDIVR_STI_ST0;

    /**
     * FDIV_STI_ST0: Divide ST(i) by ST(0), store result in ST(0).
     */
    public static final int FDIV_STI_ST0;

    /**
     * FFREEP_STI: Free ST(i) and mark it as empty, then pop the FPU stack.
     */
    public static final int FFREEP_STI;

    /**
     * FFREE_STI: Free ST(i) and mark it as empty.
     */
    public static final int FFREE_STI;

    /**
     * FIADD_M16INT: Add 16-bit integer in memory to ST(0).
     */
    public static final int FIADD_M16INT;

    /**
     * FICOMP_M16INT: Compare 16-bit integer in memory with ST(0), then pop ST(0).
     */
    public static final int FICOMP_M16INT;

    /**
     * FICOM_M16INT: Compare 16-bit integer in memory with ST(0).
     */
    public static final int FICOM_M16INT;

    /**
     * FIDIVR_M16INT: Reverse divide ST(0) by 16-bit integer in memory.
     */
    public static final int FIDIVR_M16INT;

    /**
     * FIDIV_M16INT: Divide ST(0) by 16-bit integer in memory.
     */
    public static final int FIDIV_M16INT;

    /**
     * FILD_M16INT: Load 16-bit integer from memory into ST(0).
     */
    public static final int FILD_M16INT;

    /**
     * FILD_M64INT: Load 64-bit integer from memory into ST(0).
     */
    public static final int FILD_M64INT;

    /**
     * FIMUL_M16INT: Multiply ST(0) by 16-bit integer from memory.
     */
    public static final int FIMUL_M16INT;

    /**
     * FISTP_M16INT: Store ST(0) into memory as 16-bit integer and pop ST(0).
     */
    public static final int FISTP_M16INT;

    /**
     * FISTP_M64INT: Store ST(0) into memory as 64-bit integer and pop ST(0).
     */
    public static final int FISTP_M64INT;

    /**
     * FISTTP_M16INT: Truncate and store ST(0) as 16-bit integer and pop ST(0).
     */
    public static final int FISTTP_M16INT;

    /**
     * FISTTP_M64INT: Truncate and store ST(0) as 64-bit integer and pop ST(0).
     */
    public static final int FISTTP_M64INT;

    /**
     * FIST_M16INT: Store ST(0) into memory as 16-bit integer.
     */
    public static final int FIST_M16INT;

    /**
     * FISUBR_M16INT: Reverse subtract 16-bit integer in memory from ST(0).
     */
    public static final int FISUBR_M16INT;

    /**
     * FISUB_M16INT: Subtract 16-bit integer in memory from ST(0).
     */
    public static final int FISUB_M16INT;

    /**
     * FLD_M64FP: Load 64-bit floating-point value from memory into ST(0).
     */
    public static final int FLD_M64FP;

    /**
     * FMULP_STI_ST0: Multiply ST(i) by ST(0), store result in ST(i), and pop ST(0).
     */
    public static final int FMULP_STI_ST0;

    /**
     * FNSAVE_M108BYTE: Save the FPU state into 108-byte memory location.
     */
    public static final int FNSAVE_M108BYTE;

    /**
     * FNSAVE_M94BYTE: Save the FPU state into 94-byte memory location.
     */
    public static final int FNSAVE_M94BYTE;

    /**
     * FNSTSW_AX: Store the FPU status word into the AX register.
     */
    public static final int FNSTSW_AX;

    /**
     * FNSTSW_M2BYTE: Store the FPU status word into a 2-byte memory location.
     */
    public static final int FNSTSW_M2BYTE;

    /**
     * FRSTOR_M108BYTE: Restore the FPU state from a 108-byte memory location.
     */
    public static final int FRSTOR_M108BYTE;

    /**
     * FRSTOR_M94BYTE: Restore the FPU state from a 94-byte memory location.
     */
    public static final int FRSTOR_M94BYTE;

    /**
     * FSAVE_M108BYTE: Save the FPU state into a 108-byte memory location and suspend FPU operation.
     */
    public static final int FSAVE_M108BYTE;

    /**
     * FSAVE_M94BYTE: Save the FPU state into a 94-byte memory location and suspend FPU operation.
     */
    public static final int FSAVE_M94BYTE;

    /**
     * FSTDW_AX: Store ST(0) as a double word into the AX register.
     */
    public static final int FSTDW_AX;

    /**
     * FSTP_M64FP: Store ST(0) as 64-bit floating-point value into memory and pop the FPU stack.
     */
    public static final int FSTP_M64FP;

    /**
     * FSTP_STI: Store ST(0) into ST(i) and pop ST(0).
     */
    public static final int FSTP_STI;

    /**
     * FSTP_STI_DFD0: Store ST(0) into ST(i) with a specific precision and pop ST(0).
     */
    public static final int FSTP_STI_DFD0;

    /**
     * FSTP_STI_DFD8: Store ST(0) into ST(i) with another specific precision and pop ST(0).
     */
    public static final int FSTP_STI_DFD8;

    /**
     * FSTSG_AX: Store the FPU status group from AX register.
     */
    public static final int FSTSG_AX;

    /**
     * FSTSW_AX: Store the FPU status word into AX register.
     */
    public static final int FSTSW_AX;

    /**
     * FSTSW_M2BYTE: Store the FPU status word into a 2-byte memory location.
     */
    public static final int FSTSW_M2BYTE;

    /**
     * FST_M64FP: Store ST(0) as a 64-bit floating-point value into memory.
     */
    public static final int FST_M64FP;

    /**
     * FST_STI: Store ST(0) into ST(i) without popping ST(0).
     */
    public static final int FST_STI;

    /**
     * FSUBP_STI_ST0: Subtract ST(0) from ST(i), store result in ST(i), and pop ST(0).
     */
    public static final int FSUBP_STI_ST0;

    /**
     * FSUBRP_STI_ST0: Reverse subtract ST(i) from ST(0), store result in ST(i), and pop ST(0).
     */
    public static final int FSUBRP_STI_ST0;

    /**
     * FSUBR_STI_ST0: Reverse subtract ST(i) from ST(0), store result in ST(0).
     */
    public static final int FSUBR_STI_ST0;

    /**
     * FSUB_STI_ST0: Subtract ST(i) from ST(0), store result in ST(0).
     */
    public static final int FSUB_STI_ST0;

    /**
     * FUCOMIP_ST0_STI: Compare ST(0) with ST(i) and set flags, then pop ST(0) (non-exceptional).
     */
    public static final int FUCOMIP_ST0_STI;

    /**
     * FUCOMP_ST0_STI: Compare ST(0) with ST(i) and set flags, then pop ST(0) (exceptional).
     */
    public static final int FUCOMP_ST0_STI;

    /**
     * FUCOM_ST0_STI: Compare ST(0) with ST(i) and set flags.
     */
    public static final int FUCOM_ST0_STI;

    /**
     * FXCH_ST0_STI_DDC8: Exchange ST(0) with ST(i) (using specific precision format).
     */
    public static final int FXCH_ST0_STI_DDC8;

    /**
     * FXCH_ST0_STI_DFC8: Exchange ST(0) with ST(i) (using different precision format).
     */
    public static final int FXCH_ST0_STI_DFC8;

    /**
     * IN_AL_IMM8: Input 8-bit data from the port specified by IMM8 into the AL register.
     */
    public static final int IN_AL_IMM8;

    /**
     * IN_AX_IMM8: Input 8-bit data from the port specified by IMM8 into the AX register.
     */
    public static final int IN_AX_IMM8;

    /**
     * IN_EAX_IMM8: Input 8-bit data from the port specified by IMM8 into the EAX register.
     */
    public static final int IN_EAX_IMM8;

    /**
     * JCXZ_REL8_16: Jump to the address specified by REL8 if CX register is zero (16-bit).
     */
    public static final int JCXZ_REL8_16;

    /**
     * JCXZ_REL8_32: Jump to the address specified by REL8 if CX register is zero (32-bit).
     */
    public static final int JCXZ_REL8_32;

    /**
     * JECXZ_REL8_16: Jump to the address specified by REL8 if ECX register is zero (16-bit).
     */
    public static final int JECXZ_REL8_16;

    /**
     * JECXZ_REL8_32: Jump to the address specified by REL8 if ECX register is zero (32-bit).
     */
    public static final int JECXZ_REL8_32;

    /**
     * JECXZ_REL8_64: Jump to the address specified by REL8 if ECX register is zero (64-bit).
     */
    public static final int JECXZ_REL8_64;

    /**
     * JMP_PTR1616: Jump to the address specified by a 16-bit pointer (16-bit mode).
     */
    public static final int JMP_PTR1616;

    /**
     * JMP_PTR1632: Jump to the address specified by a 16-bit pointer (32-bit mode).
     */
    public static final int JMP_PTR1632;

    /**
     * JMP_REL16: Jump to the address specified by the 16-bit relative offset.
     */
    public static final int JMP_REL16;

    /**
     * JMP_REL32_32: Jump to the address specified by the 32-bit relative offset (32-bit mode).
     */
    public static final int JMP_REL32_32;

    /**
     * JMP_REL32_64: Jump to the address specified by the 32-bit relative offset (64-bit mode).
     */
    public static final int JMP_REL32_64;

    /**
     * JMP_REL8_16: Jump to the address specified by the 8-bit relative offset (16-bit mode).
     */
    public static final int JMP_REL8_16;

    /**
     * JMP_REL8_32: Jump to the address specified by the 8-bit relative offset (32-bit mode).
     */
    public static final int JMP_REL8_32;

    /**
     * JRCXZ_REL8_16: Jump to the address specified by REL8 if RCX register is zero (16-bit mode).
     */
    public static final int JRCXZ_REL8_16;

    /**
     * JRCXZ_REL8_64: Jump to the address specified by REL8 if RCX register is zero (64-bit mode).
     */
    public static final int JRCXZ_REL8_64;

    /**
     * LOOPE_REL8_16_CX: Loop while the CX register is not zero, executing the jump specified by REL8 (16-bit mode).
     */
    public static final int LOOPE_REL8_16_CX;

    /**
     * LOOPE_REL8_16_ECX: Loop while the ECX register is not zero, executing the jump specified by REL8 (16-bit mode).
     */
    public static final int LOOPE_REL8_16_ECX;

    /**
     * LOOPE_REL8_16_RCX: Loop while the RCX register is not zero, executing the jump specified by REL8 (16-bit mode).
     */
    public static final int LOOPE_REL8_16_RCX;

    /**
     * LOOPE_REL8_32_CX: Loop while the CX register is not zero, executing the jump specified by REL8 (32-bit mode).
     */
    public static final int LOOPE_REL8_32_CX;

    /**
     * LOOPE_REL8_32_ECX: Loop while the ECX register is not zero, executing the jump specified by REL8 (32-bit mode).
     */
    public static final int LOOPE_REL8_32_ECX;

    /**
     * LOOPE_REL8_64_ECX: Loop while the ECX register is not zero, executing the jump specified by REL8 (64-bit mode).
     */
    public static final int LOOPE_REL8_64_ECX;

    /**
     * LOOPE_REL8_64_RCX: Loop while the RCX register is not zero, executing the jump specified by REL8 (64-bit mode).
     */
    public static final int LOOPE_REL8_64_RCX;

    /**
     * LOOPNE_REL8_16_CX: Loop while the CX register is not zero and ZF is clear, executing the jump specified by REL8 (16-bit mode).
     */
    public static final int LOOPNE_REL8_16_CX;

    /**
     * LOOPNE_REL8_16_ECX: Loop while the ECX register is not zero and ZF is clear, executing the jump specified by REL8 (16-bit mode).
     */
    public static final int LOOPNE_REL8_16_ECX;

    /**
     * LOOPNE_REL8_16_RCX: Loop while the RCX register is not zero and ZF is clear, executing the jump specified by REL8 (16-bit mode).
     */
    public static final int LOOPNE_REL8_16_RCX;

    /**
     * LOOPNE_REL8_32_CX: Loop while the CX register is not zero and ZF is clear, executing the jump specified by REL8 (32-bit mode).
     */
    public static final int LOOPNE_REL8_32_CX;

    /**
     * LOOPNE_REL8_32_ECX: Loop while the ECX register is not zero and ZF is clear, executing the jump specified by REL8 (32-bit mode).
     */
    public static final int LOOPNE_REL8_32_ECX;

    /**
     * LOOPNE_REL8_64_ECX: Loop while the ECX register is not zero and ZF is clear, executing the jump specified by REL8 (64-bit mode).
     */
    public static final int LOOPNE_REL8_64_ECX;

    /**
     * LOOPNE_REL8_64_RCX: Loop while the RCX register is not zero and ZF is clear, executing the jump specified by REL8 (64-bit mode).
     */
    public static final int LOOPNE_REL8_64_RCX;

    /**
     * LOOP_REL8_16_CX: Loop while the CX register is not zero, executing the jump specified by REL8 (16-bit mode).
     */
    public static final int LOOP_REL8_16_CX;

    /**
     * LOOP_REL8_16_ECX: Loop while the ECX register is not zero, executing the jump specified by REL8 (16-bit mode).
     */
    public static final int LOOP_REL8_16_ECX;

    /**
     * LOOP_REL8_16_RCX: Loop while the RCX register is not zero, executing the jump specified by REL8 (16-bit mode).
     */
    public static final int LOOP_REL8_16_RCX;

    /**
     * LOOP_REL8_32_CX: Loop while the CX register is not zero, executing the jump specified by REL8 (32-bit mode).
     */
    public static final int LOOP_REL8_32_CX;

    /**
     * LOOP_REL8_32_ECX: Loop while the ECX register is not zero, executing the jump specified by REL8 (32-bit mode).
     */
    public static final int LOOP_REL8_32_ECX;

    /**
     * LOOP_REL8_64_ECX: Loop while the ECX register is not zero, executing the jump specified by REL8 (64-bit mode).
     */
    public static final int LOOP_REL8_64_ECX;

    /**
     * LOOP_REL8_64_RCX: Loop while the RCX register is not zero, executing the jump specified by REL8 (64-bit mode).
     */
    public static final int LOOP_REL8_64_RCX;

    /**
     * OUT_IMM8_AL: Output the byte from the AL register to the I/O port specified by IMM8.
     */
    public static final int OUT_IMM8_AL;

    /**
     * OUT_IMM8_AX: Output the word from the AX register to the I/O port specified by IMM8.
     */
    public static final int OUT_IMM8_AX;

    /**
     * OUT_IMM8_EAX: Output the double word from the EAX register to the I/O port specified by IMM8.
     */
    public static final int OUT_IMM8_EAX;

    /**
     * CALL_M1616: Call a procedure specified by the 16-bit memory address.
     */
    public static final int CALL_M1616;

    /**
     * CALL_M1632: Call a procedure specified by the 32-bit memory address.
     */
    public static final int CALL_M1632;

    /**
     * CALL_M1664: Call a procedure specified by the 64-bit memory address.
     */
    public static final int CALL_M1664;

    /**
     * CALL_RM16: Call a procedure specified by the 16-bit register/memory address.
     */
    public static final int CALL_RM16;

    /**
     * CALL_RM32: Call a procedure specified by the 32-bit register/memory address.
     */
    public static final int CALL_RM32;

    /**
     * CALL_RM64: Call a procedure specified by the 64-bit register/memory address.
     */
    public static final int CALL_RM64;

    /**
     * CLC: Clear the carry flag.
     */
    public static final int CLC;

    /**
     * CLD: Clear the direction flag.
     */
    public static final int CLD;

    /**
     * CLI: Clear the interrupt flag.
     */
    public static final int CLI;

    /**
     * CMC: Complement the carry flag (invert its value).
     */
    public static final int CMC;

    /**
     * DEC_RM16: Decrement the value at the specified 16-bit memory/register address.
     */
    public static final int DEC_RM16;

    /**
     * DEC_RM32: Decrement the value at the specified 32-bit memory/register address.
     */
    public static final int DEC_RM32;

    /**
     * DEC_RM64: Decrement the value at the specified 64-bit memory/register address.
     */
    public static final int DEC_RM64;

    /**
     * DEC_RM8: Decrement the value at the specified 8-bit memory/register address.
     */
    public static final int DEC_RM8;

    /**
     * DIV_RM16: Divide the 16-bit accumulator by the specified 16-bit value.
     */
    public static final int DIV_RM16;

    /**
     * DIV_RM32: Divide the 32-bit accumulator by the specified 32-bit value.
     */
    public static final int DIV_RM32;

    /**
     * DIV_RM64: Divide the 64-bit accumulator by the specified 64-bit value.
     */
    public static final int DIV_RM64;

    /**
     * DIV_RM8: Divide the 8-bit accumulator by the specified 8-bit value.
     */
    public static final int DIV_RM8;

    /**
     * HLT: Halt the processor (used to stop execution).
     */
    public static final int HLT;

    /**
     * IDIV_RM16: Signed divide the 16-bit accumulator by the specified 16-bit value.
     */
    public static final int IDIV_RM16;

    /**
     * IDIV_RM32: Signed divide the 32-bit accumulator by the specified 32-bit value.
     */
    public static final int IDIV_RM32;

    /**
     * IDIV_RM64: Signed divide the 64-bit accumulator by the specified 64-bit value.
     */
    public static final int IDIV_RM64;

    /**
     * IDIV_RM8: Signed divide the 8-bit accumulator by the specified 8-bit value.
     */
    public static final int IDIV_RM8;

    /**
     * IMUL_RM16: Multiply the 16-bit accumulator by the specified 16-bit value.
     */
    public static final int IMUL_RM16;

    /**
     * IMUL_RM32: Multiply the 32-bit accumulator by the specified 32-bit value.
     */
    public static final int IMUL_RM32;

    /**
     * IMUL_RM64: Multiply the 64-bit accumulator by the specified 64-bit value.
     */
    public static final int IMUL_RM64;

    /**
     * IMUL_RM8: Multiply the 8-bit accumulator by the specified 8-bit value.
     */
    public static final int IMUL_RM8;

    /**
     * INC_RM16: Increment the value at the specified 16-bit memory/register address.
     */
    public static final int INC_RM16;

    /**
     * INC_RM32: Increment the value at the specified 32-bit memory/register address.
     */
    public static final int INC_RM32;

    /**
     * INC_RM64: Increment the value at the specified 64-bit memory/register address.
     */
    public static final int INC_RM64;

    /**
     * INC_RM8: Increment the value at the specified 8-bit memory/register address.
     */
    public static final int INC_RM8;

    /**
     * INT1: Generate a software interrupt 1 (often used for debugging).
     */
    public static final int INT1;

    /**
     * IN_AL_DX: Input a byte from the I/O port specified by DX into the AL register.
     */
    public static final int IN_AL_DX;

    /**
     * IN_AX_DX: Input a word from the I/O port specified by DX into the AX register.
     */
    public static final int IN_AX_DX;

    /**
     * IN_EAX_DX: Input a double word from the I/O port specified by DX into the EAX register.
     */
    public static final int IN_EAX_DX;

    /**
     * JMPE_RM16: Jump to the address specified by the 16-bit register/memory address, and set the code segment.
     */
    public static final int JMPE_RM16;

    /**
     * JMPE_RM32: Jump to the address specified by the 32-bit register/memory address, and set the code segment.
     */
    public static final int JMPE_RM32;

    /**
     * JMP_M1616: Jump to the address specified by the 16-bit memory address.
     */
    public static final int JMP_M1616;

    /**
     * JMP_M1632: Jump to the address specified by the 32-bit memory address.
     */
    public static final int JMP_M1632;

    /**
     * JMP_M1664: Jump to the address specified by the 64-bit memory address.
     */
    public static final int JMP_M1664;

    /**
     * JMP_REL8_64: Jump to the address specified by the 8-bit relative offset (64-bit mode).
     */
    public static final int JMP_REL8_64;

    /**
     * JMP_RM16: Jump to the address specified by the 16-bit register/memory address.
     */
    public static final int JMP_RM16;

    /**
     * JMP_RM32: Jump to the address specified by the 32-bit register/memory address.
     */
    public static final int JMP_RM32;

    /**
     * JMP_RM64: Jump to the address specified by the 64-bit register/memory address.
     */
    public static final int JMP_RM64;

    /**
     * LGDT_M1632: Load the Global Descriptor Table from the specified 32-bit memory address.
     */
    public static final int LGDT_M1632;

    /**
     * LGDT_M1632_16: Load the Global Descriptor Table from the specified 16-bit memory address.
     */
    public static final int LGDT_M1632_16;

    /**
     * LGDT_M1664: Load the Global Descriptor Table from the specified 64-bit memory address.
     */
    public static final int LGDT_M1664;

    /**
     * LLDT_R32M16: Load the Local Descriptor Table from the 32-bit register and 16-bit memory address.
     */
    public static final int LLDT_R32M16;

    /**
     * LLDT_R64M16: Load the Local Descriptor Table from the 64-bit register and 16-bit memory address.
     */
    public static final int LLDT_R64M16;

    /**
     * LLDT_RM16: Load the Local Descriptor Table from the specified 16-bit register/memory address.
     */
    public static final int LLDT_RM16;

    /**
     * LTR_R32M16: Load the Task Register from the 32-bit register and 16-bit memory address.
     */
    public static final int LTR_R32M16;

    /**
     * LTR_R64M16: Load the Task Register from the 64-bit register and 16-bit memory address.
     */
    public static final int LTR_R64M16;

    /**
     * LTR_RM16: Load the Task Register from the specified 16-bit register/memory address.
     */
    public static final int LTR_RM16;

    /**
     * MUL_RM16: Multiply the 16-bit accumulator by the specified 16-bit value.
     */
    public static final int MUL_RM16;

    /**
     * MUL_RM32: Multiply the 32-bit accumulator by the specified 32-bit value.
     */
    public static final int MUL_RM32;

    /**
     * MUL_RM64: Multiply the 64-bit accumulator by the specified 64-bit value.
     */
    public static final int MUL_RM64;

    /**
     * MUL_RM8: Multiply the 8-bit accumulator by the specified 8-bit value.
     */
    public static final int MUL_RM8;

    /**
     * NEG_RM16: Negate the value at the specified 16-bit memory/register address.
     */
    public static final int NEG_RM16;

    /**
     * NEG_RM32: Negate the value at the specified 32-bit memory/register address.
     */
    public static final int NEG_RM32;

    /**
     * NEG_RM64: Negate the value at the specified 64-bit memory/register address.
     */
    public static final int NEG_RM64;

    /**
     * NEG_RM8: Negate the value at the specified 8-bit memory/register address.
     */
    public static final int NEG_RM8;

    /**
     * NOT_RM16: Perform a bitwise NOT operation on the value at the specified 16-bit memory/register address.
     */
    public static final int NOT_RM16;

    /**
     * NOT_RM32: Perform a bitwise NOT operation on the value at the specified 32-bit memory/register address.
     */
    public static final int NOT_RM32;

    /**
     * NOT_RM64: Perform a bitwise NOT operation on the value at the specified 64-bit memory/register address.
     */
    public static final int NOT_RM64;

    /**
     * NOT_RM8: Perform a bitwise NOT operation on the value at the specified 8-bit memory/register address.
     */
    public static final int NOT_RM8;

    /**
     * OUT_DX_AL: Output the byte in the AL register to the I/O port specified by DX.
     */
    public static final int OUT_DX_AL;

    /**
     * OUT_DX_AX: Output the word in the AX register to the I/O port specified by DX.
     */
    public static final int OUT_DX_AX;

    /**
     * OUT_DX_EAX: Output the double word in the EAX register to the I/O port specified by DX.
     */
    public static final int OUT_DX_EAX;

    /**
     * PUSH_RM16: Push the value at the specified 16-bit memory/register address onto the stack.
     */
    public static final int PUSH_RM16;

    /**
     * PUSH_RM32: Push the value at the specified 32-bit memory/register address onto the stack.
     */
    public static final int PUSH_RM32;

    /**
     * PUSH_RM64: Push the value at the specified 64-bit memory/register address onto the stack.
     */
    public static final int PUSH_RM64;

    /**
     * SGDT_M1632: Store the Global Descriptor Table to the specified 32-bit memory address.
     */
    public static final int SGDT_M1632;

    /**
     * SGDT_M1632_16: Store the Global Descriptor Table to the specified 16-bit memory address.
     */
    public static final int SGDT_M1632_16;

    /**
     * SGDT_M1664: Store the Global Descriptor Table to the specified 64-bit memory address.
     */
    public static final int SGDT_M1664;

    /**
     * SIDT_M1632: Store the Interrupt Descriptor Table to the specified 32-bit memory address.
     */
    public static final int SIDT_M1632;

    /**
     * SIDT_M1632_16: Store the Interrupt Descriptor Table to the specified 16-bit memory address.
     */
    public static final int SIDT_M1632_16;

    /**
     * SIDT_M1664: Store the Interrupt Descriptor Table to the specified 64-bit memory address.
     */
    public static final int SIDT_M1664;

    /**
     * SLDT_R32M16: Store the Local Descriptor Table from the 32-bit register and 16-bit memory address.
     */
    public static final int SLDT_R32M16;

    /**
     * SLDT_R64M16: Store the Local Descriptor Table from the 64-bit register and 16-bit memory address.
     */
    public static final int SLDT_R64M16;

    /**
     * SLDT_RM16: Store the Local Descriptor Table from the specified 16-bit register/memory address.
     */
    public static final int SLDT_RM16;

    /**
     * STC: Set the carry flag.
     */
    public static final int STC;

    /**
     * STD: Set the direction flag.
     */
    public static final int STD;

    /**
     * STI: Set the interrupt flag.
     */
    public static final int STI;

    /**
     * STR_R32M16: Store the Task Register from the 32-bit register and 16-bit memory address.
     */
    public static final int STR_R32M16;

    /**
     * STR_R64M16: Store the Task Register from the 64-bit register and 16-bit memory address.
     */
    public static final int STR_R64M16;

    /**
     * STR_RM16: Store the Task Register from the specified 16-bit register/memory address.
     */
    public static final int STR_RM16;

    /**
     * TEST_RM16_IMM16: Test the 16-bit value at the specified memory/register address with the given immediate 16-bit value.
     */
    public static final int TEST_RM16_IMM16;

    /**
     * TEST_RM16_IMM16_F7R1: Test the 16-bit value at the specified memory/register address with the given immediate 16-bit value, special case for F7R1.
     */
    public static final int TEST_RM16_IMM16_F7R1;

    /**
     * TEST_RM32_IMM32: Test the 32-bit value at the specified memory/register address with the given immediate 32-bit value.
     */
    public static final int TEST_RM32_IMM32;

    /**
     * TEST_RM32_IMM32_F7R1: Test the 32-bit value at the specified memory/register address with the given immediate 32-bit value, special case for F7R1.
     */
    public static final int TEST_RM32_IMM32_F7R1;

    /**
     * TEST_RM64_IMM32: Test the 64-bit value at the specified memory/register address with the given immediate 32-bit value.
     */
    public static final int TEST_RM64_IMM32;

    /**
     * TEST_RM64_IMM32_F7R1: Test the 64-bit value at the specified memory/register address with the given immediate 32-bit value, special case for F7R1.
     */
    public static final int TEST_RM64_IMM32_F7R1;

    /**
     * TEST_RM8_IMM8: Test the 8-bit value at the specified memory/register address with the given immediate 8-bit value.
     */
    public static final int TEST_RM8_IMM8;

    /**
     * TEST_RM8_IMM8_F6R1: Test the 8-bit value at the specified memory/register address with the given immediate 8-bit value, special case for F6R1.
     */
    public static final int TEST_RM8_IMM8_F6R1;

    /**
     * VERR_R32M16: Verify the validity of the 32-bit value at the specified 16-bit register/memory address.
     */
    public static final int VERR_R32M16;

    /**
     * VERR_R64M16: Verify the validity of the 64-bit value at the specified 16-bit register/memory address.
     */
    public static final int VERR_R64M16;

    /**
     * VERR_RM16: Verify the validity of the value at the specified 16-bit register/memory address.
     */
    public static final int VERR_RM16;

    /**
     * VERW_R32M16: Verify the write validity of the 32-bit value at the specified 16-bit register/memory address.
     */
    public static final int VERW_R32M16;

    /**
     * VERW_R64M16: Verify the write validity of the 64-bit value at the specified 16-bit register/memory address.
     */
    public static final int VERW_R64M16;

    /**
     * VERW_RM16: Verify the write validity of the value at the specified 16-bit register/memory address.
     */
    public static final int VERW_RM16;

    //FIXME: THIS NEEDS TO BE REORGANIZED BADLY. In 1.0.3
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
        JMPE_RM16  = i++;
        JMPE_RM32 =  i++;
        JMP_M1616 = i++;
        JMP_M1632 = i++;
        JMP_M1664 = i++;
        JMP_REL8_64 = i++;
        JMP_RM16 = i++;
        JMP_RM32 = i++;
        JMP_RM64 = i++;

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
        F2XM1 = i++;
        FABS = i++;
        FADD_M64FP = i++;
        FADD_ST0_STI = i++;
        FADD_STI_ST0 = i++;
        FCHS = i++;
        FCLEX = i++;
        FCMOVBE_ST0_STI = i++;
        FCMOVB_ST0_STI = i++;
        FCMOVE_ST0_STI = i++;
        FCMOVNBE_ST0_STI = i++;
        FCMOVNB_ST0_STI = i++;
        FCMOVNE_ST0_STI = i++;
        FCMOVNU_ST0_STI = i++;
        FCMOVU_ST0_STI = i++;
        FCOMI_ST0_STI = i++;
        FCOMP_M64FP = i++;
        FCOMP_ST0_STI = i++;
        FCOMP_ST0_STI_DCD8 = i++;
        FCOM_M64FP = i++;
        FCOM_ST0_STI = i++;
        FCOM_ST0_STI_DCD0 = i++;
        FCOS = i++;
        FDECSTP = i++;
        FDISI = i++;
        FDIVR_M32FP = i++;
        FDIVR_M64FP = i++;
        FDIVR_ST0_STI = i++;
        FDIV_M64FP = i++;
        FDIV_ST0_STI = i++;
        FENI = i++;
        FIADD_M32INT = i++;
        FICOMP_M32INT = i++;
        FICOM_M32INT = i++;
        FIDIVR_M32INT = i++;
        FIDIV_M32INT = i++;
        FILD_M32INT = i++;
        FIMUL_M32INT = i++;
        FINCSTP = i++;
        FINIT = i++;
        FISTP_M32INT = i++;
        FISTTP_M32INT = i++;
        FIST_M32INT = i++;
        FISUBR_M32INT = i++;
        FISUB_M32INT = i++;
        FLD1 = i++;
        FLDCW_M2BYTE = i++;
        FLDENV_M14BYTE = i++;
        FLDENV_M28BYTE = i++;
        FLDL2E = i++;
        FLDL2T = i++;
        FLDLG2 = i++;
        FLDLN2 = i++;
        FLDPI = i++;
        FLDZ = i++;
        FLD_M32FP = i++;
        FLD_M80FP = i++;
        FLD_STI = i++;
        FMUL_M64FP = i++;
        FMUL_ST0_STI = i++;
        FMUL_STI_ST0 = i++;
        FNCLEX = i++;
        FNDISI = i++;
        FNENI = i++;
        FNINIT = i++;
        FNOP = i++;
        FNSETPM = i++;
        FNSTCW_M2BYTE = i++;
        FNSTENV_M14BYTE = i++;
        FNSTENV_M28BYTE = i++;
        FPATAN = i++;
        FPREM = i++;
        FPREM1 = i++;
        FPTAN = i++;
        FRNDINT = i++;
        FRSTPM = i++;
        FSCALE = i++;
        FSETPM = i++;
        FSIN = i++;
        FSINCOS = i++;
        FSQRT = i++;
        FSTCW_M2BYTE = i++;
        FSTENV_M14BYTE = i++;
        FSTENV_M28BYTE = i++;
        FSTPNCE_STI = i++;
        FSTP_M32FP = i++;
        FSTP_M80FP = i++;
        FST_M32FP = i++;
        FSUBR_M64FP = i++;
        FSUBR_ST0_STI = i++;
        FSUB_M64FP = i++;
        FSUB_ST0_STI = i++;
        FTST = i++;
        FUCOMI_ST0_STI = i++;
        FUCOMPP = i++;
        FXAM = i++;
        FXCH_ST0_STI = i++;
        FXTRACT = i++;
        FYL2X = i++;
        FYL2XP1 = i++;
        FADDP_STI_ST0 = i++;
        FBLD_M80BCD = i++;
        FBSTP_M80BCD = i++;
        FCOMIP_ST0_STI = i++;
        FCOMPP = i++;
        FCOMP_ST0_STI_DED0 = i++;
        FDIVP_STI_ST0 = i++;
        FDIVRP_STI_ST0 = i++;
        FDIVR_STI_ST0 = i++;
        FDIV_STI_ST0 = i++;
        FFREEP_STI = i++;
        FFREE_STI = i++;
        FIADD_M16INT = i++;
        FICOMP_M16INT = i++;
        FICOM_M16INT = i++;
        FIDIVR_M16INT = i++;
        FIDIV_M16INT = i++;
        FILD_M16INT = i++;
        FILD_M64INT = i++;
        FIMUL_M16INT = i++;
        FISTP_M16INT = i++;
        FISTP_M64INT = i++;
        FISTTP_M16INT = i++;
        FISTTP_M64INT = i++;
        FIST_M16INT = i++;
        FISUBR_M16INT = i++;
        FISUB_M16INT = i++;
        FLD_M64FP = i++;
        FMULP_STI_ST0 = i++;
        FNSAVE_M108BYTE = i++;
        FNSAVE_M94BYTE = i++;
        FNSTSW_AX = i++;
        FNSTSW_M2BYTE = i++;
        FRSTOR_M108BYTE = i++;
        FRSTOR_M94BYTE = i++;
        FSAVE_M108BYTE = i++;
        FSAVE_M94BYTE = i++;
        FSTDW_AX = i++;
        FSTP_M64FP = i++;
        FSTP_STI = i++;
        FSTP_STI_DFD0 = i++;
        FSTP_STI_DFD8 = i++;
        FSTSG_AX = i++;
        FSTSW_AX = i++;
        FSTSW_M2BYTE = i++;
        FST_M64FP = i++;
        FST_STI = i++;
        FSUBP_STI_ST0 = i++;
        FSUBRP_STI_ST0 = i++;
        FSUBR_STI_ST0 = i++;
        FSUB_STI_ST0 = i++;
        FUCOMIP_ST0_STI = i++;
        FUCOMP_ST0_STI = i++;
        FUCOM_ST0_STI = i++;
        FXCH_ST0_STI_DDC8 = i++;
        FXCH_ST0_STI_DFC8 = i++;

        // CALL and control instructions
        CALL_REL16 = i++;
        CALL_REL32_32 = i++;
        CALL_REL32_64 = i++;
        CALL_M1616 = i++;
        CALL_M1632 = i++;
        CALL_M1664 = i++;
        CALL_RM16 = i++;
        CALL_RM32 = i++;
        CALL_RM64 = i++;
        CLC = i++;
        CLD = i++;
        CLI = i++;
        CMC = i++;
        INT1 = i++;
        STC  = i++;
        STD  = i++;
        STI  = i++;

        // I/O operations continued
        IN_AL_IMM8 = i++;
        IN_AX_IMM8 = i++;
        IN_EAX_IMM8 = i++;
        IN_AL_DX   = i++;
        IN_AX_DX   = i++;
        IN_EAX_DX  = i++;
        INSB_M8_DX = i++;
        INSW_M16_DX = i++;
        INSD_M32_DX = i++;
        OUT_IMM8_AL = i++;
        OUT_IMM8_AX = i++;
        OUT_IMM8_EAX = i++;
        OUT_DX_AL  = i++;
        OUT_DX_AX  = i++;
        OUT_DX_EAX = i++;
        OUTSB_DX_M8 = i++;
        OUTSW_DX_M16 = i++;
        OUTSD_DX_M32 = i++;

        // Jump instructions
        JCXZ_REL8_16 = i++;
        JCXZ_REL8_32 = i++;
        JECXZ_REL8_16 = i++;
        JECXZ_REL8_32 = i++;
        JECXZ_REL8_64 = i++;
        JMP_PTR1616 = i++;
        JMP_PTR1632 = i++;
        JMP_REL16 = i++;
        JMP_REL32_32 = i++;
        JMP_REL32_64 = i++;
        JMP_REL8_16 = i++;
        JMP_REL8_32 = i++;
        JRCXZ_REL8_16 = i++;
        JRCXZ_REL8_64 = i++;
        LOOPE_REL8_16_CX = i++;
        LOOPE_REL8_16_ECX = i++;
        LOOPE_REL8_16_RCX = i++;
        LOOPE_REL8_32_CX = i++;
        LOOPE_REL8_32_ECX = i++;
        LOOPE_REL8_64_ECX = i++;
        LOOPE_REL8_64_RCX = i++;
        LOOPNE_REL8_16_CX = i++;
        LOOPNE_REL8_16_ECX = i++;
        LOOPNE_REL8_16_RCX = i++;
        LOOPNE_REL8_32_CX = i++;
        LOOPNE_REL8_32_ECX = i++;
        LOOPNE_REL8_64_ECX = i++;
        LOOPNE_REL8_64_RCX = i++;
        LOOP_REL8_16_CX = i++;
        LOOP_REL8_16_ECX = i++;
        LOOP_REL8_16_RCX = i++;
        LOOP_REL8_32_CX = i++;
        LOOP_REL8_32_ECX = i++;
        LOOP_REL8_64_ECX = i++;
        LOOP_REL8_64_RCX = i++;

        // Call and Control Operations

        // Arithmetic Operations
        DEC_RM16 = i++;
        DEC_RM32 = i++;
        DEC_RM64 = i++;
        DEC_RM8 = i++;
        DIV_RM16 = i++;
        DIV_RM32 = i++;
        DIV_RM64 = i++;
        DIV_RM8 = i++;
        IDIV_RM16 = i++;
        IDIV_RM32 = i++;
        IDIV_RM64 = i++;
        IDIV_RM8  = i++;
        IMUL_RM16 = i++;
        IMUL_RM32 = i++;
        IMUL_RM64 = i++;
        IMUL_RM8  = i++;
        INC_RM16  = i++;
        INC_RM32  = i++;
        INC_RM64  = i++;
        INC_RM8   = i++;
        MUL_RM16  = i++;
        MUL_RM32  = i++;
        MUL_RM64  = i++;
        MUL_RM8   = i++;
        NEG_RM16  = i++;
        NEG_RM32  = i++;
        NEG_RM64  = i++;
        NEG_RM8   = i++;
        NOT_RM16  = i++;
        NOT_RM32  = i++;
        NOT_RM64  = i++;
        NOT_RM8   = i++;

        // Halt
        HLT = i++;

        // === Segment Descriptor Table Operations ===
        LGDT_M1632     = i++;
        LGDT_M1632_16  = i++;
        LGDT_M1664     = i++;
        SGDT_M1632     = i++;
        SGDT_M1632_16  = i++;
        SGDT_M1664     = i++;
        SIDT_M1632     = i++;
        SIDT_M1632_16  = i++;
        SIDT_M1664     = i++;

        // === Segment Register Load/Store Operations ===
        LLDT_R32M16 = i++;
        LLDT_R64M16 = i++;
        LLDT_RM16   = i++;
        LTR_R32M16  = i++;
        LTR_R64M16  = i++;
        LTR_RM16    = i++;
        SLDT_R32M16 = i++;
        SLDT_R64M16 = i++;
        SLDT_RM16   = i++;
        STR_R32M16  = i++;
        STR_R64M16  = i++;
        STR_RM16    = i++;

        // === TEST Instructions ===
        TEST_RM16_IMM16         = i++;
        TEST_RM16_IMM16_F7R1    = i++;
        TEST_RM32_IMM32         = i++;
        TEST_RM32_IMM32_F7R1    = i++;
        TEST_RM64_IMM32         = i++;
        TEST_RM64_IMM32_F7R1    = i++;
        TEST_RM8_IMM8           = i++;
        TEST_RM8_IMM8_F6R1      = i++;

        // === Verification Instructions ===
        VERR_R32M16 = i++;
        VERR_R64M16 = i++;
        VERR_RM16   = i++;
        VERW_R32M16 = i++;
        VERW_R64M16 = i++;
        VERW_RM16   = i++;

        // Stack operations
        PUSH_RM16 = i++;
        PUSH_RM32 = i++;
        PUSH_RM64 = i++;
    }
}