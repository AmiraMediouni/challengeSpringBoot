package com.example.challenge.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    /*@GetMapping(path="${apiPrefix}/welcome")
    public static void helloWorld(){
        System.out.println("hello world");*/
    @GetMapping
    public String home(){
        return "Hello World";
    }
}
