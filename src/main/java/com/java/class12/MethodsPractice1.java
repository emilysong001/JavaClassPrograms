package com.java.class12;

import java.util.Scanner;

public class MethodsPractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a city: ");
        String city = sc.nextLine();
        cityToTravel(city);
    }

    public static void cityToTravel(String city) {
        System.out.println("I want to travel to " + city);
    }
}
