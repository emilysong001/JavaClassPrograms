package com.java.class26homework;

public class Phone {
    String brand;
    String model;
    int memory;
    private String operationSystem;
    Phone(String brand, String model, int memory) {
        this.brand = brand;
        this.model = model;
        this.memory = memory;
    }
    void getOperationSystem() {
        if (brand.equalsIgnoreCase("iPhone")) {
            operationSystem = "IOS";
        } else {
            operationSystem = "Android";
        }
        System.out.println("The operation system is: " + operationSystem);
    }
    void getDetails() {
        System.out.println("The memory of your " + brand + " " + model + " is " + memory);
    }
    void call() {
        System.out.println(brand + " " + model + " is calling");
    }
    void text() {
        System.out.println(brand + " " + model + " is texting");
    }
}
