package com.java.class10;

import java.util.Scanner;


//homework: in Food ingredients app
//handle invalid inputs:
//if the user entered invalid input on Main course or Appetizer choice print "Invalid Choice"
//if the user entered invalid input on Appetizer choice - print Invalid appetizer choice
//if the user entered invalid input on Main course choice - print Invalid Main course choice

//second part of homework
//add Drinks choice
//users should have Orange juice, Apple juice, pineapple juice
//print out ingreditents for each.

public class Homework10_1 {
    public static void main(String[] args) {
        System.out.println("1. Main Course");
        System.out.println("2. Appetizer");
        System.out.println("3. Drinks");
        Scanner sc = new Scanner(System.in);
        String choice1 = sc.nextLine();

        if (choice1.equalsIgnoreCase("Main Course") || choice1.equals("1")) {
            System.out.println("1. Lagman");
            System.out.println("2. NYC Steak");
            String choiceOfMain = sc.nextLine();

            if (choiceOfMain.equalsIgnoreCase("Lagman") || choiceOfMain.equals("1")) {
                System.out.println("The Lagman Ingredients like this:...");
            } else if (choiceOfMain.equalsIgnoreCase("NYC Steak") || choiceOfMain.equals("2")) {
                System.out.println("The NYC Steak Ingredients like this:...");
            } else {
                System.out.println("Invalid Main course choice. Please input 1. Lagman or 2. NYC Steak");
            }
        }
        else if (choice1.equalsIgnoreCase("Appetizer") || choice1.equals("2")) {
            System.out.println("1. Spring Rolls");
            System.out.println("2. Egg Rolls");
            String choiceOfAppetizer = sc.nextLine();

            if (choiceOfAppetizer.equalsIgnoreCase("Spring Rolls") || choiceOfAppetizer.equals("1")) {
                System.out.println("The Spring Rolls Ingredients like this:...");
            } else if (choiceOfAppetizer.equalsIgnoreCase("Egg Rolls") || choiceOfAppetizer.equals("2")) {
                System.out.println("The Egg Rolls Ingredients like this:...");
            } else {
                System.out.println("Invalid appetizer choice. Please input 1. Spring Rolls or 2. Egg Rolls");
            }
        }
        else if (choice1.equalsIgnoreCase("Drinks") || choice1.equals("3")) {
            System.out.println("1. Orange Drink");
            System.out.println("2. Apple Drink");
            System.out.println("3. Pineapple Drink");
            String choiceOfDrinks = sc.nextLine();

            if (choiceOfDrinks.equalsIgnoreCase("Orange Drink") || choiceOfDrinks.equals("1")) {
                System.out.println("The Orange Drink Ingredients like this:...");
            } else if (choiceOfDrinks.equalsIgnoreCase("Apple Drink") || choiceOfDrinks.equals("2")) {
                System.out.println("The Apple Drink Ingredients like this:...");
            } else if (choiceOfDrinks.equalsIgnoreCase("Pineapple Drink") || choiceOfDrinks.equals("3")) {
                System.out.println("The Pineapple Drink Ingredients like this:...");
            } else {
                System.out.println("Invalid drinks. Please input 1. Orange Drink or 2. Apple Drink or 3. Pineapple Drink");
            }
        }
        else {
            System.out.println("Invalid choice. Please input 1. Main Course or 2. Appetizer or 3. Drinks");
        }
    }

}
