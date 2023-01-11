package com.java.class05;

public class Homework3 {
    public static void main(String[] args) {
        //write a program where you give your
        // credit score
        //your marital status
        //number of children

        //if credit score is more than 680
        //married
        //more than 2 children
        boolean giveFamilyHealthInsuranceCoverage;

        int creditScore = 790;
        boolean married = true;
        int numberOfChildren = 2;

        giveFamilyHealthInsuranceCoverage = creditScore>680 && married && numberOfChildren>2;
        System.out.println(giveFamilyHealthInsuranceCoverage);

    }
}
