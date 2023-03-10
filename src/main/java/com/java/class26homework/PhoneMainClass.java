package com.java.class26homework;

public class PhoneMainClass {
    public static void main(String[] args) {
        Phone phone1= new Phone("iPhone","12",256);
        Phone phone2= new Phone("iPhone","14",512);
        Phone phone3= new Phone("Samsung","Galaxy",256);

        phone1.getDetails();
        phone1.getOperationSystem();
        phone1.call();
        phone1.text();

        phone2.getDetails();
        phone2.getOperationSystem();
        phone2.call();
        phone2.text();

        phone3.getDetails();
        phone3.getOperationSystem();
        phone3.call();
        phone3.text();

    }
}
