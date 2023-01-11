package com.java.class08;

import java.util.Scanner;

public class Homework7 {
   /* **Write a program to take a day number from the user and print the name of the day from the given number**
            **Question Type:** Write Code.
            ## Test Data:
    Input - 0,  Output - Sunday
    Input - 1,  Output - Monday
    Input - 2,  Output - Tuesday
    Input - 3,  Output - Wednesday
    Input - 4,  Output - Thursday
    Input - 5,  Output - Friday
    Input - 6,  Output - Saturday
    Input - 7,  Output - Invalid Input */

    public static void main(String[] args) {
        System.out.println("================Homework7-1=================");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a day number: ");
        int day_num = input.nextInt();
        if (day_num == 0) {
            System.out.println("Sunday");
        } else if (day_num == 1) {
            System.out.println("Monday");
        } else if (day_num == 2) {
            System.out.println("Tuesday");
        } else if (day_num == 3) {
            System.out.println("Wednesday");
        } else if (day_num == 4) {
            System.out.println("Thursday");
        } else if (day_num == 5) {
            System.out.println("Friday");
        } else if (day_num == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid Input");
        }

        /* homework 2:
            **Write a program to print a welcome message to the traveler and notify them of a 10% discount if they are returning customers,
            *  at the end print the message “Enjoy your stay here”**
            **Question Type:** Write Code.
            Test Data:

    Example 1:
    Welcome to the Beverly Hills
    Are you traveling first time here(true/false)? true
    Enjoy your stay

    Example 2:
    Welcome to the Beverly Hills
    Are you traveling first time here(true/false)? false
    You have got a 10% discount on your stay
    Enjoy your stay*/


        System.out.println("================Homework7-2=================");
        System.out.println("Welcome to the Beverly Hills");
        System.out.println("Are you traveling first time here(true/false)? ");
        boolean travelingFirstTime = input.nextBoolean();
        if (!travelingFirstTime) {
            System.out.println("You have got a 10% discount on your stay");
        }
        System.out.println("Enjoy your stay");

    }
}
