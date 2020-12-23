package com.example.hotelqualitifinalproject.model;

import java.util.List;

public class Accommodation {

    private Long id;
    private String startDay;
    private String endDay;
    private Double valueReservation;
    private Guest guest;
    private Hotel hotel;


    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public double getValueReservation() {
        return valueReservation;
    }

    public void setValueReservation(double valueReservation) {
        this.valueReservation = valueReservation;
    }

    // ver
    @Override
    public String toString() {
        return "Accommodation [id=" + id + ", startDay=" + startDay + ", endDay=" + endDay + ", valueReservation="
                + valueReservation + "]";
    }

}

