package com.java.class18;

import java.util.Locale;
import java.util.Scanner;

public class DoWhileLoop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;

        System.out.println("Please enter the number");
        int num = sc.nextInt();
        do {
            num = num * num;
            System.out.println(num);
            System.out.println("Would you like to continue printing square?(Yes / No)");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("yes"));
    }
}