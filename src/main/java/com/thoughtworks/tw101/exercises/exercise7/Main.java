package com.thoughtworks.tw101.exercises.exercise7;

//import java.io.Console;
import java.io.IOException;
import java.util.Scanner;
// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        GuessingGame game = new GuessingGame();
        int userGuess;
        System.out.println("Please guess a number between 1 and 100");

            while (!game.getIsGameOver()) {
                userGuess = reader.nextInt();
                game.guess(userGuess);
            }

    }
}
