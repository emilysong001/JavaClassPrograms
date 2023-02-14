package com.java.class21;

public class Homework6 {
    public static void main(String[] args) {
        // 6.  Write a program to print the below pattern
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        int num = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (num - i) * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
