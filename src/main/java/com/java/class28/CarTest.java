package com.java.class28;

public class CarTest {
    public static void main(String[] args) {
        //int num; //error local variable must be initialized
        //System.out.println(num);
        Car c = new Car();
        c.drive(); //100
        System.out.println(c.speed); //200
        //System.out.println(speed); //error, no local variable speed
        //System.out.println(Car.speed); //error, not a static variable
        System.out.println(Car.price); //600
        System.out.println(c.price); //600


    }
}
