package com.example.demo.dao;

import com.example.demo.model.UserPlans;

import java.util.UUID;

public interface UserPlanDao {
    int insertUserPlans(UUID id, UserPlans userPlans);

    default int addUserPlans(UserPlans userplans) {
        UUID id = UUID.randomUUID();
        return insertUserPlans(id, userplans);
    }
}
