package mi.m4x.rive;

import mi.m4x.rive.constants.Constants;

/**
 * The {@code MemorySizeInformation} class holds details about the memory size,
 * element size, element type, and other properties related to memory configurations.
 * This class is designed to handle and store information about different memory sizes
 * used in a system, including their signed status, element types, and whether the size
 * supports broadcasting.
 *
 * @author M4ximumpizza
 * @since 1.0.2
 */
public class MemorySizeInformation {

    private final int size;
    private final int elementSize;
    private final int memorySize;
    private final int elementType;
    private final boolean isSigned;
    private final boolean isBroadcast;

    /**
     * Creates an array of {@code MemorySizeInformation} objects, each representing
     * a distinct memory configuration.
     *
     * @return an array of {@code MemorySizeInformation} objects.
     */
    private static MemorySizeInformation[] createMemorySizeInformations() {
        byte[] data = {
                // Raw byte data representing memory configurations.
                // Format: {elementType, low byte of value, high byte of value}
                (byte)0x00, (byte)0x00, (byte)0x00,
                (byte)0x01, (byte)0x21, (byte)0x00,
                (byte)0x02, (byte)0x42, (byte)0x00,
                (byte)0x03, (byte)0x63, (byte)0x00,
                (byte)0x04, (byte)0xA5, (byte)0x00,
                (byte)0x05, (byte)0xA5, (byte)0x00,
                (byte)0x06, (byte)0x08, (byte)0x01,
                (byte)0x07, (byte)0x4A, (byte)0x01,
                (byte)0x08, (byte)0x8C, (byte)0x01,
                (byte)0x09, (byte)0x21, (byte)0x80,
                (byte)0x0A, (byte)0x42, (byte)0x80,
                (byte)0x0B, (byte)0x63, (byte)0x80,
                (byte)0x0C, (byte)0xA5, (byte)0x80,
                (byte)0x0D, (byte)0x08, (byte)0x81,
                (byte)0x0E, (byte)0x4A, (byte)0x81,
                (byte)0x0F, (byte)0x8C, (byte)0x81,
                (byte)0x10, (byte)0x63, (byte)0x00,
                (byte)0x11, (byte)0x84, (byte)0x00,
                (byte)0x12, (byte)0xC6, (byte)0x00,
                (byte)0x13, (byte)0x42, (byte)0x00,
                (byte)0x14, (byte)0x63, (byte)0x00,
                (byte)0x15, (byte)0xA5, (byte)0x00,
                (byte)0x02, (byte)0x43, (byte)0x00,
                (byte)0x03, (byte)0x65, (byte)0x00,
                (byte)0x18, (byte)0xA5, (byte)0x00,
                (byte)0x19, (byte)0x08, (byte)0x01,
                (byte)0x1A, (byte)0x84, (byte)0x00,
                (byte)0x1B, (byte)0xC6, (byte)0x00,
                (byte)0x1C, (byte)0x42, (byte)0x80,
                (byte)0x1D, (byte)0x63, (byte)0x80,
                (byte)0x1E, (byte)0xA5, (byte)0x80,
                (byte)0x1F, (byte)0xC6, (byte)0x80,
                (byte)0x20, (byte)0x08, (byte)0x81,
                (byte)0x21, (byte)0x42, (byte)0x80,
                (byte)0x22, (byte)0xE7, (byte)0x00,
                (byte)0x23, (byte)0x29, (byte)0x01,
                (byte)0x24, (byte)0xAD, (byte)0x01,
                (byte)0x25, (byte)0xCE, (byte)0x01,
                (byte)0x26, (byte)0xEF, (byte)0x01,
                (byte)0x27, (byte)0xEF, (byte)0x01,
                (byte)0x28, (byte)0x00, (byte)0x00,
                (byte)0x29, (byte)0x00, (byte)0x00,
                (byte)0x2A, (byte)0xC6, (byte)0x80,
                (byte)0x2B, (byte)0x8C, (byte)0x01,
                (byte)0x2C, (byte)0x00, (byte)0x00,
                (byte)0x2D, (byte)0xC6, (byte)0x00,
                (byte)0x2E, (byte)0x6B, (byte)0x01,
                (byte)0x2F, (byte)0x8C, (byte)0x01,
                (byte)0x01, (byte)0x22, (byte)0x00,
                (byte)0x09, (byte)0x22, (byte)0x80,
                (byte)0x01, (byte)0x23, (byte)0x00,
                (byte)0x09, (byte)0x23, (byte)0x80,
                (byte)0x02, (byte)0x43, (byte)0x00,
                (byte)0x0A, (byte)0x43, (byte)0x80,
                (byte)0x1C, (byte)0x43, (byte)0x80,
                (byte)0x21, (byte)0x43, (byte)0x80,
                (byte)0x01, (byte)0x25, (byte)0x00,
                (byte)0x09, (byte)0x25, (byte)0x80,
                (byte)0x02, (byte)0x45, (byte)0x00,
                (byte)0x0A, (byte)0x45, (byte)0x80,
                (byte)0x03, (byte)0x65, (byte)0x00,
                (byte)0x0B, (byte)0x65, (byte)0x80,
                (byte)0x1C, (byte)0x45, (byte)0x80,
                (byte)0x1D, (byte)0x65, (byte)0x80,
                (byte)0x01, (byte)0x28, (byte)0x00,
                (byte)0x09, (byte)0x28, (byte)0x80,
                (byte)0x02, (byte)0x48, (byte)0x00,
                (byte)0x0A, (byte)0x48, (byte)0x80,
                (byte)0x03, (byte)0x68, (byte)0x00,
                (byte)0x0B, (byte)0x68, (byte)0x80,
                (byte)0x04, (byte)0xA8, (byte)0x00,
                (byte)0x05, (byte)0xA8, (byte)0x00,
                (byte)0x0C, (byte)0xA8, (byte)0x80,
                (byte)0x1C, (byte)0x48, (byte)0x80,
                (byte)0x1D, (byte)0x68, (byte)0x80,
                (byte)0x1E, (byte)0xA8, (byte)0x80,
                (byte)0x21, (byte)0x48, (byte)0x80,
                (byte)0x36, (byte)0x68, (byte)0x80,
                (byte)0x37, (byte)0x68, (byte)0x80,
                (byte)0x01, (byte)0x2A, (byte)0x00,
                (byte)0x09, (byte)0x2A, (byte)0x80,
                (byte)0x02, (byte)0x4A, (byte)0x00,
                (byte)0x0A, (byte)0x4A, (byte)0x80,
                (byte)0x03, (byte)0x6A, (byte)0x00,
                (byte)0x0B, (byte)0x6A, (byte)0x80,
                (byte)0x04, (byte)0xAA, (byte)0x00,
                (byte)0x05, (byte)0xAA, (byte)0x00,
                (byte)0x0C, (byte)0xAA, (byte)0x80,
                (byte)0x06, (byte)0x0A, (byte)0x01,
                (byte)0x0D, (byte)0x0A, (byte)0x81,
                (byte)0x1C, (byte)0x4A, (byte)0x80,
                (byte)0x1D, (byte)0x6A, (byte)0x80,
                (byte)0x1E, (byte)0xAA, (byte)0x80,
                (byte)0x20, (byte)0x0A, (byte)0x81,
                (byte)0x21, (byte)0x4A, (byte)0x80,
                (byte)0x36, (byte)0x6A, (byte)0x80,
                (byte)0x37, (byte)0x6A, (byte)0x80,
                (byte)0x01, (byte)0x2C, (byte)0x00,
                (byte)0x09, (byte)0x2C, (byte)0x80,
                (byte)0x02, (byte)0x4C, (byte)0x00,
                (byte)0x0A, (byte)0x4C, (byte)0x80,
                (byte)0x03, (byte)0x6C, (byte)0x00,
                (byte)0x0B, (byte)0x6C, (byte)0x80,
                (byte)0x04, (byte)0xAC, (byte)0x00,
                (byte)0x05, (byte)0xAC, (byte)0x00,
                (byte)0x0C, (byte)0xAC, (byte)0x80,
                (byte)0x06, (byte)0x0C, (byte)0x01,
                (byte)0x1C, (byte)0x4C, (byte)0x80,
                (byte)0x1D, (byte)0x6C, (byte)0x80,
                (byte)0x1E, (byte)0xAC, (byte)0x80,
                (byte)0x36, (byte)0x6C, (byte)0x80,
                (byte)0x37, (byte)0x6C, (byte)0x80,
                (byte)0x1C, (byte)0x42, (byte)0x80,
                (byte)0x03, (byte)0x63, (byte)0x00,
                (byte)0x0B, (byte)0x63, (byte)0x80,
                (byte)0x1C, (byte)0x42, (byte)0x80,
                (byte)0x1D, (byte)0x63, (byte)0x80,
                (byte)0x0A, (byte)0x42, (byte)0x00,
                (byte)0x02, (byte)0x42, (byte)0x00,
                (byte)0x03, (byte)0x63, (byte)0x00,
                (byte)0x0B, (byte)0x63, (byte)0x80,
                (byte)0x04, (byte)0xA5, (byte)0x00,
                (byte)0x05, (byte)0xA5, (byte)0x00,
                (byte)0x0C, (byte)0xA5, (byte)0x80,
                (byte)0x1C, (byte)0x42, (byte)0x80,
                (byte)0x1D, (byte)0x63, (byte)0x80,
                (byte)0x1E, (byte)0xA5, (byte)0x80,
                (byte)0x35, (byte)0x63, (byte)0x80,
                (byte)0x3D, (byte)0xA5, (byte)0x80,
                (byte)0x3C, (byte)0xA5, (byte)0x00,
                (byte)0x36, (byte)0x63, (byte)0x80,
                (byte)0x37, (byte)0x63, (byte)0x80,
                (byte)0x0A, (byte)0x42, (byte)0x00,
                (byte)0x02, (byte)0x42, (byte)0x00,
                (byte)0x03, (byte)0x63, (byte)0x00,
                (byte)0x0B, (byte)0x63, (byte)0x80,
                (byte)0x04, (byte)0xA5, (byte)0x00,
                (byte)0x05, (byte)0xA5, (byte)0x00,
                (byte)0x0C, (byte)0xA5, (byte)0x80,
                (byte)0x1C, (byte)0x42, (byte)0x80,
                (byte)0x1D, (byte)0x63, (byte)0x80,
                (byte)0x1E, (byte)0xA5, (byte)0x80,
                (byte)0x35, (byte)0x63, (byte)0x80,
                (byte)0x3D, (byte)0xA5, (byte)0x80,
                (byte)0x3C, (byte)0xA5, (byte)0x00,
                (byte)0x36, (byte)0x63, (byte)0x80,
                (byte)0x37, (byte)0x63, (byte)0x80,
                (byte)0x0A, (byte)0x42, (byte)0x00,
                (byte)0x02, (byte)0x42, (byte)0x00,
                (byte)0x03, (byte)0x63, (byte)0x00,
                (byte)0x0B, (byte)0x63, (byte)0x80,
                (byte)0x04, (byte)0xA5, (byte)0x00,
                (byte)0x05, (byte)0xA5, (byte)0x00,
                (byte)0x0C, (byte)0xA5, (byte)0x80,
                (byte)0x1C, (byte)0x42, (byte)0x80,
                (byte)0x1D, (byte)0x63, (byte)0x80,
                (byte)0x1E, (byte)0xA5, (byte)0x80,
                (byte)0x36, (byte)0x63, (byte)0x80,
                (byte)0x35, (byte)0x63, (byte)0x80,
                (byte)0x3C, (byte)0xA5, (byte)0x00,
                (byte)0x3D, (byte)0xA5, (byte)0x80,
                (byte)0x37, (byte)0x63, (byte)0x80,
        };

        // Constants for decoding the memory configuration values.
        final short IS_SIGNED = -32768;  // 0x8000 in signed short format
        final int SIZE_MASK = 31;
        final int SIZE_SHIFT = 0;
        final int ELEMENT_SIZE_SHIFT = 5;

        // Predefined size values for different configurations.
        short[] sizes = {0, 1, 2, 4, 6, 8, 10, 14, 16, 16, 28, 32, 64, 108, 512};

        // Create an array to store the memory size information.
        MemorySizeInformation[] informations = new MemorySizeInformation[Constants.MEMORY_SIZE_ENUM_COUNTS];

        // Iterate through the raw data to populate the memory information.
        for (int i = 0, j = 0; i < informations.length; i++, j += 3) {
            int elementType = data[j];
            int value = ((data[j + 2] & 0xFF) << 8) | (data[j + 1] & 0xFF);
            int size = sizes[(value >>> SIZE_SHIFT) & SIZE_MASK];
            int elementSize = sizes[(value >>> ELEMENT_SIZE_SHIFT) & 31];
            boolean isSigned = (value & IS_SIGNED) != 0;
            boolean isBroadcast = i >= Constants.FIRST_BROADCAST_MEMORY_SIZE;

            // Create a new MemorySizeInformation object with the decoded values.
            informations[i] = new MemorySizeInformation(i, size, elementSize, elementType, isSigned, isBroadcast);
        }

        return informations;
    }

