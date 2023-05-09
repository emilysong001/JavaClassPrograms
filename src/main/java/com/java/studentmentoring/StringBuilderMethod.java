package com.java.studentmentoring;

public class StringBuilderMethod {
    public static void main(String[] args) {

        StringBuilder str1 = new StringBuilder("AAAABBBCCCC");
        System.out.println("String1 = " + str1); // print out string

        //StringBuilder str = new StringBuilder();
        StringBuffer str = new StringBuffer();

        /*String str2 = new String ("Hi, Let's go to the market.");
        str2.substring(5);
        System.out.println(str2);*/

        //append(): add characters to the StringBuilder
        str.append("Hi, Let's go to the market.");
        System.out.println("String: " + str); // print out string

        //insert(): adds characters to the StringBuilder at the requested index
        str.insert(3,"Hello");
        System.out.println("The string after insert: "+str);

        //delete():removes characters from the sequence
        str.delete(0,3);//0 3-1 0-2 Hi,
        //.tek...
        //.te
        System.out.println("The string after delete: "+str);

        //reverse(): it reverses the characters in the sequences
        str.reverse();
        System.out.println("The string after reverse: "+str);
    }
}
