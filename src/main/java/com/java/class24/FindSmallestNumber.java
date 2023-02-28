package com.java.class24;

public class FindSmallestNumber {
    public static void main(String[] args) {
        int data[] = {43, 56, 2, 6, 78, 32};
        int smallest = data[0];
        for (int i : data) {
            //i means the value of the specific index
            if (i < smallest) {
                smallest = i;
            }
        }
        System.out.println(smallest);
    }
}
