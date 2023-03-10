package com.java.class26;

public class Bank {
    //boolean isSavingAccount;
    double balance;
    String accName;

    void deposit(double amount){
        balance = balance + amount;
    }

    void withdraw(double amount){
        balance = balance - amount;
    }
}
