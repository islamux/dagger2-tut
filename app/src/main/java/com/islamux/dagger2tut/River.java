package com.islamux.dagger2tut;


import android.util.Log;

import javax.inject.Inject;

public class River {
    private static final String TAG = "River";

    @Inject
    public River() {
        Log.d(TAG,"Fathi River");
    }

    public String getWater(){
        return "water";
    }
}
