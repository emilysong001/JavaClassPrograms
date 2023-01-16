package com.java.class12;

import java.util.Scanner;

public class Homework12_2 {
    public static void main(String[] args) {
        //Create a method that takes a char representing a grade (A, B, C, D, or F)
        //and returns a boolean indicating
        //whether the grade is passing or failing. A and B are passing, C,D,F are failing.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your grade: Ex. A");
        char grade = sc.next().charAt(0);
        if (grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='F') {
            if (isPassed(grade)) {
                System.out.println("Congratulation, you passed.");
            } else {
                System.out.println("Sorry, you failed.");
            }
        }
        else {
            System.out.println("Wrong input. Please try again.");
        }
    }

    public static boolean isPassed(char grade) {
        boolean pass = false;
        switch (grade) {
            case 'A':
            case 'B':
                pass = true;
                break;
            case 'C':
            case 'D':
            case 'F':
                pass = false;
                break;
        }
        return pass;
    }
}