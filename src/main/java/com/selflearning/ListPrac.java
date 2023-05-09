package com.selflearning;

import java.util.ArrayList;
import java.util.List;

public class ListPrac {


    public static int checkPrice(List<String> produce, List<Float> producePrice, List<String> produceSold, List<Float> soldPrice) {
        int output = 0;

        for (int i = 0; i < produceSold.size(); i++) {
            for (int j = 0; j < produce.size(); j++) {
                if (produceSold.get(i).equalsIgnoreCase(produce.get(j))) {
                    //System.out.println(j);
                    //System.out.println(producePrice.get(j));
                    //System.out.println(soldPrice.get(i));
                    if (!soldPrice.get(i).equals(producePrice.get(j))) {
                        output++;
                    }
                    break;
                }
            }
        }
        return output;
}

    public static void main(String[] args) {
        List<String> produce = new ArrayList<>();
        List<Float> producePrice = new ArrayList<>();
        List<String> produceSold = new ArrayList<>();
        List<Float> soldPrice = new ArrayList<>();
        produce.add("egg");
        produce.add("milk");
        produce.add("water");
        produce.add("yogurt");

        producePrice.add(10.99f);
        producePrice.add(13.99f);
        producePrice.add(15.99f);
        producePrice.add(18.99f);

        produceSold.add("milk");
        produceSold.add("milk");
        produceSold.add("egg");
        produceSold.add("water");

        soldPrice.add(10.99f);
        soldPrice.add(13.99f);
        soldPrice.add(15.99f);
        soldPrice.add(15.99f);

        System.out.println(checkPrice(produce,producePrice,produceSold,soldPrice));

        /*float f1= 0.01f;
        float f2=0.02f;
        if(f1==f2){
            System.out.println(true);
        } else {
            System.out.println(false);
        }*/

    }
}
