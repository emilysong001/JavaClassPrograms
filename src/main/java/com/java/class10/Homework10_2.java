package com.java.class10;

import java.util.Scanner;

public class Homework10_2 {

  /*  Write a program for online shopping website:
    An online shopping website uses a nested if statement to determine the shipping cost for an order
    based on the weight of the order and the shipping destination.
    Take user inputs for:
    double weight, destination.
    If the weight of the order is less than 2 lbs and the shipping destination is within the United States,
    the shipping cost is $5.
    If the weight of the order is 2 lbs or more and the shipping destination is within the United States,
    the shipping cost is calculated based on the weight of the order. users pay 50 cents per lbs.
    If the shipping destination is outside the United States, the shipping cost is calculated
    based on the weight of the order at special rate. $1.5 per lbs.
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Destination: United States/US/Other country?");
        String destination = sc.nextLine();
        System.out.println("The weight of the order:");
        double weight = sc.nextDouble();
        double cost;

        if (destination.equalsIgnoreCase("United States") || destination.equalsIgnoreCase("US")) {
            if (weight < 2) {
                System.out.println("The shipping cost is $5");
            } else {
                cost = weight * 0.5;
                //requirement doesn't make sense when weight = 2, the cost is $1.
                //cost = 5 + (weight-2) * 0.5;
                System.out.println("The shipping cost is $" + cost);
            }
        } else {
            cost = weight * 1.5;
            System.out.println("This is the international shipment. The shipping cost is $" + cost);
        }
    }
}


 /*nextLine() issue, add 1 more nextLine() will fix it
        System.out.println("The weight of the order:");
        double weight = sc.nextDouble();
        System.out.println("Destination: United States/US?");
        sc.nextLine();
        String destination = sc.nextLine();*/