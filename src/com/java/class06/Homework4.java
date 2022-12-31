package com.java.class06;

public class Homework4 {
    public static void main(String[] args) {
        //Login Functionality
        // Write a logic which would tell the user if logged in or not
        //you have a username
        //you have a password
        //you loginLocation

        //in order to be logged your userName should match steve@apple.com
        //and your password should be infinityLoop1
        //and your location should be california

        boolean logIn;
        String userName = "emily@gmail.com";
        String password = "infinityLoop1";
        String loginLocation = "california";

        logIn = userName == "steve@apple.com" && password =="infinityLoop1" && loginLocation == "california";
        System.out.println(logIn);

    }
}
