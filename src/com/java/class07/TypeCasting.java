package com.java.class07;

public class TypeCasting {
    //incompatible means -> not supported, things that doesn't fit each other
    //2 problems 1) Trying to put decimal pointed numbers into whole number data types
    //2）

    public static void main(String[] args) {
        double gasPrice = 1.99;
        //int wholeNumber = gasPrice;
        //incompatible types compilation error


        //int b =10.5 //incompatible types compilation error
        int a = 40;
        //short smallNum =a; //incompatible types compilation error


        //explicit type casting
        double price = 2.99;
        //(int) is a type casting operator
        int convert = (int) price;

        System.out.println(convert);

        double num2 = 9.01;
        int convert2 = (int) num2;
        System.out.println(convert2);

        System.out.println("---------------");


        float floatNum = 2.4f; //what is f, what's the different between float and double? why should we have float

        byte convert3 = (byte) floatNum;
        System.out.println(convert3);

        System.out.println("-------Implicit Type--------");
        System.out.println("-------Examples--------");
        /*int i =3;
        double a1;
        a1=i;
        System.out.println(a1);
        */

        int num1 =24;
        double doubleNum = num1;
        System.out.println(doubleNum);

        int num3 =55;
        double doubleNum2 = num3;
        System.out.println(doubleNum2);

        //average customer spending on my products
        //I sold 454495.96
        //64 clients
        //find what's the average customer spending

        double total = 4544950.96;
        int clientNumber = 64;
        double average = total/clientNumber;//int clientNumber is implicit converted to double
        System.out.println(average);

        System.out.println("-------------------");

        //I drove 100 miles
        //gallons of gas = 2.4;
        //how many miles per gallon did I drive

        int miles = 100;
        double totalGallons = 2.4;
        double milesPerGallon = miles/totalGallons; //int miles is implicit converted to double
        System.out.println(milesPerGallon);

        int hourOfDay = 10;

        if (hourOfDay <11) System.out.println("Good Morning");




    }
}
