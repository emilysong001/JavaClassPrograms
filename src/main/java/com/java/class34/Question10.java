package com.java.class34;

public class Question10 {
      /*static int m;
    //{ m = 10;}
     static{
         //m=10;
     }

    Question10(){
         m=10;
        System.out.println(m);
    }
*/
    public static void main(String[] args) {

        int num = 45645;
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
