package com.example.demo;

public class Activity {

    private String actID;
    private String actName;
    private String startDate;
    private Float price;
    private String startTime;
    private String endTime;
    private String siteLink;

    public String getActID() { return actID; }

    public String getActName() {
        return actName;
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


    public void setActivityId(String activityId) {
        this.actID = activityId;
    }

}
