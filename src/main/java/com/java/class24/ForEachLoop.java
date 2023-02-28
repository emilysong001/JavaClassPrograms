package com.java.class24;

public class ForEachLoop {
    public static void main(String[] args) {
        int data[] = {43, 56, 2, 6, 78, 32};

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }

        System.out.println("using for each loop");
        for ( int i: data) {
            System.out.println(i);
        }

        String strs[] = {"apple","banana"};
        for(String str: strs) {
            System.out.println(str.toCharArray());
        }
    }
}
