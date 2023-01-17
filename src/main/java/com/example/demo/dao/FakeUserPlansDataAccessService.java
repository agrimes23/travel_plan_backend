package com.example.demo.dao;

import com.example.demo.model.UserPlans;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FakeUserPlansDataAccessService implements UserPlanDao{

    private static List<UserPlans> DB = new ArrayList<>();
    @Override
    public int insertUserPlans(UUID id, UserPlans userPlans) {
        DB.add(new UserPlans(id, userPlans.getUsername(), userPlans.getPassword(), userPlans.getTripPlans()));
        return 1;
    }
}
