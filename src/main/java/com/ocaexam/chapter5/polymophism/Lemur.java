package com.ocaexam.chapter5.polymophism;

public class Lemur extends Primate implements HasTail{
    @Override
    public boolean isTailStriped() {
        return false;
    }

    public int age = 10;

    public void getDetail(){
        System.out.println(HasTail.getTail());
    }

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        System.out.println(lemur.isTailStriped());
        System.out.println(lemur.hasHair());

        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());
        //System.out.println(hasTail.hasHair());

        Primate primate = lemur;
        System.out.println(primate.hasHair());
        //System.out.println(primate.isTailStriped());


        Primate primate1 = new Primate();
        System.out.println(primate1.hasHair());
        //System.out.println(primate.isTailStriped());

        Lemur lemur2 = (Lemur) primate;
        System.out.println(lemur2.age);
        System.out.println(lemur2.isTailStriped());
        System.out.println(lemur2.hasHair());


        /*Lemur lemur3 = (Lemur) primate1; // class cast exception - runtime exception
        System.out.println(lemur3.age);
        System.out.println(lemur3.isTailStriped());
        System.out.println(lemur3.hasHair());*/
    }
}
