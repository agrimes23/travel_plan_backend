package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Food {

    private final String name;
    private final String date;
    private final Float price;
    private final String rezTime;
    private final String siteLink;

    public Food(@JsonProperty("name") String name, @JsonProperty("date") String date, @JsonProperty("price") Float price, @JsonProperty("rezTime") String rezTime, @JsonProperty("siteLink") String siteLink) {
        this.name = name;
        this.date = date;
        this.price = price;
        this.rezTime = rezTime;
        this.siteLink = siteLink;
    }

    public String getName() {
        return name;
    }
    public String getDate() {
        return date;
    }
    public Float getPrice() {
        return price;
    }
    public String getRezTime() {
        return rezTime;
    }
    public String getSiteLink() {
        return siteLink;
    }

}
