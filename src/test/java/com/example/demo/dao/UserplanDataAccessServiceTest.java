package com.example.demo.dao;
import java.util.*;

import com.example.demo.model.*;
import com.squareup.moshi.Moshi;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MoshiTest {

    @Test
    public void Test() {
       System.out.println("a string");
       List<TripPlan> x = List.of(new TripPlan(List.of(new Hotel(
                                "FROM POSTGRES DB",
                                "FROM POSTGRES DB",
                                0f,
                                "FROM POSTGRES DB",
                                "FROM POSTGRES DB",
                                "FROM POSTGRES DB"
                        )),
                        List.of(new Transport(
                                "FROM POSTGRES DB",
                                "FROM POSTGRES DB",
                                "FROM POSTGRES DB",
                                "FROM POSTGRES DB",
                                0f,
                                "FROM POSTGRES DB",
                                "FROM POSTGRES DB",
                                "FROM POSTGRES DB"
                        )),
                        List.of(new Activity(
                                "FROM POSTGRES DB",
                                "FROM POSTGRES DB",
                                0f,
                                "FROM POSTGRES DB",
                                "FROM POSTGRES DB",
                                "FROM POSTGRES DB"
                        )),
                        List.of(new Food(
                                "FROM POSTGRES DB",
                                "FROM POSTGRES DB",
                                0f,
                                "FROM POSTGRES DB",
                                "FROM POSTGRES DB"
                        ))));
       Moshi moshi = new Moshi.Builder().build();
       Type type = Types.
       moshi.adapter()
    }
}