package com.ocaexam.chapter5;

public class Animal {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(a.age);
        Lion l = new Lion();
        //System.out.println(l.age);
        l.setAge(5);
       System.out.println(l.getAge());
    }

}
