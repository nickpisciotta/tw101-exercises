package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

import com.thoughtworks.tw101.exercises.exercise7.GuessingGame;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please guess a number between 1 and 100");
        GuessingGame game = new GuessingGame();
        ArrayList<Integer> guesses = new ArrayList<>();

        try {
            while (!game.getIsGameOver()) {
                int userGuess = reader.nextInt();
                guesses.add(userGuess);
                game.guess(userGuess);
            }
        }   catch (InputMismatchException e){
                System.out.println("You need to enter a number");

        }
            System.out.println("Here are your guesses: ");
            for (int guess : guesses) {
                System.out.println(guess);
            }

    }
}
