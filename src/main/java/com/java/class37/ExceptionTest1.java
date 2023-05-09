package com.java.class37;

import java.util.Scanner;

public class ExceptionTest1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter an age: ");
        int age = input.nextInt();

        if (age > 100 || age <= 0) {
            // System.out.println("invalid");
            throw new ArithmeticException("Invalid Age Specified");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else {
            System.out.println("Not Teenager");
        }
    }


}


