package com.java.class29_1;

public class ThisSuperWithMethods {
    public static void main(String[] args) {
        ChaseBank cb = new ChaseBank();
        cb.display();
    }
}

class Bank{
    void displayRate(){
        System.out.println("4.0%");
    }
}

class ChaseBank extends Bank{
    /*void displayRate(){
        System.out.println("6.0%");
        super.displayRate();
    }*/

    void display(){
        System.out.println("6.0%");
        displayRate();
    }

}

class TDBank extends ChaseBank{
    /*@Override
    void displayRate() {
        super.displayRate();
        System.out.println("5.0%");
    }*/
}