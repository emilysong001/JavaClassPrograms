package com.java.class21;

public class Homework4 {
    public static void main(String[] args) {
        // 4.  Write a program to print the below pattern
        //*
        //**
        //***
        //****
        //*****
        int num = 8;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
