package com.ocaexam.chapter6;

import java.io.IOException;

class HasSoreThroatException extends Exception {
}

class TiredException extends RuntimeException {
}

interface Roar {
    void roar() throws HasSoreThroatException;
}

public class Lion implements Roar {
    /*public void roar() throws TiredException{

    }*/
    /*public void roar() {

    }*/
    public void roar() throws IllegalArgumentException {

    }

    public static void main(String[] args) {
        try {
            System.out.println("work real hard");
        } catch (StackOverflowError e) {

        } catch (RuntimeException e) {

        }
    }
}