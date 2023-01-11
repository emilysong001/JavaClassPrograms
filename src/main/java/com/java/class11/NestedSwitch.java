package com.java.class11;

import java.util.Scanner;

public class NestedSwitch {
    //Online store.
    // we want to write a program which calculates shipping cost based on
    //destination and based on total spending
    //if the customer is spending less than $5 than charge $5 for shipping
    //if spending more than $5 and less or equal to 10 then charge $10

    //if spending more than $10 then
    // we also look at the shipping destination
    //if it's USA -> charge 10% of the total spending for shipping
    //if it's Canada -> charge 15%
    //if it's Europe -> charge 20%
    //if it's other countries -> 25%

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Destination: USA/Canada/Europe?");
        String destination = sc.nextLine();
        System.out.println("The total spending:");
        double spending = sc.nextDouble();

        if (spending > 0) {
            switch ((int) spending) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Shipment cost is $5");
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.println("Shipment cost is $10");
                    break;
                default:
                    switch (destination.toUpperCase()) {
                        //switch (destination.toLowerCase()) {
                        case "USA":
                        //case "USa": etc.
                            //another way is to use all lower case or all upper case in the case conditions
                            System.out.println("Shipment cost is $" + spending * 0.1);
                            break;
                        case "Canada":
                            System.out.println("Shipment cost is $" + spending * 0.15);
                            break;
                        case "Europe":
                            System.out.println("Shipment cost is $" + spending * 0.2);
                            break;
                        default:
                            System.out.println("Shipment cost is $" + spending * 0.25);
                    }

            }
        }
        else {
            System.out.println("Invalid data.");
        }
    }
}
