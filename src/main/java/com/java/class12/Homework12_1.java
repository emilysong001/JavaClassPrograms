package com.java.class12;

import java.util.Scanner;

public class Homework12_1 {
    public static void main(String[] args) {
        //Create a method that takes a person's height as a double (in meters)
        // and returns their height in feet and inches. Google the formula.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a person's height as a double (in meters): ");
        double height = sc.nextDouble();
        System.out.printf("%d", heightConverterInFeet(height));
        System.out.printf(" feet and ");
        System.out.printf("%.2f", heightConverterInInches(height));
        System.out.println(" inches");
        System.out.println("==============================");
        double heightInInches = heightConverterToInches(height);
        System.out.println(height + " meters is " + heightInInches + " inches");
        System.out.println("==============================");
        double heightInFeet = heightConverterToFeet(height);
        System.out.println(height + " meters is " + heightInFeet + " feet");

    }

    public static int heightConverterInFeet(double height) {
        return (int) (height / 0.3048);
    }

    public static double heightConverterInInches(double height) {
        return (height / 0.3048 - (int) (height / 0.3048)) * 12;
    }

    public static double heightConverterToInches(double height) {
        return 0.3937 * height;
       //System.out.printf("%.2f%n", inch);
    }

    public static double heightConverterToFeet(double height) {
        return 0.0328 * height;
        //System.out.printf("%.2f", feet);
    }
}

