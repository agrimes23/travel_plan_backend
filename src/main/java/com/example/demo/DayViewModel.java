package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class DayViewModel {

    public String title;
    public ArrayList<ItineraryItemViewModel> itineraryItemViewModels = new ArrayList <ItineraryItemViewModel>();

    @Autowired
    public DayViewModel(String title, ArrayList<ItineraryItemViewModel> itineraryItemViewModels) {
        this.title = title;
        this.itineraryItemViewModels = itineraryItemViewModels;
    }
}
