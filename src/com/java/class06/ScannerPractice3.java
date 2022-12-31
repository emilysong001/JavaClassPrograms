package com.java.class06;

import java.util.Scanner;

public class ScannerPractice3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your username: ");
        String userName = input.next();

        System.out.println("Please enter your password: ");
        String password = input.next();

        boolean loginStatus;
        //loginStatus = userName.equals("best@devx.com") && password.equals("Fall2022");
        //loginStatus = userName.equals("best@devx.com") && !password.equals("Fall2022");
        loginStatus = userName.equalsIgnoreCase("best@devx.com") && password.equals("Fall2022");

        //anotherString has no functionality, except give us a hint


        System.out.println("Your Login Status is: "+loginStatus);

        //==
        //!=
        // needs to be used with caution when you usign for Strings
        // you can use ==, != only working with constant value
        //when you are taking the values from user ==,!=

        // for Strings, the best way to compare is to use .equals()
        // every String varaible has .equals() and .equalsIgnoreCase()
        //if you want to compare not equals with
        //!var.equals("expectedResult")
        //equalsIgnoreCase a method that compare 2 strings, it will return true regardless the cases




    }
}
