package com.ocaexam.chapter1;

public class Swan {
    int numberEggs;//instance variable
    String first = "Emily";// write to fields
    String last = "Song";// write to fields
    String full = first+last;// read and write to fields

    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numberEggs = 1;
        //set variable //writing to a variable //setting it
        System.out.println(mother.numberEggs);
        //read variable //getting it
    }
}
