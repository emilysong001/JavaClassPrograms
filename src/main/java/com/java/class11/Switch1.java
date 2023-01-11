package com.java.class11;

public class Switch1 {
    // == .equals()
    public static void main(String[] args) {
        int rate = 10;

        /*if (rate == 1) {
            System.out.println("Awful Service");
        }
        else if (rate == 2) {
            System.out.println("Awful Service");
        }*/


        switch (rate) {
            case 1: //2==1?
                System.out.println("Awful service");
                //try to make your code is
            case 2:
                System.out.println("Extremely poor service");
            case 3:
                System.out.println("Bad service");
        }
        System.out.println("=======================");

        //when you multiples cases
        switch (rate) {
            case 1:
            case 2:
            case 3:
                System.out.println("Bad service");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Okay service");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Good service");
                break;
            default:
                //it is the same as else statement
                System.out.println("Invalid input");

        }


        System.out.println("=======================");

        String shipmentState = "Hawaii";
        final String il = "Illinois";
        //String values in double quote is literal

        //much cleaner than else if statement
        //easy to maintain
        switch (shipmentState) {
            //case_sensitive
            //if you have same exact body for 2 or more cases, it means they need to be mergered
            //Hawaii or Alaska, get same result
            case "Hawaii":
                //variables are not allowed in cases
            case "Alaska":
                System.out.println("Shipment cost is $10");
                break;
            case il:
                System.out.println("Shipment cost is $11");
                break;
            case "NY":
                System.out.println("Shipment cost is $5");
                break;
            case "Florida":
                System.out.println("Shipment cost is $7");
                break;
            case "California":
                System.out.println("Shipment cost is $12");
                break;
        }


        //constant
        //final is a java keyword that ensures the value of
        int num = 23;
        final int NUM = 23;

        //use case: area code for Chicago
        final int areaCodeForChicago = 312;
    }
}
