package com.java.class27;

public class Dog {
    String name;
    int age;
    String variety;

    Dog(String nameFromUser, int ageFromUser,String variety) {
        name = nameFromUser;
        age = ageFromUser;
        this.variety= variety;
        System.out.println(name+" is "+age+" years old, he is a "+variety);
    }
    Dog(String nameFromUser, String variety) {
        name = nameFromUser;
        this.variety= variety;
        System.out.println(name+" is a "+variety);
    }
    Dog() {
        System.out.println("This is a stray dog. ");
    }

}
