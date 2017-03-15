package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {
        int totalOfOdds = 0;
        for (int i = start + 1; i < end; i++) {
            if (isOdd(i)) {
                totalOfOdds = totalOfOdds + i;
            }
        }
        return totalOfOdds;
    }

    public boolean isOdd (double number) {
        return  (number % 2 == 1) ? true : false;
    }
}
