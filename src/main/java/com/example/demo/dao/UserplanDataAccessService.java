package com.example.demo.dao;

import com.example.demo.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("postgres")
public class UserplanDataAccessService implements UserPlanDao{

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserplanDataAccessService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertUserPlans(UUID id, UserPlans userPlans) {
        return 0;
    }

    @Override
    public List<UserPlans> selectAllUserPlans() {
        final String sql = "SELECT id, username FROM userPlans, ";
        jdbcTemplate.query(sql, (resultSet, i) -> {
            return new UserPlans(
                    UUID.fromString(resultSet.getString("id")),
                    resultSet.getString("username"),
                    resultSet.getString("password"),

                    )

        });
        return List.of(new UserPlans(UUID.randomUUID(), "FROM POSTGRES DB", "FROM POSTGRES DB", List<TripPlan>(
                List.of(
                        List.of(new Hotel (
                                "FROM POSTGRES DB",
                                "FROM POSTGRES DB",
                                null,
                                "FROM POSTGRES DB",
                                "FROM POSTGRES DB",
                                "FROM POSTGRES DB"
                        )),
                        List.of(new Transport(
                                "FROM POSTGRES DB",
                                "FROM POSTGRES DB",
                                "FROM POSTGRES DB",
                                "FROM POSTGRES DB",
                                null,
                                "FROM POSTGRES DB",
                                "FROM POSTGRES DB",
                                "FROM POSTGRES DB"
                        )),
                        List.of(new Activity(
                                "FROM POSTGRES DB",
                                "FROM POSTGRES DB",
                                null,
                                "FROM POSTGRES DB",
                                "FROM POSTGRES DB",
                                "FROM POSTGRES DB"
                        )),
                        List.of(new Food(
                                "FROM POSTGRES DB",
                                "FROM POSTGRES DB",
                                null,
                                "FROM POSTGRES DB",
                                "FROM POSTGRES DB"
                        )))
        ))));
    }

    @Override
    public Optional<UserPlans> selectUserPlansById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deleteUserPlansById(UUID id) {
        return 0;
    }

    @Override
    public int updateUserPlanById(UUID id, UserPlans userPlans) {
        return 0;
    }
}
