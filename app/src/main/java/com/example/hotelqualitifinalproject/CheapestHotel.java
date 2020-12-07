package com.example.hotelqualitifinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;

public class CheapestHotel extends AppCompatActivity {

    ArrayList<Hoteis> listaHoteis = new ArrayList<>(
            Arrays.asList(
                    new Hoteis("Hotel Qualiti Premium", "Dubai, EAU", 50, 100, 80, 150, R.drawable.qualitipremium),
                    new Hoteis("Jardim Botânico", "Gravatá, PE", 50, 70, 80, 105, R.drawable.jardimbotanico),
                    new Hoteis("Parque das Flores", "Natal, RN", 50, 75, 80, 150, R.drawable.parquedasflores),
                    new Hoteis("Mar Atlântico", "Tamandaré, PE", 50, 80, 80, 130, R.drawable.maratlantico)
            ));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheapest_hotel);


        ListView cheapestHotelList = findViewById(R.id.cheapestHotelList);
        CheapestHotelsAdapter gerenciador = new CheapestHotelsAdapter(this, R.layout.item_view, listaHoteis);
        cheapestHotelList.setAdapter(gerenciador);
    }
}