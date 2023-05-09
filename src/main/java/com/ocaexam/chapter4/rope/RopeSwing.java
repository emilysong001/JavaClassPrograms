package com.ocaexam.chapter4.rope;

public class RopeSwing {
    private static final String leftRope;
    private static final String rightRope;
    private static final String bench = null;
    private static String bench1;
    private static final String name = "name";

    private final String leftRope1;

    /*{
        leftRope1 = "sgdg";
    }*/

    static {
        leftRope = "left";
        rightRope = "right";
        int aaa = 60; //local variable
    }

    static {
      // name = "name";
       // rightRope = "right";
    }

    RopeSwing(){
        leftRope1 = "sgdg";
    }

    public static void main(String[] args) {
       //bench = "bench";
        bench1 = "bench";
        System.out.println(leftRope);

    }
}
