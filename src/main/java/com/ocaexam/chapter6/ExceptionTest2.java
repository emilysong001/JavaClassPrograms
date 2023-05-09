package com.ocaexam.chapter6;

public class ExceptionTest2 {
    public static void main(String[] args) throws Exception {
        new ExceptionTest2().explore();
    }

    void explore() throws Exception {
        fall();
        getUp();
    }

    void fall() throws Exception {
        System.out.println("falls");
        throw new RuntimeException();
        //throw new Exception();
    }

    void getUp(){
        System.out.println("gets up");
    }
}
