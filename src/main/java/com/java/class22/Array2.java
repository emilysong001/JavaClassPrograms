package com.java.class22;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {

        //declaration
        int[] listOfData = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter data: ");
        for (int i = 0; i < listOfData.length; i++) {
            listOfData[i] = input.nextInt();
        }

        System.out.println("Please enter target number: ");
        int targetNumber = input.nextInt();

        for (int i = 0; i < listOfData.length; i++) {
            if (listOfData[i] == targetNumber) {
                System.out.println("The index of the number is: " + i);
            }
        }
    }
}
