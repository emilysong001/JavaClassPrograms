package com.java.class32;

public class Main extends ChaseBank{
     void explore(){
         System.out.println(balance);
    }
    public static void main(String[] args) {
       // System.out.println(balance);//error, static method invoked an instance variable
    }
}
