package com.example.hotelqualitifinalproject.repository;

import com.example.hotelqualitifinalproject.model.Hotel;
import com.example.hotelqualitifinalproject.service.HotelService;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitConfig {

    private Retrofit retrofit;

    public RetrofitConfig() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl("http://hotelrecode.herokuapp.com")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    public HotelService getHotelService(){
        return retrofit.create(HotelService.class);
    }
}
