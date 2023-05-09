package com.java.studentmentoring;

import java.util.GregorianCalendar;

public class StringPerformance {
    public static void main(String[] args) {
        System.gc();
        long start = new GregorianCalendar().getTimeInMillis();
        long startMemory = Runtime.getRuntime().freeMemory();
        StringBuffer sb = new StringBuffer();
        //StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000000; i++) {
            sb.append(":").append(i);
        }
        long end = new GregorianCalendar().getTimeInMillis();
        long endMemory = Runtime.getRuntime().freeMemory();
        System.out.println("Time Taken:" + (end - start));
        System.out.println("Memory used:" + (startMemory - endMemory));

        //StringBuilder
        //Time Taken:492
        //Memory used:149651632

        //StringBuffer
        //Time Taken:627
        //Memory used:149651632


    }
}
