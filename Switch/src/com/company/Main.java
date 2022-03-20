package com.company;

public class Main {

    public static void main(String[] args) {
        DayOfTheWeekChallenge dayOfTheWeekChallenge = new DayOfTheWeekChallenge();
        DayOfTheWeekChallenge.printDayOfTheWeek(-1);
        NumberInWord printNumberInWord = new NumberInWord();
        NumberInWord.printNumberInWord(12);
        NumberOfDaysInMonth numberOfDaysInMonth = new NumberOfDaysInMonth();
        System.out.println(NumberOfDaysInMonth.isLeapYear(2017));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020));
        CheckPrimeNumber checkPrimeNumber = new CheckPrimeNumber();
        SumOdd sumOdd = new SumOdd();
        DigitSumChallenge sumDigits = new DigitSumChallenge();
        int n = 40;
        int b = 5;
        int c = 15;
        if (!CheckPrimeNumber.isPrime(n)) {
            System.out.println("Number " + n + " is not prime number");
        } else {
            System.out.println("Number " + n + " is prime number");
        }
        CheckPrimeNumber.countPrime(b, c);
        CheckPrimeNumber.sumDivisible35();
        System.out.println(SumOdd.isOdd(2));
        System.out.println(SumOdd.sumOdd(13, 13));
        System.out.println(DigitSumChallenge.sumDigits(125));
        System.out.println(DigitSumChallenge.isPalindrome(-322));
        System.out.println(DigitSumChallenge.sumFirstAndLastDigit(10));
        System.out.println(DigitSumChallenge.getEvenDigitSum(0));

    }
}