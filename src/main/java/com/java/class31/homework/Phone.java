package com.java.class31.homework;

public class Phone {
    void call(){
        System.out.println("calling");
    }
    void text(){
        System.out.println("texting");
    }
    void repair(){
        System.out.println("repairing");
    }
}

class AndroidPhone extends Phone{
    @Override
    void repair() {
        System.out.println("AndroidPhone need to be repaired");
    }
}

class IPhone extends Phone{
    @Override
    void repair() {
        System.out.println("IPhone need to be repaired");
    }
}

