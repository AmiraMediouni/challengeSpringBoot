package com.example.challenge.entites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.List;


@Getter @Setter
@Entity
public class Post {
    @Id
    @GeneratedValue
    private int id;
    private  String title;
    private  String description;
    private  Boolean published;
    private Date createdAt;
    private Date updatedAt;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
}
