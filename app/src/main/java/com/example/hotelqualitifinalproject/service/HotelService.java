package com.example.hotelqualitifinalproject.service;

import com.example.hotelqualitifinalproject.model.Hotel;
import com.example.hotelqualitifinalproject.repository.HotelRepository;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.OPTIONS;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;


//import com.example.hotelqualitifinalproject.model.Hotel;
//import com.example.hotelqualitifinalproject.repository.HotelRepository;

public interface HotelService {

    @GET("hotel")
    Call<List<Hotel>> getAllHotels();

    @GET("hotel")
    Call<Hotel> getHotel();
}
