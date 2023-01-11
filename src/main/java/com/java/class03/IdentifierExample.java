package com.java.class03;

//Class 03
/*Identifier -user defined name which are giving to class or method or variable
Rules of Identifier:
1. Allowed character:0-9, A-Z,a-z,$,_
2. can't start with digit
3. It is case-sensitive
4. we can't use keyword reserved by Java
Need a address/location - store data
Data Types - name which is given to a variable to identify which kind of data can be stored
1MB(Megabyte)=1024KB
1KB(KiloByte）=1024Byte
1 Byte= 8 bits

 */

public class IdentifierExample {

    public static void main(String[] args) {
        byte sum1= 10+20;
        //System.out.println(sum1);

        byte x1=10;
        byte x2=20;
        int sum2 = x1 + x2;
        System.out.println(sum2);


        byte num1 =-128;
        short num2=343;
        int num3=2147483647;
        long num4=523644;
        float num5=35264.789f;
        double num6=45554584.4844;
        String name = "Merry Christmas";
        char gender='M';
        char capital = 77;
        int a= gender+capital;
        short a1=1235;
        short a2= 16532;
        int a3=a1+a2;
        boolean answer= true;

        System.out.println("char:"+a);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(name);
        System.out.println(gender);
        System.out.println(capital);
        System.out.println(answer);

    }
}
