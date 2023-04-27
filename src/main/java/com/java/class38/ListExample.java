package com.java.class38;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> listOfNum = new ArrayList<>();
        listOfNum.add(10);
        listOfNum.add(12);
        listOfNum.add(34);
        listOfNum.add(35);
        listOfNum.add(68);
        listOfNum.add(15);
        System.out.println(listOfNum);

        listOfNum.add(2, 50);
        for (int i = 0; i < listOfNum.size(); i++) {
            System.out.println(listOfNum.get(i));
        }
        System.out.println(listOfNum.contains(10));
        System.out.println(listOfNum.isEmpty());

        Collections.sort(listOfNum);
        Collections.reverse(listOfNum);
        listOfNum.remove(0);
        System.out.println(listOfNum);

        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("mango");
        fruits.add("kiwi");


        System.out.println(fruits);
        if (fruits.contains("banana")) {
            fruits.remove("mango");
        }

       /* for (int i = 0; i < fruits.size(); i++) {
            if(fruits.get(i).equalsIgnoreCase("banana")){
                fruits.remove("mango");
            }
        }*/
        System.out.println(fruits);
    }
}

