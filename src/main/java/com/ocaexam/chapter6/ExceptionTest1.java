package com.ocaexam.chapter6;

public class ExceptionTest1 {
    public static void main(String[] args) {
        new ExceptionTest1().explore();
    }

    void explore() {
        try {
            fall();
        }
        /*catch(RuntimeException e){
            getUp();
        }*/ finally {
            System.out.println("final");
        } //must have, if there is no catch block

    }

    void fall() {
        System.out.println("falls");
        throw new RuntimeException();
    }

    void getUp() {
        System.out.println("gets up");
    }
}
