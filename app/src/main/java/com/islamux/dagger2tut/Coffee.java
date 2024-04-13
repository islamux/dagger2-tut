package com.islamux.dagger2tut;

import javax.inject.Inject;

public class Coffee {
    private River river ;
    private Farm farm ;

    @Inject
    public Coffee(River river, Farm farm) {
        this.river = river;
        this.farm = farm;
    }

    String getCoffee(){
        return "Cop Of Coffee";
    }
}
