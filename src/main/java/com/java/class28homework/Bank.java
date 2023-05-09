package com.java.class28homework;

public class Bank {
    public static int totalAccountsOfBank = 0;
    public static double totalBalance = 0.0;
    public static double interestRate = 0.05; // 5% interest rate per year
    public int accountNumber;
    public double accountBalance;
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
        totalAccountsOfBank++;
        accountNumber++;
    }

    public static void addAccount(double initialBalance) {
        totalAccountsOfBank++;
        totalBalance += initialBalance;
        System.out.println("Total Accounts Of Bank is " + totalAccountsOfBank);
        System.out.println("Total Balance Of Bank is " + totalBalance);
    }

    public static void getInterestRate() {
        System.out.println("The current interest rate is " + interestRate);
    }

    public double deposit(double amount) {
        accountBalance = accountBalance + amount;
        totalBalance = totalBalance + amount;
        return accountBalance;
    }

    public double withdraw(double amount) {
        accountBalance = accountBalance - amount;
        totalBalance = totalBalance - amount;
        return accountBalance;
    }

    public void getBalance() {
        System.out.println("The current balance of account " + bankName + " is: " + accountBalance);
    }

    public static void getTotalBalance() {
        System.out.println("The bank total balance is: " + totalBalance);
    }
}
