package com.java.class06;

//import statement is a statement that tell our classes to use
// functionalities from different package
import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        //compiling a code => checking if we are matching all syntax rules

        //before you can use scanner, you have to have import statement
        //before public class line
        Scanner input = new Scanner(System.in);
        //it will allow us to enter a integer
        input.nextInt();
        //user can write any type
        input.nextLine();
        //user can write any decimal
        input.nextDouble();
        //user can write true or false
        input.nextBoolean();


    }
}
