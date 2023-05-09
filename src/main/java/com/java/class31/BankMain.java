package com.java.class31;

public class BankMain {
    public static void main(String[] args) {

        Paypal chiragPaypal = new Paypal();

        ChaseBank chiragCB = new ChaseBank();
        CitiBank chiragCiti = new CitiBank();

        chiragPaypal.displayRateOfInterest(chiragCB);
        chiragPaypal.displayRateOfInterest(chiragCiti);
    }
}
