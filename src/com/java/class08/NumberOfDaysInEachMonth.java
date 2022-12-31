package com.java.class08;

import java.util.Scanner;

public class NumberOfDaysInEachMonth {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the month in number");
        int month = input.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("The number of days in " + month + " month is 31 days.");
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("The number of days in " + month + " is 30 days.");
        }
        else if (month == 2) {
            System.out.println("The number of days in " + month + " is 28 or 29 days depends on which year you are in.");
        }
        else {
            System.out.println("Wrong Entry. You can only input a number between 1 and 12.");
        }
    }
}
