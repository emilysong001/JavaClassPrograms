package com.java.class17;

public class WhileLoopPractice3 {
    public static void main(String[] args) {
        //print out
        String str = "Mission Impossible";
        int i = 1;
        String str1 = "";
        while (i <= str.length()) {
            str1 = str1 + str.charAt(i);
            //System.out.println(str.charAt(i));
            i = i + 2;
        }
        System.out.println(str1);
    }
}
