package com.java.class14;

import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        //String str= "I love Java";
        //String str2 = "Hello World!";
        //System.out.println(str.charAt(3));
        //System.out.println(str2.charAt(20));
        // StringIndexOutOfBoundsException runtime errors

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();


        CharAt charAt = new CharAt();
        System.out.println(charAt.lastChar(str));
    }
    public char lastChar(String str){
        return str.charAt(str.length()-1);
    }
}
