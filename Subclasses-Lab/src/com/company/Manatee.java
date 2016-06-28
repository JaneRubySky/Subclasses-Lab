package com.company;

/**
 * Created by janerubygrissom on 6/28/16.
 */
public class Manatee extends Mammal {

    String Manatee;

    public Manatee(boolean isFurry, int numLegs, int topSpeed, boolean isEndangered, String name) {
        super(isFurry, numLegs, topSpeed, isEndangered, name);

    }

    public String getManatee() {

        return (getName() + ": " + "Number of Legs- " + getNumLegs() + ", " + "Top Speed- " + getTopSpeed() + "mph" +
                ", " + "Endangered- "+ getIsEndangered() + ", " + "Furry-" + isFurry());
    }
}
