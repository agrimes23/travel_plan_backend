package com.example.demo.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    // Do I want all these in my login? (Probably but look over the database and see how to implement them
//    private String firstname;
//    private String lastname;
    private String username;
    private String password;
}
