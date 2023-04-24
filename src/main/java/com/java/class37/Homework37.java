package com.java.class37;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the number of days in a given month:");
        int month = sc.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 days");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        } else if (month == 2) {
            System.out.println("28/29 days");
        } else {
            throw new InputMismatchException("Invalid input");
        }
    }
}
