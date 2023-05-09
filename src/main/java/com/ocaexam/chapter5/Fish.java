package com.ocaexam.chapter5;

public class Fish {
    protected int size;
    private int age;

    public Fish(int age) {
        this.age = age;
        System.out.println("Fish"+this.age);
    }

     int getAge() {
        return age;
    }
}
