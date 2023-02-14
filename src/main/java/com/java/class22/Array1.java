package com.java.class22;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {

        int listOfData[] = new int[5];

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter data: ");

        for (int i = 0; i < listOfData.length; i++) {
            listOfData[i] = input.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < listOfData.length; i++) {
            sum += listOfData[i];
        }
        System.out.println("sum of the data: " + sum);

    }
}

