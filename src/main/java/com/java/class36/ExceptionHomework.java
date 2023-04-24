package com.java.class36;

import java.util.Scanner;

public class ExceptionHomework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter 2 numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        String str = null;
        int a[] = {10, 11, 12, 13, 14};
        try {
            int div = num1 / num2;
        } catch (ArithmeticException e) {
            System.out.println("Please enter a non zero number 2.");
        }
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("This is a null String.");
        }
        try {
            System.out.println(a[5]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Please try again.");
        }

    }
}
