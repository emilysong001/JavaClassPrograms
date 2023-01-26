package com.java.class16;

public class Homework {
    public static void main(String[] args) {
        printOddNumber(1,19);
        System.out.println("=============");
        printSum(1,10);
        System.out.println("=============");
        printMultiplication(7);
    }

    public static void printOddNumber(int i, int j) {
        //Write a program that uses a while loop to print the odd numbers from 1 to 20. => 1,3,5,7,9,11,13,15,17,19
        while (i <= j) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void printSum(int i, int j) {
        //Write a program that uses a while loop to print the sum of the numbers from 1 to 10. => 1+2+3+4+5+6+7+8+9+10
        int sum = 0;
        while (i <= j) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }

    public static void printMultiplication(int i) {
        //Write a program that uses a while loop to print the multiplication table for a given number.
        int j = 1;
        while (j <= 10) {
            System.out.println(i + " * " + j + " = " + (i * j));
            j++;
        }
    }
}
