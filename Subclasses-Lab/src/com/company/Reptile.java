package com.company;

/**
 * Created by janerubygrissom on 6/28/16.
 */


public class Reptile extends Animal {
    private boolean mIsColdBlooded;

    public Reptile(boolean isColdBlooded, int numLegs, int topSpeed, boolean isEndangered, String name) {
        super(numLegs, topSpeed, isEndangered, name);
        mIsColdBlooded = isColdBlooded;
    }

    public boolean isColdBlooded() {
        return mIsColdBlooded;
    }
}
