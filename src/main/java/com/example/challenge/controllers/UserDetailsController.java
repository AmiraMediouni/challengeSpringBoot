package com.example.challenge.controllers;


import com.example.challenge.entites.UserDetails;
import com.example.challenge.reponses.MessageResponse;
import com.example.challenge.services.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/userDetails" )
public class UserDetailsController {
    @Autowired
    UserDetailsService userDetailsService;

    @GetMapping
    public List<UserDetails> getAllUserDetails() {
        return this.userDetailsService.getAllUserDetails();
    }

    @GetMapping(value = "/{id}")
    public UserDetails getUserDetailsByID(@PathVariable("id") int id) {
        return this.userDetailsService.getUserDetailsById(id);
    }

    @PostMapping
    public UserDetails addNewUserDetails(@RequestBody UserDetails userDetails) {
        return this.userDetailsService.addNewUserDetails(userDetails);
    }

    @PutMapping(value = "/{id}")
    public UserDetails updateUserDetails(@PathVariable("id") int id, @RequestBody UserDetails userDetails) {
        return userDetailsService.updateUserDetailsByID(id, userDetails);
    }

    @DeleteMapping(value = "/{id}")
    public MessageResponse deleteUserDetails(@PathVariable("id") int id) {

        return this.userDetailsService.deleteUserDetailsById(id);
    }
}
