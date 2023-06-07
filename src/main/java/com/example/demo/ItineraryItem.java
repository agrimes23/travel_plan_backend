package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class ItineraryItem {

    private String itineraryItemId;
    private ItineraryItemType itineraryItemType;

    @Autowired
    public ItineraryItem(String itineraryItemId, ItineraryItemType itineraryItemType) {
        this.itineraryItemId = itineraryItemId;
        this.itineraryItemType = itineraryItemType;
    }

    public String getItineraryItemId() {
        return itineraryItemId;
    }
    public ItineraryItemType getItineraryItemType() {
        return itineraryItemType;
    }

    public void setItineraryItemId(String itineraryItemId) {
        this.itineraryItemId = itineraryItemId;
    }
    public void setItineraryItemType(ItineraryItemType itineraryItemType) {
        this.itineraryItemType = itineraryItemType;
    }


}
