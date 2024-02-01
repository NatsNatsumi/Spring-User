package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Worker {
    @GetMapping("/")
    public void getWorker(){
        System.out.println("しとる");
    }
    @GetMapping("/user")
    public void getUser(){
        System.out.println("しりとる");
    }
}