    /**
     * Retrieves the total memory size for this configuration.
     *
     * @return the memory size.
     */
    public int getMemorySize() {
        return memorySize;
    }

    /**
     * Retrieves the size of each individual element in the memory configuration.
     *
     * @return the element size.
     */
    public int getElementSize() {
        return elementSize;
    }

    /**
     * Retrieves the overall size of the memory configuration.
     *
     * @return the size.
     */
    public int getSize() {
        return size;
    }

    /**
     * Retrieves the element type associated with this memory configuration.
     *
     * @return the element type.
     */
    public int getElementType() {
        return elementType;
    }

    /**
     * Determines whether the memory configuration is signed.
     *
     * @return true if the configuration is signed; false otherwise.
     */
    public boolean isSigned() {
        return isSigned;
    }

    /**
     * Determines whether this memory configuration supports broadcasting.
     *
     * @return true if broadcasting is supported; false otherwise.
     */
    public boolean isBroadcast() {
        return isBroadcast;
    }

    /**
     * Calculates the number of elements in the memory configuration.
     * The number of elements is computed by dividing the size by the element size.
     *
     * @return the number of elements.
     */
    public int getElementCount() {
        return (elementSize == size) ? 1 : size / elementSize;
    }

    /**
     * Constructor for creating a new memory size information object.
     *
     * @param size the total size of the memory.
     * @param elementSize the size of each individual element.
     * @param memorySize the overall memory size.
     * @param elementType the type of the element.
     * @param isSigned whether the memory is signed.
     * @param isBroadcast whether the memory supports broadcasting.
     */
    private MemorySizeInformation(int size, int elementSize, int memorySize, int elementType, boolean isSigned, boolean isBroadcast) {
        this.size = size;
        this.elementSize = elementSize;
        this.memorySize = memorySize;
        this.elementType = elementType;
        this.isSigned = isSigned;
        this.isBroadcast = isBroadcast;
    }
}
