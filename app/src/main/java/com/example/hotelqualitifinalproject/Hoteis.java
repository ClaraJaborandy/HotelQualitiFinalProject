package com.example.hotelqualitifinalproject;

public class Hoteis {

    private String name;
    private String city;
    private Integer priceWeekFid;
    private Integer priceWeekNorm;
    private Integer priceWeekendFid;
    private Integer priceWeekendNorm;
    private Integer imageSource;

    public Hoteis() {
    }

    public Hoteis(String name, String city, Integer priceWeekFid, Integer priceWeekNorm, Integer priceWeekendFid, Integer priceWeekendNorm, Integer imageSource) {
        this.name = name;
        this.city = city;
        this.priceWeekFid = priceWeekFid;
        this.priceWeekNorm = priceWeekNorm;
        this.priceWeekendFid = priceWeekendFid;
        this.priceWeekendNorm = priceWeekendNorm;
        this.imageSource = imageSource;
    }

    public Integer getImageSource() {
        return imageSource;
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

    public int getPriceWeekFid() {
        return priceWeekFid;
    }

    public void setPriceWeekFid(Integer priceWeekFid) {
        this.priceWeekFid = priceWeekFid;
    }

    public int getPriceWeekNorm() {
        return priceWeekNorm;
    }

    public void setPriceWeekNorm(Integer priceWeekNorm) {
        this.priceWeekNorm = priceWeekNorm;
    }

    public int getPriceWeekendFid() {
        return priceWeekendFid;
    }

    public void setPriceWeekendFid(Integer priceWeekendFid) {
        this.priceWeekendFid = priceWeekendFid;
    }

    public int getPriceWeekendNorm() {
        return priceWeekendNorm;
    }

    public void setPriceWeekendNorm(Integer priceWeekendNorm) {
        this.priceWeekendNorm = priceWeekendNorm;
    }

    @Override
    public String toString(){
        return name;
    }


}

