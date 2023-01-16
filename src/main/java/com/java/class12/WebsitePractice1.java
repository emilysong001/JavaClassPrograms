package com.java.class12;

public class WebsitePractice1 {

    public static String welcomeBackSuperstar() {
        //write your program here
        return ("Welcome back, Superstar!");
    }

    public static void main(String[] args) {
        String str = welcomeBackSuperstar();
        System.out.printf(str + "\n");
        System.out.printf(str + "\n");
        System.out.printf(str + "\n");

        System.out.println("==============================");

        String str2 = myNameIsBruno();
        System.out.println(str2);

    }

    public static String myNameIsBruno() {
        //write your program here
        return "My name is \033[1mBruno\033[0m and I am \033[1m22\033[0m years old.";
    }
}
