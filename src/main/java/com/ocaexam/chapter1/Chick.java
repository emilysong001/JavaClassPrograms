package com.ocaexam.chapter1;

public class Chick {
    private String name = "Fluffy";
    {
        System.out.println("Setting field");
    }

    public Chick(){
        name = "Tiny";
        System.out.println("setting constructor");
    }

    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);
    }

}
