package com.selflearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Page {


    public static void getResult(List<List<String>> values, int sortColumn, int sortNumber, int resultsPerPage, int page) {
        List<String> output = new ArrayList<>();

        Collections.sort(values, new Comparator<List<String>>() {

            @Override
            public int compare(List<String> o1, List<String> o2) {
                String s1 = o1.get(sortColumn);
                String s2 = o2.get(sortColumn);
                if (sortNumber == 0) {
                    return s1.compareTo(s2);
                } else {
                    return s2.compareTo(s1);
                }
            }
        });
        if ((resultsPerPage * page + resultsPerPage)<=values.size()) {
            for (int i = resultsPerPage * page; i < resultsPerPage * page + resultsPerPage; i++) {
                System.out.println(values.get(i).get(0));
                //output.add(values.get(i).get(0));
            }
        } else {
            for (int i = resultsPerPage * page; i < values.size(); i++) {
                System.out.println(values.get(i).get(0));
                //output.add(values.get(i).get(0));
            }
        }
        //System.out.println(output);
    }

    public static void main(String[] args) {
        List<String> a = new ArrayList<>();
        a.add("p1");
        a.add("1");
        a.add("2");
        List<String> b = new ArrayList<>();
        b.add("p2");
        b.add("3");
        b.add("4");
        List<String> c = new ArrayList<>();
        c.add("p3");
        c.add("2");
        c.add("1");
        List<String> d = new ArrayList<>();
        d.add("p21");
        d.add("20");
        d.add("11");
        List<String> e = new ArrayList<>();
        e.add("p4");
        e.add("7");
        e.add("3");
        List<String> f = new ArrayList<>();
        f.add("p7");
        f.add("2");
        f.add("10");
        List<String> g = new ArrayList<>();
        g.add("p5");
        g.add("2");
        g.add("5");
       /* System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);*/
        List<List<String>> m = new ArrayList<>();
        m.add(a);
        m.add(b);
        m.add(c);
        m.add(d);
        m.add(e);
        m.add(f);
        m.add(g);
        //System.out.println(m);
        int sortColumn = 0;
        int sortNumber = 0;
        int resultsPerPage = 2;
        int page = 1;
        getResult(m, sortColumn, sortNumber, resultsPerPage, page);

    }
}
