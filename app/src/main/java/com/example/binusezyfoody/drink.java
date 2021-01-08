package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class drink extends AppCompatActivity {

    Button add;
    Button add2;
    Button add3;
    Button add4;
    Button myorder;
    String text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);

        add = findViewById(R.id.add);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = "Air Mineral\nRp. 10.000";
                Intent intent = new Intent(drink.this, order.class);
                intent.putExtra("displaytext",text);
                startActivity(intent);
            }
        });

        add2 = findViewById(R.id.add2);

        add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = "Golda\nRp. 5.000";
                Intent intent = new Intent(drink.this, order.class);
                intent.putExtra("displaytext",text);
                startActivity(intent);
            }
        });

        add3 = findViewById(R.id.add3);

        add3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = "Teh Botol\nRp. 15.000";
                Intent intent = new Intent(drink.this, order.class);
                intent.putExtra("displaytext",text);
                startActivity(intent);
            }
        });

        add4 = findViewById(R.id.add4);

        add4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = "Jus Jeruk\nRp. 25.000";
                Intent intent = new Intent(drink.this, order.class);
                intent.putExtra("displaytext",text);
                startActivity(intent);
            }
        });

        myorder = findViewById(R.id.myorder);

        myorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(drink.this, myorder.class);
                startActivity(intent);
            }
        });


    }
}