package com.java.class16;

public class LoopPractice {
    //Write a program
    //that will count number of vowel characters and
    //and consonant characters in a String

    //String str = "Hello DevXer";
    //4 - vowels
    //8 - consonants including the space
    public static void main(String[] args) {
        String str10 = "Hello DevXer";
        //iterate through all characters
        //if character is a e i o u,  then it is vowel, length of vowel
        int index = 0;
        int lengthOfVowel = 0;
        int lengthOfConsonant = 0;
        while (index < str10.length()) {
            switch (str10.toLowerCase().charAt(index)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    //System.out.println(str10.charAt(index)+" is vowel");
                    lengthOfVowel++;
                    break;
                default:
                    //System.out.println(str10.charAt(index)+" is consonant");
                    lengthOfConsonant++;
            }
            index++;
        }
        System.out.println(lengthOfVowel + " Vowel");
        System.out.println(lengthOfConsonant + " Consonant");
    }
}

