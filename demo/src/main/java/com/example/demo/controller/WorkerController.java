package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Worker;

@RestController
public class WorkerController {
    @GetMapping("/")
    public void getWorker() {
        System.out.println("しとる");
    }

    @GetMapping("/user")
    @ResponseBody
    public Worker getUser() {
        Worker worker = new Worker();
        worker.setId(4);
        worker.setName("NatNatsumi");
        worker.setWeight(400);
        return worker;
    }
}
