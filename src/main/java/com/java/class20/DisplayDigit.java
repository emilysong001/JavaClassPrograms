package com.java.class20;

import java.util.Scanner;

public class DisplayDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
       // int temp = 0;
        while (num > 0) {
            System.out.println(num % 10);
            num = num / 10;
           // System.out.println(temp);
        }
    }
}
