package com.java.class19;

public class Homework {
    public static void main(String[] args) {
        System.out.println("Task 1 - The sum of even numbers: " + sumOfEven());
        System.out.println("Task 2 - The number of divisors of the given number: " + divisors(12));
        magic();
        System.out.println("Task 4 - Print sum of 1 + 2 - 3 + 4 + 5 - 6 + 7 + 8 - 9 + 10: " + sum1(10));
        System.out.println("Task 5 - Print sum of 10 + 1 + 9 + 2 + 8 + 3 + 7 + 4 + 6 + 5: " + sum2());
        System.out.println("Task 6 - Print sum of 1^2 + 2^2 + 3^2 + 4^2 + 5^2: " + sum3());
    }
    //1. Write a program to print the sum of even numbers from 1 to 10
    public static int sumOfEven() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    //2. Write a program to count the number of divisors of the given numbers
    //For example - Number 6 has 4 divisors & 12 has 6 divisors
    public static int divisors(int num) {
        int divisor = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisor++;
            }
        }
        return divisor;
    }
    // 3. Write a program to find a magic number from 1 to 100,
    //if you divide that number by 5 you will get remainder 4
    //if you divide that number by 4 you will get remainder 3
    //if you divide that number by 3 you will get remainder 2
    //if you divide that number by 2 you will get remainder 1
    public static void magic() {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 4 && i % 4 == 3 && i % 3 == 2 && i % 2 == 1) {
                System.out.println("Task 3 - The magic number: "+ i);
            }
        }
    }
    // 4.  Java program to Print sum of 1 + 2 - 3 + 4 + 5 - 6 + 7 + 8 - 9 + 10
    public static int sum1(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 3 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        return sum;
    }
    //5.  Java program to find sum of 10 + 1 + 9 + 2 + 8 + 3 + 7 + 4 + 6 + 5
    public static int sum2() {
        int sum = 0;
        int j = 1;
        for (int i = 10; i > 5; i--) {
            sum += i + j;
            j++;
        }
        return sum;
    }
    // 6.  Java program to find sum of 1^2 + 2^2 + 3^2 + 4^2 + 5^2
    public static int sum3() {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i * i;
        }
        return sum;
    }
}
