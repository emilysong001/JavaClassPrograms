package com.java.class10;

import java.util.Scanner;

public class IfStatementRecap2 {

    //coding interview process:
//1. clarify gaps in the requirement by asking questions
//2. write a pseudocode
//3. write the code
//4. debug your code -> checking your code for mistakes, visually.
//5. test your code -> by running

    public static void main(String[] args) {

        //1. Determining the minimum/maximum of three numbers:
        //ask the user to input 3 integer numbers
        //write a logic that will print out the largest number and tell the user which specific input is this
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Please input number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Please input number 3: ");
        int num3 = sc.nextInt();

        //first step: before we jump to pseudocode - we need to clarify any missing requirements:
        //can all numbers be equal? If yes what should be the output
        // -> yes, printOut all numbers are equal

        //what if 2 numbers are largest and equal? -> print out that number
        //is there a limit for numbers? no
        //ese only whole numbers? or decimal pointed number - whole numbers
        //can we compare negative numbers? - yes


        //pseudocode -> is the logic of a program
        //written in plain english.
        //I need to 3 integer numbers
        //My logic would like this
        // I need to tackle the numbers 1 by 1.

        //first let's write a logic where my n1 is the largest/
        //my n1 would the largest if it's bigger than n2 AND bigger than n3
        //so this is true than print out n1 is the largest number
        //if num1 is equal to num 2 and greater than num 3
        // then print out n1 and n2 are the greatest number
        //if num1==num2 &&num1>3 sout n1 and n2 are ther greatest

        if (num1 >= num2 && num1 > num3) {
            System.out.println("The largest number is:" + num1);
        } else if (num2 > num1 && num2 >= num3) {
            System.out.println("The largest number is:" + num2);
        }
        //else if (num3 >= num1 && num3 > num2) {
        else if (num3 > num2) {
            System.out.println("The largest number is:" + num3);
        } else {
            System.out.println("All numbers are equal");
        }

        //general rule for debugging:
        //if you have the same exact body for multiple if statements it's bad
        //you can optimize your code by combining logics into one if statement


    }
}
