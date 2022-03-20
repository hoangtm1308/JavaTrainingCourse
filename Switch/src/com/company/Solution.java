package com.company;

import java.util.Scanner;

public class Solution {
//    private static final Scanner scanner = new Scanner(System.in);
//    public static void main(String[] args) {
//        int N = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        scanner.close();
//        int a = N % 2;
//        if (a != 0) {
//            System.out.println("Weird");
//        } else if (N >= 2 && N <= 5) {
//            System.out.println("Not Weird");
//        } else if (N >= 6 && N <= 20) {
//            System.out.println("Weird");
//        } else {
//            System.out.println("Not Weird");
//        }
//    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine();
      //  System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
}
