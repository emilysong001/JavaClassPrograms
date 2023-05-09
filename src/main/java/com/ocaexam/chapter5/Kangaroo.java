package com.ocaexam.chapter5;

public class Kangaroo extends Marsupial {
    /*public static boolean isBiped(){
        return true;
    }*/

    public boolean isBiped(){
        return true;
    }

    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: "+isBiped());
    }

    public static void main(String[] args) {
        Kangaroo k = new Kangaroo();
        k.getMarsupialDescription();
        k.getKangarooDescription();
    }
}
