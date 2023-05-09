package com.java.class29_1homework;

public class MainClass {
    public static void main(String[] args) {
        Salad salad = new Salad();
    }
}
class Food {
    public Food() {
        this("beef");
        System.out.println("From Food no args constructor");
    }
    public Food(String name) {
        System.out.println("From Food parameter constructor: " + name);
    }
}
class VegFood extends Food {
    public VegFood() {
        this("tomato");
        System.out.println("From VegFood no args constructor");
    }
    public VegFood(String name) {
        super();
        System.out.println("From VegFood parameter constructor: " + name);
    }
}
class Salad extends VegFood {
    public Salad() {
        this("sesame salad");
        System.out.println("From Salad no args constructor");
    }
    public Salad(String name) {
        super("super salad");
        System.out.println("From Salad parameter constructor: " + name);
    }
}
