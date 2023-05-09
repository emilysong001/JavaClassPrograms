package com.ocaexam.chapter1;

public class Egg {
    public Egg() {
        number = 5;
    }
    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println(egg.number);
        System.out.println(Integer.MAX_VALUE);
    }
    private int number = 3;
    { number = 4; }
}
