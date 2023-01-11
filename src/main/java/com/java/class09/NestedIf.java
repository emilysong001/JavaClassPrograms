package com.java.class09;

import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input outerBoolean");
        //boolean outerBoolean = input.nextBoolean();
        System.out.println("Please input innerBoolean");
        //boolean innerBoolean = input.nextBoolean();

        //first if statement scope{} => is outer if statement

        if (true){

            System.out.println("12.1");

            if (false){
                System.out.println("Hi from inner if statement.12.2");
            }
            else if (true){
                System.out.println("else 12.3");
            }
            else if (true){
                System.out.println("else 12.4");
            }
            else {
                System.out.println("else 12.5");
            }
            System.out.println("12.6");
        }
        else {
            System.out.println("else 12.5");
            if(true){
                System.out.println("12.6");
            }
            else if (true){
                System.out.println("12.7");
            }
            else {
                System.out.println("12.8");
            }
        }
    }
}
