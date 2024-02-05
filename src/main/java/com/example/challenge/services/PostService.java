package com.example.challenge.services;

import com.example.challenge.entites.Post;
import com.example.challenge.reponses.MessageResponse;
import com.example.challenge.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Service
public class PostService {
    @Autowired
    PostRepository postRepository;
    public List<Post> postList=new CopyOnWriteArrayList<>();
    private int postIdCount=1;
    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    public Post getPostById(int id){

        return postRepository.findById(id).get();
    }

    public Post addNewPost(Post post){

        return postRepository.save(post);
    }

    public Post updatePostByID(int id, Post post){

        post.setId(id);
        return postRepository.save(post);

    }
    public MessageResponse deletePostById(int id ){

        postRepository.deleteById(id);
        return new MessageResponse("Post deleted with success!");


    }
}

