package com.java.class07;

public class IfStatement {
    //if statement is a logical flow control
    // it is used to write a program that executes certain portion of the code
    // only in certain conditions

    public static void main(String[] args) {

        int hourOfDay = 10;
        if (hourOfDay <11) System.out.println("Good Morning");

        System.out.println("=======================");
        if (true) {
            System.out.println("Hello World");
            System.out.println("Hello");
        }
        System.out.println("I'm outside of If Statement");

        //single statement doesn't need {} curly braces
        if (false) System.out.println("Hello Mars");
        System.out.println("Hello Saturn");// this line is outside of If Statement scope
        //it will print in any condition

        System.out.println("=======================");
        int gallonOfOil = 5000;
        if (gallonOfOil>1000) {
            System.out.println("Hello Venus");
        }



    }
}
