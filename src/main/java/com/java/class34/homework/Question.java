package com.java.class34.homework;

public class Question {
    public static void main(String[] args) {
        C c = new C();
        c.method1();
        c.method2();
        c.method3();
        Parent p = new Child();
        Child p1 = new Child();
    }
}

abstract class A {
    abstract void method1();

    void method2() {
        System.out.println("Second");
        method1();
    }
}

abstract class B extends A {
    void method1() {
        System.out.println("First");
        method3();
    }

    abstract void method3();
}

class C extends B {
    void method3() {
        System.out.println("Third");
    }
}

abstract class Parent {
    public abstract void method4();
}

class Child extends Parent {
    @Override
    public void method4() {

    }
}