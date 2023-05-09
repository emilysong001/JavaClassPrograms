package com.java.studentmentoring;

public class StringExample {
    public static void main(String[] args) {
        //1.immutable/not immutable
        String str = "Hello, ";
        str.concat("Welcome to Devx.");
        str = str.concat("Welcome to Devx.");
        System.out.println(str);

        //String str1 = str.concat("Welcome to Devx.");
        //System.out.println(str1);

        StringBuffer strbuffer= new StringBuffer("This is Emily. ");
        strbuffer.append("How are you?");
        System.out.println(strbuffer);

        StringBuilder strbuilder= new StringBuilder("Today, we are talking about Strings. ");
        strbuilder.append("Are you ready?");
        System.out.println(strbuilder);
    }
}
