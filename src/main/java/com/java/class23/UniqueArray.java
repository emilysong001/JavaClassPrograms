package com.java.class23;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueArray {
    public static void main(String[] args) {
        /*String[] arr = new String[8];
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 8 fruits: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextLine();
        }*/
        /*String[] arr = {"apple","banana","kiwi","apple","banana","apple","peach","apple"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));*/

        String[] arr = {"apple", "watermelon", "grape", "kiwi", "apple", "banana", "apple", "peach", "apple", "apple", "banana", "kiwi"};
        String[] duplicate = new String[13];

        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].equalsIgnoreCase(arr[i])) {
                    duplicate[k] = arr[i];
                    k++;
                    break;
                }
            }
            for (int m = 0; m < k - 1; m++) {
                if (arr[i].equalsIgnoreCase(duplicate[m])) {
                    //duplicate[k] = null;
                    k--;
                }
            }
        }
        for (int i = 0; i <= k; i++) {
            System.out.println(duplicate[i]);
        }
        //System.out.println(Arrays.toString(duplicate));
    }
}