package com.islamux.dagger2tut;

import android.util.Log;

import javax.inject.Inject;

public class Coffee {
    private static final String TAG = "Coffee";

    // If we want to use the three ways of injections at the same time,field injection, constructor injection, and method injection in the same time

        // field injection
        @Inject
       Farm farm;

      // without field injection
       River river;

       // from api or user input or stable value
        int sugar;

       // constructor injection
    @Inject
    public Coffee(River river, int sugar) {
        this.river = river;
        this.sugar = sugar;

    }

    // method injection
    @Inject
    public void connectElectricity() {
        
        Log.d(TAG, "Fathi connectElectricity: connecting ");
    }
    public String getCoffeeCup() {
        return farm.getBeans() + "+" + river.getWater() + "+sugar: " + sugar;
    }

}
