package com.example.demo;

public class Transport {
    private String transportID;
    private String transportCompany;
    private String type;
    private String deptDate;
    private String arrivalDate;
    private float price;
    private String boardTime;
    private String stopTime;
    private String siteLink;


    // Getter Methods

    public String getTransportID() {
        return transportID;
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

    public float getPrice() {
        return price;
    }

    public String getBoardTime() {
        return boardTime;
    }

    public String getStopTime() {
        return stopTime;
    }

    public String getSiteLink() {
        return siteLink;
    }

    // Setter Methods

    public void setTransportID(String transportID) {
        this.transportID = transportID;
    }
    public void setTransportCompany(String transportCompany) {
        this.transportCompany = transportCompany;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDeptDate(String deptDate) {
        this.deptDate = deptDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setBoardTime(String boardTime) {
        this.boardTime = boardTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public void setSiteLink(String siteLink) {
        this.siteLink = siteLink;
    }
}
