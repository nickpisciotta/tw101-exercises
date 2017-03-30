package com.thoughtworks.tw101.exercises.exercise7;

/**
 * Created by nickpisciotta on 3/24/17.
 */
public class GuessingGame {

    private boolean isGameOver = false;
    private int randomNumber = (int) (Math.random() * 100);


    public boolean guess (int userGuess) {
        if (userGuess == randomNumber) {
            printUserWon();
            isGameOver = true;
            return true;
        }

        if (userGuess > randomNumber) {
            printTooHigh();
        } else {
            printTooLow();
        }
        return false;
    }

    public boolean getIsGameOver() {
        return isGameOver;
    }

    private void printUserWon() {
        System.out.println("You won! Correct answer was " + randomNumber );
    }

    private void printTooHigh() {
        System.out.println("Your guess was too high. Try again");
    }

    private void printTooLow() {
        System.out.println("Your guess was too low. Try again");
    }

}
