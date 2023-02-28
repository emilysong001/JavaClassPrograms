package com.java.class24;

import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        //1. Write a program to get two 2D arrays from the user and print the sum of it
        System.out.println("===============Task1================");
        int[][] array1 = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int[][] array2 = {{4, 4, 4}, {2, 2, 2}, {1, 1, 1}};
        int sum[][] = new int[3][3];

        System.out.println("Sum of two 2D array elements is ");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                sum[i][j] = array1[i][j] + array2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        //2. Write a program to find the sum of array elements using for-each loop
        System.out.println("===============Task2================");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sumOfArr = 0;
        for (int i : arr) {
            sumOfArr += i;
        }
        System.out.println("The sum of array elements: " + sumOfArr);

        //Program to print the sum of the smallest and greatest number from the array using for-each loop
        System.out.println("===============Task3================");
        int[] arr1 = {45, 65, 85, 24, 45, 85, 34, 65, 100};
        int smallest = arr1[0];
        int greatest = arr1[0];
        int sum1;
        for (int i : arr1) {
            if (i < smallest) {
                smallest = i;
            }
            if (i > greatest) {
                greatest = i;
            }
        }
        sum1 = smallest + greatest;
        System.out.println("The sum of the smallest and greatest number: " + sum1);

        //4. Write a program to sort array elements in ascending order using for-each loop
        System.out.println("===============Task4================");
        int[] arr2 = {5, 2, 8, 7, 1};
        Arrays.sort(arr2);
        for (int j : arr2) {
            System.out.print(j + " ");
        }
    }
}
