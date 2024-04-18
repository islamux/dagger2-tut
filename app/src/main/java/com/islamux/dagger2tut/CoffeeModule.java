package com.islamux.dagger2tut;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
@Module
public class CoffeeModule {

    @Singleton // to get one instance from class not own. (River)
    @Provides // class not mine
    River provideRiver() {
        // return instance from River class to make CoffeeComponent use it.
        return new River();
    }


    // if we have another func we make annotate @Provides above them.
//    @Provides
//    AnotherClass provideAnotherClass() {
//        return new AnotherClass();
//    }

}
