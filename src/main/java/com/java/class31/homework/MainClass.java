package com.java.class31.homework;

public class MainClass {
    public static void main(String[] args) {
        AndroidPhone ap = new AndroidPhone();
        IPhone ip = new IPhone();
        ServiceCenter sc = new ServiceCenter();
        sc.servicePhone(ap);
        sc.servicePhone(ip);
    }
}
