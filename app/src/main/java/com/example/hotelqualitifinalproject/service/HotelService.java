package com.example.hotelqualitifinalproject.service;

import androidx.room.Update;

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

public interface HotelService {

    @GET("hotelRepository")
    Call<List<Hotel>> findAllHotels();

    @GET("hotelRepository")
    Call<List<Hotel>> findHotelById();

    @POST("hotelRepository")
    Call<List<Hotel>> saveHotel();

    @Update
    @POST("hotelRepository")
    Call<List<Hotel>> updateHotel();

    @DELETE("HotelRepository")
    Call<List<Hotel>> deleteHotelById();

    @DELETE("HotelRepository")
    Call<List<Hotel>> deleteAllHotel();
}
