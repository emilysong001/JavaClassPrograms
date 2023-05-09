package com.ocaexam.chapter5;

public class Rodent {
    //protected int tailLength = 4;
    static int tailLength = 4;
    public void getRodentDetails(){
        System.out.println("[parentTail="+tailLength+"]");
    }
    static int getTailLength(){
        return 10;
    }
}
