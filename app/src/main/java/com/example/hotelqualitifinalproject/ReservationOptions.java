package com.example.hotelqualitifinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ReservationOptions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation_payment);
    }

    public void clickTemp2 (View v) {
        Intent intent = new Intent(this, Finished.class);
        startActivity(intent);
        finish();
    }
}