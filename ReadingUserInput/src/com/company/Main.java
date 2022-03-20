package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Year Of Birth");
        int year = scanner.nextInt();
        System.out.println("Enter Your Name:");
        String name = scanner.nextLine();
        int age = 2022 - year;
        System.out.println("Your Name Is: " + name);
        System.out.println("Your Age is: " + age);
        scanner.close();
    }
}
