package com.selflearning.leetcode;

public class RectangleArea223 {
    public static void main(String[] args){
        int result = computeArea(-3,0,3,4,0,-1,9,2);
        System.out.println(result);
        int result1 = computeArea(-2,-2,2,2,-2,-2,2,2);
        System.out.println(result1);
        int result2 = computeArea(0,0,0,0,-1,-1,1,1);
        System.out.println(result2);
    }

    public static int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int totala = (ax2-ax1)*(ay2-ay1);
        System.out.println(totala);
        int totalb = (bx2-bx1)*(by2-by1);
        System.out.println(totalb);
        int totalc = (ax2-by1)*(by2-ax1);
        System.out.println(totalc);
        return totala+totalb-totalc;
    }
}
