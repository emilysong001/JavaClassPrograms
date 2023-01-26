package com.java.class16;

public class MultiplicationTable {
    public static void main(String[] args) {
        //Write a program that uses a while loop to print the multiplication table for a given number.
        int i = 1;
        while (i <= 7) {
            int j = 1;
            while (j <= i) {
                System.out.println(i + " * " + j + " = " + (i * j));
                j++;
            }
            i++;
        }
    }
}
