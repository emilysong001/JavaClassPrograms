package com.ocaexam.chapter4.chimp;

import com.ocaexam.chapter4.rope.*;
import static com.ocaexam.chapter4.rope.Rope.*;

public class Chimp {


    Rope rope1 = new Rope();
    private static Rope rope2 = new Rope();
    {
        System.out.println(Rope.length);
        System.out.println(rope1.length);
    }

    public static void main(String[] args) {
        /*swing();
        Rope.swing();
        new Rope().swing();
        System.out.println(LENGTH);*/

        Rope rope3 = new Rope();
        System.out.println(rope3.length);

        //rope1.length =2;
        rope2.length =8;

        //System.out.println(rope1.length);


    }


}
