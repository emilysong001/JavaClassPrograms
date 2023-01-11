package com.java.class10;

import java.util.Scanner;

public class NestedRecap {

    //let's design the logic for restaurant app
//first users should be given 2 options:
//appetizer or main course
//if user picks appetizers
//we should show users 2 appetizer.
//1: spring rolls
//2: egg rolls
//once user is shown appetizer options they should be able select one
//appetizer.
//if user selects spring roll: print out spring roll ingredients
///if user selects egg roll: print out egg roll ingredients

//if user picks main course
//show
//1. Lagman
//2. New York Rib Eye steak
//if user selects Lagman: print out Lagman  ingredients
//if user selects New York Rib Eye steak: print out New York Rib Eye steak ingredients

    public static void main(String[] args) {
        System.out.println("1. Main Course");
        System.out.println("2. Appetizer");
        Scanner sc = new Scanner(System.in);
        String choice1 = sc.nextLine();

        if (choice1.equalsIgnoreCase("Appetizer") || choice1.equals("2")) {
            System.out.println("1. Spring Rolls");
            System.out.println("2. Egg Rolls");
            String choiceOfAppetizer = sc.nextLine();

            if (choiceOfAppetizer.equalsIgnoreCase("Spring Rolls") || choiceOfAppetizer.equals("1")) {
                System.out.println("The Spring Rolls Ingredients like this:...");
            }
            else if (choiceOfAppetizer.equalsIgnoreCase("Egg Rolls") || choiceOfAppetizer.equals("2")) {
                System.out.println("The Egg Rolls Ingredients like this:...");
            }
            else {
                System.out.println("Invalid input. Please input 1. Spring Rolls or 2. Egg Rolls");
            }
        }
        else if (choice1.equalsIgnoreCase("Main Course") || choice1.equals("1")) {
            System.out.println("1. Lagman");
            System.out.println("2. NYC Steak");
            String choiceOfMain = sc.nextLine();

            if (choiceOfMain.equalsIgnoreCase("Lagman") || choiceOfMain.equals("1")) {
                System.out.println("The Lagman Ingredients like this:...");
            }
            else if (choiceOfMain.equalsIgnoreCase("NYC Steak") || choiceOfMain.equals("2")) {
                System.out.println("The NYC Steak Ingredients like this:...");
            }
            else {
                System.out.println("Invalid input. Please input 1. Lagman or 2. NYC Steak");
            }
        }
        else {
            System.out.println("Invalid input. Please input 1. Main Course or 2. Appetizer");
        }


    }
}
