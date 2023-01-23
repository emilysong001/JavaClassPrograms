package com.java.class14;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {

        String str1 = "hello world";
        System.out.println(str1.substring(6));
        System.out.println(str1);
        // StringIndexOutOfBoundsException

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();

        System.out.println(getSubStringWithStart(str));
        //subString(i,j) from i to j-1
        //System.out.println(getSubStringWithStartAndEnd(str));

    }
    public static String getSubStringWithStart(String str){
        return str.substring(6);
    }

    /*public static String getSubStringWithStartAndEnd(String str){
        String subString;
        if(str.length()-3>=6) {
            subString = str.substring(6, str.length() - 3);
        }
        subString = "Error";
        return subString;
    }*/
}
