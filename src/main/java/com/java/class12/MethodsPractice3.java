package com.java.class12;

import java.util.Scanner;

public class MethodsPractice3 {
    /*We have a loud talking parrot. Create a function that will tell us if we are in trouble or not
    based on the hour and based on if the parrot is talking.

    The "hour" is the current hour time in the range 0..23.
    We are in trouble if the parrot is talking and the hour is
    before 7 or after 20. Return true if we are in trouble.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please tell me the hour of parrot talking: 1..24");
        int hourOfTalking = sc.nextInt();
        System.out.println("Please tell me if the parrot is talking: true/false ");
        boolean isTalking = sc.nextBoolean();
        boolean trouble = inTrouble(hourOfTalking, isTalking);
        System.out.println(trouble);

    }

    public static boolean inTrouble(int hourOfTalking, boolean isTalking) {
        if (isTalking) {
            return hourOfTalking < 7 && hourOfTalking > 0 || hourOfTalking > 20 && hourOfTalking <= 24;
        } else {
            return false;
        }
    }


}
