package com.example.challenge.repositories;

import com.example.challenge.entites.User;
import com.example.challenge.entites.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails,Integer> {
    @Override
    List<UserDetails> findAll();
}
