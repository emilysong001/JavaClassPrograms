package com.java.class30;

import java.util.ArrayList;
import java.util.List;

public class WrapperTest {
    public static void main(String[] args) {
        //parse methods - parseInt() return a primitive
        //valueOf methods - return a wrapper class
        int a = Integer.parseInt("123");
        //Interger wrapper = Integer.valueOf("123");
        //autoboxing
        //you can just type the primitive value, java will convert it to the
        //relevant wrapper class for you

        System.out.println(Boolean.parseBoolean("true"));
        System.out.println(Boolean.valueOf("True"));

        List<Double> l = new ArrayList<>();
        l.add(50.5);
        l.add(new Double(60));
        l.remove(50.5);
        double first = l.get(0);
        System.out.println(first);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(Integer.valueOf(1));
        numbers.remove(new Integer(2));
        //numbers.remove(1);
        System.out.println(numbers);
    }
}
