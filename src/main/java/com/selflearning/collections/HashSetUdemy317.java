package com.selflearning.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetUdemy317 {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        HashSet<String> hs = new HashSet<>();
        h.add("emily");
        h.add("yahoo");
        h.add("rahul");
        h.add("java");
        h.add("emily");
        System.out.println(h);

      /*  h.remove("java");
        System.out.println(h);
        h.remove("java");
        System.out.println(h);*/

        System.out.println(h.remove("java"));
        System.out.println(h.isEmpty());
        System.out.println(h.size());
        System.out.println(h.contains("rahul"));


        Iterator i = h.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

    }
}
