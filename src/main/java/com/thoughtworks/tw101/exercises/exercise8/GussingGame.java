package com.thoughtworks.tw101.exercises.exercise8;

/**
 * Created by nickpisciotta on 3/30/17.
 */
public class GussingGame {

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
