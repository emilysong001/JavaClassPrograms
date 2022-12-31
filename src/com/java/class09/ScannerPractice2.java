package com.java.class09;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        //primitive data types don't have any methods(functions), that's why they are from primitive
        Scanner input = new Scanner(System.in);

        System.out.println("What's your gender");
        char gender = input.next().charAt(0);

        //System.out.println(gender);
        if (gender == 'F' || gender == 'f') {
            System.out.println("Enjoy your life");
        } else if (gender == 'M' || gender == 'm') {
            System.out.println("Go hard work");
        } else {
            System.out.println("Wrong Entry");
        }
    }
}
