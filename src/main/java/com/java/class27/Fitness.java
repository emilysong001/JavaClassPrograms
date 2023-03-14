package com.java.class27;

public class Fitness {
    String name;
    int age;
    boolean membership;
    String[] vip = {"Jack", "Emily"};

    Fitness() {
        System.out.println("Welcome to the fitness");
    }

    Fitness(String name, int age, boolean membership) {
        this.name = name;
        this.age =age;
        for (String i:vip) {
            if(name.equalsIgnoreCase(i)){

            }
        }
    }
}
