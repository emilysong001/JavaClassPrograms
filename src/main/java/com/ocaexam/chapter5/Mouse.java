package com.ocaexam.chapter5;

public class Mouse extends Rodent{
   //protected int tailLength = 8;
    static int tailLength = 8;
    public void getMouseDetail(){
        System.out.println("[tail="+tailLength+",parentTail="+super.tailLength+"]");
    }

    public void getDetail(){
        System.out.println(getTailLength());
    }

    public static void main(String[] args) {
        Mouse m = new Mouse();
        /*m.getRodentDetails();
        m.getMouseDetail();*/
        System.out.println(tailLength);
       // System.out.println(m.tailLength);

        Rodent r = new Rodent();
        System.out.println(tailLength);
        //System.out.println(super.tailLength); //error
        //System.out.println(r.tailLength);

        Rodent r1 = new Mouse();
        System.out.println(tailLength);
        //System.out.println(r1.tailLength);
    }
}
