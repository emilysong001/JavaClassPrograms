package com.ocaexam.chapter4;

public class StringBuilders {
    public static StringBuilder work(StringBuilder a,StringBuilder b){
        a = new StringBuilder("a");
        //a.append("a");
        b.append("b");
        return a;
    }

    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("s1");
        StringBuilder s2 = new StringBuilder("s2");
        StringBuilder s3 = work(s1,s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
