package com.example.demo.api;

import com.example.demo.model.UserPlans;
import com.example.demo.service.UserPlansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/userplans")
@RestController
public class UserPlansController {

    private final UserPlansService userPlansService;

    @Autowired
    public UserPlansController(UserPlansService userPlansService) {
        this.userPlansService = userPlansService;
    }

    @PostMapping
    public void addUserPlans(@RequestBody UserPlans userPlans) {
        userPlansService.addUserPlans(userPlans);
    }

    @GetMapping
    public List<UserPlans> getAllUserPlans() {
        return userPlansService.getAllUserPlans();
    }

//    @GetMapping(path="{id}")
//    public UserPlans getUserPlanById(@PathVariable("id") UUID id) {
//        return userPlansService.getUserPlanById(id)
//            .orElse(null);
//    }

}
