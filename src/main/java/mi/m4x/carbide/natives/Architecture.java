package mi.m4x.carbide.natives;

/**
 * Represents the system CPU architecture.
 * <p>
 * Detects the current runtime architecture using {@code System.getProperty("os.arch")},
 * normalizes it, and maps it to supported values.
 * </p>
 *
 * <p>Supported architectures:</p>
 * <ul>
 *   <li>{@link #X86_64} — 64-bit x86 (e.g., AMD64, x86_64)</li>
 *   <li>{@link #ARM} — ARM 32/64-bit (e.g., arm, arm64, aarch64)</li>
 *   <li>{@link #RISC_V} — RISC-V (e.g., riscv, riscv64)</li>
 *   <li>{@link #UNSUPPORTED} — Any unrecognized or unsupported architecture</li>
 * </ul>
 *
 * @since 1.0.0
 * @author M4ximumpizza
 */
public enum Architecture {
    /** Represents 64-bit x86 architectures such as AMD64 and x86_64. */
    X86_64,

    /** Represents ARM and ARM64 architectures. */
    ARM,

    /** Represents RISC-V architectures. */
    RISC_V,

    /** Represents an unsupported or unrecognized architecture. */
    UNSUPPORTED;

    /**
     * Detects the architecture of the running system.
     * <p>
     * Normalizes the {@code os.arch} system property to remove formatting variations,
     * then maps the result to a supported enum value.
     * </p>
     *
     * @return the detected {@link Architecture}, or {@link #UNSUPPORTED} if unknown
     */
    public static Architecture detect() {
        String arch = System.getProperty("os.arch");
        if (arch == null || arch.isEmpty()) return UNSUPPORTED;

        String normalized = normalize(arch);

        return switch (normalized) {
            case "x8664", "amd64", "ia32e", "em64t", "x64" -> X86_64;
            case "arm", "armv7", "armv8", "arm64", "aarch64" -> ARM;
            case "riscv", "riscv64", "rv64" -> RISC_V;
            default -> UNSUPPORTED;
        };
    }

    /**
     * Normalizes an architecture string by converting it to lowercase and
     * removing all non-alphanumeric characters.
     *
     * @param arch the raw {@code os.arch} string
     * @return a normalized, lowercase, alphanumeric-only architecture identifier
     */
    private static String normalize(String arch) {
        StringBuilder result = new StringBuilder(arch.length());
        for (int i = 0; i < arch.length(); i++) {
            char c = Character.toLowerCase(arch.charAt(i));
            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
