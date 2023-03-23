package com.java.class29_1;

public class ThisSuperWithConstructor{
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        Dog1 d1 = new Dog1("dog234");
    }
}

class Animal1 {
    Animal1(String name) {
        System.out.println("From Animal " + name);
    }
    Animal1() {
        System.out.println("From Animal ");
    }

}

class Dog1 extends Animal1 {
    Dog1() {
        //this("dog1");
        System.out.println("From Dog1 ");
    }
    Dog1(String name) {
        //super("dog2");
        //this("dog2",true);
        System.out.println("From Dog1 name " + name);
    }

    Dog1(String name, boolean b) {
        System.out.println("From Dog1 name b" + name);
    }
}
