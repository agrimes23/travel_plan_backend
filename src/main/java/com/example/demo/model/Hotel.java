package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hotel {

    private final String hotelName;
    private final String stayDate;
    private final Float price;
    private final String checkinTime;
    private final String checkoutTime;
    private final String siteLink;

    public Hotel(@JsonProperty("hotelName") String hotelName, @JsonProperty("stayDate") String stayDate, @JsonProperty("price") Float price, @JsonProperty("checkinTime") String checkinTime, @JsonProperty("checkoutTime") String checkoutTime, @JsonProperty("siteLink") String siteLink) {
        this.hotelName = hotelName;
        this.stayDate = stayDate;
        this.price = price;
        this.checkinTime = checkinTime;
        this.checkoutTime = checkoutTime;
        this. siteLink = siteLink;
    }

    public String getHotelName() {
        return hotelName;
    }
    public String getStayDate() {
        return stayDate;
    }
    public Float getPrice() {
        return price;
    }
    public String getCheckinTime() {
        return checkinTime;
    }
    public String getCheckoutTime() {
        return checkoutTime;
    }
    public String getSiteLink() {
        return siteLink;
    }
}
