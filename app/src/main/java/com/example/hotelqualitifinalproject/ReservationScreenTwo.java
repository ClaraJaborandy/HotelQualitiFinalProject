package com.example.hotelqualitifinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ReservationScreenTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation_screen_two);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}