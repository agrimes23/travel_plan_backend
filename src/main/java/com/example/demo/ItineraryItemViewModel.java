package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class ItineraryItemViewModel {
    public String time;
    public String description;

    @Autowired
    public ItineraryItemViewModel(String time, String description) {
        this.time = time;
        this.description = description;
    }
}
