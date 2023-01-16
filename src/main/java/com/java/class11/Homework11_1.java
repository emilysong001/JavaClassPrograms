package com.java.class11;

import java.util.Scanner;

public class Homework11_1 {

    public static void main(String[] args) {
       /* Write a program that takes a day of the week as input (e.g., “Monday”),
       and outputs the number of days until the next weekend (i.e., either Saturday or Sunday).
       Use a switch statement to implement this program.
       Sample outputs for input "Monday" would be "5" and input "Friday" would be "2"*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a day of the week: e.g. \"Monday\"");
        String dayOfWeek = sc.nextLine();
        switch (dayOfWeek.toLowerCase()) {
            case "monday":
                System.out.println("The number of days until the next weekend: 5");
                break;
            case "tuesday":
                System.out.println("The number of days until the next weekend: 4");
                break;
            case "wednesday":
                System.out.println("The number of days until the next weekend: 3");
                break;
            case "thursday":
                System.out.println("The number of days until the next weekend: 2");
                break;
            case "friday": // input "Friday" would be "2", should be 1?
                System.out.println("The number of days until the next weekend: 1");
                break;
            case "saturday"://depends on the requirement
                System.out.println("The number of days until the next weekend: 7");
                break;
            case "sunday"://depends on the requirement
                System.out.println("The number of days until the next weekend: 6");
                break;
            default:
                System.out.println("Wrong input. Please try again.");
        }
    }
}
