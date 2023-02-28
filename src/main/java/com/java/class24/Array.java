package com.java.class24;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[][] data1 = new int[3][5]; //0
        //Integer[][] data1 = new Integer[3][5]; //null
        //System.out.println(Arrays.toString(data1));
        System.out.println(data1[0][4]);
        // System.out.println(data1[4][0]); //out of bound

        int data[][] = {{3, 5, 7}, {5, 7, 2}, {6, 3, 1}};

        //print(data);
        //sum(data);
        sumOfEachRow(data);

    }

    public static void print(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sum(int[][] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                sum += data[i][j];
            }
        }
        System.out.println("The sum of data: " + sum);
    }

    public static void sumOfEachRow(int[][] data) {

        for (int i = 0; i < data.length; i++) {
            int sum = 0;
            for (int j = 0; j < data[0].length; j++) {
                sum += data[i][j];
            }
            System.out.println("The sum of row " + (i+1) + " = " + sum);
        }

    }
}
