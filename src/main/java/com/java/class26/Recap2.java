package com.java.class26;

public class Recap2 {
    public static void main(String[] args) {
        /*int i = 1;
        do {
            i--;
        } while (i > 2);
        System.out.println(i);*/
        System.out.println(test());
        System.out.println(test1());

    }
    public static int test(){
        int i = 1;
        do {
            i--;
        } while (i > 2);
       return i;
    }

    public static int test1(){
        int i = 1;
            i++;
        return i;
    }
}
