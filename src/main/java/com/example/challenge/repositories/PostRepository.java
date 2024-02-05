package com.example.challenge.repositories;

import com.example.challenge.entites.Post;
import com.example.challenge.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post,Integer> {
    @Override
    List<Post> findAll();

}