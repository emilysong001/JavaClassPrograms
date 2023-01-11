package com.java.class10;

import java.util.Scanner;

public class IfStatementRecap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Please input number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Please input number 3: ");
        int num3 = sc.nextInt();

        //bad code style

        if (num1 < num2) {
            if (num2 < num3) {
                System.out.println("The largest number is:" + num3);
            }
            else if (num2 > num3){
                System.out.println("The largest number is:" + num2);
            }
            else {
                System.out.println("Number 2 and Number 3 are the same largest: " + num2);
            }
        } else if(num1 > num2) {
            if (num1 < num3) {
                System.out.println("The largest number is:" + num3);
            }
            else if (num1 > num3){
                System.out.println("The largest number is:" + num1);
            }
            else {
                System.out.println("Number 1 and Number 3 are the same largest: " + num1);
            }
        } else {
            if (num1 > num3) {
                System.out.println("Number 1 and Number 3 are the same largest:" + num1);
            }
            else if (num1 < num3)  {
                System.out.println("The largest number is:" + num3);
            }
            else {
                System.out.println("all numbers are equal: " + num3);
            }
        }

    }
}
