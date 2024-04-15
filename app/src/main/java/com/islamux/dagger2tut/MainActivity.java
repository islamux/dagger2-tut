package com.islamux.dagger2tut;


import android.health.connect.changelog.ChangeLogTokenRequest;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Inject
    Coffee coffee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        /* Three ways to inject dependencies
         1- Dagger using constructor injection
         2- Dagger using field injection
         3-Dagger using method injection

         1- Dagger using constructor injection:
        //CoffeeComponent component = DaggerCoffeeComponent.builder().build();
        CoffComponent component = DaggerCoffeeComponent.create();

        component.getCoffee().getCoffeeCup();

         2- Dagger using field injection:
        CoffeeComponent component = DaggerCoffeeComponent.create();
        component.getCoffee().getCoffeeCup();

         3-Dagger using method injection:
        CoffeeComponent component = DaggerCoffeeComponent.create();
        component.getCoffee().getCoffeeCup()

        // Steps of Dagger:
         1- dagger insert inside class constructor
         2- dagger insert inside class field
         3- dagger insert inside class method (without calling it manually)

         /* Best practice:
            1 - using constructor injection is the best practice
            2 - using filed injection is second practice because it cause capping classes in the class.
         */

        CoffeeComponent component = DaggerCoffeeComponent.create();
        // coffee.connectElectricity(); // boiler plate code so we don't need to write it again and again. then we can use only one time. inject function to inject the dependencies.
        component.inject(this); // to inject only one time in the activity withou using alot of instances.

        Log.d(TAG, "FATHI onCreate: " +  coffee.getCoffeeCup());

    }
}