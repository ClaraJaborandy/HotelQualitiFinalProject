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

    @GET("/hotel/2")
    Call<List<Hotel>> findAllHotel();

    @GET("hotel")
    Call<Hotel> findHotelById();

    @POST("hotel")
    Call<List<Hotel>> saveHotel();

    @POST("hotel")
    Call<List<Hotel>> updateHotel();

    @DELETE("hotel")
    Call<List<Hotel>> deleteHotelById();

    @DELETE("hotel")
    Call<List<Hotel>> deleteAllHotel();
}
