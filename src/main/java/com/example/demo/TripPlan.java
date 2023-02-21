package com.example.demo;

import java.util.ArrayList;
import java.util.UUID;

public class TripPlan {

    private String id;
    private String placeName;
    private String tripStart;
    private String tripEnd;
    private float EstBud;
    public ArrayList < Hotel > hotels = new ArrayList < Hotel >();
    private ArrayList < Transport > transports = new ArrayList < Transport > ();
    private ArrayList < Object > activities = new ArrayList < Object > ();
    private ArrayList < Object > food = new ArrayList < Object > ();

    public TripPlan(String placeName, String tripStart, String tripEnd, float EstBud, ArrayList<Hotel> hotels, ArrayList<Transport> transports, ArrayList<Object> activities, ArrayList<Object> food) {
        this.id = UUID.randomUUID().toString();
        this.placeName = placeName;
        this.tripStart = tripStart;
        this.tripEnd = tripEnd;
        this.EstBud = EstBud;
        this.hotels = hotels;
        this.transports = transports;
        this.activities = activities;
        this.food = food;

    }


    // Getter Methods


    public void addTransport(Transport transport) {

        this.transports.add(transport);
    }

    public void addHotel(Hotel hotel) {
        if (this.hotels == null) {
            this.hotels = new ArrayList < Hotel >();
        }
        this.hotels.add(hotel);
    }

    public String getId() {
        return id;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getTripStart() {
        return tripStart;
    }

    public String getTripEnd() {
        return tripEnd;
    }

    public float getEstBud() {
        return EstBud;
    }

    // Setter Methods

    public void setId(String id) {
        this.id = id;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public void setTripStart(String tripStart) {
        this.tripStart = tripStart;
    }

    public void setTripEnd(String tripEnd) {
        this.tripEnd = tripEnd;
    }

    public void setEstBud(float EstBud) {
        this.EstBud = EstBud;
    }


}
