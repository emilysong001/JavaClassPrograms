package com.java.class22;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        //create and initialize an array
        int[] listOfData = {10, 30, 50, 30, 70, 40, 45, 32};

        //access element from the array with the index number
        System.out.println(listOfData[0]);
        System.out.println(listOfData.length);

        //memory/location
        System.out.println(listOfData);
        //it is only used when we want to know what is stored in the Array
        System.out.println(Arrays.toString(listOfData));

        String listOfStrings[] = {"Emily", "Song"};
        //System.out.println(listOfStrings[0]);
        for (int i = 0; i < listOfStrings.length; i++) {
            for (int j = 0; j < listOfStrings[i].length(); j++) {
                System.out.println(listOfStrings[i].charAt(j));
            }
            //System.out.println(listOfStrings[i]);
        }

    }

}

