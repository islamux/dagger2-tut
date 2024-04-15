package com.islamux.dagger2tut;

import dagger.Component;
@Component
public interface CoffeeComponent {

    Coffee getCoffee();

    // tell dagger using mainActivity without boilerplate code
    // only one time inject for mainActivity
    void inject(MainActivity mainActivity);
}
