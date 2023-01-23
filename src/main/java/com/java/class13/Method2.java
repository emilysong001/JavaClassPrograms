package com.java.class13;

import java.util.Scanner;

public class Method2 {
    public static void main(String[] args) {
        //Given two int values, return their sum.
        // Unless the two values are the same, then return double their sum.
        //int sum = sum(10,20);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        //int sum = sum(num1, num2);
        //System.out.println("The total is:"+sum);
        System.out.println("The total is:"+sum(num1, num2));
        System.out.println("===============");
        System.out.println(inTheRange(num1,num2));
        System.out.println("===============");

    }

    public static int sum(int num1, int num2) {
       /* if (num1 == num2) {
            return (num1 + num2) * 2;
        } else {
            return num1 + num2;*/
        if (num1 == num2) {
            return (num1 + num2) * 2;
        }
            return num1 + num2;
            //return statement is a finish line, when your code runs return statement,
            //it means you want to break out of this method
    }

    public static boolean inTheRange(int num1, int num2) {
        /*if (num1 >= 10 && num1 <= 20 || num2 >= 10 && num2 <= 20) {
            return true;
        }
        return false;*/
        //local variables that defined without a certain scope
        //you can use the same variable names as long as they are in the different scope
        return num1 >= 10 && num1 <= 20 || num2 >= 10 && num2 <= 20;
        //if you have a method that returns true/false boolean
        //if you have just a simple if else logic
        //you can put the conditon expression with return
    }
}
