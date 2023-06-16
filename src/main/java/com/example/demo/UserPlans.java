package com.example.demo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "userplans")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserPlans {
    @JsonSerialize(using=ObjectIdSerializer.class)
    @Id
    private ObjectId id;
    private String username;
    private String password;
    private List<TripPlan> tripPlans;

    public UserPlans(String username, String password) {
        this.username = username;
        this.password = password;
        this.tripPlans = List.of();
    }

    public void setTripPlans(List<TripPlan> tripPlans) {
        this.tripPlans = tripPlans;
    }

    public ObjectId getId() {
        return id;
    }
}
