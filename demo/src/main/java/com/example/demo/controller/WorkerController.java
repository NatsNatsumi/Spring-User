package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Worker;
import com.example.demo.repository.WorkerRepository;

@RestController
public class WorkerController {

    @Autowired
    private WorkerRepository workerRepository;

    @GetMapping("/")
    public void getWorker() {
        System.out.println("しとる");
    }

    @GetMapping("/worker")
    @ResponseBody
    public List<Worker> getAllWorker() {

        return workerRepository.findAll();
        // Worker worker = new Worker();
        // worker.setId(4);
        // worker.setName("NatNatsumi");
        // worker.setWeight(400);
        // worker.setTeam_id(20);

        // return worker;
    }
}
