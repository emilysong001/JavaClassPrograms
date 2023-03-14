package com.java.class27homework;

public class IPhoneMainClass {
    public static void main(String[] args) {
        Iphone phone1 = new Iphone();
        Iphone phone2 = new Iphone("14",512);
        Iphone phone3 = new Iphone("14",512,"white");

        phone1.getDetails();
        phone1.call();
        phone1.text();
        phone2.getDetails();
        phone2.call();
        phone3.getDetails();
        phone3.text();

        System.out.println("===========After changing static value: ===========");
        phone1.brand = "IPhone1";
        phone1.operationSystem = "IOS1";
        phone2.brand = "IPhone2";
        phone2.operationSystem = "IOS2";
        phone3.brand = "IPhone3";
        phone3.operationSystem = "IOS3";

        phone1.getDetails();
        phone2.getDetails();
        phone3.getDetails();

    }
}
