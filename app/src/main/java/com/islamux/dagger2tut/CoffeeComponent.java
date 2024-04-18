package com.islamux.dagger2tut;


import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = CoffeeModule.class /*,Module2.class, Module3.class*/) //tell dagger to use CoffeeModule
public interface CoffeeComponent {

    Coffee getCoffee();

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder sugar(@Sugar int sugar);
        @BindsInstance
        Builder milk(@Milk int milk);

        CoffeeComponent build();
    }

    // tell dagger using mainActivity without boilerplate code
    // only one time inject for mainActivity
    void inject(MainActivity mainActivity);
}
