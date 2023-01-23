package com.example.demo;

import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TripPlan {

    private String id;
    private String placeName;
    private String tripStart;
    private String tripEnd;
    private float EstBud;
    ArrayList< Object > hotel = new ArrayList < Object > ();
    ArrayList < Transport > transport = new ArrayList < Transport > ();
    ArrayList < Object > activity = new ArrayList < Object > ();
    ArrayList < Object > food = new ArrayList < Object > ();

    public TripPlan(String placeName, String tripStart, String tripEnd, float EstBud, ArrayList<Object> hotel, ArrayList<Transport> transport, ArrayList<Object> activity, ArrayList<Object> food) {
        this.id = UUID.randomUUID().toString();
        this.placeName = placeName;
        this.tripStart = tripStart;
        this.tripEnd = tripEnd;
        this.EstBud = EstBud;
        this.hotel = hotel;
        this.transport = transport;
        this.activity = activity;
        this.food = food;

    }


    // Getter Methods


    public void addTransport(Transport transport) {
        this.transport.add(transport);
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
