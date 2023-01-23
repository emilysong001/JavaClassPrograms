package com.java.class13;


//what's static method
//it is predefined function
// that can be used without creating an object

//what's object
//it is an instance of a class

//what is a non-static method
//it is an instance method
//in order to use instance method in the static
// you must create an object
public class InstanceMethods {

    public static void main(String[] args) {
        print();
        InstanceMethods someVarName = new InstanceMethods();
        someVarName.print1();
    }

    public static void print() {
        System.out.println("Hello");
    }

    public void print1() {
        System.out.println("Hello");
    }
}
