package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TripPlan {

        private final List<Hotel> hotel;
        private final List<Transport> transport;
        private final List<Activity> activity;
        private final List<Food> food;

        public TripPlan(@JsonProperty("hotel")List<Hotel> hotel, @JsonProperty("transport") List<Transport> transport, @JsonProperty("activity") List<Activity> activity, @JsonProperty("food") List<Food> food) {
            this.hotel = hotel;
            this.transport = transport;
            this.activity = activity;
            this.food = food;
        }

        public List<Hotel> getHotel() {
            return hotel;
        }
        public List<Transport> getTransport() {
            return transport;
        }
        public List<Activity> getActivity() {
            return activity;
        }
        public List<Food> getFood() {
            return food;
        }







}
