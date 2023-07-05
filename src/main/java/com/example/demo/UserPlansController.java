package com.example.demo;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
@RequestMapping("api/v1/userplans")
@CrossOrigin(origins = "http://localhost:3000")
public class UserPlansController {
    @Autowired
    private UserPlansService userPlansService;

    @GetMapping
    public ResponseEntity<List<UserPlans>> getAllUserPlans() {
        return new ResponseEntity<List<UserPlans>>(userPlansService.allUserPlans(), HttpStatus.OK);
    }
    @CrossOrigin
    @GetMapping("/{username}")
    public ResponseEntity<Optional<UserPlans>> getSingleUserPlan(@PathVariable String username){
        return new ResponseEntity<Optional<UserPlans>>(userPlansService.singleUserPlan(username), HttpStatus.OK);
    }


    
    @PostMapping("/login")
    public ResponseEntity<Optional<UserPlans>> getUserLogin(@RequestBody LoginRequestBody loginRequestBody) {
        return new ResponseEntity<Optional<UserPlans>>(userPlansService.userLogin(loginRequestBody.getUsername(), loginRequestBody.getPassword()), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UserPlans> createUserPlans(@RequestBody Map<String, String> payload) {
        List<TripPlan> tripPlans = new ArrayList<TripPlan>();
        return new ResponseEntity<UserPlans>(userPlansService.createUserPlans(payload.get("username"), payload.get("password"), tripPlans), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public void updateUserPlans(@PathVariable ("id") String id, @RequestBody UserPlans userPlans) {
        userPlansService.updateUserPlans(userPlans);
    }

    // ------------------------------- Adding trip to user account ------------------------------- //

    @PutMapping("/addTrip/{id}")
    public void addTripPlanToUserPlans(@PathVariable ("id") ObjectId userId, @RequestBody TripPlan tripPlan) {
        userPlansService.addTripPlanToUserPlans(userId, tripPlan);
    }

    @PutMapping("/addHotel/{userId}/{tripId}")
    public void addHotelToTripPlans(@PathVariable ("userId") ObjectId userId, @PathVariable ("tripId") String tripId, @RequestBody Hotel hotel) {
        userPlansService.addHotelToTripPlans(userId, tripId, hotel);
    }
    @PutMapping("/addActivity/{userId}/{tripId}")
    public void addActivityToTripPlans(@PathVariable ("userId") ObjectId userId, @PathVariable ("tripId") String tripId, @RequestBody Activity activity) {
        System.out.println("addActivityToTripPlans(): " + userId + " " + tripId );
        userPlansService.addActivityToTripPlans(userId, tripId, activity);
    }

    @PutMapping("/addTransport/{userId}/{tripId}")
    public void addTransportToTripPlans(@PathVariable ("userId") ObjectId userId, @PathVariable ("tripId") String tripId, @RequestBody Transport transport) {
        userPlansService.addTransportToTripPlans(userId, tripId, transport);
    }

    @PutMapping("/addFood/{userId}/{tripId}")
    public void addFoodToTripPlans(@PathVariable ("userId") ObjectId userId, @PathVariable ("tripId") String tripId, @RequestBody Food food) {
        userPlansService.addFoodToTripPlans(userId, tripId, food);
    }
    // ------------------------------- Adding plans to Itinerary ------------------------------- //
    @PutMapping("/addHotelItinerary/{userId}/{tripId}/{itineraryId}")
    public void addHotelToItinerary(@PathVariable("userId") ObjectId userId, @PathVariable("tripId") String tripId, @PathVariable("itineraryId") String itinId, @RequestBody Hotel hotel) {
        userPlansService.addHotelOptToItinerary(userId, tripId, itinId, hotel);
    }

    // ------------------------------- Deleting account ------------------------------- //
    @DeleteMapping("/{id}")
    public ResponseEntity deleteExpense(@PathVariable ObjectId id){
        System.out.println("Deleting Account..." + id);
        userPlansService.deleteUserPlans(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


}
