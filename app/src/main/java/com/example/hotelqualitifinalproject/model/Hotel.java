package com.example.hotelqualitifinalproject.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class Hotel {

    private Long id;
    private String name;
    private String email;
    private String telephone;
    private Integer classification;
    private Double priceWeekRegular;
    private Double priceWeekFidelity;
    private Double priceWeekendRegular;
    private Double priceWeekendFidelity;

    public Hotel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getClassification() {
        return classification;
    }

    public void setClassification(Integer classification) {
        this.classification = classification;
    }

    public Double getPriceWeekRegular() {
        return priceWeekRegular;
    }

    public void setPriceWeekRegular(Double priceWeekRegular) {
        this.priceWeekRegular = priceWeekRegular;
    }

    public Double getPriceWeekFidelity() {
        return priceWeekFidelity;
    }

    public void setPriceWeekFidelity(Double priceWeekFidelity) {
        this.priceWeekFidelity = priceWeekFidelity;
    }

    public Double getPriceWeekendRegular() {
        return priceWeekendRegular;
    }

    public void setPriceWeekendRegular(Double priceWeekendRegular) {
        this.priceWeekendRegular = priceWeekendRegular;
    }

    public Double getPriceWeekendFidelity() {
        return priceWeekendFidelity;
    }

    public void setPriceWeekendFidelity(Double priceWeekendFidelity) {
        this.priceWeekendFidelity = priceWeekendFidelity;
    }

    // ver se eu realmente preciso disso
    @Override
    public String toString() {
        return "Hotel [id=" + id + ", name=" + name + ", email=" + email + ", telephone=" + telephone
                + ", classification=" + classification + ", priceWeekRegular=" + priceWeekRegular
                + ", priceWeekFidelity=" + priceWeekFidelity + ", priceWeekendRegular=" + priceWeekendRegular
                + ", priceWeekendFidelity=" + priceWeekendFidelity + "]";
    }
}