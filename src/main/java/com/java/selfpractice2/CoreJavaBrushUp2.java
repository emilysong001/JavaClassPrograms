package com.java.selfpractice2;

import java.util.ArrayList;
import java.util.*;

public class CoreJavaBrushUp2 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 6, 8, 10, 122};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
                break;//any condition meet, it will jump out loop
            }
            else{
                System.out.println(arr[i]+" is an odd data");
            }
            /*if (arr[i] == "Emily") {
                System.out.println(arr[i]);
                break;//any condition meet, it will jump out loop
            }*/
        }

        ArrayList<String> a = new ArrayList<String>();
        a.add("Emily");
        a.add("Bai");
        a.add("Kevin");
        a.add("Thea");
        a.remove(2);
        System.out.println(a.get(0));

        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
        System.out.println("***********");

        for (String s:a) {
            System.out.println(s);
        }

        System.out.println(a.contains("Emily"));

        String[] name = {"Emily", "Thea", "Bai", "Kevin"};
        List<String> nameArrayList = Arrays.asList(name);
        //nameArrayList.add("Wide");
        System.out.println(nameArrayList.get(0));
        System.out.println(nameArrayList.contains("Emily"));





    }
}
