package com.java.class09;

import java.util.Scanner;

public class Homework9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("================Homework9-1=================");
        // **Write a program to find the greatest number out of three numbers using nested if statement**
        System.out.println("Please enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Please enter the second number: ");
        int num2 = input.nextInt();
        System.out.println("Please enter the third number: ");
        int num3 = input.nextInt();
        if (num1 < num2) {
            if (num2 < num3) {
                System.out.println("The greatest number is: " + num3);
            } else {
                System.out.println("The greatest number is: " + num2);
            }
        } else {
            if (num1 < num3) {
                System.out.println("The greatest number is: " + num3);
            } else {
                System.out.println("The greatest number is: " + num1);
            }
        }

        System.out.println("================Homework9-2=================");
        //**Write a program to get a salary, age, and loan amount from the user
        // and print how much credit card limit they can avail, based on the following criteria**
        /*Salary
                ----------------------------------------------
        less than 1000              Not Eligible
        1001 to 5000                limit 10000
        5001 to 10000               limit 20000
        greater than 10001          limit 50000
                ----------------------------------------------
        Age should be greater than or equal to 18
        Loan Amount
        ---------------------------------
                less than 5000           No Deduction In Limit
        greater than 20000       Not Eligible
        5001 to 20000            Deduct Half Of The Loan Amount From Credit Card Limit
        ---------------------------------
                Note - If Credit Limit Turns Negative, Print - You Are Not Eligibile*/

        System.out.println("Please enter your salary: ");
        double salary = input.nextDouble();
        System.out.println("Please enter your age: ");
        int age = input.nextInt();
        System.out.println("Please enter the loan amount: ");
        double loan_amount = input.nextDouble();
        int limit_salary1 = 10000;
        int limit_salary2 = 20000;
        int limit_salary3 = 50000;


        if (age>=18){
            if (loan_amount>20000){
                System.out.println("You Are Not Eligible");
            }
            else if (loan_amount < 5000){
                if(salary<1000){
                    System.out.println("You Are Not Eligible");
                }
                else if(salary<5000){
                    System.out.println("limit 10000");
                }
                else if(salary<10000){
                    System.out.println("limit 20000");
                }
                else{
                    System.out.println("limit 50000");
                }
            }
            else {
                if(salary<1000){
                    System.out.println("You Are Not Eligible");
                }
                else if(salary<5000){
                    System.out.println("Limit: "+(limit_salary1-loan_amount/2));
                }
                else if(salary<10000){
                    System.out.println("Limit: "+(limit_salary2-loan_amount/2));
                }
                else{
                    System.out.println("Limit: "+(limit_salary3-loan_amount/2));
                }


            }

        }
    }
}
