package com.java.selfpractice2;

public class CoreJavaBrushUp3 {
    public static void main(String[] args) {
        String s = "Emily, Song";
        String s1 = "Emily";
        String s5= "Hello";

        String s2 = new String("Welcome to the Java World");
        String s3 = new String("Welcome");

        String[] sl = s.split(",");
        for (int i = 0; i < sl.length; i++) {
            System.out.println(sl[i]);
            System.out.println(sl[i].trim());
        }
        System.out.println("***********");
        System.out.println(sl[0]);
        System.out.println(sl[1]);

        String[] sl1 = s2.split(" ");
        for (int i = 0; i < sl1.length; i++) {
            System.out.println(sl1[i]);
        }

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

        //revert string

        for (int i = s.length()-1; i >=0; i--) {
            System.out.println(s.charAt(i));

        }

    }
}
