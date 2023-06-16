package com.example.demo;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserPlansRepository extends MongoRepository<UserPlans, ObjectId> {
    Optional<UserPlans> findById(ObjectId id);
    // not sure if below will work need to check
//    Optional<UserPlans> findByUsername(String username);
}
