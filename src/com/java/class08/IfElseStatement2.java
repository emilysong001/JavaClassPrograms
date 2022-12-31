package com.java.class08;

import java.util.Scanner;

public class IfElseStatement2 {
    /*Write a program to get the salaries of two-person and print the name of the person that has a greater salary
Question Type: Write Code.
Test Data:
Example 1
Person 1: 1200
Person 2: 2500
Output: 2500

Example 2:
Person 1: 4500
Person 2: 8600
Output: 8600*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("The salary of Emily: ");
        double salary1 = input.nextDouble();
        System.out.println("The salary of Askar: ");
        double salary2 = input.nextDouble();

        if (salary1 > salary2) {
            System.out.println("Emily's salary is higher");
        } else {
            System.out.println("Askar's salary is higher");
        }
    }
}
