package com.java.class17;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        sumOfEven(1, 100);
        System.out.println("======================");
        //prime();

        int j = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the n value : ");
        int num = scanner.nextInt();
        System.out.print("Prime numbers between 1 to " + num + " are ");
        while (j <= num) {
            int i = 1;
            int counter = 0;
            while (i <= j) {
                if (j % i == 0) {
                    counter++;
                }
                ++i;
            }
            if (counter == 2) {
                System.out.print(j + " ");
            }
            ++j;
        }
    }

    //Write a program that calculates the sum of all even numbers between 1 and a 100 using a while loop.
    //2+4+6+8 … = ?
    public static void sumOfEven(int i, int j) {
        int sum = 0;
        while (i <= j) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }

    //Write a program that prints all prime numbers between 1 and a 100  using a while loop.
    //
    public static void prime() {
        //outer while loop - iterate all provided numbers 1-100
        int i = 1;
        while (i <= 100) {
            //prime number means it can only be divided into 1 and itself
            //so inner while loop - iterate from 2 to given number-1,
            //if it can be divided by any number of (2->given number-1) with no remainder, then it is not a prime number.
            // ex: 4%2==0, not prime
            int j = 2;
            boolean flag = false;
            while (j <= i - 1) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
                j++;
            }
            if (!flag) {
                System.out.println(i + " is a prime number");
            }
            i++;
        }
    }
}
