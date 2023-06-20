package com.example.demo.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/userplans")
@RequiredArgsConstructor
public class AuthenticationController {

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register (
            @RequestBody RegisterRequest request
    ) {
        //
    }
    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> register (
            @RequestBody AuthenticationRequest request
    ) {
        //
    }

}
