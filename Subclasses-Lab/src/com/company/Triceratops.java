package com.company;

/**
 * Created by janerubygrissom on 6/28/16.
 */
public class Triceratops extends Reptile {

    String Triceratops;

    public Triceratops(boolean isColdBlooded, int numLegs, int topSpeed, boolean isEndangered, String name) {
        super(isColdBlooded, numLegs, topSpeed, isEndangered, name);

    }

    public String getTriceratops() {

        return (getName() + ": " + "Number of Legs- " + getNumLegs() + ", " + "Top Speed- " + getTopSpeed() + "mph" +
                ", " + "Endangered- "+ getIsEndangered() + ", " + "Cold Blooded-" + isColdBlooded());
    }
}
