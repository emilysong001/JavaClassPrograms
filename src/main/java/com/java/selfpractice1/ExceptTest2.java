package com.java.selfpractice1;

public class ExceptTest2 {
    public static void main(String[] args) {
        String input = "15a";
        try {
            float ft = Float.parseFloat(input);
            System.out.println(ft);
        } catch (NumberFormatException nfe) {
            System.out.println(" Oops: " + nfe.getMessage());
        }

        int[] a = new int[2];
        try {
            System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown  :" + e);
        } finally {
            System.out.println("out of block");
            a[0] = 6;
            System.out.println("First element value: " + a[0]);
            System.out.println("The finally statement is executed");
        }
    }
}
