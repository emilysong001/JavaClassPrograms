package com.java.class33;

abstract class Bank {
    int balance;

    public abstract void displayRateOfInterest();

    public void withdraw(int amount) {
        balance = balance - amount;
    }

    Bank(){
        System.out.println("constructor");
    }

}

class CitiBank extends Bank {
    public void displayRateOfInterest() {
        System.out.println("5.0");
    }
}

class ChaseBank extends Bank {
    public void displayRateOfInterest() {
        System.out.println("6.0");
    }
}

public class AbstractClass1 {
    public static void main(String[] args) {
        Bank b = new CitiBank();
        b.displayRateOfInterest();
    }
}
