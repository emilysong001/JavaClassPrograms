package com.java.class28;

import com.java.class27homework.Iphone;

public class IPhoneMainClass {

    public static void main(String[] args) {
        IPhone iph = new IPhone("14",512,"white");
        //System.out.println(Iphone.brand);
        IPhone.getBasicInfo();
       // IPhone iph = new IPhone();
        iph.getMoreDetails();
        iph.getBasicInfo();
        System.out.println(iph.operationSystem);
        //System.out.println(IPhone.model);//error


    }
}
