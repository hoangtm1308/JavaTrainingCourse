package com.company;

public class SumOdd {
    public static boolean isOdd (int number) {
        if (number < 0 ) {
            return false;
        } else {
            return number % 2 != 0;
        }
    }
    public static int sumOdd(int start, int end) {
        if (start > 0 && end > 0 && end >= start) {
            int sum = 0;
            int count = 0;
            for ( int i = start; i <= end; i++ ) {
                if (isOdd(i)) {
                    System.out.println(i + " is Odd");
                    sum += i;
                    count ++;
                }
            }
            if (count == 0) {
                System.out.println("There is no Odd");
            }
            return sum;
        } else {
            return -1;
        }
    }
}
