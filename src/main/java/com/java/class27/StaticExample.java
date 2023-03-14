package com.java.class27;

class Car {
    int price;  //each object has its own price
    static int salesPrice;

    //static int price; //this will be different thing, all objects share the price variable
    Car() {
        price++;
    }

    void count() {
        System.out.println(price);
    }
}


public class StaticExample {
    public static void main(String[] args) {
        Car audi = new Car();
        Car bmw = new Car();
        Car honda = new Car();

        //each object has its own price
        System.out.println(audi.price); //1
        System.out.println(bmw.price); //1
        System.out.println(honda.price); //1

        /*audi.count();
        bmw.count();
        honda.count();
        */


        Car audi1 = new Car();
        System.out.println(audi1.salesPrice); //0
        Car bmw1 = new Car();
        System.out.println(bmw1.salesPrice); //0
        Car honda1 = new Car();
        System.out.println(honda1.salesPrice); //0


        System.out.println(Car.salesPrice); //0

    }
}