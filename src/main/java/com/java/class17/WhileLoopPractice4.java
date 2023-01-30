package com.java.class17;

public class WhileLoopPractice4 {
    public static void main(String[] args) {
        String str = "maiam";
        int i = str.length() - 1;
        String rev = "";
        while (i >= 0) {
            rev += str.charAt(i);
            i--;
        }
        if (str.equalsIgnoreCase(rev)) {
            System.out.println("This is a Palindrome");
        } else {
            System.out.println("This is not a Palindrome");
        }
    }
}