package com.example.huy.bathroomapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.CountDownTimer;

public class waitEstimate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wait_estimate);
        //ImageButton female =(ImageButton)findViewById(R.id.femaleButton);


        Button submit = (Button) findViewById(R.id.submitButton);
        Button cancel;
        submit.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {

                                          view.setVisibility(View.GONE);


                                      });


                Button cancel1 = (Button) findViewById(R.id.cancelButton);
        cancel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //when button is pressed
            }
        });
        ;


    }
