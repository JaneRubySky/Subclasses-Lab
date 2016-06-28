package com.company;

/**
 * Created by janerubygrissom on 6/28/16.
 */
public class Turtle extends Reptile {

    String Turtle;

    public Turtle(boolean isColdBlooded, int numLegs, int topSpeed, boolean isEndangered, String name) {
        super(isColdBlooded, numLegs, topSpeed, isEndangered, name);

    }

    public String getTurtle() {

        return (getName() + ": " + "Number of Legs- " + getNumLegs() + ", " + "Top Speed- " + getTopSpeed() + "mph" +
                ", " + "Endangered- " + getIsEndangered() + ", " + "Cold Blooded-" + isColdBlooded());
    }
}
