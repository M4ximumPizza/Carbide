package mi.m4x.carbide.natives;

/**
 * Enum representing a simplified set of operating systems.
 *
 * This enum provides a utility method to detect and categorize the host
 * operating system using the standard {@code os.name} system property.
 *
 * Supported OS categories:
 * - {@link #LINUX}
 * - {@link #OSX} (MacOS)
 * - {@link #WINDOWS}
 * - {@link #UNSUPPORTED} (fallback for unknown systems)
 *
 * Detection is normalized and tolerant of common system naming variations
 * such as "Darwin" for Mac or different flavors of Linux.
 *
 * @author M4ximumpizza
 * @since 1.0.0
 */
public enum OperatingSystems {
    /** Represents any Linux-based OS. */
    LINUX,
    /** Represents macOS (also includes Darwin-based systems). */
    OSX,
    /** Represents Microsoft Windows operating systems. */
    WINDOWS,
    /** Represents an unrecognized or unsupported operating system. */
    UNSUPPORTED;

    /**
     * Detects the host operating system and returns the corresponding enum constant.
     *
     * Uses {@code System.getProperty("os.name")} to determine the platform.
     * The value is normalized to lowercase alphanumeric characters before matching.
     *
     * @return the detected {@code OperatingSystems} value, or {@code UNSUPPORTED} if unknown.
     */
    public static OperatingSystems get() {
        String os = System.getProperty("os.name");
        if (os == null) return UNSUPPORTED;

        String normalized = normalizeOs(os);

        // Match against known OS name prefixes
        if (startsWith(normalized, "linux")) return LINUX;
        if (startsWith(normalized, "macosx") || startsWith(normalized, "osx") || startsWith(normalized, "darwin")) return OSX;
        if (startsWith(normalized, "windows")) return WINDOWS;

        return UNSUPPORTED;
    }

    /**
     * Normalizes an OS name string by converting it to lowercase and removing all
     * non-alphanumeric characters.
     *
     * This ensures consistent and predictable comparisons across platforms and vendors.
     *
     * @param os the original {@code os.name} string
     * @return a normalized, lowercase alphanumeric version of the input
     */
    private static String normalizeOs(String os) {
        StringBuilder sb = new StringBuilder(os.length());
        for (int i = 0; i < os.length(); i++) {
            char c = Character.toLowerCase(os.charAt(i));
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * Checks whether a string starts with a given prefix.
     *
     * Equivalent to {@code String.startsWith()} but implemented manually
     * to avoid allocation and improve portability across restricted environments.
     *
     * @param s the full string
     * @param prefix the prefix to check
     * @return true if {@code s} starts with {@code prefix}, false otherwise
     */
    private static boolean startsWith(String s, String prefix) {
        int len = prefix.length();
        if (s.length() < len) return false;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != prefix.charAt(i)) return false;
        }
        return true;
    }
}
