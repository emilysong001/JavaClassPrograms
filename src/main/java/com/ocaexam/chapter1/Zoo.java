package com.ocaexam.chapter1;

import java.util.Date;
import java.util.Random;

public class Zoo {
    public static void main(String[] args) {
        //System.out.println(args[0]);
        //System.out.println(args[1]);
        Random r= new Random();
        System.out.println(r.nextInt(10000));
        //prints out a random number between 0 and 10000
        //naming conflicts
        Date date = new Date();
        java.sql.Date sqlDate;
    }
}
