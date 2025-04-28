package mi.m4x.rive.registers;

import mi.m4x.carbide.interfaces.Beta;

/**
 * Represents a functional interface that retrieves the value of a register, which is used when calculating
 * the virtual address of a memory operand.
 * <p>
 * This interface is designed to be implemented by classes that need to fetch the value of various types of registers,
 * including general-purpose registers, vector registers, and segment registers. The implementation must handle
 * special cases, such as segment registers, where the base address of the segment should be returned instead of
 * the register value itself. If the register value cannot be read, the method should return {@code null}.
 * </p>
 */
@Beta
@FunctionalInterface
public interface VirtualAddressGetRegisterValue {
    /**
     * Retrieves the value of the specified register. If the register is a segment register, this method should return
     * the base address of the segment rather than the register value itself. If the value of the register cannot
     * be determined, the method should return {@code null}.
     * <p>
     * This method also handles vector register operands (VSIB), where additional parameters (element index and element size)
     * are used to specify which element within the vector should be accessed.
     * </p>
     *
     * @param register     The register whose value is to be retrieved. This can be one of the following:
     *                     <ul>
     *                         <li>General Purpose Registers (GPR8, GPR16, GPR32, GPR64)</li>
     *                         <li>Vector Registers (XMM, YMM, ZMM)</li>
     *                         <li>Segment Registers (seg)</li>
     *                     </ul>
     *                     Represented by a value from the {@link Register} enum.
     * @param elementIndex The index of the element within a vector index register, used only when dealing with
     *                     VSIB (Vector Scalable Indexed Base) memory operands. This parameter identifies which element
     *                     of the vector register is being accessed.
     * @param elementSize  The size, in bytes, of each element in the vector register, used only when dealing with VSIB
     *                     memory operands. This will be either 4 or 8 bytes, depending on the type of vector register.
     *
     * @return The value of the register if it was successfully read, or {@code null} if the register's value could not
     *         be determined (for example, if the register is unavailable or cannot be accessed).
     */
    Long get(int register, int elementIndex, int elementSize);
}
