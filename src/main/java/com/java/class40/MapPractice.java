package com.java.class40;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapPractice {
    public static void main(String[] args) {
String s = "df";
       Map<Character, Integer> map1 = new HashMap<>();
        map1.put('I',1);
        char[] c = s.toCharArray();

        Map<String, Integer> salary = new HashMap<>();

        salary.put("Dana", 2400);
        salary.put("Chirag", 2000);
        salary.put("Azat", 6000);
        salary.put("Emily", 1500);
        salary.put("Chirag", 7200);
        salary.put("Aizhan", 6700);
        salary.put("Madina", 7400);
        salary.put("Milana", 1800);

        int max = Integer.MIN_VALUE;
        String person = "";
        for(Map.Entry<String, Integer> pair: salary.entrySet()){
            if(pair.getValue()>max){
                max = pair.getValue();
                person = pair.getKey();
            }
        }
        System.out.println("Employee name who is taking the greatest salary: " + person);

        int sum=0;
        int count =0;
        for(int sal: salary.values()){
            sum = sum +sal;
            count++;
        }
        System.out.println("Total salary is: " + sum);
        int average =sum/count;

        Set<String> personName = new HashSet<>();

        for(Map.Entry<String, Integer> pair: salary.entrySet()){
            if(pair.getValue()>=average){
                personName.add(pair.getKey());
            }
        }
        System.out.println("All employees whose salary is greater than or equal to average salary: "+ personName);

        /*for(double sal: salary.values()){
            sal = sal*1.2;
            System.out.println();
        }
        System.out.println(salary);*/

        for(Map.Entry<String, Integer> pair: salary.entrySet()){
            System.out.println(pair.getKey() + " "+ pair.getValue()*1.2);
            }
        }


}
