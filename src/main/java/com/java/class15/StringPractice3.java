package com.java.class15;

public class StringPractice3 {
    public static void main(String[] args) {
        String str2 = "blass 5am sf";
        System.out.println(printSpecific(str2));
    }

    public static String printSpecific(String str){
        String sub = "5am";
        int indexOfSub = str.indexOf(sub);
        int lengthOfSub = sub.length();
        return str.substring(indexOfSub,indexOfSub+lengthOfSub);
    }

}
