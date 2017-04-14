package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by nickpisciotta on 3/22/17.
 */
public class Troll implements Monster {

    private int hitPoints = 40;
    private String name = "Troll";


    @Override
    public void takeDamage(int amount) {hitPoints -= amount/2;}

    @Override
    public void reportStatus() {
        System.out.println(name + " has " + hitPoints +  " hit points.");
    }
}
