package com.islamux.dagger2tut;

import android.app.Application;

public class MainApplication extends Application {
   private CoffeeComponent coffeeComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        coffeeComponent =  DaggerCoffeeComponent.builder().sugar(4).milk(5).build(); // pass sugars to the module from the activity (user) (editText.text)
    }

    public CoffeeComponent getCoffeeComponent() {
        return coffeeComponent;
    }
}
