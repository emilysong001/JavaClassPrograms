package com.java.selfpractice3;


public class Car extends Vehicle {
    public static void main(String[] args){
        Vehicle a = new Car();
        boolean result =  a instanceof Car;
        System.out.println( result);
        Vehicle a1 = new Vehicle();
        boolean result1 =  a1 instanceof Vehicle;
        System.out.println( result1);
    }
}
