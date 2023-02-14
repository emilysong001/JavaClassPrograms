package com.java.class21;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        // 3. Write a program to check given number is palindrome or not
        //Example1
        //Input - 1221
        //Output - Palindrome
        //Example2
        //Input - 122321
        //Output - Not Palindrome
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = sc.nextInt();
        int rev = 0;
        for (int i = num; i > 0; i = i / 10) {
            rev = rev * 10 + i % 10;
        }
        if (rev == num) {
            System.out.println("This is Palindrome");
        } else {
            System.out.println("This is not Palindrome");
        }
    }
}
