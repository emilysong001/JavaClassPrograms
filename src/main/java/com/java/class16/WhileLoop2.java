package com.java.class16;

public class WhileLoop2 {
    public static void main(String[] args) {
        /*String a = "*";
        while (a.length() < 6) {
            System.out.println(a);
            a = a.concat("*");
        }
*/
        String str = "*";
        int iterator = 0;
        while (iterator < 5) {
            System.out.println(str);
            str = str.concat("*");
            iterator++;
        }

        /*String str1 = "*";
        for (int i = 0; i < 5; i++) {
            System.out.println(str1);
            str1 = str1.concat("*");
        }*/

        /* String str = "*";
        int iterator = 0;
        while (iterator < 5) {
            System.out.println(str);
            str = str.concat("*");
            iterator++;
        } */

        int i = 10;
        while (i >= 0) {
            System.out.println(i);
            i--;
        }

        String str2 = "*****";
        int length = str2.length();
        while (length > 0) {
            System.out.println(str2.substring(0, length));
            length--;
        }

        String str3 = "*****";
        while (str3.length() > 0) {
            System.out.println(str3);
            str3 = str3.substring(0, str3.length() - 1);
        }

        int i3 = 0;
        while (i3 <= 20) {
            if (i3 % 2 == 0) {
                System.out.println(i3);
            }
            i3++;
        }//executing 10 times

        int i4 = 0;
        while (i4 <= 20) {
            System.out.println(i4);
            i4 = i4 + 2;
        }
        //executing 20 times

        //space complexity
        //time complexity
        //big annotation

    }
}
