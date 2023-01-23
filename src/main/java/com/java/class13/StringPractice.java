package com.java.class13;

public class StringPractice {

    public static void main(String[] args) {
        String str = "hello";
        String str2 = "Devx";
        String str3 = str + str2;
        String str4 = str + " " + str2;
        System.out.println(str3);
        System.out.println(str4);
        int a = 10;
        int b = 15;
        int sum = a + b;
        System.out.println(sum);
        String str5 = "10";
        String str6 = "20";
        String str7 = str5+str6;
        System.out.println(str7);

        String str8 = a+str5;
        //when concatenating a String with different data types
        //everything turns(casts) into a String
        System.out.println(str8);

        String str9 = 42+10+str5;
        System.out.println(str9);
        String str10 = "Hello"+42+10+"Devx";
        System.out.println(str10);
        String str11 = 42+10+"Hello"+42+10+"Devx";
        System.out.println(str11);
    }
}
