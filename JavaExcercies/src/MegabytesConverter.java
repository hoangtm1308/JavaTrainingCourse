public class MegabytesConverter {
    public static void main(String[] args) {
        printMegabytesAndKilobytes(5000);
    }
    public static void printMegabytesAndKilobytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaByte = kiloBytes / 1024;
            int remainKilobyte = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaByte + " MB and " + remainKilobyte + " KB");
        }
    }
}
