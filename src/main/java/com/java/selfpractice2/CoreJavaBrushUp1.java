package com.java.selfpractice2;

public class CoreJavaBrushUp1 {
    public static void main(String[] args) {

        int myNum = 5;
        String website = "https://devxschool.com/sdet/";
        System.out.println(myNum);
        System.out.println("website：" + website);

        //Arrays
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        int[] arr2 = {1, 2, 4, 5, 6};

        System.out.println(arr.length);
        System.out.println(arr[3]);

        System.out.println(arr2.length);

        //for loop

        for (int i = 0; i < arr2.length; i = i + 1) {
            System.out.println(arr2[i]);
        }

        String[] name = {"Emily", "Thea", "Bai", "Kevin"};
        //loop method 1
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
        //loop method 2
        for (String s : name) {
            System.out.println(s);
        }


    }
}
