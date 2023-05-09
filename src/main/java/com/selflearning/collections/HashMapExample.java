package com.selflearning.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {


        HashMap hm = new HashMap();
        hm.put(0, "hello");
        hm.put(1, "Bye");
        hm.put(2, "morning");
        hm.put(3, "evening");

        hm.put("hello", 4);
        hm.put("Bye", 2);
        hm.put("morning", 6);
        hm.put("evening", 3);

        System.out.println(hm.get(1));
        System.out.println(hm.get("hello"));
        System.out.println(hm.get("Bye"));
        System.out.println(hm.get("bye"));
        System.out.println(hm.get(2));
        hm.remove(3);
        System.out.println(hm);

        hm.remove(4);
        System.out.println(hm);
        //hm.keySet(); //return Set<K>
        Set s = hm.entrySet(); //return Set<K,V>
        Iterator i = s.iterator();

        while (i.hasNext()) {
            // System.out.println(i.next());
            Map.Entry mp = (Map.Entry) i.next();
            System.out.println(mp.getKey());
            System.out.println(mp.getValue());
        }


        // create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // add some key-value pairs to the HashMap
        hashMap.put("apple", 1);
        hashMap.put("banana", 2);
        hashMap.put("orange", 3);

        // print out the keys and values separately
        for (String i1 : hashMap.keySet()) {
            //System.out.println("Key: " + i1 + ", Value: " + hashMap.get(i1));
            System.out.println(i1);
            System.out.println(hashMap.get(i1));
        }

    }
}
