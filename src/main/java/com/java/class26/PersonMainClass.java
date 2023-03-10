package com.java.class26;

public class PersonMainClass {
    public static void main(String[] args) {
        /*int a = 10;
        System.out.println(a);*/

        //create reference of class
        Person aidai; //object: size is not existed, no memory, it must be initialized.
        int i = 0; //initialized
        String str; //default value is null, it doesn't exist
        System.out.println(i);


        //Initialize memory for the object
        Person dana = new Person();
        Person azat = new Person();


        dana.age=34;
        azat.age=14;
        dana.name = "Danaker";
        azat.name = "Azat Azamatov";
        dana.run();
    }
}
