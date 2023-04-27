package com.java.class39;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExa {
    public static void main(String[] args) {
        /*Map<String,Integer> marksOfStudents = new HashMap<>();
        marksOfStudents.put("Dana",90);
        marksOfStudents.put("Azat",85);
        marksOfStudents.put("Aidai",90);
        marksOfStudents.put("Taira",85);
        marksOfStudents.put("Madina",90);

        System.out.println(marksOfStudents);*/

        List<String> riceList = new ArrayList<>();
        riceList.add("Raw rice");
        riceList.add("water");

        List<String> curryList = new ArrayList<>();
        curryList.add("vegetables");
        curryList.add("salt");
        curryList.add("oil");

        List<String> dalList = new ArrayList<>();
        dalList.add("Pulses");
        dalList.add("spices");
        dalList.add("salt");

        Map<String, List<String>> foods = new HashMap<>();
        foods.put("Boiled rice",riceList);
        foods.put("Curry",curryList);
        foods.put("Dal",dalList);
        System.out.println(foods);
        System.out.println(foods.get("Curry"));
    }
}

class Food {
    private String rice;
    private String curry;
    private String dal;

    public String getRice() {
        return rice;
    }

    public void setRice(String rice) {
        this.rice = rice;
    }

    public String getCurry() {
        return curry;
    }

    public void setCurry(String curry) {
        this.curry = curry;
    }

    public String getDal() {
        return dal;
    }

    public void setDal(String dal) {
        this.dal = dal;
    }


}
