package com.java.class32;

public class MainClass {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Emily");
        p.setAge(25);
        p.setGender("Female");
        p.setOccupation("SDET");
        System.out.println(p.getName());
        System.out.println(p.getAge());//Female is always 18.
        System.out.println(p.getGender());
        System.out.println(p.getOccupation());
    }
}
