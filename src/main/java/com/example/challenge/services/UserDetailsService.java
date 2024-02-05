package com.example.challenge.services;

import com.example.challenge.entites.UserDetails;
import com.example.challenge.reponses.MessageResponse;
import com.example.challenge.repositories.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class UserDetailsService {
    @Autowired
    UserDetailsRepository userDetailsRepository;
    public List<UserDetails> userDetailsList=new CopyOnWriteArrayList<>();
    private int userDetailsIdCount=1;
    public List<UserDetails> getAllUserDetails(){
        return userDetailsRepository.findAll();
    }

    public UserDetails getUserDetailsById(int id){

        return userDetailsRepository.findById(id).get();
    }

    public UserDetails addNewUserDetails(UserDetails userDetails){

        return userDetailsRepository.save(userDetails);
    }

    public UserDetails updateUserDetailsByID(int id, UserDetails userDetails){

        userDetails.setId(id);
        return userDetailsRepository.save(userDetails);

    }
    public MessageResponse deleteUserDetailsById(int id ){

        userDetailsRepository.deleteById(id);
        return new MessageResponse("UserDetails deleted with success!");


    }
}


