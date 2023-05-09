package com.java.class40;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        String str = "this is my first java collection class and it is easy";
        str = str.toLowerCase();

        Map<Character,Integer> count = new HashMap<>();
        for(char c: str.toCharArray()){
            if(count.containsKey(c)) {
                count.put(c, count.get(c)+1);
            }
            else {
                count.put(c, 1);
            }
        }
        System.out.println(count);

    }
}
