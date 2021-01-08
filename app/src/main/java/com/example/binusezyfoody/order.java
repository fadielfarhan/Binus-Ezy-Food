package com.example.binusezyfoody;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class order extends AppCompatActivity {

    int count = 0;
    Button increase;
    Button decrease;
    TextView quantity;
    Button myorder;
    Button MoreOrder;
    TextView Display;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        increase = findViewById(R.id.increase);
        decrease = findViewById(R.id.decrease);
        quantity = findViewById(R.id.displayquantity);

        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                quantity.setText(count +" Quantity" );
            }
        });



        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                quantity.setText(count +" Quantity" );
            }
        });




        myorder = findViewById(R.id.myorder);

        myorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(order.this, myorder.class);
                startActivity(intent);
            }
        });

        MoreOrder = findViewById(R.id.MoreOrder);

        MoreOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(order.this, drink.class);
                startActivity(intent);
            }
        });

        Intent intent = getIntent();
        text = intent.getStringExtra("displaytext");
        Display = (TextView) findViewById(R.id.textView2);
        Display.setText(getIntent().getStringExtra("displaytext"));
    }
}