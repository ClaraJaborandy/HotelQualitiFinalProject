package com.example.hotelqualitifinalproject.service;
import androidx.room.Update;

import com.example.hotelqualitifinalproject.model.Accommodation;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.OPTIONS;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface AccommodationService {
    @GET("accommodation")
    Call<List<Accommodation>> findAllAccommodation();

    @GET("accommodation")
    Call<List<Accommodation>> findAll();

    @GET("accommodation")
    Call<List<Accommodation>> findAccommodationById();

    @GET("accommodation")
    Call<List<Accommodation>> findAccommodationByGuest();

    @GET("accommodation")
    Call<List<Accommodation>> findAccommodationByHotel();

    @POST("accommodation")
    Call<List<Accommodation>> saveAccommodation();

    @POST("accommodation")
    Call<List<Accommodation>> updateAccommodation();

    @DELETE("accommodation")
    Call<List<Accommodation>> deleteAccommodationById();

    @DELETE("accommodation")
    Call<List<Accommodation>> deleteAllAccommodation();
}
