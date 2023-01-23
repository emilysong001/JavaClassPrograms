package com.java.class14;

public class StringDotLength {
    public static void main(String[] args) {
        String str= "I love Java";
        System.out.println(str.length());
        String str2 = "Hello World!";
        System.out.println(str2.length());
        System.out.println(str.charAt(3));
        System.out.println(str.substring(2));
        System.out.println("==============");

        System.out.println(str2.charAt(4));
        System.out.println(str2.substring(4,5));
        //the difference is return type, and for substring, it is still a String, we have all String method can use
        //but for char, it is only a primitive type, no method on it

        String var = str2.substring(4,5);
        System.out.println(var);

        String str3 = "United States of America";
        String str4 = "Canada";
        String str5 = "Mexico";
        String str6 = "Cuba";

        int num = str3.length();
        int num1 = str4.length();
        int num2 = str5.length();
        int num3 = str6.length();
        int average = (num+num1+num2+num3)/4;
        System.out.println(average);

    }
}
