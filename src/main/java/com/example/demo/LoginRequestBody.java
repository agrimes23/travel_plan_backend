package com.example.demo;

import org.bson.types.ObjectId;

import java.util.List;

public class LoginRequestBody {

    private final String username;
    private final String password;

    public LoginRequestBody(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
