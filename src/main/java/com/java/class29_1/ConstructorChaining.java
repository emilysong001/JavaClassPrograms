package com.java.class29_1;

import org.checkerframework.checker.units.qual.A;

public class ConstructorChaining {
    public static void main(String[] args) {
        Pets pet = new Pets();
    }
}

class Animal {
   /* Animal(String name) {
        //super();
        System.out.println("From Animal " + name);
    }*/
}

class Dog extends Animal {
   /* Dog(String name) {
        //super(name);
        super("ABC");
        System.out.println("From Dog " + name);
    }*/
}

class Pets extends Dog {
    /*Pets() {
        super("john");
        System.out.println("From Pets");
    }*/
}

