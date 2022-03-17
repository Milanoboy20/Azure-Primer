package com.example.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/")
    String hello(){
        return "Primer App Example";
    }

    @GetMapping("/hello")
    String hello2(){
        return "Hello Again!";
    }
}
