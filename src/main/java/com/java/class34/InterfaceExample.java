package com.java.class34;

interface Bank {
    //void displayMessage();
    /*default void withdraw(){
    }*/
    public static final int a = 1000;
    abstract void displayRateOfInterest();

    void withdraw(int amount);

    void deposit(int amount);

}

interface InternationalBank{
    void displaySwiftCode();
    abstract void displayRateOfInterest();
}

interface InternationalBank1 extends InternationalBank, Bank{

}

class CitiBank implements Bank, InternationalBank{


    @Override
    public void displayRateOfInterest() {
        System.out.println("sfsdf");
    }

    @Override
    public void withdraw(int amount) {

    }

    @Override
    public void deposit(int amount) {

    }

    @Override
    public void displaySwiftCode() {

    }
}

class ChaseBank implements Bank {


    @Override
    public void displayRateOfInterest() {

    }

    @Override
    public void withdraw(int amount) {

    }

    @Override
    public void deposit(int amount) {

    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(25));
    }
}
