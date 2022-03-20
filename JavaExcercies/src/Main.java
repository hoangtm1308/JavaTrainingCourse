public class Main {
    public static void main(String[] args) {
        SpeedConverter speedConverter = new SpeedConverter();
        MegabytesConverter megabytesConverter = new MegabytesConverter();
        LeapYearCalculator leapYearCalculator = new LeapYearCalculator();
        SpeedConverter.printConversion(12);
        MegabytesConverter.printMegabytesAndKilobytes(1024);
        System.out.println(LeapYearCalculator.isLeapYear(2000));
    }
}
