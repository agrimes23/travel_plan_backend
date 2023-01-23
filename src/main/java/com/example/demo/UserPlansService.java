package com.example.demo;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserPlansService {

    @Autowired
    private UserPlansRepository userPlansRepository;
    public List<UserPlans> allUserPlans() {
        return userPlansRepository.findAll();
    }

    public Optional<UserPlans> singleUserPlan(ObjectId id) {
        return userPlansRepository.findById(id);
    }

    public Optional<UserPlans> userLogin(String username, String password){
        return userPlansRepository.findAll().stream().filter(userPlans -> Objects.equals(userPlans.getUsername(), username) && Objects.equals(userPlans.getPassword(), password)).findFirst();
    }

    public UserPlans createUserPlans(String username, String password) {
        return userPlansRepository.insert(new UserPlans(username, password));
    }

    public void updateUserPlans(UserPlans userPlans) {
        userPlansRepository.save(userPlans);
    }
    public void deleteUserPlans(ObjectId id) {
        userPlansRepository.deleteById(id);
    }

//    public void updateUserPlans(ObjectId id, TripPlan tripPlan) {
//        UserPlans originalUserPlans = userPlansRepository.findById(id)
//                        .orElseThrow();
//        originalUserPlans.getTripPlans().
//        userPlansRepository.save();
//    }

    public void addTransport(ObjectId userId, String tripPlanId, Transport transport) {
        UserPlans originalUserPlans = userPlansRepository.findById(userId)
                        .orElseThrow();
        TripPlan tripPlan = originalUserPlans.getTripPlans().stream().filter(it -> Objects.equals(it.getId(), tripPlanId)).findFirst()
                        .orElseThrow();
        tripPlan.addTransport(transport);
        userPlansRepository.save(originalUserPlans);
    }
}
