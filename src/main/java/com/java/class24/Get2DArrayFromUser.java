package com.java.class24;

import java.util.Scanner;

public class Get2DArrayFromUser {
    public static void main(String[] args) {
        int data[][] = new int[3][3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < data.length; i++) {
            System.out.println("enter 3 numbers for row " + (i + 1));
            //int max = Integer.MIN_VALUE; it works well
            //int max = data[i][0];
            //wrong since it didn't take data from the user, it is default to 0
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = input.nextInt();
                /*if (data[i][j] > max) {
                    max = data[i][j];
                }*/
            }
            //System.out.println("The greatest number of Row " +(i+1)+" is "+ max);
        }
        greatest(data);
    }
    public static void greatest(int[][] data){
        for (int i = 0; i < data.length; i++) {
            int great = data[i][0];
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j] > great) {
                    great = data[i][j];
                }
            }
            System.out.println("The greatest number of Row " +(i+1)+" is "+ great);
        }
    }
}
