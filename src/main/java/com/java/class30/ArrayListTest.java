package com.java.class30;

import java.util.ArrayList;
import java.util.List;


public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();//store an Arraylist in a list reference variable
        list1.add("hawk");
        list1.add(Boolean.TRUE);

        System.out.println(list1);
        System.out.println(list1.size());

        list2.add("dfhh");
        list2.add(String.valueOf(Boolean.TRUE));
        System.out.println(list2);
        //list2.add(7);

        Object[] objectArray = list1.toArray();
        System.out.println(objectArray.length);

        String[] sArray = list2.toArray(new String[0]);
        System.out.println(sArray.length);

    }
}
