package com.selflearning.recursion;

public class Recursion1 {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
        int result1 = sum(5,10);
        System.out.println(result1);
    }
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static int sum(int start, int end) {
        if (end > start) {
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }
}
