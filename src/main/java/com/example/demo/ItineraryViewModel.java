package com.example.demo;

import java.util.ArrayList;

public class ItineraryViewModel {
    public ArrayList<DayViewModel> dayViewModels = new ArrayList<DayViewModel>();
    public String totalCost;

    public ItineraryViewModel(ArrayList<DayViewModel> dayViewModels, String totalCost){
        this.dayViewModels = dayViewModels;
        this.totalCost = totalCost;
    }

}
