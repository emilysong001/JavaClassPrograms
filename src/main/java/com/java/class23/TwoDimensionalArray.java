package com.java.class23;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int data[][] = {
                {34, 54},
                {34, 45},
                {54, 56}
        };
        System.out.println(data[0][1]);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }

        //get the rows of the two dimensional Array
        System.out.println(data.length);
        //get the columns of the two dimensional Array
        System.out.println(data[0].length);


    }
}
