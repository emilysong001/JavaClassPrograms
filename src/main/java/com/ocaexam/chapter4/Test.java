package com.ocaexam.chapter4;

import java.io.*;
import java.util.*;

public class Test {
    public void print(byte x) {
        System.out.println("byte");
    }
    /*public void print(int x) {
        System.out.println("int");
    }*/
    public void print(Integer x) {
        System.out.println("Integer");
    }

    /*public void print(float x) {
        System.out.println("float");
    }*/
   public void print(long x) {
        System.out.println("long");
    }
    /*public void print(int... x) {
        System.out.println("varargs");
    }*/
    public void print(Object x) {
        System.out.println("Object");
    }
    /*public void print(Object x,Object y) {
        System.out.println("2 Objects");
    }*/

    Test(){
        System.out.println("1");
    }
    /*Test(int num){
        System.out.println("2");
    }*/
    Test(Integer num){
        System.out.println("3");
    }
    Test(Object num){
        System.out.println("4");
    }
    Test(int... nums){
        System.out.println("5");
    }

    public static void main(String[] args) throws IOException {
        Test t = new Test();
       /* short s = 123;
        t.print(s);
        t.print(true);
        t.print(6.789);
        new Test(100);
        new Test(100L);*/

        t.print(4);
        Locale l = Locale.forLanguageTag("en-US");
        Locale m = new Locale.Builder().setRegion("GB").setLanguage("en").build();
        System.out.println(l);
        System.out.println(m);

        List<String> ll= new ArrayList<>();
        ll.add("30");
        ll.add("3A");
        ll.add("3a");
        ll.add("a3");
        ll.add("A4");
        ll.add("AA");
        ll.add("a5");
        ll.add("3");
        ll.add("x4");
        ll.add("4x");
        ll.add("a");
        System.out.println(ll);
        Collections.sort(ll);
        System.out.println(ll);

        byte c1[] = {10,20,30,40,50};
        byte c2[] = {60,70,80,90};

        /*ByteArrayOutputStream b1 = new ByteArrayOutputStream();
        ByteArrayOutputStream b2 = new ByteArrayOutputStream(10);
        b2.write(100);
        System.out.println(b2);
        System.out.println("out1 "+b2.size());
        b2.write(c1,0,c2.length);
        System.out.println("out2 "+b2.size());
        byte[] b = b2.toByteArray();
        System.out.println("out3 "+b.length);
        b2.flush();
        System.out.println("out4 "+ b2.size());
        b2.reset();
        System.out.println("out5 "+ b2.size());
        b1.writeTo(b2);
        System.out.println("out6 "+ b1.size());*/

        Map<Integer,Integer> m2 = new HashMap<>();
        Integer key = 5;
        Integer value = key;
        m2.put(key++,value);
        System.out.println(m2);

        int i=0;
        int j = i++ + ++i;
        System.out.println(j);






    }
}
