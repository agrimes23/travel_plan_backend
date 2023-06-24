package com.example.demo.auth;

import com.example.demo.TripPlan;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    // Do I want all these in my login? (Probably but look over the database and see how to implement them
//    private String firstname;
//    private String lastname;
    private String username;
    private String password;
    private List<TripPlan> tripPlans;
}
