package com.java.class23;

import java.util.Arrays;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        System.out.println("===========Task1===========");
        //Write a program to get a collection of elements and print it in reverse order
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("===========Task2===========");
        // Write a program to find the duplicate elements from the array
        int[] arr1 = {45, 65, 85, 24, 45, 85, 34, 65, 45, 85};
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] == arr1[i + 1]) {
                int duplicate = arr1[i];
                for (int j = i + 2; j < arr1.length; j++) {
                    if (arr1[j] == duplicate) {
                        i++;
                    }
                }
                System.out.println(arr1[i]);
            }
        }

        System.out.println("===========Task3===========");
        //Program to print the elements of an array present in the odd position
        int[] arr2 = {45, 65, 85, 24, 45, 85, 34, 65, 45, 85};
        for (int i = 0; i < arr2.length; i++) {
            if (i % 2 == 1) {
                System.out.print(arr2[i] + " ");
            }
        }

        System.out.println();
        System.out.println("===========Task4===========");
        //Write a program to sort array elements in ascending order
        int[] arr3 = {5, 2, 8, 7, 1};
        //Arrays.sort(arr3);
        for (int i = 0; i < arr3.length; i++) {
            for (int j = i + 1; j < arr3.length; j++) {
                if (arr3[j] < arr3[i]) {
                    int tem = arr3[i];
                    arr3[i] = arr3[j];
                    arr3[j] = tem;
                }
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
