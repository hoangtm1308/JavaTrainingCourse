public class LeapYearCalculator {
    public static boolean isLeapYear (int year) {
        boolean isLeapYear = true;
        if (year <=1 || year >9999) {
            return isLeapYear = false;
        } else {
            int checkLeapYear = year % 4;
            if (checkLeapYear != 0) {
                return isLeapYear = false;
            } else {
                checkLeapYear = year % 100;
                if (checkLeapYear != 0) {
                    return isLeapYear = true;
                } else {
                    checkLeapYear = year % 400;
                    if (checkLeapYear != 0) {
                        return isLeapYear = false;
                    } else {
                        return isLeapYear = true;
                    }
                }
            }
        }
    }
}
