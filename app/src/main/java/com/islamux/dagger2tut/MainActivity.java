package com.islamux.dagger2tut;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

// manual dependency injection
//        Farm farm = new Farm();
//        River river = new River();
//
//        Coffee coffee = new Coffee(river, farm);
//        coffee.getCoffee();

// auto dependency dagger2
        // way1 : Through constructor
        CoffeeComponent component = DaggerCoffeeComponent.create(); //DaggerCoffeeComponent auto generated by dagger contains getCoffee(new Farm(), new River())
        component.getCoffee(); // Now you can go inside the getCoffe directly

    }
}