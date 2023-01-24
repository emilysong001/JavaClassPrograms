package com.java.class15;

public class Replace {

    //.replace('f','g')
    //.replace("fa","ga")
    //.replaceFirst("s","S")
    // String chain
    public static void main(String[] args) {
        String str = "feeksforfeeks";
        //str.replace('f','g') if don't assign, str is still the original one
        //String is immutable
        System.out.println(str.replace('f','g'));

        String str3 = "public static void main(String{} args)";
        String str4 =str3.replace('{','[').replace('}',']');
        System.out.println(str4);

        String str10 = "Rock and Roll, Spring Roll";
        str10 = str10.replace('o','B');
        System.out.println(str10);

        String str12 = "system.out.println(Hello World)";
        System.out.println(str12.replaceFirst("s","S").replace("(","(\"").replace(")","\");"));
    }
}
