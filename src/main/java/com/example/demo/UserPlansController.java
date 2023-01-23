package com.example.demo;

import org.apache.coyote.Response;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
@RequestMapping("api/v1/userplans")
@CrossOrigin
public class UserPlansController {
    @Autowired
    private UserPlansService userPlansService;

    @GetMapping
    public ResponseEntity<List<UserPlans>> getAllUserPlans() {
        return new ResponseEntity<List<UserPlans>>(userPlansService.allUserPlans(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<UserPlans>> getSingleUserPlan(@PathVariable ObjectId id){
        return new ResponseEntity<Optional<UserPlans>>(userPlansService.singleUserPlan(id), HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<Optional<UserPlans>> getUserLogin(@RequestBody LoginRequestBody loginRequestBody) {
        return new ResponseEntity<Optional<UserPlans>>(userPlansService.userLogin(loginRequestBody.getUsername(), loginRequestBody.getPassword()), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UserPlans> createUserPlans(@RequestBody Map<String, String> payload) {

        return new ResponseEntity<UserPlans>(userPlansService.createUserPlans(payload.get("username"), payload.get("password")), HttpStatus.CREATED);
    }

    @PutMapping
    public void updateUserPlans(@RequestBody UserPlans userPlans) {
        userPlansService.updateUserPlans(userPlans);
    }

//    @PutMapping
//    public void updateTripPlanInUserPlan(@RequestBody UpdateTripPlanInUserPlanRequestBody updateTripPlanInUserPlanRequestBody) {
//
//        userPlansService.updateUserPlans(updateTripPlanInUserPlanRequestBody.getId(), updateTripPlanInUserPlanRequestBody.getTripPlan());
//    }
    @PutMapping
    public ResponseEntity addTransport(@RequestBody AddTransportRequestBody addTransportRequestBody) {
        userPlansService.addTransport(addTransportRequestBody.getUserId(), addTransportRequestBody.getTripPlanId(), addTransportRequestBody.getTransport());
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteExpense(@PathVariable ObjectId id){
        System.out.println("Deleting Expense..." + id);
        userPlansService.deleteUserPlans(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


}
