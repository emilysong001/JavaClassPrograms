package com.java.class35;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a day between 0 and 6:");
        int i = sc.nextInt();
        Days[] list = Days.values();
        if (i >= 0 && i <= 6) {
            System.out.println("This is: "+list[i]);
        }
    }
}

enum Days { //all the variable inside the enum should be String
    SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6);
    int days;

    Days(int days) {
        this.days = days;
    }
}


/*switch (i){
            case 0:
                System.out.println(Days.SUNDAY);
                break;
           case 1:
               System.out.println(Days.MONDAY);
               break;
           case 2:
               System.out.println(Days.TUESDAY);
               break;
           case 3:
               System.out.println(Days.WEDNESDAY);
               break;
           case 4:
               System.out.println(Days.THURSDAY);
               break;
           case 5:
               System.out.println(Days.FRIDAY);
               break;
           case 6:
               System.out.println(Days.SATURDAY);
               break;
        }*/