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
                    new Hoteis("Hotel Qualiti Premium", "Dubai, EAU", 50.00, 100.00, 80.00, 150.00),
                    new Hoteis("Jardim Botânico", "Gravatá, PE", 50.00, 70.00, 80.00, 105.00),
                    new Hoteis("Parque das Flores", "Natal, RN", 50.00, 75.00, 80.00, 150.00),
                    new Hoteis("Mar Atlântico", "Tamandaré, PE", 50.00, 80.00, 80.00, 130.00)
            ));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheapest_hotel);


        ListView cheapestHotelList = findViewById(R.id.cheapestHotelList);
        ArrayAdapter gerenciador = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listaHoteis);
        cheapestHotelList.setAdapter(gerenciador);
    }
}