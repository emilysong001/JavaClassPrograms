package com.java.class19;

public class Factorial {
    public static void main(String[] args) {
        int sum = 1;
        for (int i = 1; i <= 5; i++) {
            sum = sum * i;
        }
        System.out.println(sum);
    }
}
