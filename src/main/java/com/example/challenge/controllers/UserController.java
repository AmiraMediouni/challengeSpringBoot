package com.example.challenge.controllers;

import com.example.challenge.entites.User;
import com.example.challenge.reponses.MessageResponse;
import com.example.challenge.repositories.UserRepository;
import com.example.challenge.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/users" )
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return this.userService.getAllUsers();
    }

    @GetMapping(value = "/{id}")
    public User getUserByID(@PathVariable("id") int id) {
        return this.userService.getUserByID(id);
    }

    @PostMapping
    public User addNewUser(@RequestBody User user) {
        return this.userService.addNewUser(user);
    }

    @PutMapping(value = "/{id}")
    public User updateUser(@PathVariable("id") int id, @RequestBody User user) {
        return userService.updateUserByID(id, user);
    }

    @DeleteMapping(value = "/{id}")
    public MessageResponse deleteUser(@PathVariable("id") int id) {
       // userService.deleteUserById(id);
        return this.userService.deleteUserById(id);
    }
    @GetMapping("/findByEmail/{email}")
    public User findByEmail(@PathVariable String email){
        return userRepository.findByEmail(email);
    };

    @GetMapping("/existByEmail/{email}")
    public boolean existsByEmail(@PathVariable String email){
        return userRepository.existsByEmail(email);
    };

    @GetMapping("/numberOfUsers")
    public int  numberOfUsers(){
        return userRepository.numberOfUsers();
    };


}
