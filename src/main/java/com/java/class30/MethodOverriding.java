package com.java.class30;

public class MethodOverriding {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.getBank();
        System.out.println(b.balance);
        BankOfAmerica ba = new BankOfAmerica();
        ba.getBank();
        System.out.println(ba.balance);
        Bank bm = new BankOfAmerica();
        bm.getBank();
        System.out.println(bm.balance);
    }
}

class Bank{
    public int balance = 10;
    void getBank(){
        System.out.println("hello");
    }
}


class BankOfAmerica extends Bank{
    public int balance = 20;
    void getBank(){
        System.out.println("welcome");
    }
}
