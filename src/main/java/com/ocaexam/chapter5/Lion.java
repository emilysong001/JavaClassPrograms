package com.ocaexam.chapter5;

public class Lion extends Animal{
    private void roar(){
        System.out.println(getAge());
        //System.out.println(age);
    }

    public static void main(String[] args) {
        Lion l = new Lion();
        System.out.println(l.getAge());
        Animal a = new Animal();
        System.out.println(a.getAge());
        //System.out.println(a.age);

        //Lion.r();
        //r();


    }

    /*public static void r() {
        Lion l = new Lion();
        System.out.println(l.getAge());
        Animal a = new Animal();
        System.out.println(a.getAge());
        // System.out.println(a.age);
    }*/
}
