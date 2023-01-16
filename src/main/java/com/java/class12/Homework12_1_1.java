package com.java.class12;

import java.util.Scanner;

public class Homework12_1_1 {

    //private String value;
    //private int index;
    //get set method
    public static void main(String[] args) {
        //Create a method that takes a person's height as a double (in meters)
        // and returns their height in feet and inches. Google the formula.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a person's height as a double (in meters): ");
        double height = sc.nextDouble();
        System.out.printf("%d", heightConverterInFeet(height));
        System.out.printf(" feet and ");
        System.out.printf("%.2f", heightConverterInInches(height));
        System.out.printf(" inches");
    }

    public static int heightConverterInFeet(double height) {
        return (int) (height / 30.48);
    }

    public static double heightConverterInInches(double height) {
        return  (height / 30.48 - (int) (height / 30.48)) * 12;
    }

    /*public static Homework12_1_1 myMethod() {
        Homework12_1_1 rv = new Homework12_1_1();
        rv.setValue("value");
        rv.setIndex(12);
        return rv;
    }*/
}
