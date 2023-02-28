package com.example.demo;

import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.UUID;

public class Itinerary {
    public String itineraryID;
    public ArrayList<ItineraryItem> itineraryItem = new ArrayList < ItineraryItem >();


    // Getter Methods

    public void addItineraryItem(ItineraryItem itineraryItem) {
        if (this.itineraryItem == null) {
            this.itineraryItem = new ArrayList < ItineraryItem >();
        }
        this.itineraryItem.add(itineraryItem);
    }

    public String getItineraryID() {
        return itineraryID;
    }

}
