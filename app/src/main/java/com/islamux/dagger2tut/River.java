package com.islamux.dagger2tut;


import android.util.Log;

import javax.inject.Inject;

public class River {
    private static final String TAG = "River";

    // For view only (lets say these class is closed and we couldn't use @inject inside it. )
    public River() {
        Log.d(TAG,"Fathi River");
    }

    public String getWater(){
        return "water";
    }
}
