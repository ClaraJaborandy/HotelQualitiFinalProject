package com.example.hotelqualitifinalproject.repository;

import com.example.hotelqualitifinalproject.model.Hotel;
import com.example.hotelqualitifinalproject.service.GuestService;
import com.example.hotelqualitifinalproject.service.HotelService;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitConfig {

    private Retrofit retrofit;

    public RetrofitConfig() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl("https://hotelrecode.herokuapp.com/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    public HotelService getHotelService(){
        return retrofit.create(HotelService.class);
    }

    public GuestService getGuestService() {return retrofit.create(GuestService.class);}
}
