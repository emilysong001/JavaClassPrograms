package com.java.class20;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = sc.nextInt();
        sum();
        sum2();
        sum3(num);
        greatestDigit(num);
        reverse(num);
    }

    //1. Write a program to find sum of 1^1 + 2^2 + 3^3 + 4^4 + 5^5
    public static void sum() {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += Math.pow(i, i);
        }
        System.out.println("Task1 - Sum of 1^1 + 2^2 + 3^3 + 4^4 + 5^5: "+sum);
    }

    //2. Write a program to find sum of 1/2 + 2/3 + 3/4 + 4/5 +......10/11
    //Note - Please print the sum in decimal, answer should not be zero
    public static void sum2() {
        double sum = 0;
        for (double i = 1; i <= 10; i++) {
            sum += i / (i + 1);
        }
        System.out.println("Task2 - Sum of 1/2 + 2/3 + 3/4 + 4/5 +......10/11: "+sum);
    }

    // 3. Write a program to print the sum of each digit from the given number
    //Example1
    //Input - 3521
    //Output - 11
    public static void sum3(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("Task3 - The sum of each digit from the given number: "+sum);
    }
    // 4.  Write a program to print the greatest digit from the given number
    //Example1
    //Input - 86545
    //Output - Greatest digit is 8
    public static void greatestDigit(int num) {
        int greatestDigit = 0;
        while (num > 0) {
            if (num % 10 > greatestDigit)
                greatestDigit = num % 10;
            num = num / 10;
        }
        System.out.println("Task4 - The greatest digit from the given number: "+greatestDigit);
    }
    //5.  Write a program to print the reverse of the given number
    //Example1
    //Input - 86545
    //Output - 54568
    public static void reverse(int num) {
        int reverse = 0;
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Task5 - The reverse of the given number: "+reverse);
    }
}
