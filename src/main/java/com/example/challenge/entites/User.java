package com.example.challenge.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private  String firstName;
    private  String lastName;
    private  String email;
    private  String password;
    private int age;
    @OneToOne
    @JoinColumn(name="userDetails_id")
   private UserDetails Userdetails;


    @OneToMany(mappedBy="user")
    private List <Post> posts;

    @ManyToMany
    @JoinTable(
            name="user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List <Role> roles;
}
