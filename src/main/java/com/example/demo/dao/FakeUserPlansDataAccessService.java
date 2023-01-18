package com.example.demo.dao;

import com.example.demo.model.UserPlans;
import org.apache.catalina.User;
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
        Optional<UserPlans> userPlansMaybe = selectUserPlansById(id);
        if(userPlansMaybe.isEmpty()) {
            return 0;
        }
        DB.remove(userPlansMaybe.get());
        return 1;
    }

    @Override
    public int updateUserPlanById(UUID id, UserPlans update) {
        return selectUserPlansById(id)
                .map(userPlans -> {
                    int indexOfUserPlanToUpdate = DB.indexOf(userPlans);
                    if(indexOfUserPlanToUpdate >= 0) {
                        DB.set(indexOfUserPlanToUpdate, new UserPlans(id, update.getUsername(), update.getPassword(), update.getTripPlans()));
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }
}
