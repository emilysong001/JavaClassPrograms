package com.selflearning.ikm;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Integer x = 3;
        Integer y = null;
      /*  try {
            System.out.println(Integer.compareUnsigned(x,3)==0||Integer.compareUnsigned(y,0)==0);
        } catch(Exception e){
            System.out.println(e.getClass().toString());
        }

        try {
            System.out.println(y.compareTo(null)==0||true);
        } catch(Exception e){
            System.out.println(e.getClass().toString());
        }*/

        /*ResourceBundle bundle = ResourceBundle.getBundle("Messages",new Locale("zh","CN"));
        System.out.println(bundle);*/

        /*Runnable r = () -> System.out.println("H1");
        new Thread(r).start();*/

        String stringA = "A";
        String stringB = "B";
        String stringnull = null;
        StringBuilder sb = new StringBuilder("C");
        Formatter f = new Formatter(sb);
        f.format("%s%s", stringA, stringB);
        System.out.println("Line1" + f);

        f.format("%-2s", stringB);
        System.out.println("Line2" + f);

        f.format("%b", stringnull);
        System.out.println("Line3" + f);

        Long l = new Long(1234);
        Long l1 = l;

        if (l == l1)
            System.out.println("equal");
        else
            System.out.println("not eq");
        l++;

        System.out.println(l);
        System.out.println(l1);
        if (l == l1)
            System.out.println("equal");
        else
            System.out.println("not eq");


        Locale l11 = new Locale("en");
        System.out.println(l11.getDisplayLanguage());
        //System.out.println(l11.getCountry());

        Map<Integer, Integer> map = new HashMap<>();

        Integer key = 5;
        Integer value = key;
        map.put(key++, value);
        map.put(300, 300);
        int count = 0;
        for (Integer i : map.keySet()) {
            for (Integer j : map.values()) {
                System.out.println("lop:"+i);
                System.out.println("lopm:"+map.get(i));
                count++;
                if (i == map.get(i)) {
                    System.out.println(i);
                    System.out.println(map.get(i));
                    break;
                } else
                    System.out.println(i);
                System.out.println(map.get(i));
                continue;
            }
        }
        System.out.println("count:" + count);

        Set<String> set = new LinkedHashSet<>();
        set.add("3");
        set.add("1");
        set.add("3");
        set.add("2");
        set.add("3");
        set.add("1");
        set.forEach(s-> System.out.print(s+"-"));
        System.out.println("============");

        try{
            int n1 = Integer.parseUnsignedInt("4");
            int n2 = Integer.parseUnsignedInt(null);
            System.out.println(n1/n2);
        } catch (NumberFormatException | IndexOutOfBoundsException e){
            System.out.println(e.getClass());
        }catch (NullPointerException e){
            System.out.println(e.getClass());
        }catch (Exception e){
            System.out.println(e.getClass());
        }



    }
}
