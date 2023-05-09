package com.ocaexam.chapter4.city;

import com.ocaexam.chapter4.school.Classroom;

public class School {
    public static void main(String[] args) {
        //System.out.println(Classroom.globalKey);
        Classroom room = new Classroom(101,"mrs");
        System.out.println(room.floor);
    }
}
