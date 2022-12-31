package com.java.class06;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //nextInt(), nextLine() -methods, functions, all methods return a result
        //public int nextInt() - it returns an Integer value, int is this method's return data type

        //before we ask for user input
        // we should tell the user what type of info we want from them

        System.out.println("Please enter your age: ");
        int age = input.nextInt(); // return the value to variable age
        //comparations, calculation,printout, anything
        if (age > 18) {
            System.out.println("Your age is: "+age);
        } else {
            System.out.println("You are very young");
        }

        System.out.println("Please enter your credit score: ");
        int creditScore = input.nextInt();
        System.out.println("Your Credit Score is: "+creditScore);


        System.out.println("Please enter your marital status: ");
        boolean isMarried = input.nextBoolean();
        System.out.println("Is married?"+isMarried);

        System.out.println("Please enter your marital status: ");
        String maritalStatus = input.next();
        System.out.println("Is married?"+maritalStatus);

    }
}
