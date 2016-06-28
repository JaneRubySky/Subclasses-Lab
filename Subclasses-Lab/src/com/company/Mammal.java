package com.company;

/**
 * Created by janerubygrissom on 6/28/16.
 */

public class Mammal extends Animal {
        private boolean mIsFurry;

        public Mammal(boolean isFurry, int numLegs, int topSpeed, boolean isEndangered, String name){
            super(numLegs, topSpeed, isEndangered, name);
            mIsFurry = isFurry;
        }

        public boolean isFurry(){
            return mIsFurry;
        }
    }
