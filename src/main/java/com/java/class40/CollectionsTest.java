package com.java.class40;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsTest {
    public static void main(String[] args) {
        //Createing ArrayList Object
        ArrayList<String> students = new ArrayList<>();

        //Adding elements to the ArrayList
        students.add("Jai");
        students.add("Manish");
        students.add("Vikram");
        students.add("Mahesh");
        students.add("Naren");

        //Print ArrayList
        System.out.println("ArrayList elements: " + students);

        // Print minimum value
        System.out.println("Minimum value: " + Collections.min(students));

        // print maximum value
        System.out.println("Maximum value: " + Collections.max(students));
    }
}
