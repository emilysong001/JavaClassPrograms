package com.java.selfpractice3;

public class SwapTwo {
    public static void main(String[] args) {
        System.out.println("Calling swap function with inputs 2 & 3");
        swap(2, 3);
        System.out.println("Calling swap function with inputs -3 & 5");
        swap(-3, 5);
    }

    private static void swap(int x, int y) {
        System.out.println("values before swap:" + x + " and " + y);
        /*y = x + y;
        x = y - x;
        y = y - x;*/

        // swap logic - x=2, y=3
        x = x + y; //=> x=5
        y = x - y; // => y=2
        x = x - y; //=> x=3
        //x & y swapped (x=3, y=2)
        System.out.println("values after swap:" + x + " and " + y);
    }
}
