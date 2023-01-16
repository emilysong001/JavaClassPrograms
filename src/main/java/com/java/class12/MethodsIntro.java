package com.java.class12;

public class MethodsIntro {
    //methods are predefined logic that can be used
    // to execute through the whole project.
    public static void main(String[] args) {
        //when your method has a return type, you should use the result
        //and save it into a variable
        //double spentAmount = 1000;
        //double taxPercent;
        //double tax = calculateTax2(spentAmount, taxPercent);
        //System.out.println(tax);
        System.out.println("==============");
        sayHello();
        System.out.println("==============");
        double salary = 1000000;
        double tax = calculateTax3(salary);
        System.out.println(tax);
    }

    //1. put an access modifier ->public, protected, default, private
    //2. static
    //3. return data type - it is the data type of the result info
    // of the function(method), can be any data type, also be void
    // ->doesn't return any result, ex. just print something
    //when the return type is not void, you must have return statement;
    //return statement must be followed by a value that has the same data type
    //or calculation
    //4. method name() -> name should be meaningful and follow camelCase
    //the body can be as large as you need to be, you can have calculations
    //have if, switch anything
    /*public static double calculateTax() {
        return 10.0 * 5.0;
    }*/

    public static void sayHello() {
        int year = 2023;
        double targetSalary = 130000;
        System.out.println("Hello " + year);
        System.out.println("My target salary is " + targetSalary);
    }

    /*public static double calculateTax2(double spentAmount, double taxPercent) {
        double tax = spentAmount + (spentAmount * taxPercent);
        return tax;
    }*/

    /*public static double calculateTax3(double salary) {
        double taxPercent;
        if (salary <= 100000) {
            taxPercent = 0.1;
        } else {
            taxPercent = 0.15;
        }
        double tax = salary * taxPercent;
        return tax;
    }*/

    public static double calculateTax3(double salary) {
        if (salary <= 100000) {
            return salary * 0.1;
        } else {
            return salary * 0.15;
        }
    }
}
