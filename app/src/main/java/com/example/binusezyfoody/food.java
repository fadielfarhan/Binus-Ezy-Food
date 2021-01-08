package com.example.binusezyfoody;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class food extends AppCompatActivity {

    Button add;
    Button add2;
    Button add3;
    Button add4;
    Button myorder;
    String text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        add = findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = "Ayam goreng\n Rp.20.000";
                Intent intent = new Intent(food.this, order.class);
                intent.putExtra("displaytext",text);
                startActivity(intent);
            }
        });

        add2 = findViewById(R.id.add2);

        add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = "Carbonara\nRp.25.000";
                Intent intent = new Intent(food.this, order.class);
                intent.putExtra("displaytext",text);
                startActivity(intent);
            }
        });

        add3 = findViewById(R.id.add3);

        add3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = "Nasi goreng\nRp. 25.000";
                Intent intent = new Intent(food.this, order.class);
                intent.putExtra("displaytext",text);
                startActivity(intent);
            }
        });

        add4 = findViewById(R.id.add4);

        add4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = "Ikan Bakar\\nRp.35.000";
                Intent intent = new Intent(food.this, order.class);
                intent.putExtra("displaytext",text);
                startActivity(intent);
            }
        });

        myorder = findViewById(R.id.myorder);

        myorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(food.this, myorder.class);
                startActivity(intent);
            }
        });


    }
}