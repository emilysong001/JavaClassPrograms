package com.java.class12;

import java.util.Scanner;

public class Homework12_3 {
    public static void main(String[] args) {
        //Create a method that takes a boolean indicating whether someone is a member of a loyalty program
        // and a double representing the cost of a purchase, and returns a double
        // representing the final cost of the purchase after applying a discount.
        // If the customer is a loyalty customer apply 10% discount.
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you a member of a loyalty program? true/false");
        boolean membership = sc.nextBoolean();
        System.out.println("Please enter the cost of a purchase:");
        double cost = sc.nextDouble();
        System.out.println("The total cost is " + totalCost(membership, cost));
    }

    public static double totalCost(boolean membership, double cost) {
        if (membership) {
            cost = cost * 0.9;
        }
        return cost;
    }
}
