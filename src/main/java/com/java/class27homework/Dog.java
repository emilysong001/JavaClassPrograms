package com.java.class27homework;

public class Dog {
     static String name = "Carl";
     static int age = 3;
    static String variety = "Pomeranian";

    public Dog(int age) {
        this.age = age;
    }

    public Dog(String name) {
        this.name = name;
    }


    static void getDetail(){
        System.out.println("This is a dog.");
    }

    static Dog growUp(){
        /*Dog d = new Dog();
        age = age+1;
        return d;*/
        return new Dog(5);
    }

    static Dog growUp1(){
        /*Dog d = new Dog();
        age = age+1;
        return d;*/
        return new Dog("Kate");
    }
}
