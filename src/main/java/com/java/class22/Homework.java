package com.java.class22;

public class Homework {
    public static void main(String[] args) {
        //Write a program to find the greatest number from an array
        //Example
        //Input - 12, 45, 67, 23, 13, 45, 56
        //Output - 67
        int[] arr = {12, 45, 67, 23, 13, 45, 56};
        int greatest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > greatest) {
                greatest = arr[i];
            }
        }
        System.out.println("Task1 - The greatest number is: " + greatest);

        //Write a program to find the sum of even and odd numbers
        //Example
        //Input - 12, 45, 67, 23, 13, 45, 56
        //Output - Sum of Even Elements - 68, Sum of Odd Elements - 193
        int sumOfEven = 0;
        int sumOfOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sumOfEven += arr[i];
            } else {
                sumOfOdd += arr[i];
            }
        }
        System.out.println("Task2 - Sum of Even Elements: " + sumOfEven);
        System.out.println("Task2 - Sum of Odd Elements: " + sumOfOdd);

        //Write a program to count number of positive(consider zero also positive) and negative numbers from an array
        //Example
        //Input - 12, -45, 67, 23, -13, 45, -56
        //Output - Positive Elements - 4, Negative Elements - 3
        int[] arr1 = {12, -45, 67, 23, -13, 45, -56};
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] >= 0) {
                positive++;
            } else {
                negative++;
            }
        }
        System.out.println("Task3 - Positive Elements: " + positive);
        System.out.println("Task3 - Negative Elements: " + negative);
    }
}
