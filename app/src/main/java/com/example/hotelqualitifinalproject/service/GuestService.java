package com.example.hotelqualitifinalproject.service;
import androidx.room.Update;

import com.example.hotelqualitifinalproject.model.Guest;
import com.example.hotelqualitifinalproject.model.Hotel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.OPTIONS;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;


public interface GuestService {

    @GET("guest")
    Call<List<Guest>> findAllGuest();

    @GET("guest")
    Call<List<Guest>> findGuestById();

    @POST("guest")
    Call<Void> saveGuest(@Body Guest guest);

    @POST("guest")
    Call<List<Guest>> updateGuest();

    @DELETE("guest")
    Call<List<Guest>> deleteGuestById();

    @DELETE("guest")
    Call<List<Guest>> deleteAllGuest();

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://hotelrecode.herokuapp.com/guest")
            .addConverterFactory(JacksonConverterFactory.create())
            .build();
}
