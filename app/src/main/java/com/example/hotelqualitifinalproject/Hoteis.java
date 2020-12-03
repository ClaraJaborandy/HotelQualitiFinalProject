package com.example.hotelqualitifinalproject;

public class Hoteis {

    private String name;
    private String city;
    private Double priceWeekFid;
    private Double priceWeekNorm;
    private Double priceWeekendFid;
    private Double priceWeekendNorm;

    public Hoteis() {
    }

    public Hoteis(String name, String city, Double priceWeekFid, Double priceWeekNorm, Double priceWeekendFid, Double priceWeekendNorm) {
        this.name = name;
        this.city = city;
        this.priceWeekFid = priceWeekFid;
        this.priceWeekNorm = priceWeekNorm;
        this.priceWeekendFid = priceWeekendFid;
        this.priceWeekendNorm = priceWeekendNorm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getPriceWeekFid() {
        return priceWeekFid;
    }

    public void setPriceWeekFid(Double priceWeekFid) {
        this.priceWeekFid = priceWeekFid;
    }

    public Double getPriceWeekNorm() {
        return priceWeekNorm;
    }

    public void setPriceWeekNorm(Double priceWeekNorm) {
        this.priceWeekNorm = priceWeekNorm;
    }

    public Double getPriceWeekendFid() {
        return priceWeekendFid;
    }

    public void setPriceWeekendFid(Double priceWeekendFid) {
        this.priceWeekendFid = priceWeekendFid;
    }

    public Double getPriceWeekendNorm() {
        return priceWeekendNorm;
    }

    public void setPriceWeekendNorm(Double priceWeekendNorm) {
        this.priceWeekendNorm = priceWeekendNorm;
    }
}

