package com.java.class27;

public class Bank {
    double balance;
    String accName;
    String accNumber;

    Bank(String accName, String accNumber) {
        balance = 0;
        this.accName = accName;
        this.accNumber = accNumber;

    }
    Bank(){//constructor
        System.out.println("From No Arg Constructor");
    }
    void Bank(){ //method - name is non convention
        System.out.println("wow Constructor");
    }

    void deposit(double amount) {
        System.out.println(accName + " is trying to deposit " + amount + " into " + accNumber);
        balance = balance + amount;
    }

    void withdraw(double amount) {
        System.out.println(accName + " is trying to withdraw " + amount + " from " + accNumber);
        balance = balance - amount;
    }
}
