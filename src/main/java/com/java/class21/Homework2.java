package com.java.class21;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        //  2. Write a program to print reverse of the given String
        //Example
        //Input - Wedevx
        //Output - xvedeW
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a String:");
        String str = sc.nextLine();
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println("The reverse of the string is: " + reverse);
    }
}
