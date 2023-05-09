package com.java.class29_1;

public class Constructor {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        //SportsCar sportsCar1 = new SportsCar(100);

    }
}

class Vehicle{
    int a ;
     Vehicle() {
        System.out.println("From Vehicle");
    }

    Vehicle(int a) {
        System.out.println("From Vehicle"+a);
    }
}

class Car extends Vehicle{

    Car(int a) {
        super(a);
    }
}

class SportsCar extends Car{
    SportsCar() {
        super(1);
        System.out.println("From SportsCar");
    }
     /*SportsCar(int i) {
         System.out.println("From SportsCar"+i);
    }*/
}
