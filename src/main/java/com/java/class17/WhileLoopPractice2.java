package com.java.class17;

import java.util.Scanner;

public class WhileLoopPractice2 {
    //write a program that prints the all characters of a String
    //in reverse order
    //ex: Java
    //avaJ
    //Lambo -> obaml
    //obama -> amabo
    //DevX -> XveD

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String str = sc.nextLine();

        String reverseStr = "";
        int j = str.length() - 1;
        while (j >= 0) {
            reverseStr = reverseStr + str.charAt(j);
            j--;
        }
        System.out.println("Reverse String is " + reverseStr);

        String str3 = "Lambo";
        System.out.println(str3.charAt(2));
    }
}
