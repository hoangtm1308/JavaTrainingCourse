package com.company;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear (int year) {
        if (year < 1 || year > 9999) {
            System.out.println("INVALID VALUE \n");
            return false;
        } else {
            int checkLeapYear = year % 4;
            if (checkLeapYear != 0) {
                return false;
            } else {
                checkLeapYear = year % 100;
                if (checkLeapYear != 0) {
                    return true;
                } else {
                    checkLeapYear = year % 400;
                    if (checkLeapYear != 0) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }
    public static int getDaysInMonth (int month, int year) {
        if (year < 1 || year > 9999) {
            return -1;
        }
        int dayOfMonth;
        if (isLeapYear(year)) {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    dayOfMonth = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    dayOfMonth = 30;
                    break;
                case 2:
                    dayOfMonth = 29;
                    break;
                default:
                    return -1;
            }
        } else {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    dayOfMonth = 31;
                    break;
                case 4: case 6: case 9: case 11:
                    dayOfMonth = 30;
                    break;
                case 2:
                    dayOfMonth = 28;
                    break;
                default:
                    return -1;
            }
        }
        return dayOfMonth;
    }
}
