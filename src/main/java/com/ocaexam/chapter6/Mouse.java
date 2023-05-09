package com.ocaexam.chapter6;

public class Mouse {
    public String name;
    public void run() {
        System.out.print("1");
        try {
            System.out.print("2");
            name.toString();
            System.out.print("3");
        }
        catch (NullPointerException e) {
            System.out.print("4");
            throw e;
            //throw e;
        }
            System.out.println("5");
    }

    public static void main(String[] args) {
        Mouse jerry = new Mouse();
        //jerry.name = "Leroy";
        jerry.run();
        System.out.println("6");
    }
}
