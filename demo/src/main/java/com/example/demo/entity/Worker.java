package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Worker {
    @Id
    private Integer Id;
    private String Name;
    private Integer Weight;
    private Integer Team_id;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getWeight() {
        return Weight;
    }

    public void setWeight(Integer weight) {
        Weight = weight;
    }

    public Integer getTeam_id() {
        return Team_id;
    }

    public void setTeam_id(Integer team_id) {
        Team_id = team_id;
    }
}
