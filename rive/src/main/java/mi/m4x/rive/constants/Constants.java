package mi.m4x.rive.constants;

import mi.m4x.carbide.interfaces.Beta;
import mi.m4x.rive.MemorySize;

/**
 * Constants class for the Carbide architecture.
 *
 * @author M4ximumpizza
 * @since 1.0.1
 */
@Beta
public class Constants {
    public static final int REGISTER_ENUM_COUNTS = 256;
    /**
     * @since 1.0.2
     */
    public static final int MEMORY_SIZE_ENUM_COUNTS = 162;
    /**
     * @since 1.0.2
     */
    public static final int FIRST_BROADCAST_MEMORY_SIZE = MemorySize.BROADCAST32_FLOAT16;
}
