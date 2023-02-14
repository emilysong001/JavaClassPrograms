package com.java.class21;

public class Homework5 {
    public static void main(String[] args) {
        //  5.  Write a program to print the below pattern
        //       *
        //      ***
        //     *****
        //    *******
        //   *********
        //pyramid
        int num = 7;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
