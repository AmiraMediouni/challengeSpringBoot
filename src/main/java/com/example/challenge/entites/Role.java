package com.example.challenge.entites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter
@Entity
public class Role {
    @Id
    @GeneratedValue
    private int id;
    private  String name;
    private Date createdAt;
    private Date updatedAt;

}
