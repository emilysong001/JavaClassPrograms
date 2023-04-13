package com.java.class33;

class Bank1 {
    int accountNumber;

    //private Bank(){ //error
    Bank1() {
        accountNumber = 978192368;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

public class Question8 {
    public static void main(String[] args) {
        Bank1 b = new Bank1();
        System.out.println(b.getAccountNumber());
        System.out.println(fun());
    }

    static int fun(){
        //static int x = 0;//error //local variable can't be static
        //public/protected/private int x = 0; //error
        //final int x = 0;//works
        int x = 0;
        return ++x; //return 1
        //return x++; //return 0
    }
}

