package com.java.class19;

import java.util.Scanner;

public class Factors {
    // 6 factors - 1 2 3 6
    //25 1 5 25
    //14 1 2 7 14
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
