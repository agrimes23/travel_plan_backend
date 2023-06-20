package com.example.demo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Document(collection = "userplans")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserPlans implements UserDetails {
    @JsonSerialize(using=ObjectIdSerializer.class)
    @Id
    private ObjectId id;
    private String username;
    private String password;

    private Role role;
    private List<TripPlan> tripPlans;

    public UserPlans(String username, String password) {
        this.username = username;
        this.password = password;
        this.tripPlans = List.of();
    }

    public void setTripPlans(List<TripPlan> tripPlans) {
        this.tripPlans = tripPlans;
    }

    public ObjectId getId() {
        return id;
    }

    // TODO: Do I need to make a get TripPlans? How can I get user info through JWT, especially when it's updated?

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
