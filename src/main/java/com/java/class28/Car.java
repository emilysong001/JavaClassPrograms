package com.java.class28;

public class Car {
    int speed = 200; //instance variable
    String color = "white";
    static int price = 600;

    static void drive() {
        int speed = 100; //local variable
        System.out.println(speed);
        //System.out.println(color); //error
        //inside the static method you can only use the static variables
    }
}
