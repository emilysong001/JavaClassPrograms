package com.ocaexam.chapter6;

public class MultiException {

    public static void main(String[] args) {
        /*System.out.print("a");
        try {
            System.out.print("b");
            throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException e) {
            System.out.print("c");
            throw new RuntimeException("1");
        }
        catch (RuntimeException e) {
            System.out.print("d");
            throw new RuntimeException("2");
        }
        finally {
            System.out.print("e");
            throw new RuntimeException("3");*/

            System.out.print("a");
            try {
                System.out.print("b");
                throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException e) {
                System.out.print("c");
                try {
                    throw new RuntimeException("1");
                } catch (RuntimeException e1) {
                    System.out.print("d");
                    throw new RuntimeException("2");
                }
            }
    }
}
