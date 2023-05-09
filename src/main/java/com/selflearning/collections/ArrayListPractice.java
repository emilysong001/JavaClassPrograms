package com.selflearning.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        String[] str = {"Jerry","Emily","Sandy","Azat"};


        List<String> l = Arrays.asList(str);

        //List<String> l1 = Arrays.asList("Jerry","Emily","Sandy","Azat");
        System.out.println(l);

        ArrayList list1 = new ArrayList();

        list1.add("hawk");
        list1.add(Boolean.TRUE);
        list1.add(7);
        System.out.println(list1);

        ArrayList<String> listOfString = new ArrayList<>();
        listOfString.add("hawk");
        listOfString.add("adc");
        //listOfString.add(Boolean.TRUE);
        //listOfString.add(7);
        System.out.println(listOfString);
        Arrays.sort(str);
        int a = Arrays.binarySearch(str, "Jerry");
        System.out.println(a);

        String[] str1 = listOfString.toArray(new String[0]);
        System.out.println(str1[1]);

        List<String> hex = Arrays.asList("30","8","3A","FF");
        Collections.sort(hex);
        int x = Collections.binarySearch(hex,"8");
        int y = Collections.binarySearch(hex,"3A");
        int y1 = Collections.binarySearch(hex,"30");
        int y2 = Collections.binarySearch(hex,"FF");
        int z = Collections.binarySearch(hex,"4F");
        System.out.println(x+" "+y+" "+y1+" "+y2+" "+z);

        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5"));
        ages.add(Integer.valueOf("6"));
        ages.add(7);
        //ages.add(null);
        for (int a1:ages) {
            System.out.println(a1);
        }


        List<String> ages1 = new ArrayList<>();
        ages1.add("5");
        ages1.add("6");
        ages1.add(String.valueOf(7));
        ages1.add(null);
        for (String a1:ages1) {
            System.out.println(a1);
        }

    }
}
