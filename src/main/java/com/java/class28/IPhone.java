package com.java.class28;

public class IPhone {
    static String brand = "IPhone";
    static String operationSystem = "IOS";
    String model;
    int memory;
    String color;

    static void getBasicInfo() {
        System.out.println("The operation system of your "+brand+" is " + operationSystem);
    }

    void getMoreDetails() {

        System.out.println("The memory of your " + brand + " " + model + " is " + memory + "G");
        if (color != null) {
            System.out.println("The color is " + color);
        } else {
            System.out.println("The color is black.");
        }
    }

    IPhone(String model, int memory, String color) {
        this.model = model;
        this.memory = memory;
        this.color = color;
    }
}
