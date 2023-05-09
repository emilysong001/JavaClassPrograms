package com.java.class29_1homework;

public class Question {
    public static void main(String[] args) {
        Child c = new Child();
    }
}

class Parent {
    public Parent() {
        System.out.println("From Base");
    }
}

class Child extends Parent {
    Child() {
        this("Hello!");
        //super();
        System.out.println("Welcome!");
    }

    Child(String str) {
        System.out.println(str);
    }
}
