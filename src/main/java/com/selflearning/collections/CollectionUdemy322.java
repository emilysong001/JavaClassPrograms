package com.selflearning.collections;

import java.util.ArrayList;

public class CollectionUdemy322 {
    public static void main(String[] args) {
        int[] a = {4, 5, 5, 5, 4, 6, 6, 9, 4};

        //print not duplicated value
        /*HashSet hs = new HashSet();
        for (int i = 0; i <a.length ; i++) {
            hs.add(a[i]);
        }
        System.out.println(hs);*/

        //print how many duplicated times for each element

        ArrayList list = new ArrayList();

        for (int i = 0; i < a.length; i++) {
            int flag = 0;
            //use list contains to figure out if this value is already stored into the list,
            //then we don't need to compare the same value already compared
            if (!list.contains(a[i])) {
                list.add(a[i]);
                flag++;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        flag++;
                    }
                }
                System.out.println("value "+a[i]+" is repeated "+flag+" times");
            }
            if(flag==1)
                System.out.println(a[i]+" is unique number.");
        }

    }
}
