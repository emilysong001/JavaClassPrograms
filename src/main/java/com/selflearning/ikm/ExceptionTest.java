package com.selflearning.ikm;

public class ExceptionTest {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        int z = 3;
        try {
            try {
                System.out.println(x);
                System.out.println(x / y);
                System.out.println(z);
            } catch (ArithmeticException ae) {
                System.out.println("Inner Arithmetic Exception");
                throw ae;
            } catch (RuntimeException re) {
                System.out.println("Inner Runtime Exception");
                throw re;
            } finally {
                System.out.println("Finally");
            }
        } catch (Exception e) {
            System.out.println("Outer Exception");

        }
    }
}
