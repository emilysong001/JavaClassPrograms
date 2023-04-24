package com.java.class35;

public class EnumExample {
    public static void main(String[] args) {
        System.out.println(DaysOfWeek.MONDAY);
        System.out.println(MarksOfStudent.AIDAI);
        System.out.println(MarksOfStudent.AIDAI.marks);
        System.out.println(MarksOfStudent.AIDAI.i);
    }
}

enum DaysOfWeek{ //all the variable inside the enum should be String
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY
}


enum MarksOfStudent{
    AIDAI(45,33),AZAT(33, 34),EMILY(20, 34);
    int marks;
    int i;
    MarksOfStudent(int marks, int i){
        this.marks = marks;
        this.i = i;
    }

}