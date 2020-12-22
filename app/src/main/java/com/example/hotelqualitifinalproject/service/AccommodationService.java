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
    @GET("AccommodationRepository")
    Call<List<Accommodation>> findAllAccommodation();

    @GET("AccommodationRepository")
    Call<List<Accommodation>> findAll();

    @GET("AccommodationRepository")
    Call<List<Accommodation>> findAccommodationById();

    @GET("AccommodationRepository")
    Call<List<Accommodation>> findAccommodationByGuest();

    @GET("AccommodationRepository")
    Call<List<Accommodation>> findAccommodationByHotel();

    @POST("AccommodationRepository")
    Call<List<Accommodation>> saveAccommodation();

    @Update
    @PUT("AccommodationRepository")
    Call<List<Accommodation>> updateAccommodation();

    @DELETE("AccommodationRepository")
    Call<List<Accommodation>> deleteAccommodationById();

    @DELETE("AccommodationRepository")
    Call<List<Accommodation>> deleteAllAccommodation();
}
