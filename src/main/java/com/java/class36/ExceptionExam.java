package com.java.class36;

import java.util.Scanner;

public class ExceptionExam {
    public static void main(String[] args) {
        {
            Scanner input = new Scanner(System.in);
            System.out.println("enter two numbers:");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            try {
                System.out.println(num1 / num2);
            }
            catch (ArithmeticException e){
                System.out.println("please enter a correct one");

            }
            System.out.println("enter two number50sghg:");
        }
    }
}
