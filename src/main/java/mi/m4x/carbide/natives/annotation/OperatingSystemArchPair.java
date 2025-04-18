package mi.m4x.carbide.natives.annotation;

import mi.m4x.carbide.natives.Architecture;
import mi.m4x.carbide.natives.OperatingSystems;

/**
 * Annotation to specify a pair of operating system and architecture.
 */
public @interface OperatingSystemArchPair {
    /**
     * @return the operating system of the system
     */
    OperatingSystems os();

    /**
     * @return the architecture of the system
     */
    Architecture arch();
}
