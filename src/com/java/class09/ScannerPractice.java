package com.java.class09;

import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your gender");
        //when you hit . and have a name ending with a ()
        //it means it's a method(function)

        //The best and most simple alternative to taking char input in Java would be the next().charAt(0).
        //The charAt(0) command is used in combination
        // with the simple next() command which instructs Java to record the next character or string
        // that is input into the command line. This input can be a string, character, or numeral.
        char gender = input.next().charAt(0);
        System.out.println(gender);

        String gender1 = input.next();
        char genderInCharDataType = gender1.charAt(0);
        //String has some methods, like charAt(), equals(),equalsIgnoreCase(), Substring()
        System.out.println(genderInCharDataType);

        String a = input.nextLine();
        System.out.println(a);

        String b = input.next();
        System.out.println(b);

    }
}
