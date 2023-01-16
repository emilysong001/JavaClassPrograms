package com.java.class12;

import java.util.Stack;

public class WebsitePractice2 {
    public static void main(String[] args) {
        String str = "GOOGLE";
        reverseWords(str);
        String str1 = welcomeBackSuperstar();
        System.out.println(str1);
        System.out.println(str1);
        System.out.println(str1);
    }

    public static void reverseWords(String str) {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) != ' ')
                st.push(str.charAt(i));
            else {
                while (!st.empty()) {
                    System.out.print(st.pop());
                }
                System.out.print(" ");
            }
        }
        while (!st.empty()) {
            System.out.print(st.pop());
        }
    }

    public static String welcomeBackSuperstar() {
        //write your program here
        return("Welcome back, Superstar!");
    }
}
