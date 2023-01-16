package com.java.class11;

import java.util.Scanner;

public class homework11_2 {

    public static void main(String[] args) {
        //Write a program that takes an operator (e.g., “+”, “-”, “*”, “/”) and two integers as input,
        // and outputs the result of the operation. Use a switch statement to implement this program.
        // Make sure to consider the possibility of division by zero, and any other edge cases.
        //Sample outputs for input "+ 2 3" would be "5", input "/ 6 2" would be "3",
        // input "* 7 8" would be "56", if we have edge case
        // input "/ 5 0" would be "division by zero is not allowed" or similar message

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the operator: ");
        char operator = sc.next().charAt(0);
        System.out.println("Please enter the first number: ");
        int num1 = sc.nextInt();//-2147483648 to 2147483647
        System.out.println("Please enter the second number: ");
        int num2 = sc.nextInt();
        long result;
        switch (operator) {
            case '+':
                result = (long) num1 + num2;
                System.out.println(result);
                break;
            case '-':
                result = (long) num1 - num2;
                System.out.println(result);
                break;
            case '*':
                //For the edge case, the result will exceed the maximum value of int type, so cast type to long
                result = (long) num1 * num2;
                System.out.println(result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed. Please enter the valid value.");
                } else {
                    result = (long) num1 / num2;
                    System.out.println(result);
                }
                break;
            default:
                System.out.println("Wrong operator. Please try again.");
        }

        //operation can be wrong, so add 1 rule
        //division by zero, error, add 1 rule


    }
}
