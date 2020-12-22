package com.example.hotelqualitifinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.hotelqualitifinalproject.adapter.CheapestHotelsAdapter;

import java.util.ArrayList;
import java.util.Arrays;

public class CheapestHotel extends AppCompatActivity {


    ArrayList<Hoteis> listaHoteis = new ArrayList<>(
            Arrays.asList(
                    new Hoteis("Qualiti Premium", "20211201", "20211203", 999.99, R.drawable.qualitipremium),
                    new Hoteis("Jardim Botânico", "20211201", "20211203", 930.11, R.drawable.jardimbotanico),
                    new Hoteis("Parque das Flores", "20211201", "20211203", 99.25, R.drawable.parquedasflores),
                    new Hoteis("Mar Atlântico", "20211201", "20211203", 320.61, R.drawable.maratlantico)
            ));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheapest_hotel);


        ListView cheapestHotelList = findViewById(R.id.cheapestHotelList);
        CheapestHotelsAdapter gerenciador = new CheapestHotelsAdapter(this, R.layout.item_view, listaHoteis);
        cheapestHotelList.setAdapter(gerenciador);
    }

    ImageButton imageButton;
    public void profileButton(View view){
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        Intent intent = new Intent(CheapestHotel.this, EditProfile.class);
        startActivity(intent);

    }

    public void inputPersonalData (View view){
        Intent intent = new Intent(CheapestHotel.this, ReservationOptions.class);
        startActivity(intent);
    }




}