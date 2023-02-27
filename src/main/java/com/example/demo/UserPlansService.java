package com.example.demo;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

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

//    public void addTripPlanToUserPlans(ObjectId userId, TripPlan tripPlan) {
//        userPlansRepository.save()
//    }
    public void deleteUserPlans(ObjectId id) {
        userPlansRepository.deleteById(id);
    }

    // ------------------------------ Updating Trip Plans ------------------------------ //

    public void addTripPlanToUserPlans(ObjectId id, TripPlan tripPlan) {

        UUID tripId = UUID.randomUUID();
        tripPlan.setId(tripId.toString());

        UserPlans originalUserPlans = userPlansRepository.findById(id)
                        .orElseThrow();
        originalUserPlans.getTripPlans().add(tripPlan);
        userPlansRepository.save(originalUserPlans);
    }

    public void addTransportToTripPlans(ObjectId userId, String tripPlanId, Transport transport) {
        UUID transportId = UUID.randomUUID();
        transport.setTransportID(transportId.toString());

        UserPlans originalUserPlans = userPlansRepository.findById(userId)
                        .orElseThrow();
        TripPlan tripPlan = originalUserPlans.getTripPlans().stream().filter(it -> Objects.equals(it.getId(), tripPlanId)).findFirst()
                        .orElseThrow();
        tripPlan.addTransport(transport);
        userPlansRepository.save(originalUserPlans);
    }

    public void addHotelToTripPlans(ObjectId userId, String tripPlanId, Hotel hotel) {

        UUID hotelId = UUID.randomUUID();
        hotel.setHotelId(hotelId.toString());

        UserPlans originalUserPlans = userPlansRepository.findById(userId)
                .orElseThrow();
        TripPlan tripPlan = originalUserPlans.getTripPlans().stream().filter(it -> Objects.equals(it.getId(), tripPlanId)).findFirst()
                .orElseThrow();
        tripPlan.addHotel(hotel);
        userPlansRepository.save(originalUserPlans);
    }

    public void addActivityToTripPlans(ObjectId userId, String tripPlanId, Activity activity) {

        UUID activityId = UUID.randomUUID();
        activity.setActivityId(activityId.toString());

        UserPlans originalUserPlans = userPlansRepository.findById(userId)
                .orElseThrow();
        TripPlan tripPlan = originalUserPlans.getTripPlans().stream().filter(it -> Objects.equals(it.getId(), tripPlanId)).findFirst()
                .orElseThrow();
        tripPlan.addActivity(activity);
//        System.out.println("tripPlannn in Service: " + tripPlan.activities.size());
        userPlansRepository.save(originalUserPlans);
    }
    public void addFoodToTripPlans(ObjectId userId, String tripPlanId, Food food) {

        UUID foodId = UUID.randomUUID();
        food.setFoodId(foodId.toString());

        UserPlans originalUserPlans = userPlansRepository.findById(userId)
                .orElseThrow();
        TripPlan tripPlan = originalUserPlans.getTripPlans().stream().filter(it -> Objects.equals(it.getId(), tripPlanId)).findFirst()
                .orElseThrow();
        tripPlan.addFood(food);
        userPlansRepository.save(originalUserPlans);
    }
    // Make a schema in Itinerary.java, and add the Itinerary array in TripPlan.java
    // Make 4 services that add objects to Hotels, Activities, Transport, and Food
    // should be everything... then write code on frontend

    // ------------------------------ Updating the Itinerary ------------------------------ //

    public void addItineraryToTripPlan(ObjectId id, String tripPlanId, Itinerary itinerary) {

        UUID itinId = UUID.randomUUID();

        itinerary.itineraryID = itinId.toString();

        UserPlans originalUserPlans = userPlansRepository.findById(id)
                .orElseThrow();
        TripPlan tripPlan = originalUserPlans.getTripPlans().stream().filter(it -> Objects.equals(it.getId(), tripPlanId)).findFirst()
                .orElseThrow();
        tripPlan.addItinerary(itinerary);
        userPlansRepository.save(originalUserPlans);

    }

    public void addHotelOptToItinerary (ObjectId userId, String tripPlanId, String itineraryID, String itineraryItemId) {

        UserPlans originalUserPlans = userPlansRepository.findById(userId)
                .orElseThrow();
        TripPlan tripPlan = originalUserPlans.getTripPlans().stream().filter(it -> Objects.equals(it.getId(), tripPlanId)).findFirst()
                .orElseThrow();
        Itinerary itinerary = tripPlan.itineraries.stream().filter(it -> Objects.equals(it.getItineraryID(), itineraryID)).findFirst()
                .orElseThrow();
        itinerary.addItineraryItem(new ItineraryItem(itineraryItemId, ItineraryItemType.HOTEL));
        userPlansRepository.save(originalUserPlans);
    }
    public void addActivityOptToItinerary (ObjectId userId, String tripPlanId, String itineraryID, String itineraryItemId) {
        UserPlans originalUserPlans = userPlansRepository.findById(userId)
                .orElseThrow();
        TripPlan tripPlan = originalUserPlans.getTripPlans().stream().filter(it -> Objects.equals(it.getId(), tripPlanId)).findFirst()
                .orElseThrow();
        Itinerary itinerary = tripPlan.itineraries.stream().filter(it -> Objects.equals(it.getItineraryID(), itineraryID)).findFirst()
                .orElseThrow();
        itinerary.addItineraryItem(new ItineraryItem(itineraryItemId, ItineraryItemType.ACTIVITY));
        userPlansRepository.save(originalUserPlans);
    }

    public void addTransportOptToItinerary (ObjectId userId, String tripPlanId, String itineraryID, String itineraryItemId) {
        UserPlans originalUserPlans = userPlansRepository.findById(userId)
                .orElseThrow();
        TripPlan tripPlan = originalUserPlans.getTripPlans().stream().filter(it -> Objects.equals(it.getId(), tripPlanId)).findFirst()
                .orElseThrow();
        Itinerary itinerary = tripPlan.itineraries.stream().filter(it -> Objects.equals(it.getItineraryID(), itineraryID)).findFirst()
                .orElseThrow();
        itinerary.addItineraryItem(new ItineraryItem(itineraryItemId, ItineraryItemType.TRANSPORT));
        userPlansRepository.save(originalUserPlans);
    }
    public void addFoodOptToItinerary (ObjectId userId, String tripPlanId, String itineraryID, String itineraryItemId) {
         UserPlans originalUserPlans = userPlansRepository.findById(userId)
                .orElseThrow();
         TripPlan tripPlan = originalUserPlans.getTripPlans().stream().filter(it -> Objects.equals(it.getId(), tripPlanId)).findFirst()
                .orElseThrow();
         Itinerary itinerary = tripPlan.itineraries.stream().filter(it -> Objects.equals(it.getItineraryID(), itineraryID)).findFirst()
                .orElseThrow();
         itinerary.addItineraryItem(new ItineraryItem(itineraryItemId, ItineraryItemType.FOOD));
         userPlansRepository.save(originalUserPlans);
    }

    public void getItinerariesViewModel (ObjectId userId, String tripPlanId, String itineraryID) {
        String[] itinerariesVM
    }


}
