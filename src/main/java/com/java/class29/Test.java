package com.java.class29;

public class Test {
    public static void main(String[] args) {
        /*Animal a = new Animal();
        //Lion l = (Lion) new Animal();
        Animal a1 = new Lion();
        System.out.println(a.variety);
        //System.out.println(l.variety);
        System.out.println(a1.variety);*/

        Calculator c = new Calculator();
        c.add(10, 20);
        c.sub(40, 20);

        AdvanceCalculator ac = new AdvanceCalculator();
        ac.mul(10, 20);
        ac.add(10,30);

        Lion l = new Lion();
        l.roar();
        l.eat();
        l.sleep();
        l.run();
        l.walk();


    }
}
