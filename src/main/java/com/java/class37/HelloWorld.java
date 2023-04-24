package com.java.class37;

public class HelloWorld {
    public static void main(String[] args) {
        int a = 10,b=0;
        div(a,b);
    }

    static void div(int a,int b) {
        if(b==0){
            throw new RuntimeException("dg");
        } else {
            System.out.println("dgg");
        }
    }
}
