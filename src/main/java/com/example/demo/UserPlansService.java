package com.example.demo;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public UserPlans createUserPlans(String username, String password) {
        return userPlansRepository.insert(new UserPlans(username, password));
    }

    public void updateUserPlans(ObjectId id, List<Object> tripPlans) {
        UserPlans savedUserPlans = userPlansRepository.findById(id)
                .orElseThrow(() -> new RuntimeException(
                        String.format("Cannot Find Your Account by ID %s", id)));

        savedUserPlans.setTripPlans(tripPlans);
        userPlansRepository.save(savedUserPlans);
    }
}
