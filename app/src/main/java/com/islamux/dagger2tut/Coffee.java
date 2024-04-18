package com.islamux.dagger2tut;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

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
        int milk;

       // constructor injection
    @Inject
    public Coffee(River river, @Sugar int sugar, @Milk int milk) {
        this.river = river;
        this.sugar = sugar;
        this.milk = milk;

    }

    // method injection
    @Inject
    public void connectElectricity() {
        
        Log.d(TAG, "Fathi connectElectricity: connecting ");
    }
    public String getCoffeeCup() {
        return farm.getBeans() + "+" + river.getWater() + "+sugar: " + sugar + "+milk: " + milk;
    }

}
