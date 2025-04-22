package x86;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RegisterLexerTest {
    private static final List<String> REGISTERS = Stream.of(
            // 8-bit
            "AL","CL","DL","BL","AH","CH","DH","BH","SPL","BPL","SIL","DIL","R8B","R9B","R10B","R11B","R12B","R13B","R14B","R15B",
            // 16-bit
            "AX","CX","DX","BX","SP","BP","SI","DI","R8W","R9W","R10W","R11W","R12W","R13W","R14W","R15W",
            // 32-bit
            "EAX","ECX","EDX","EBX","ESP","EBP","ESI","EDI","R8D","R9D","R10D","R11D","R12D","R13D","R14D","R15D",
            // 64-bit
            "RAX","RCX","RDX","RBX","RSP","RBP","RSI","RDI","R8","R9","R10","R11","R12","R13","R14","R15",
            // IPs
            "EIP","RIP",
            // Segment
            "ES","CS","SS","DS","FS","GS",
            // FPU
            "ST0","ST1","ST2","ST3","ST4","ST5","ST6","ST7",
            // Control
            "CR0","CR1","CR2","CR3","CR4","CR5","CR6","CR7","CR8","CR9","CR10","CR11","CR12","CR13","CR14","CR15",
            // Debug
            "DR0","DR1","DR2","DR3","DR4","DR5","DR6","DR7","DR8","DR9","DR10","DR11","DR12","DR13","DR14","DR15",
            // Test
            "TR0","TR1","TR2","TR3","TR4","TR5","TR6","TR7",
            // Bound
            "BND0","BND1","BND2","BND3",
            // AVX-512 mask
            "K0","K1","K2","K3","K4","K5","K6","K7",
            // MMX
            "MM0","MM1","MM2","MM3","MM4","MM5","MM6","MM7",
            // XMM
            "XMM0","XMM1","XMM2","XMM3","XMM4","XMM5","XMM6","XMM7","XMM8","XMM9","XMM10","XMM11","XMM12","XMM13","XMM14","XMM15",
            "XMM16","XMM17","XMM18","XMM19","XMM20","XMM21","XMM22","XMM23","XMM24","XMM25","XMM26","XMM27","XMM28","XMM29","XMM30","XMM31",
            // YMM
            "YMM0","YMM1","YMM2","YMM3","YMM4","YMM5","YMM6","YMM7","YMM8","YMM9","YMM10","YMM11","YMM12","YMM13","YMM14","YMM15",
            "YMM16","YMM17","YMM18","YMM19","YMM20","YMM21","YMM22","YMM23","YMM24","YMM25","YMM26","YMM27","YMM28","YMM29","YMM30","YMM31",
            // ZMM
            "ZMM0","ZMM1","ZMM2","ZMM3","ZMM4","ZMM5","ZMM6","ZMM7","ZMM8","ZMM9","ZMM10","ZMM11","ZMM12","ZMM13","ZMM14","ZMM15",
            "ZMM16","ZMM17","ZMM18","ZMM19","ZMM20","ZMM21","ZMM22","ZMM23","ZMM24","ZMM25","ZMM26","ZMM27","ZMM28","ZMM29","ZMM30","ZMM31",
            // TMM
            "TMM0","TMM1","TMM2","TMM3","TMM4","TMM5","TMM6","TMM7"
    ).collect(Collectors.toList());

    public static void main(String[] args) throws IOException {
        String content = Files.readString(Path.of("rive/src/test/java/x86/asm/Test.asm"));
        String regex = "\\b(" + String.join("|", REGISTERS) + ")\\b";
        Matcher matcher = Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(content);

        System.out.println("Registers found in the ASM file:");
        while (matcher.find()) {
            System.out.println(matcher.group().toUpperCase());
        }
    }
}
