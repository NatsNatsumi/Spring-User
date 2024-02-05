package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    @GetMapping("/test")
    public void createTestData() {
        List<Worker> testWorkerList = new ArrayList<Worker>();
        for (int i = 0; i < 1000; i++) {
            Worker worker = new Worker();
            worker.setId(i);
            worker.setName("UserName" + i);

            Random rand = new Random();
            int weight = rand.nextInt(30) + 35;
            worker.setWeight(weight);
            int teamid = rand.nextInt(4) + 0;
            worker.setTeam_id(teamid);
            testWorkerList.add(worker);

        }

        workerRepository.saveAll(testWorkerList);

    }

    @GetMapping("/worker")
    @ResponseBody
    public List<Worker> getAllWorker() {

        return workerRepository.findAll();

    }

    @GetMapping("/user")
    @ResponseBody
    public Worker getUser() {

        Worker worker = new Worker();
        worker.setId(4);
        worker.setName("NatNatsumi");
        worker.setWeight(400);
        worker.setTeam_id(20);

        return worker;
    }
}
