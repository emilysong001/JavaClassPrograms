package com.java.class38;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int salary[] = new int[5];
        System.out.println("please enter salary: ");
        for (int i = 0; i < salary.length; i++) {
            salary[i] = input.nextInt();
        }

    }
}
