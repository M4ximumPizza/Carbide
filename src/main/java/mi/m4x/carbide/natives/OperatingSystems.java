package mi.m4x.carbide.natives;

/**
 * Represents a simplified categorization of the host operating system.
 * <p>
 * This enum provides a platform-agnostic mechanism to detect the OS using
 * {@code System.getProperty("os.name")}, normalizing and parsing common
 * variants into generalized types.
 * </p>
 *
 * <p>Supported operating systems:</p>
 * <ul>
 *   <li>{@link #LINUX}</li>
 *   <li>{@link #OSX} (macOS / Darwin)</li>
 *   <li>{@link #WINDOWS}</li>
 *   <li>{@link #UNSUPPORTED} (fallback category)</li>
 * </ul>
 *
 * @author M4ximumpizza
 * @since 1.0.0
 */
public enum OperatingSystems {
    /** Any Linux-based OS (Ubuntu, Arch, etc.) */
    LINUX,

    /** macOS and Darwin-based systems */
    OSX,

    /** Microsoft Windows OS family */
    WINDOWS,

    /** Unrecognized or unsupported operating system */
    UNSUPPORTED;

    /**
     * Detects and returns the host operating system as an {@link OperatingSystems} enum constant.
     * The detection is case- and formatting-insensitive and supports common variants.
     *
     * @return the detected {@code OperatingSystems} value; defaults to {@code UNSUPPORTED} if unrecognized.
     */
    public static OperatingSystems detect() {
        String osName = System.getProperty("os.name");
        if (osName == null || osName.isEmpty()) return UNSUPPORTED;

        String normalized = normalize(osName);

        if (startsWith(normalized, "linux")) return LINUX;
        if (startsWith(normalized, "macosx") || startsWith(normalized, "osx") || startsWith(normalized, "darwin")) return OSX;
        if (startsWith(normalized, "windows")) return WINDOWS;

        return UNSUPPORTED;
    }

    /**
     * Normalizes an OS name by converting it to lowercase and removing all non-alphanumeric characters.
     * This ensures consistent comparison across OS name variants.
     *
     * @param name the original OS name
     * @return a normalized version suitable for comparison
     */
    private static String normalize(String name) {
        StringBuilder result = new StringBuilder(name.length());
        for (int i = 0; i < name.length(); i++) {
            char c = Character.toLowerCase(name.charAt(i));
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    /**
     * Checks whether the given string starts with the specified prefix.
     * Avoids using {@code String.startsWith()} to reduce allocations in restricted environments.
     *
     * @param text the string to test
     * @param prefix the expected prefix
     * @return {@code true} if {@code text} starts with {@code prefix}, {@code false} otherwise
     */
    private static boolean startsWith(String text, String prefix) {
        if (text.length() < prefix.length()) return false;
        for (int i = 0; i < prefix.length(); i++) {
            if (text.charAt(i) != prefix.charAt(i)) return false;
        }
        return true;
    }
}
