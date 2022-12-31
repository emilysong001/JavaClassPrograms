package com.java.class06;

public class ConditionalOR {
    public static void main(String[] args) {
        //is used for setting multiple conditions
        //and overall result is ture if at least one of them is true

        boolean giveDiscount = false;
        int age = 25;
        giveDiscount = age >60 || age <8;
        System.out.println(giveDiscount);

        //difference between && -> all conditions must be true
        //|| -> at least one of them must be true

        int currenTime = 13;//1pm

        boolean drinkCoffee = currenTime>6 && currenTime<11;

        System.out.println(drinkCoffee);

        System.out.println("========================");

        boolean canIRelaxNow;
        int howManyJavaExercises = 0;
        int howManySoftSkillsVideos = 0;

        canIRelaxNow = howManyJavaExercises>=5 || howManySoftSkillsVideos >=2;
        System.out.println(canIRelaxNow);

        System.out.println("========================");

        boolean block;
        int numberOfLoginAttempts = 4;
        double transactionAmount = 0.0;
        String locationOfTransaction = "USA";

        block = numberOfLoginAttempts>3 || transactionAmount>3000.0 || locationOfTransaction!="USA";
        // this expression is expected, so I never change the logic

        System.out.println(block);

        //int any comparation

        System.out.println("========================");
        // you store text in a String data type
        // you can only compare strings with ==, !=
        //you can't do >,<,>=,<=









    }
}
