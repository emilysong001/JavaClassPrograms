package com.java.class21;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        //1. Write a program to count the number of vowels from the String (Ignoring Case)
        //Example
        //Input - Welcome to Java Class
        //Output - Num of vowels=7
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the word or sentence: ");
        String str = sc.nextLine();
        if (!str.isEmpty()) {
            int vowel = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.toLowerCase().charAt(i) == 'a' || str.toLowerCase().charAt(i) == 'e' ||
                        str.toLowerCase().charAt(i) == 'i' || str.toLowerCase().charAt(i) == 'o' ||
                        str.toLowerCase().charAt(i) == 'u') {
                    vowel++;
                }
            }
            System.out.println("Num of vowels = " + vowel);
        } else {
            System.out.println("Please try again.");
        }
    }
}
