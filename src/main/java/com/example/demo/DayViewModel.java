package com.example.demo;

import java.util.ArrayList;

public class DayViewModel {

    public String title;
    public ArrayList<ItineraryItemViewModel> itineraryItemViewModels = new ArrayList <ItineraryItemViewModel>();

    public DayViewModel(String title, ArrayList<ItineraryItemViewModel> itineraryItemViewModels) {
        this.title = title;
        this.itineraryItemViewModels = itineraryItemViewModels;
    }
}
