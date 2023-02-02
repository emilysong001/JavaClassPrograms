package com.java.class18;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        print(10,1);
        ATM();
    }

    public static void ATM() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the ATM Machine");
        System.out.println("Please enter your account opening balance:");
        double balance = sc.nextDouble();
        int moreOperation;
        do {
            System.out.println("Please choose the operations you want to perform: 1. Withdraw, 2.Deposit, 3. Check Balance");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Please enter the amount you want to withdraw: ");
                int withdraw = sc.nextInt();
                balance -= withdraw;
                System.out.println("The available balance is:" + balance);
            } else if (choice == 2) {
                System.out.println("Please enter the amount you want to deposit: ");
                int deposit = sc.nextInt();
                balance += deposit;
                System.out.println("The available balance is:" + balance);
            } else if (choice == 3) {
                System.out.println("The available balance is:" + balance);
            } else {
                System.out.println("Wrong Input");
            }
            System.out.println("Do you want to perform more operations? Press 1 for yes, Press 2 for No");
            moreOperation = sc.nextInt();
        } while (moreOperation == 1);
    }

    //Write a program to print numbers from 10 to 1 using a do-while loop
    public static void print(int i, int j){
        do {
            System.out.println(i);
            i--;
        } while (i >= j);
    }
}

