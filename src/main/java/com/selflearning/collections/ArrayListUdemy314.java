package com.selflearning.collections;

import java.util.ArrayList;

public class ArrayListUdemy314 {
    public static void main(String[] args) {

        ArrayList a = new ArrayList();
        a.add("emily");
        a.add("rahul");
        a.add("java");
        a.add("emily");
        System.out.println(a);
        a.add(0,"student");
        System.out.println(a);

       /* a.remove("emily");
        a.remove(1);
        System.out.println(a);*/

        /*a.removeAll(a);
        System.out.println(a);*/
        System.out.println(a.get(0));
        System.out.println(a.contains("emily"));
        System.out.println(a.contains("jav"));
        System.out.println(a.indexOf("rahul"));
        System.out.println(a.isEmpty());
        System.out.println(a.size());

        ArrayList<String> al = new ArrayList<>();
        al.add("emily1");
    }

}
