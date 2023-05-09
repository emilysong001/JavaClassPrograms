package com.java.class40;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GreatestFrequency {
    public static void main(String[] args) {
        String str = "this is my first java collection class and it is easy";
        str = str.toLowerCase();
        char maxItem= str.charAt(0);
        int maxCount=-1;

        Map<Character,Integer> count = new HashMap<>();
        for(char c: str.toCharArray()){
            if(count.containsKey(c)) {
                count.put(c, count.get(c)+1);
            }
            else {
                count.put(c, 1);
            }
            /*if(count.get(c)>maxCount){
                maxCount = count.get(c);
                maxItem = c;
            }*/
        }
        Set<Map.Entry<Character,Integer>> pairs =count.entrySet();
        for(Map.Entry<Character,Integer> pair: pairs){
            if(pair.getValue()>maxCount){
                maxCount = pair.getValue();
                maxItem = pair.getKey();
            }
        }
        System.out.println("Max item is \""+maxItem+"\"; Max frequency is "+maxCount);
    }
}
