package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Tinh Tuoi  co dieu kien
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Your Year Of Birth");
//        boolean hasNextInt = scanner.hasNextInt();
//        if (hasNextInt) {
//            int year = scanner.nextInt();
//            scanner.nextLine();
//            System.out.println("Enter Your Name:");
//            String name = scanner.nextLine();
//            int age = 2022 - year;
//            if (age >= 0 && age <= 100) {
//                System.out.println("Your Name Is: " + name);
//                System.out.println("Your Age is: " + age);
//            } else {
//                System.out.println("Invalid Year of Birth");
//            }
//        } else {
//            System.out.println("Unable to parse year of birth.");
//        }
        //Cong tong cac so nhap vao may tinh
//        Scanner scanner = new Scanner(System.in);
//        int counter = 0;
//        int sum = 0;
//        while (counter < 5) {
//            int order = counter + 1;
//            System.out.println("Enter number # " + order + ":");
//            boolean hasNextInt = scanner.hasNextInt();
//            if (hasNextInt) {
//                int number = scanner.nextInt();
//                counter++;
//                sum += number;
//                if (counter == 5) {
//                    break;
//                }
//            } else {
//                System.out.println("Invalid Number");
//            }
//            scanner.nextLine();
//        }
//        System.out.println("Summary of all number:" + sum);
//        scanner.close();
        //Tim so Min va Max trong cac so vua nhap vao
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int min = 0;
        boolean flag = true; // Co the dung gia tri gioi han của bien integer thi ko can dung flag
        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            System.out.println("Enter the Number");
            if (hasNextInt) {
                int number = scanner.nextInt();
                if (flag) {
                    flag = false;
                    min = number;
                    max = number;
                }
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            } else {
                break;

            }
            scanner.nextLine();
        }
        System.out.println("Min = " + min + "Max = " + max);
        scanner.close();
    }
    public static void  inputThenPrintSumAndAverage() {
        int sum = 0;
        int average = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            boolean hasInt = scanner.hasNextInt();
            if (hasInt) {

            } else {
                break;
            }
        }
        scanner.close();
    }
}
