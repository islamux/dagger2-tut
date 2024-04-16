package com.islamux.dagger2tut;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeModule {

    int sugar;

    public CoffeeModule(int sugar) {
        this.sugar = sugar;
    }

    @Provides
    River provideRiver() {
        // return instance from River class to make CoffeeComponent use it.
        return new River();
    }

    @Provides
    int provideSugar() {
        return sugar;
    }

    // if we have another func we make annotate @Provides above them.
//    @Provides
//    AnotherClass provideAnotherClass() {
//        return new AnotherClass();
//    }

}
