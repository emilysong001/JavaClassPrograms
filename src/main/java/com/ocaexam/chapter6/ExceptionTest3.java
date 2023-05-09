package com.ocaexam.chapter6;

import java.io.IOException;

public class ExceptionTest3 {
    public static void main(String[] args) {
        new ExceptionTest3().explore();
    }

    void explore() {//both runtime exception and error, don't need developer to handle
        try{
            fall();
            getUp();
        }
        catch(RuntimeException e){
            getUp();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("final");
        }

    }

    void fall() throws IOException {
        System.out.println("falls");
        throw new RuntimeException();
    }

    void getUp() throws ExceptionInInitializerError{
        System.out.println("gets up");
        throw new ExceptionInInitializerError();
    }
}
