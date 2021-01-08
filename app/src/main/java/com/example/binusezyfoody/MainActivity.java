package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    Button drink;
    Button food;
    Button snack;
    Button myorder;
    Button map;
    ImageButton drinklogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drink = findViewById(R.id.drink);

        drink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, drink.class);
                startActivity(intent);
            }
        });

        drinklogo = findViewById(R.id.drinklogo);

        drinklogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, drink.class);
                startActivity(intent);
            }
        });

        food = findViewById(R.id.food);

        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, food.class);
                startActivity(intent);
            }
        });

        snack = findViewById(R.id.snack);

        snack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, snack.class);
                startActivity(intent);
            }
        });
        myorder = findViewById(R.id.myorder);

        myorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, myorder.class);
                startActivity(intent);
            }
        });

        map = findViewById(R.id.map);

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, maps.class);
                startActivity(intent);
            }
        });

    }
}