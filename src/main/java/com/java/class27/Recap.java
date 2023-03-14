package com.java.class27;

public class Recap {
    //operator precedence
    public static void main(String[] args) {
        int a = 35, b = 9, c = 3;
        int result = a % b % c;
        int result1 = a + b % c * a / b + c + b / c;
        System.out.println(result);
        System.out.println(result1);
    }
}
