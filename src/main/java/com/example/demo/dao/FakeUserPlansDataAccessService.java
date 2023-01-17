package com.example.demo.dao;

import com.example.demo.model.UserPlans;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakeUserPlansDataAccessService implements UserPlanDao{
    private static List<UserPlans> DB = new ArrayList<>();
    @Override
    public int insertUserPlans(UUID id, UserPlans userPlans) {
        DB.add(new UserPlans(id, userPlans.getUsername(), userPlans.getPassword(), userPlans.getTripPlans()));
        return 1;
    }

    @Override
    public List<UserPlans> selectAllUserPlans() {
        return DB;
    }

    @Override
    public Optional<UserPlans> selectUserPlansById(UUID id) {
        return DB.stream()
                .filter(userPlans -> userPlans.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deleteUserPlansById(UUID id) {
        return 0;
    }

    @Override
    public int updateUserPlanById(UUID id, UserPlans userPlans) {
        return 0;
    }
}
