package com.java.class10;

import java.util.Scanner;

public class Homework10_3 {
    /*Nested If statements homework 3:
    Write a bank app to calculate interest rates on loans:
    take input for loanAmount in $,  credit score between 300-850.
    If the loan amount is less than $10,000 and the credit score is less than 600, the interest rate is set to 15%.
    If the loan amount is less than $10,000 and the credit score is 600 or higher, the interest rate is set to 10%.
    If the loan amount is $10,000 or higher and the credit score is less than 600, the interest rate is set to 12%.
    If the loan amount is $10,000 or higher and the credit score is 600 or higher, the interest rate is set to 8%.
    Print out the interest rate.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the loan amount: ");
        double loanAmount = sc.nextDouble();
        System.out.println("Please enter the credit score: ");
        int creditScore = sc.nextInt();

        if (loanAmount < 10000) {
            if (creditScore < 600) {
                System.out.println("The interest rate is set to 15%");
            } else {
                System.out.println("The interest rate is set to 10%");
            }
        } else {
            if (creditScore < 600) {
                System.out.println("The interest rate is set to 12%");
            } else {
                System.out.println("The interest rate is set to 8%");
            }
        }
        /* else if statement
        if (loanAmount < 10_000 && creditScore < 600) {
            System.out.println("The interest rate is set to 15%");
        } else if (loanAmount < 10_000 && creditScore >= 600) {
            System.out.println("The interest rate is set to 10%");
        } else if (loanAmount >= 10_000 && creditScore < 600) {
            System.out.println("The interest rate is set to 12%");
        } else if (loanAmount >= 10_000 && creditScore >= 600) {
            System.out.println("The interest rate is set to 8%");
        }*/
    }
}