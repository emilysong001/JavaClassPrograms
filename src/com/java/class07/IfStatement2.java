package com.java.class07;

import java.util.Scanner;

public class IfStatement2 {

    public static void main(String[] args) {
        //tell me if I am eligible to drive
        Scanner input = new Scanner(System.in);

        /*System.out.println("Please enter your age: ");
        int age = input.nextInt();

        if (age>16) {
            System.out.println("You are eligible to drive");
        }
        if (age<=16) {
            System.out.println("You are NOT eligible to drive");
        }*/

        System.out.println("======================");
        //write a program that asks the user for weather in fahrenheit
        // if the weather is less than 32 then print out it's Freezing

        System.out.println("What's the weather like?");
        int weather = input.nextInt();

        if (weather < 32) {
            System.out.println("It's Freezing outside! Stay home.");
        }
        if (weather >= 32 && weather < 41) {
            System.out.println("It's little chilly outside.");
        }
        if (weather >= 42 && weather < 68) {
            System.out.println("It's a good weather outside. Go get fresh air.");
        }
        if (weather >= 68) {
            System.out.println("It's amazing outside. Let's go to pool and Vitamin D.");
        }


    }
}
