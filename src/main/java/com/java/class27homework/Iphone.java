package com.java.class27homework;

public class Iphone {
    public static String brand = "IPhone";
    static String operationSystem = "IOS";
    String model;
    int memory;
    String color;
    public Iphone() {
        this.model = "12";
        this.memory = 256;
        System.out.println("You got an iphone with default version " + model + " " + memory + " G");
    }
    Iphone(String model, int memory, String color) {
        this.model = model;
        this.memory = memory;
        this.color = color;
    }
    Iphone(String model, int memory) {
        this.model = model;
        this.memory = memory;
    }
    void getDetails() {
        System.out.println("The memory of your " + brand + " " + model + " is " + memory + " G");
        System.out.println("The operation system is " + operationSystem);
        if (color != null) {
            System.out.println("The color is " + color);
        } else {
            System.out.println("The color is black.");
        }
    }
    void call() {
        System.out.println(brand + " " + model + " is calling");
    }
    void text() {
        System.out.println(brand + " " + model + " is texting");
    }
}
