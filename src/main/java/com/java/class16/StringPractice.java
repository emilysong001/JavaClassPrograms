package com.java.class16;

public class StringPractice {

    public static void main(String[] args) {
        String  str = "abaAFF";
        StringPractice s = new StringPractice();
        System.out.println(s.firstHalf(str));
    }
    public String firstHalf(String str) {
        int halfLength = str.length()/2;
        return str.substring(0,halfLength);
    }


}
