package com.java.class23;

import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args) {
        String[] arr = new String[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 Strings: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.next();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The length of " + arr[i] + " is " + arr[i].length());
        }

    }
}
