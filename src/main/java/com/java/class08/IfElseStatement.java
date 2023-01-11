package com.java.class08;

import java.util.Scanner;

public class IfElseStatement {

    public static void main(String[] args) {
        //first goal is to make sure the program works fine for the customers
        //second goal is to make sure the program is written in a most space(memory)
        //and performance(speed) efficient way
        Scanner input = new Scanner(System.in);

        System.out.println("Do you have license? true/false: ");
        boolean doesHaveLicense = input.nextBoolean();

        /*if(doesHaveLicense){
            System.out.println("Have a safe trip.");
        }
        if(!doesHaveLicense) {
            System.out.println("Here is your ticket.");
        }*/
        //

        //the program will check if statement
        //if it's true it is execute the if statement
        //if it's false the program jumps to else and execute the body of else
        //the program doesn't have to check the else (there is even no logic there)

        if (doesHaveLicense) {
            System.out.println("Have a safe trip.");
        } else {
            System.out.println("Here is your ticket.");
        }

        //if user has a license and their speed is less than 80m/h
        System.out.println("Do you have license? true/false: ");
        boolean doesLicense = input.nextBoolean();
        System.out.println("Enter your speed: ");
        int speed = input.nextInt();
        if (doesLicense && speed < 80) {
            System.out.println("have a safe journey");
            System.out.println("Be careful, it's snowing today.");
        } else {
            System.out.println("Give a ticket 2");
            System.out.println("Please obey the rules");
        }


    }
}
