package com.islamux.dagger2tut;

import dagger.Component;
@Component(modules = CoffeeModule.class /*,Module2.class, Module3.class*/) //tell dagger to use CoffeeModule
public interface CoffeeComponent {

    Coffee getCoffee();

    // tell dagger using mainActivity without boilerplate code
    // only one time inject for mainActivity
    void inject(MainActivity mainActivity);
}
