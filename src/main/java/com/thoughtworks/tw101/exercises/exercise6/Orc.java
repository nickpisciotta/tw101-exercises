package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by nickpisciotta on 3/22/17.
 */
public class Orc implements Monster {

    private int hitPoints = 20;
    private String name = "Orc";


    @Override
    public void takeDamage(int amount) {
       hitPoints -= amount;
    }

    @Override
    public void reportStatus() {
        System.out.println(name + " has " + hitPoints +  " hit points.");
    }
}
