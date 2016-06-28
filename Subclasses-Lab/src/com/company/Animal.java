package com.company;

/**
 * Created by janerubygrissom on 6/28/16.
 */
public class Animal {

    private int mNumLegs;
    private int mTopSpeed;
    private boolean mIsEndangered;
    private String mName;

    public Animal(int numLegs, int topSpeed, boolean isEndangered, String name) {
        mNumLegs = numLegs;
        mTopSpeed = topSpeed;
        mIsEndangered = isEndangered;
        mName = name;
    }

    public int getNumLegs(){
        return mNumLegs;
    }

    public int getTopSpeed(){
        return mTopSpeed;
    }

    public boolean getIsEndangered(){
        return mIsEndangered;
    }

    public String getName(){
        return mName;
    }
}





