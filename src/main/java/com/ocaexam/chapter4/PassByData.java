package com.ocaexam.chapter4;

public class PassByData {
    public static void main(String[] args) {
        int num =4;
        //newNumber(5);
        //newNumber(num);
        System.out.println(newNumber(5));
        System.out.println(num);
        //System.out.println(newNumber(num));
        num = newNumber(num);
        System.out.println(num);
    }
    /*public static void newNumber(int num){
        num=num+8;
        System.out.println("method"+num);
    }*/

    public static int newNumber(int num){
        num=num+8;
        System.out.println("method"+num);
        return num;

    }
}
