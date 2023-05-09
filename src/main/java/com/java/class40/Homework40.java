package com.java.class40;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework40 {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        //Write a program to store the FIFA world cup team and captains in the HashMap
        // & Print team based on the captain value entered by the user
        //Example Data
        //   Team		   Captain
        //----------	        --------------
        //Argentina	Lionel Messi
        //Belgium		Eden Hazard
        //Brazil		Thiago Silva
        //Denmark	Simon Kjaer
        //Portugal	        Cristiano Ronaldo
        //USA		Christian Pulisic
        //Australia	        Mathew Ryan
        //Wales		Gareth Bale
        map.put("Argentina","Lionel Messi");
        map.put("Belgium","Eden Hazard");
        map.put("Brazil","Thiago Silva");
        map.put("Denmark","Simon Kjaer");
        map.put("Portugal","Cristiano Ronaldo");
        map.put("USA","Christian Pulisic");
        map.put("Australia","Mathew Ryan");
        map.put("Wales","Gareth Bale");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your captain:");
        String captain = sc.nextLine();

        for(Map.Entry<String,String> pair: map.entrySet()){
            if(pair.getValue().equalsIgnoreCase(captain)){
                System.out.println("Team is: "+pair.getKey());
            }
        }

    }
}
