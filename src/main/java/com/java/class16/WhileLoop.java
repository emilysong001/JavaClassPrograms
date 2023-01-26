package com.java.class16;

public class WhileLoop {
    public static void main(String[] args) {
        //what are loops?
        //you need to rerun the same set of code multiple times,
        // and you need to accomplish that with minimal code.

        int activeUsers = 0;
        //activeUsers++;
        //System.out.println("Welcome User number"+activeUsers);

       /*for (int i = 0; i<10; i++){
            activeUsers++;
            System.out.println("Welcome User number"+activeUsers);
        }*/

        //() -> boolean expression
        //while boolean expression is true
        //you must have a boolean expression updater
        //otherwise you might have an infinite loop.

        while (activeUsers < 10) {
            //body
            activeUsers++;
            System.out.println("Welcome User number" + activeUsers);
        }

        /*while(activeUsers<10){
            System.out.println("Welcome User number"+ activeUsers++);
            System.out.println(activeUsers);
        }*/

        /*while(activeUsers<10){
            System.out.println("Welcome User number"+ ++activeUsers);
            System.out.println(activeUsers);
        }*/

        /*while (activeUsers < 10) {
            ++activeUsers;
            System.out.println("Welcome User number" + activeUsers);
        }*/

        int activeU = 0;
        while (activeU < 5) {
            System.out.println(activeU);
            activeU++;
        }


    }
}
