package com.java.class08;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = input.nextInt();
        if (number % 2 == 0) {
            System.out.println("It is an even number");
        } else {
            System.out.println("It is an odd number");
        }

    }
}
