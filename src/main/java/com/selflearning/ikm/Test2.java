package com.selflearning.ikm;

public class Test2 {

    static int num2 = getValue();
    static int num1 = 10;

    static int getValue(){
        return num1;
    }
    static int sum(){
        return num1+num2;
    }
    static int min(){
        return num1-num2;
    }

    public static void main(String[] args) {
        System.out.println("+   "+sum());
        System.out.println("-     "+min());
    }
}
