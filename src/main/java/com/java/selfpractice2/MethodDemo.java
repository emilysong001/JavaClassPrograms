package com.java.selfpractice2;

public class MethodDemo {


    public static void main(String[] args){
        MethodDemo d = new MethodDemo();
        //d.getData();
        d.getUserData();

        String m = d.getUserData();
        System.out.println(m);

        MethodDemo.getData1();
        getData1();

        MethodDemo2 d2 = new MethodDemo2();
        String m2 = d2.getUserData2();
        System.out.println(m2);
    }

    public void getData(){
        System.out.println("Hello World");
    }

    public String getUserData(){
        System.out.println("Hello World");
        return "User Data";
    }

    public static void getData1(){
        System.out.println("Hello World 1");
    }
}
