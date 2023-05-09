package com.selflearning.statictest;

import com.sun.deploy.net.MessageHeader;

import java.util.*;

public class Pairs {



    public static Set<String> getAllPairs(List<Integer> list) {
        Set<String> pairs = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int a = list.get(i);
                int b = list.get(j);
                if (a != b) {
                    String pair = "(" + Math.min(a, b) + "," + Math.max(a, b) + ")";
                    pairs.add(pair);
                }
            }
        }
        return pairs;
    }
    public static int testPairs(List<Integer> listOfInteger){
        Set<Integer> pairs = new HashSet<>();

        for (int i = 0; i < listOfInteger.size(); i++) {
            for (int j = i+1; j < listOfInteger.size(); j++) {

                int a = listOfInteger.get(i);
                int b = listOfInteger.get(j);
                if(b!=a){
                    System.out.println(a+","+b);
                }
                System.out.println(pairs);
            }
        }

        //System.out.println(listOfInteger.size());
       // System.out.println(pairs);
        return 0;
    }

    public static void main(String[] args) {

        List<Integer> listOfInteger = new ArrayList<>();
        listOfInteger.add(1);
        listOfInteger.add(1);
        listOfInteger.add(2);
        listOfInteger.add(2);
        listOfInteger.add(3);
        listOfInteger.add(3);
        System.out.println(testPairs(listOfInteger));

       // Set<String> pairs = getAllPairs(listOfInteger);
        //System.out.println(pairs);
    }
}
