package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.List;
import java.util.UUID;

public class UserPlans {

    @Id
    @GeneratedValue
    private final UUID id;

    private final String username;
    private final String password;

    @OneToMany (mappedBy = "UserPlans", cascade = CascadeType.ALL)
    private final List<TripPlan> tripPlans;

    public UserPlans(@JsonProperty("id") UUID id, @JsonProperty("username") String username, @JsonProperty("password") String password, @JsonProperty("tripPlans")List<TripPlan> tripPlans) {
        this.id = id;
        this.username= username;
        this.password = password;
        this.tripPlans = tripPlans;
    }

    public UUID getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public List<TripPlan> getTripPlans() {
        return tripPlans;
    }



}
