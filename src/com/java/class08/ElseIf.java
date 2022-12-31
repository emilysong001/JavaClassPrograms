package com.java.class08;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //if user has a license and their speed is less than 80m/h
        System.out.println("Do you have license? true/false: ");
        boolean hasLicense = input.nextBoolean();
        System.out.println("Enter your speed: ");
        int speedLimit = input.nextInt();

        //one if statement is like one use case, one scenario from your users(application)
        //as soon as you get a true if or else if statement you execute that if statement
        // and jump out of the whole else if group

        if (hasLicense && speedLimit < 80) {
            System.out.println("have a safe journey");
        } else if (hasLicense && speedLimit >= 80) {
            System.out.println("Here is your speeding ticket");
        } else if (!hasLicense && speedLimit < 80) {
            System.out.println("we have to tow your car");
        } else if (!hasLicense && speedLimit >= 80) {
            System.out.println("You must appear in the court");
        } else {
            System.out.println("Buy a car");
        }
        //coding standard: usually the pairs go as if one or more

    }
}
