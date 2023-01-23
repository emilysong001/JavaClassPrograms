package com.java.class13;

import java.util.Scanner;

public class InstanceMethods2 {

    public static void main(String[] args) {
        //Given two non-negative int values,
        // return true if they have the same last digit,
        // such as with 27 and 57.
        // Note that the % “mod” operator computes remainders, so 17 % 10 is 7.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();

        InstanceMethods2 im = new InstanceMethods2();
        if (num1 >= 0 && num2 >= 0) {
            System.out.println(im.isSameLastDigit(num1, num2));
        } else {
            System.out.println("Wrong input");
        }
        System.out.println("================");
        if (num1 >= 0) {
            System.out.println(im.isMultiple(num1));
        } else {
            System.out.println("Wrong input");
        }

        System.out.println("================");
        System.out.println(im.isTen(num1, num2));
    }

    public boolean isSameLastDigit(int num1, int num2) {
        return num1 % 10 == num2 % 10;
    }

    //create a method that takes a non-negative int.
    //Return true if the given non-negative number
    // is a multiple of 3 or a multiple of 5. Use the % “mod” operator (edited)
    public boolean isMultiple(int num1) {
        return num1 % 3 == 0 || num1 % 5 == 0;
    }
    //Create a method that takes 2 integers,
    //Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
    public boolean isTen(int num1, int num2) {
        return num1 == 10 || num2 == 10 || num1 + num2 == 10;
    }
}
