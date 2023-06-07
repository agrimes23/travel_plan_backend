package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class ItineraryViewModel {
    public ArrayList<DayViewModel> dayViewModels = new ArrayList<DayViewModel>();
    public String totalCost;

    @Autowired
    public ItineraryViewModel(ArrayList<DayViewModel> dayViewModels, String totalCost){
        this.dayViewModels = dayViewModels;
        this.totalCost = totalCost;
    }

}
