package com.java.class24;

import java.util.Arrays;

public class Homework4 {
    public static void main(String[] args) {
        //4. Write a program to sort array elements in ascending order using for-each loop
        int[] arr = {5, 2, 8, 7,1};
        Arrays.sort(arr);
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
}
