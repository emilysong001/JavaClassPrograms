package com.java.class15;

public class Replace2 {
    public static void main(String[] args) {
        //String str = "Devx Adventures World";
        //String str = "Hello Coder Superstar"
        String str = "I went end to College";
        int index = str.indexOf("e");
        System.out.println(str.substring(0,index+1)+str.substring(index+1).replaceFirst("e","X"));
    }

}
