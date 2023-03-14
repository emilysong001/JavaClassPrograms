package com.java.class27homework;

public class DogMainClass {
    public static void main(String[] args) {

        System.out.println(Dog.name);
        System.out.println(Dog.age);
        System.out.println(Dog.variety);

        Dog d1 = new Dog(4);
        d1.name = "Jack";
        d1.age = 4;
        d1.variety = "stray";

        System.out.println(Dog.name);
        System.out.println(Dog.age);
        System.out.println(Dog.variety);
        Dog.getDetail();

       /*Dog.growUp().growUp1();
       System.out.println(Dog.age);*/
    }
}
