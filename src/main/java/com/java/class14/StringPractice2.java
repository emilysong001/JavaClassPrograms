package com.java.class14;

public class StringPractice2 {
    public static void main(String[] args) {
        //concatenation 2 ways:
        //1: + takes too many memories, it impacts the performance
        //2: concat
        String str = "<html>";
        str += "<body>"; //create a new String whenever we use +
        str += "<h1>Hello Devx</h1>";
        str += "</body>";
        str += "</html>";
        System.out.println(str);

        String str1 = "public class Hello";
        //concat method
        str1 = str1.concat("{");
        //escape characters
        //\n create new line
        //\t tab
        //\" double quotes
        str1 = str1.concat("\n");
        str1 = str1.concat("}");
        System.out.println(str1);

        //Strings are immutable objects -> can't be modified
        //want to change it, you must do reassignment
        //the original String doesn't change


    }
}
