package com.example.demo;

import org.bson.types.ObjectId;

public class AddTripPlanToUserPlansRequestBody {
    private final ObjectId userId;
    private final TripPlan tripPlan;

    public AddTripPlanToUserPlansRequestBody(ObjectId userId, TripPlan tripPlan) {
        this.userId = userId;
        this.tripPlan = tripPlan;
    }

    public ObjectId getUserId() {
        return userId;
    }

    public TripPlan getTripPlan() {
        return tripPlan;
    }

}
