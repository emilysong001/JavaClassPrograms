package com.java.class12;

public class WebsitePractice2_2 {
    public static void main(String[] args) {
        String str = "GOOGLE";
        reverseWords(str);


    }

    public static void reverseWords(String str) {
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; --i) {
            reverse.append(str.charAt(i));
        }
        System.out.println(reverse);
    }
}

