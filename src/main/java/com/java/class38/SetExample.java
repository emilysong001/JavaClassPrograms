package com.java.class38;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {



        int expected =1;
        int count=0;
        int[] name = {1,5,4,1,9};
        for (int i = 0; i < name.length; i++) {
            if(expected==name[i]){
                count++;
                //break;
                continue;
            }

            /*if(expected!=name[i]){
                continue;
            }*/
        }
        System.out.println(count);



       /* Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("mango");
        fruits.add("kiwi");
        //no get() method, you don't know which one you will get

        //can only use for each loop
        for (String fruit: fruits) {
            System.out.println(fruit);
        }

        System.out.println(fruits);
        if (fruits.contains("banana")) {
            fruits.remove("mango");
        }
        System.out.println(fruits);


        String str = "We are almost finishing java";
        Set<Character> ch = new HashSet<>();
        Set<Character> result = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if(!ch.add(str.charAt(i))){
                //System.out.println(str.charAt(i));
                result.add(str.charAt(i));
            }
        }
        System.out.println(result);*/


    }
}
