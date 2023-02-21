package com.java.class23;

import java.util.Scanner;

public class ArrayFood {
    public static void main(String[] args) {
        /*String[] arr = new String[8];
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 8 fruits: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextLine();
        }*/

        String[] arr = {"apple", "banana", "kiwi", "apple", "banana", "apple", "peach", "apple"};
        //String[] duplicate = new String[8];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].equalsIgnoreCase(arr[i])) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
