package com.java.class39;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Homework39 {
    public static void main(String[] args) {
        System.out.println("=========Homework 29 March============");
        System.out.println("=========Task1============");
        //Task 1: Write a program to print unique words from the Given String (Yesterday's task 3)
        //Logic hint: Create a two set with one set holding all the words
        // and the second set will hold duplicate words and then do set1 - set2

        String str = "well, collection is very easiest topic in java and it is very useful as well";
        Set<String> strset = new HashSet<>();
        str = str.replace(",","");
        strset.add(str);

        //hold all duplicate strings
        Map<String,Integer> count1 = new HashMap<>();
        Set<String> strDuplicate = new HashSet<>();
        for(String str1: str.split(" ")){
            if(count1.containsKey(str1)){
                count1.put(str1,count1.get(str1)+1);
            } else {
                count1.put(str1,1);
            }
            if(count1.get(str1)>1)
                strDuplicate.add(str1);
        }

        //hold all unique strings
        Set<String> strUnique = new HashSet<>();
        for(String str2: str.split(" ")){
            if(!strDuplicate.contains(str2)){
                strUnique.add(str2);
            }
        }
        System.out.println(strUnique);


        System.out.println("=========Task2============");
        //Task 2: Write a program to print the frequency of each character from the String
        // - Do not use direct method from the Collections class
        //Example
        //Input - This is my collection program
        //Output - { =4, a=1, c=2, e=1, g=1, h=1, i=3, l=2, m=2, n=1, o=3, p=1, r=2, s=2, t=2, y=1}

        String input = "This is my collection program";
        input = input.toLowerCase();
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (count.containsKey(input.charAt(i))) {
                count.put(input.charAt(i), count.get(input.charAt(i)) + 1);
            } else {
                count.put(input.charAt(i), 1);
            }
        }
        System.out.println(count);
    }
}
