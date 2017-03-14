package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {

        int total = 0;
        for (int i = 1; i < 100; i++) {
            if (isOdd(i)) {
                System.out.println(i);
                total = total + i;
            }
        }
        System.out.println("Total of all odd numbers: " + total);
    }

    public static boolean isOdd (double number) {
          return  (number % 2 == 1) ? true : false;
    }
}
