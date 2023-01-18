package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Transport {

    private final String transportCompany;
    private final String type;
    private final String deptDate;
    private final String arrivalDate;
    private final Float price;
    private final String boardTime;
    private final String arrivalTime;
    private final String siteLink;

    public Transport(@JsonProperty("transportCompany") String transportCompany, @JsonProperty("type") String type, @JsonProperty("deptDate") String deptDate, @JsonProperty("arrivalDate") String arrivalDate, @JsonProperty("price") Float price, @JsonProperty("boardTime") String boardTime, @JsonProperty("arrivalTime") String arrivalTime, @JsonProperty("siteLink") String siteLink) {
        this.transportCompany = transportCompany;
        this.type = type;
        this.deptDate = deptDate;
        this.arrivalDate = arrivalDate;
        this.price = price;
        this.boardTime = boardTime;
        this.arrivalTime = arrivalTime;
        this.siteLink = siteLink;
    }

    public String getTransportCompany() {
        return transportCompany;
    }
    public String getType() {
        return type;
    }
    public String getDeptDate() {
        return deptDate;
    }
    public String getArrivalDate() {
        return arrivalDate;
    }
    public Float getPrice() {
        return price;
    }
    public String getBoardTime() {
        return boardTime;
    }
    public String getArrivalTime() {
        return arrivalTime;
    }
    public String getSiteLink() {
        return siteLink;
    }
}
