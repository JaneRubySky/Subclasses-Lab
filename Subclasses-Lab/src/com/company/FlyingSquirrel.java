package com.company;

/**
 * Created by janerubygrissom on 6/28/16.
 */


public class FlyingSquirrel extends Mammal {

    String FlyingSquirrel;

    public FlyingSquirrel(boolean isFurry, int numLegs, int topSpeed, boolean isEndangered, String name) {
        super(isFurry, numLegs, topSpeed, isEndangered, name);

    }

    public String getFlyingSquirrel() {

        return (getName() + ": " + "Number of Legs- " + getNumLegs() + ", " + "Top Speed- " + getTopSpeed() + "mph" +
                ", " + "Endangered- "+ getIsEndangered() + ", " + "Furry-" + isFurry());

    }
}
