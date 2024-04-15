package com.islamux.dagger2tut;

import android.util.Log;

import javax.inject.Inject;

public class Coffee {
    private static final String TAG = "Coffee";

    // If we want to use field injection, constructor injection, and method injection in the same time

        // field injection
        @Inject
       Farm farm;

      // wihout field injection
       River river;

       // constructor injection
    @Inject
    public Coffee(River river) {
        this.river = river;
    }

    // method injection
    @Inject
    public void connectElectricity() {
        
        Log.d(TAG, "Fathi connectElectricity: connecting ");
    }
    public String getCoffeeCup() {
        return farm.getBeans() + "+" + river.getWater();
    }

}
