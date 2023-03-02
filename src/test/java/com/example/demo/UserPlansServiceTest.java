package com.example.demo;

import org.apache.catalina.User;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class UserPlansServiceTest {

    @Test
    void getItinerariesViewModel() {
        // # Given
        UserPlansService userPlansService = new UserPlansService(new UserPlansRepository() {
            @Override
            public Optional<UserPlans> findById(ObjectId id) {
                return Optional.of(new UserPlans(new ObjectId("63fa76a54827856e629934b4"), "fakeUsername", "fakePassword", List.of(
                        new TripPlan(
                                "1ce3228f-a4fd-4b38-81d1-c9f6e591fbed",
                                "fakePlaceName",
                                "fakeTripStart",
                                "fakeTripEnd",
                                0.00f,
                                new ArrayList<Hotel>(List.of()),
                                new ArrayList<Transport>(List.of()),
                                new ArrayList<Activity>(List.of()),
                                new ArrayList<Food>(List.of()),
                                new ArrayList<Itinerary>(List.of(new Itinerary(
                                        "1ce3228f-a4fd-4b38-81d1-c9f6e591fbeb",
                                        new ArrayList<ItineraryItem>()
                                )))
                ))));
            }

            @Override
            public <S extends UserPlans> S insert(S entity) {
                return null;
            }

            @Override
            public <S extends UserPlans> List<S> insert(Iterable<S> entities) {
                return null;
            }

            @Override
            public <S extends UserPlans> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends UserPlans> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public <S extends UserPlans> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public List<UserPlans> findAll() {
                return null;
            }

            @Override
            public List<UserPlans> findAllById(Iterable<ObjectId> objectIds) {
                return null;
            }

            @Override
            public <S extends UserPlans> S save(S entity) {
                return null;
            }

            @Override
            public boolean existsById(ObjectId objectId) {
                return false;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(ObjectId objectId) {

            }

            @Override
            public void delete(UserPlans entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends ObjectId> objectIds) {

            }

            @Override
            public void deleteAll(Iterable<? extends UserPlans> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public List<UserPlans> findAll(Sort sort) {
                return null;
            }

            @Override
            public Page<UserPlans> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends UserPlans> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends UserPlans> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends UserPlans> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends UserPlans> boolean exists(Example<S> example) {
                return false;
            }

            @Override
            public <S extends UserPlans, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
                return null;
            }
        });
        // # When
        ItineraryViewModel itinerariesViewModel = userPlansService.getItinerariesViewModel(
                new ObjectId("63fa76a54827856e629934b4"),
                "1ce3228f-a4fd-4b38-81d1-c9f6e591fbed",
                "1ce3228f-a4fd-4b38-81d1-c9f6e591fbeb");
        // # Then
        assertEquals("Total Cost: $0.00", itinerariesViewModel.totalCost);
    }
}