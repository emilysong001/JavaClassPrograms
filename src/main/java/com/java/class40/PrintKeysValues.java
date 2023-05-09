package com.java.class40;

import java.util.*;

public class PrintKeysValues {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        //map.put(1,1);
        map.put(3,2);
        map.put(5,1);
        map.put(1,3);
        map.put(6,4);
        map.put(4,3);

        //get all keys
        System.out.println("print all keys");
        Set<Integer> keys= map.keySet();
        System.out.println(keys);

        System.out.println("print all keys and values");
        for(int key:keys){
            System.out.print(key+"="+map.get(key)+", ");
        }
        System.out.println();

        //get all values
        System.out.println("print all values");
        Collection<Integer> values = map.values();
        System.out.println(values);
        for(int value:values){
            System.out.print(value+" ");
        }
        System.out.println();

        //print entryMap
        System.out.println("print all entryMap");
        Set<Map.Entry<Integer,Integer>> set1 = map.entrySet();
        System.out.println(set1.size());
        for(Map.Entry<Integer,Integer> setm:set1){
            if(setm.getKey()!=1)
            System.out.println(setm.getKey()+" "+ setm.getValue());
        }
    }
}
