package com.java.class14;

import java.util.Scanner;

public class Homework14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        System.out.println("Enter a String for swap:");
        String str1 = sc.nextLine();
        System.out.println("Enter a String for swap:");
        String str2 = sc.nextLine();
        System.out.println(startWith(str));
        System.out.println(extraEnd(str1));
        System.out.println(swapLastTwo(str2));
    }
    //Write a method that takes a string and
    //  returns true if the string starts with “hi” and false otherwise.
    public static boolean startWith(String str) {
        //return str.substring(0,2).equals("hi");
        return str.startsWith("hi");
    }
    //Write a method that takes a string
    // returns a new string made of 3 copies of the last 2 chars of the original string.
    // The string length will be at least 2.
    //extraEnd(“Hi”) → “HiHiHi”
    //extraEnd(“Hello”) → “lololo”
    //extraEnd(“ab”) → “ababab”
    public static String extraEnd(String str) {
        String temp;
        if(str.length() >= 2) {
             temp = str.substring(str.length() - 2);
        }
        else {
            temp = str;
        }
        return temp.concat(temp).concat(temp);//save memory
    }
    //Given a string of any length, return a new string where the last 2 chars,
    // if present, are swapped, so “coding” yields “codign”.
    //lastTwo(“coding”) → “codign”
    //lastTwo(“cat”) → “cta”
    //lastTwo(“ab”) → “ba”
    public static String swapLastTwo(String str) {
        if (str.length() >= 2) {
            /*String swap = str.substring(str.length() - 2);
            swap = swap.substring(1).concat(swap.substring(0,1));
            str = str.substring(0, str.length() - 2)+swap;*/
            //str = str.substring(0, str.length() - 2) + str.charAt(str.length() - 2)+str.charAt(str.length() - 1) ;
            str = str.substring(0, str.length() - 2).concat(str.substring(str.length() - 1)).concat(str.substring(str.length() - 2,str.length() - 1)) ;

            //str = str.substring(0, str.length() - 2) + str.substring(str.length() - 1) + str.substring(str.length() - 2,str.length() - 1);
        }
        return str;
    }
}
