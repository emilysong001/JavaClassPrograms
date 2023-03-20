package com.java.class28homework;

public class Practice {
    int i = 8;
    int j = 9;

    public static void main(String[] args) {
        String value = "abc";
        changeValue(value);
        System.out.println(value);
        //System.out.println(add());
    }

    public static void changeValue(String a) {
        a = "xyz";
    }

    /*public static int add(){
        int k = i+j; //i,j error
        System.out.println(k);
    }*/

}
