package com.java.class12;

import java.util.Scanner;

public class MethodsPractice2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Is it a weekday? ture/false");
        //boolean weekday = sc.nextBoolean();
        System.out.println("What day is today? Ex.Monday? ");
        String weekday = sc.nextLine();
        System.out.println("Is it a vacation? ture/false");
        boolean vacation = sc.nextBoolean();
        //boolean sleep = sleepIn(weekday, vacation);
        if (weekday.equalsIgnoreCase("monday") || weekday.equalsIgnoreCase("tuesday")
                || weekday.equalsIgnoreCase("wednesday") || weekday.equalsIgnoreCase("thursday")
                || weekday.equalsIgnoreCase("friday") || weekday.equalsIgnoreCase("saturday")
                || weekday.equalsIgnoreCase("sunday")) {
            boolean isWeekday = isWeekday(weekday);
            boolean sleep = sleepIn(isWeekday, vacation);
            System.out.println(sleep);
        } else {
            System.out.println("Wrong input. Please enter a weekday. Ex. Monday");
        }
    }

    public static boolean sleepIn(boolean isWeekday, boolean vacation) {
        return vacation || !isWeekday;
    }

    //parameter is the information you need to take from the user
    //return statement: data type should be matched
    public static boolean isWeekday(String weekday) {
        boolean isWeekday = false;
        switch (weekday.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                isWeekday = true;
                break;
            case "saturday":
            case "sunday":
                isWeekday = false;
                break;
            /*default:
                System.out.println("Wrong input.");*/
        }
        return isWeekday;
    }

}


