package com.ocaexam.chapter6;

public class ThrowError {
    //not recommend to handle error, but works
    public static void main(String[] args) throws Error {
        //public static void main(String[] args) {
        new ThrowError().explore();
        System.out.println(new ThrowError().getUp());
    }

    void explore() throws Error {
        try {
            fall();
        }
        finally {
            getUp();
        }
    }

    void fall() throws Error{
        System.out.println("falls");
        //throw new Error();
    }

    Exception getUp(){ //exception can be a return type
        System.out.println("gets up");
        return new Exception("exception");
    }
}
