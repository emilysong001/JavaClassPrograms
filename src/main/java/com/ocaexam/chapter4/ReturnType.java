package com.ocaexam.chapter4;

public class ReturnType {

    static int a = 10;
    int b = 2;
    public ReturnType() {
        a++;
    }
    public static void main(String[] args) {
        test();
        ReturnType rt = new ReturnType();
        System.out.println("a"+a);
        System.out.println(rt.howMany(true, true,true));
        System.out.println(rt.howMany(true, new boolean[2]));
        //System.out.println(rt.howMany(true, {true,true})); error
    }

    static void test(){
        ReturnType rt = new ReturnType();
        System.out.println("-----");
        System.out.println("-----"+a);
        System.out.println("-----"+rt.a);
        System.out.println("-----"+rt.b);
        //return;
    }

    public int howMany(boolean b, boolean...b2){
        return b2.length;
    }
}
