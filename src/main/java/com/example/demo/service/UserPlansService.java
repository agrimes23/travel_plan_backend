package com.example.demo.service;

import com.example.demo.dao.UserPlanDao;
import com.example.demo.model.UserPlans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserPlansService {

    private final UserPlanDao userPlanDao;

    @Autowired
    public UserPlansService(@Qualifier("postgres") UserPlanDao userPlanDao) {
        this.userPlanDao = userPlanDao;
    }

    public int addUserPlans(UserPlans userPlans) {
        return userPlanDao.insertUserPlans(userPlans);
    }

    public List<UserPlans> getAllUserPlans() {
        return userPlanDao.selectAllUserPlans();
    }

    public Optional<UserPlans> getUserPlanById(UUID id) {
        return userPlanDao.selectUserPlansById(id);
    }

    public int deleteUserPlans(UUID id) {
        return userPlanDao.deleteUserPlansById(id);
    }

    public int updateUserPlans(UUID id, UserPlans newUserPlans) {
        return userPlanDao.updateUserPlanById(id, newUserPlans);
    }
}
