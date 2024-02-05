package com.example.challenge.controllers;

import com.example.challenge.entites.Post;
import com.example.challenge.reponses.MessageResponse;
import com.example.challenge.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/posts" )
public class PostController {
    @Autowired
    PostService postService;

    @GetMapping
    public List<Post> getAllPosts() {
        return this.postService.getAllPosts();
    }

    @GetMapping(value = "/{id}")
    public Post getPostByID(@PathVariable("id") int id) {
        return this.postService.getPostById(id);
    }

    @PostMapping
    public Post addNewPost(@RequestBody Post post) {
        return this.postService.addNewPost(post);
    }

    @PutMapping(value = "/{id}")
    public Post updatePost(@PathVariable("id") int id, @RequestBody Post post) {
        return postService.updatePostByID(id, post);
    }

    @DeleteMapping(value = "/{id}")
    public MessageResponse deletePost(@PathVariable("id") int id) {

        return this.postService.deletePostById(id);
    }
}