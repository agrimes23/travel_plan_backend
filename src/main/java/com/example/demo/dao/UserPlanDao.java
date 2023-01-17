package com.example.demo.dao;

import com.example.demo.model.UserPlans;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserPlanDao {
    int insertUserPlans(UUID id, UserPlans userPlans);

    default int insertUserPlans(UserPlans userplans) {
        UUID id = UUID.randomUUID();
        return insertUserPlans(id, userplans);
    }

    List<UserPlans> selectAllUserPlans();

    Optional<UserPlans> selectUserPlansById(UUID id);

    int deleteUserPlansById(UUID id);

    int updateUserPlanById(UUID id, UserPlans userPlans);
}
