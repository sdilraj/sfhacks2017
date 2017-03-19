package com.example.huy.bathroomapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class information extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        ImageButton male =(ImageButton)findViewById(R.id.maleButton);
        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(),waitEstimate.class);
                startActivity(intent1);

        }
        });
        ImageButton female =(ImageButton)findViewById(R.id.femaleButton);
        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(getApplicationContext(),waitEstimate.class);
                startActivity(intent2);

            }
        });
    }
}



