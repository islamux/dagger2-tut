package com.islamux.dagger2tut;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

// i want to mak a farm as a single instance through the lifecycle of these app when dagger2 want instance.
@Singleton
public class Farm {
    private static final String TAG = "Farm";
    @Inject
    public Farm() {
        Log.d(TAG, "Fathi Farm");
    }

    public String getBeans(){
        return  "Beans";
    }
}
