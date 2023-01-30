package com.java.class17;

public class WhileLoopPractice {
    // 1 10 2 9 3 8 4 7 5 6
    //run a specific times, ex 5 times
    public static void main(String[] args) {
        int i = 1; //starting point
        int j = 10;
        //() -> how many times it should run
        //if your problem is asking to run specific number of times
        //1. the logic in the while loop is the boolean expression must include at least 1 variable
        //if it is only constant, it will execute infinite times
        //2. in the body of the while loop, I must have a boolean expression updater
        while (i <= (i+j)/2) {
            System.out.println(i);
            System.out.println(j);
            i++;
            j--;
        }
    }


    //1. define the starting point
    //2. define a boolean expression
    //3. write the body of the while loop
    //4. make sure you have an updator of a variable
}
