package com.java.class07;

import java.util.Scanner;

public class Homework6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=============Homework 6-1===========");
        //1. Ask the user how many Java exercises are you solving per day?
        // if it's less than 3 -> print out -> You are too lazy!
        //if it's more than or equal 3 and less than 5-> good job, but you should do better!
        // if it's more than or equal 5 than print out -> great job! You are on the right track!

        System.out.println("Please enter how many Java exercises are you solving per day: ");
        int javaExercises = input.nextInt();

        if (javaExercises < 3) {
            System.out.println("You are too lazy!");
        }
        if (javaExercises >= 3 && javaExercises < 5) {
            System.out.println("Good job, but you should do better!");
        }
        if (javaExercises >= 5) {
            System.out.println("Great job! You are on the right track!");
        }


        System.out.println("=============Homework 6-2===========");
        /*2. Write a Java program that takes three positive integer numbers from the
        user as input to calculate and output the average of those three numbers.*/
        System.out.println("Please enter the first positive integer number: ");
        int num1 = input.nextInt();
        System.out.println("Please enter the second positive integer number: ");
        int num2 = input.nextInt();
        System.out.println("Please enter the third positive integer number: ");
        int num3 = input.nextInt();
        if (num1 >= 0 && num2 >= 0 && num3 >= 0) {
            double average = (num1 + num2 + num3) / 3;
            System.out.println("The average of those three numbers: " + average);
        }
        System.out.println("Please enter positive integer numbers.");


        System.out.println("=============Homework 6-3===========");
        /*3. Write a program to print a welcome message to the passenger and
        notify them to do security checks if they are not coming from connecting flight,
                and at the end print "enjoy your flight"*/
        /*System.out.println("Welcome to the Delta Air Lines.");
        System.out.println("Are you travelling from connecting flight(true/false)? ");
        boolean connectingFlight = input.nextBoolean();
        if (!connectingFlight) {
            System.out.println("Please proceed to the security checks.");
        }
        System.out.println("Enjoy your flight.");*/

        System.out.println("=============Homework 6-3===========");
        /*3. Write a program to print a welcome message to the passenger and
        notify them to do security checks if they are not coming from connecting flight,
                and at the end print "enjoy your flight"*/
        System.out.println("Welcome to the Delta Air Lines.");
        System.out.println("Are you travelling from connecting flight(true/false)? ");
        String connectingFlight1 = input.next();
        if (connectingFlight1.equalsIgnoreCase("no")) {
            System.out.println("Please proceed to the security checks.");
        }
        System.out.println("Enjoy your flight.");

    }
}
