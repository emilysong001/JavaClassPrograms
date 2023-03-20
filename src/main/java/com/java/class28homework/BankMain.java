package com.java.class28homework;

public class BankMain {
    public static void main(String[] args) {
        Bank.addAccount(50000);
        Bank.getInterestRate();
        System.out.println("========================");
        Bank b1 = new Bank("Emily");
        System.out.println("Total Accounts Of Bank is " + Bank.totalAccountsOfBank);
        b1.deposit(1000);
        b1.getBalance();
        Bank.getTotalBalance();
        b1.withdraw(500);
        b1.getBalance();
        Bank.getTotalBalance();
        System.out.println("========================");
        Bank b2 = new Bank("Bai");
        System.out.println("Total Accounts Of Bank is " + Bank.totalAccountsOfBank);
        b2.deposit(10000);
        b2.getBalance();
        Bank.getTotalBalance();
        b2.withdraw(500);
        b2.getBalance();
        Bank.getTotalBalance();


    }

}
