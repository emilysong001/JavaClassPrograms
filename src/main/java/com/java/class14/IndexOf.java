package com.java.class14;


public class IndexOf {
    public static void main(String[] args) {

        //indexOf(String s)
        //indexOf(String s, index i)
        //lastIndexOf(String s)

        String str1 = "tik tak";
        System.out.println(getIndexOf(str1));
        String str2 = "blass";
        System.out.println(getIndexOf(str2));

        String str3 = "macbook Air, Nike Air,Ipod Air";
        System.out.println(str3.indexOf("Air",10));
        System.out.println(str3.indexOf("air",10));
        System.out.println(str3.indexOf("Air",19));

        String str4 = "Lala polluza lala land la lakers";
        System.out.println(str4.indexOf("La",5));
        System.out.println(str4.indexOf("la",5));
        System.out.println(str4.indexOf("la",13));
        System.out.println(str4.indexOf("la",14));

        String str5 = "Java Developer, Java Coding";
        System.out.println(str5.lastIndexOf("Java"));
        String str6 = "Almazov";
        //"Almazova" last name //guess gender
        int last2Chars = str6.lastIndexOf("va");
        System.out.println(last2Chars);

    }

    public static int getIndexOf(String str){
        return str.indexOf("tak");
    }
}
