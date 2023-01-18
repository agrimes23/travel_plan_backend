package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Activity {

    private final String name;
    private final String startDate;
    private final Float price;
    private final String startTime;
    private final String endTime;
    private final String siteLink;

    public Activity(@JsonProperty("name") String name, @JsonProperty("startDate") String startDate, @JsonProperty("price") Float price, @JsonProperty("startTime") String startTime, @JsonProperty("endTime") String endTime, @JsonProperty("siteLink") String siteLink) {
        this.name = name;
        this.startDate = startDate;
        this.price = price;
        this.startTime = startTime;
        this.endTime = endTime;
        this.siteLink = siteLink;
    }

    public String getName() {
        return name;
    }
    public String getStartDate() {
        return startDate;
    }
    public Float getPrice() {
        return price;
    }
    public String getStartTime() {
        return startTime;
    }
    public String getEndTime() {
        return endTime;
    }
    public String getSiteLink() {
        return siteLink;
    }

}
