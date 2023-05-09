package com.ocaexam.chapter4.school;

public class Classroom {
    private int roomNumber;
    protected String teacherName;
    static int globalKey = 54321;
    public int floor=3;

    public Classroom(int r,String s) {
        roomNumber = r;
        teacherName = s;

    }
}
