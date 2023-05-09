package com.ocaexam.chapter6;

import java.io.IOException;

public class ExceptionTest4 {
    public static void main(String[] args) {
        new ExceptionTest4().explore();
    }

    void explore() {//both runtime exception and error, don't need developer to handle
        try{
            fall();
        }
       catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("final");
        }

    }

    void fall() throws IOException {
        System.out.println("falls");
        //throw new RuntimeException();
        throw new IOException();
    }

    void ohNo() throws IOException {
        System.out.println("it's ok");
        //throw new Exception(); //error
        throw new IllegalArgumentException();
        //throw new IOException();
        //throw new java.io.IOException();
        //throw new RuntimeException();


    }
}
