package com.java.class30;

public class Hello {
    int i = 34;

    public static void main(String[] args) {
        Hello h = new Hello();
        Hello h1 = new Hello();
        h.i =65;
        System.out.println(h.i);
        System.out.println(h1.i);
    }
}
