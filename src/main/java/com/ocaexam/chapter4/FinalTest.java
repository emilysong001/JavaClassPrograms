package com.ocaexam.chapter4;

public class FinalTest {

    /*public final static int LENGTH;
    {
        //LENGTH =10;
    }
    static{
        LENGTH =10;
    }
    public FinalTest() {
        //LENGTH =10;
    }*/

    static String result = "";
    {
        result += "c";
    }
    static{
        result += "u";
    }
    {
        result += "r";
    }

    public static void main(String[] args) {
        System.out.println(result+" ");
        System.out.println(result+" ");
        new FinalTest();
        new FinalTest();
        System.out.println(result+" ");
    }
}
