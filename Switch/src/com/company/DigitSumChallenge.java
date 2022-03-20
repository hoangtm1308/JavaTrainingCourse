package com.company;

public class DigitSumChallenge {
    public static int sumDigits (int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
    public static boolean isPalindrome (int number) {
        if (number == 0) {
            return false;
        }
        int reverse = 0;
        int a = number;
            while (number != 0) {
                int lastDigit = number % 10;
                number /= 10;
                reverse += lastDigit;
                reverse *= 10;
            }
        return  ((reverse/10) == a);
    }
    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        int firstDigit = 0;
        if (number >= 10) {
            while (number >= 10) {
                number /= 10;
                firstDigit = number;
            }
        } else {
            firstDigit = number;
            lastDigit = number;
        }
        return lastDigit + firstDigit;
    }
    public static int getEvenDigitSum (int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if ((digit % 2) == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}
