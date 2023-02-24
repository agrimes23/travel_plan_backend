package com.example.demo;

import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.UUID;

public class Itinerary {
    public String itineraryID;
    public ArrayList < Hotel > itineraryHotels = new ArrayList < Hotel >();
    public ArrayList < Transport > itineraryTransports = new ArrayList < Transport > ();
    public ArrayList < Activity > itineraryActivities = new ArrayList < Activity>();
    public ArrayList < Food > itineraryFood = new ArrayList < Food > ();

    public Itinerary(String itineraryID, ArrayList<Hotel> itineraryHotels, ArrayList<Transport> itineraryTransports, ArrayList<Activity> itineraryActivities, ArrayList<Food> itineraryFood) {
        this.itineraryID = itineraryID;
        this.itineraryHotels = itineraryHotels;
        this.itineraryTransports = itineraryTransports;
        this.itineraryActivities = itineraryActivities;
        this.itineraryFood = itineraryFood;
    }

    // Getter Methods

    public void addItineraryTransport(Transport itineraryTransport) {
        if (this.itineraryTransports == null) {
            this.itineraryTransports = new ArrayList < Transport>();
        }
        this.itineraryTransports.add(itineraryTransport);
    }

    public void addItineraryHotel(Hotel itineraryHotel) {
        if (this.itineraryHotels == null) {
            this.itineraryHotels = new ArrayList < Hotel >();
        }
        this.itineraryHotels.add(itineraryHotel);
    }
    public void addItineraryActivity(Activity itineraryActivitie) {
        if (this.itineraryActivities == null) {
            this.itineraryActivities = new ArrayList < Activity >();
        }
        this.itineraryActivities.add(itineraryActivitie);
    }

    public void addItineraryFood(Food itineraryFood) {
        if (this.itineraryFood == null) {
            this.itineraryFood = new ArrayList < Food >();
        }
        this.itineraryFood.add(itineraryFood);
    }

    public String getItineraryID() {
        return itineraryID;
    }



    // Setter Methods


}
