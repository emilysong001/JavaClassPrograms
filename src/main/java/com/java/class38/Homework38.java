package com.java.class38;

import java.util.*;

public class Homework38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-------Homework1------");
        List<Integer> nums = new ArrayList<Integer>();
        System.out.println("please enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            nums.add(input.nextInt());
        }
        Collections.sort(nums);
        System.out.println(nums);

        System.out.println("-------Homework2------");
        List<Integer> nums2 = new ArrayList<Integer>();
        System.out.println("please enter 5 numbers: ");

        for (int i = 0; i < 5; i++) {
            nums2.add(input.nextInt());
        }
        Collections.reverse(nums2);
        System.out.println(nums2);





        System.out.println("-------Homework3------");
        String str = "well, collection is very easiest topic in java and it is very useful as well";
        Set<String> strset = new HashSet<>();
        strset.add(str.split(",")[0]);
        String[] arr = str.split(",")[1].trim().split(" ");

        for (String str1 : arr) {
            if (!strset.add(str1)) {
                strset.remove(str1);
            }
        }
        System.out.println(strset);
    }
}






    /*int space = 0;
        for (int i = 0; i < str.split(",")[1].trim().length(); i++) {
        if (str.charAt(i) == ' ') {
        space++;
        }
        }
        for (int i = 0; i <= space; i++) {
        if (!strs.add(str.split(",")[1].trim().split(" ")[i])) {
        strs.remove(str.split(",")[1].trim().split(" ")[i]);
        }
        }*/