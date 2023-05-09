package com.selflearning;

import com.google.common.collect.Multimap;

import java.util.ArrayList;
import java.util.Collection;

public class StringPractice1 {

    public static void main(String[] args) {
        String a = "";
        String b = null;
        String l1 = "Welcome to Java World.";
        String l2 = "Hello";
        String l3 = "My name is Emily";
        System.out.println(a);
        System.out.println(trim(a));
        System.out.println(trim(b));
        System.out.println(trim(l1));
        System.out.println(trim(l2));
        System.out.println(trim(l3));
        System.out.println("==============================");
        System.out.println(trimOrNull(a));
        System.out.println(trimOrNull(b));
        System.out.println(trimOrNull(l1));
        System.out.println(trimOrNull(l2));
        System.out.println(trimOrNull(l3));
        System.out.println("==============================");
        System.out.println(trimOrEmpty(a));
        System.out.println(trimOrEmpty(b));
        System.out.println(trimOrEmpty(l1));
        System.out.println(trimOrEmpty(l2));
        System.out.println(trimOrEmpty(l3));
        System.out.println("==============================");

        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7

        /*Multimap<String, String> str = null;
        Collection<String> str1 = new ArrayList<>();
        Collection<String> str2 = str.get("person");

        Collection<String> str3 = null;*/
        /*if (str3.size() == 0) {
            throw new NullPointerException();
        }*/

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        Object[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};

        System.out.println("==============================");

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        /*for (type variable : arrayname) {
  ...
        }*/

        for (String i : cars) {
            System.out.println(i);
        }//The example above can be read like this:
        // for each String element (called i - as in index) in cars, print out the value of i.

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
    }

    public static String trim(String s) {
        return s == null ? null : s.trim();
    }

    public static String trimOrNull(String s) {
        String temp = trim(s);
        return temp != null && temp.length() != 0 ? temp : null;
    }

    public static String trimOrEmpty(String s) {
        String temp = trim(s);
        return temp != null && temp.length() != 0 ? temp : "";
    }
}
