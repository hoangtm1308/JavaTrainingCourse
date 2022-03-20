public class MinutesToYearsAndDaysCalculator {
    public static void main(String[] args) {
    printYearsAndDays(1440);
    }
    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        long year = minutes / 525600;
        long remainMinutes = minutes % 525600;
        long day = remainMinutes / 1440;
        System.out.println(minutes + " min = " + year + " y and " + day + " d");
    }
}
