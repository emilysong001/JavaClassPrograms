package com.selflearning;

public class Varargs {
    public static void main(String[] args) {
        walk(1);
        walk(1, null); //throw an exception
        //walk(1,2,null); //error
    }

    public static void walk(int start, int... nums) {
        System.out.println(nums.length);
    }
}
