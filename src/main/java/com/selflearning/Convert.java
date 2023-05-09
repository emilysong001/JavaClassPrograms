package com.selflearning;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Convert {
    public static int getPairs(List<Integer> values) {

        Set<Integer> uniqueValue = new HashSet<>(values);
        System.out.println(uniqueValue);

        List<Integer> uniqueValueList = new ArrayList<>(uniqueValue);
        Collections.sort(uniqueValueList);
        System.out.println(uniqueValueList);
        int[][] pairs = new int[uniqueValueList.size()][2];
        int m =0;
        //int k=0;
        for (int i = 0; i < uniqueValueList.size(); i++) {
            for (int j = i; j < uniqueValueList.size(); j++) {
                System.out.println(uniqueValueList.get(i)+" "+uniqueValueList.get(j));
                if(uniqueValueList.get(j)-uniqueValueList.get(i)==1){
                    m++;
                    //System.out.println(pairs[i][0]+" "+pairs[i][1]);

                }
                /*pairs[k][0] = uniqueValueList.get(i);
                pairs[k][1] = uniqueValueList.get(j);
                System.out.println(pairs[k][0]+" "+pairs[k][1]);*/
                /*if(pairs[i][1]-pairs[i][0]==0){
                    m++;
                    //System.out.println(pairs[i][0]+" "+pairs[i][1]);

                }*/

            }
        }
        System.out.println(m);

        /*Integer[] a = new Integer[uniqueValueList.size()];

        for (int i = 0; i < uniqueValueList.size(); i++) {
            a[i] = uniqueValueList.get(i);
            System.out.println(a[i]);
        }*/

       /* for (int i = 0; i < values.size(); i++) {
            uniqueValue.add(values.get(i));
        }
        List<Integer> uniqueValueList = new ArrayList<>(uniqueValue);

        System.out.println(uniqueValueList);
        System.out.println(uniqueValueList.get(0));
        int[][] pairs = new int[uniqueValueList.size()][2];
        pairs[0][0] = uniqueValueList.get(0);
        pairs[0][1] = uniqueValueList.get(0);
        pairs[1][0] = uniqueValueList.get(0);
        pairs[1][1] = uniqueValueList.get(1);
        for (int i = 0; i < uniqueValueList.size(); i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(pairs[i][j]);
            }
        }*/


        return 0;
    }

    public static void main(String[] args) {

    /*    Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,1));
        System.out.println(set);*/

        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(1);
        values.add(5);
        values.add(2);
        values.add(3);
        values.add(3);
        values.add(3);
        System.out.println(getPairs(values));
        int i = 461012;
        System.out.format("%d%n", i);

        LocalDate localDate = LocalDate.now();
        //LocalDate.parse("2015-02-20");
        LocalDate.of(2015, 02, 20);
        System.out.println(localDate);

        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(date
                .format(DateTimeFormatter.ISO_LOCAL_DATE));

    }


}
