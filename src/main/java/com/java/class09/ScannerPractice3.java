package com.java.class09;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        String str = "Java : a new world.\n" + "I like it.\n" + "Do you want to join us? Y/N \n";
        Scanner sc = new Scanner(str);
        System.out.println("first line:" + sc.nextLine());
        System.out.println("sec line:" + sc.nextLine());
        System.out.println("thi line:" + sc.next());
        System.out.println("forth line:" + sc.next());

        String str2 = "Java : a new world.";
        Scanner s = new Scanner(str2).useDelimiter(":");
        System.out.println(s);
    }
}
