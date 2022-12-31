package com.java.class04;

public class ExpressionExample {
    public static void main(String[] args) {
        System.out.println(3*5/15*10/2/2);
        System.out.println(10-5*2/10+6*3-16*2);
        System.out.println((10-5)*(2/10)+6*3-16*(2+2));
        System.out.println(15/3*5);
        System.out.println(3*5/15);
        System.out.println(5/15);
        System.out.println(3*(5/15));
        int a = 3;//定义一个变量；
        int b = ++a;//自增运算
        int c = 3;
        int d = --c;//自减运算
        System.out.println("进行自增运算后的值等于"+b);
        System.out.println(a);
        System.out.println("进行自减运算后的值等于"+d);
        System.out.println(c);
        int a1 = 3;//定义一个变量；
        int b1 = a1++;//自增运算
        int c1 = 3;
        int d1 = c1--;//自减运算
        System.out.println("进行自增运算后的值等于"+b1);
        System.out.println(a1);
        System.out.println("进行自减运算后的值等于"+d1);
        System.out.println(c1);
    }
}
