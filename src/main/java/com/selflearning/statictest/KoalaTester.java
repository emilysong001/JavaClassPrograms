package com.selflearning.statictest;

import java.util.ArrayList;

public class KoalaTester {
    private static final ArrayList<String> values = new ArrayList<>();
    public static void main(String[] args) {
        Koala.main(new String[0]);
        Koala k;
       /* k = new Koala();
        System.out.println(k.count);*/
        k= null;
        System.out.println(k.count);

        values.add("changed");
        values.add("a");
        System.out.println(values);

        int num =4;
        System.out.println(newNumber(5));
        System.out.println(num);

        String name = "web";
        speak(name);
        System.out.println(name);

        StringBuilder str = new StringBuilder();
        speak(str);
        System.out.println(str);

        int i=1;
        int j=2;
        swap(i,j);
        System.out.println(i);
        System.out.println(j);
    }

    public static int newNumber(int num){
        return num=8;
    }

    public static void speak (String name1){
        name1 = "Sparky";
    }

    public static void speak (StringBuilder s){
        s.append("wefg");
    }

    public static void swap(int a, int b){
        int temp =a;
        a=b;
        b=temp;
        /*System.out.println(a);
        System.out.println(b);
        System.out.println(temp);*/
    }
}
