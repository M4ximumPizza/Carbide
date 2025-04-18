package mi.m4x.carbide.natives;

/**
 * Enum representing the system architecture.
 *
 * Currently, supports detection of 64-bit x86 architecture (X86_64) and
 * defaults to UNSUPPORTED for any unrecognized values.
 *
 * @since 1.0.0
 * @author M4ximumpizza
 */
public enum Architecture {
    /**
     * Represents 64-bit x86 architectures, commonly known as AMD64 or x86_64.
     */
    X86_64,

    /**
     * Represents any architecture not recognized or explicitly unsupported.
     */
    UNSUPPORTED;

    /**
     * Detects and returns the current system architecture.
     *
     * This method reads the system property "os.arch", normalizes it,
     * and matches it against known architecture identifiers.
     *
     * @since 1.0.0
     * @author M4ximumpizza
     * @return the detected Architecture, or UNSUPPORTED if unrecognized
     */
    public static Architecture get() {
        String arch = System.getProperty("os.arch");
        if (arch == null) return UNSUPPORTED;

        String norm = normalizeArch(arch);

        // Match normalized architecture strings to known identifiers
        return switch (norm) {
            case "x8664", "amd64", "ia32e", "em64t", "x64" -> X86_64;
            default -> UNSUPPORTED;
        };
    }

    /**
     * Normalizes the architecture string by:
     * - Converting all characters to lowercase
     * - Removing all non-alphanumeric characters
     *
     * This ensures consistent matching across various platform quirks
     * (e.g., "x86_64", "AMD64", or "x64" all normalize correctly).
     *
     * @since 1.0.0
     * @author M4ximumpizza
     * @param arch the original architecture string from system property
     * @return a lowercase, alphanumeric-only version of the architecture string
     */
    private static String normalizeArch(String arch) {
        StringBuilder sb = new StringBuilder(arch.length());
        for (int i = 0; i < arch.length(); i++) {
            char c = Character.toLowerCase(arch.charAt(i));
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
