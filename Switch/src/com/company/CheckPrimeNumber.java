package com.company;

public class CheckPrimeNumber {
    public static boolean isPrime(int n) {
        //Kiem tra so nhap vao co phai so nguyen to
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int countPrime (int a, int b) {
        int count = 0;
        for (int i = a; i < b; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is prime number");
            }
        }
        System.out.println("There are " + count + " prime number from " + a + " to " + b);
        return count;
    }
    public static void sumDivisible35 () {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;
                System.out.println("Number " + i + " divisible to 3 & 5");
            }
            if (count == 7) {
                System.out.println("Total of 5 Number divisible to 3 & 5 is " + sum);
                break;
            }
        }
    }
}
