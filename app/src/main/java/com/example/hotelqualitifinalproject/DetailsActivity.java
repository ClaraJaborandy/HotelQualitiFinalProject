package com.example.hotelqualitifinalproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
    }

    public void telaDeReserva(View view){

        Intent intent = new Intent(this, ReservationScreen.class);
        startActivity(intent);
    }
}