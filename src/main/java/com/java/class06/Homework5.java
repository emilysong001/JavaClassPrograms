package com.java.class06;

import java.util.Scanner;

public class Homework5 {
    //Homework: Scanner.
    //Write a credit landing program
    //get user input for age, creditscore, marital status

    //printout Approved: true
    //if user is older than 25
    //if user has a creditscore more than 700
    //if user is married

    //printout Approved: false
    //if any of the conditions is wrong
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        System.out.println("Please enter your credit score: ");
        int creditScore = input.nextInt();

        System.out.println("Please enter your marital status: ");
        boolean isMarried = input.nextBoolean();

        boolean approved = age >25 && creditScore >700 && isMarried;
        System.out.println("You are approved credit landing? "+approved);
    }
}
