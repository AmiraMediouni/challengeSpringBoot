package com.example.challenge.entites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;


@Getter
@Setter
@Entity
public class UserDetails {
    @Id
    @GeneratedValue
    private int id;
    private  String githubProfileLink;
    private  String linkedinProfileLink;
    private Date createdAt;
    private Date updatedAt;
    @OneToOne
    @JoinColumn(name="user_id")
    private User user;
}
