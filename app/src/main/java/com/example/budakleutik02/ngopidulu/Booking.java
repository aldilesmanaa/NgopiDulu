package com.example.budakleutik02.ngopidulu;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Booking extends AppCompatActivity {

    Button meja1, meja2, meja3, meja4, meja5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_booking);

        meja1 = (Button) findViewById(R.id.meja1);
        meja2 = (Button) findViewById(R.id.meja2);
        meja3 = (Button) findViewById(R.id.meja3);
        meja4 = (Button) findViewById(R.id.meja4);
        meja5 = (Button) findViewById(R.id.meja5);


        meja1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // Get username, password from EditText
                meja1.setVisibility(View.INVISIBLE);

                Toast.makeText(getApplicationContext(), "Meja 1 di Booking", Toast.LENGTH_LONG).show();

            }
        });

        meja2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // Get username, password from EditText
                meja2.setVisibility(View.INVISIBLE);

                Toast.makeText(getApplicationContext(), "Meja 2 di Booking", Toast.LENGTH_LONG).show();

            }
        });

        meja3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // Get username, password from EditText
                meja3.setVisibility(View.INVISIBLE);

                Toast.makeText(getApplicationContext(), "Meja 3 di Booking", Toast.LENGTH_LONG).show();

            }
        });

        meja4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // Get username, password from EditText
                meja4.setVisibility(View.INVISIBLE);

                Toast.makeText(getApplicationContext(), "Meja 4 di Booking", Toast.LENGTH_LONG).show();

            }
        });

        meja5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // Get username, password from EditText
                meja5.setVisibility(View.INVISIBLE);

                Toast.makeText(getApplicationContext(), "Meja 5 di Booking", Toast.LENGTH_LONG).show();

            }
        });
    }
}