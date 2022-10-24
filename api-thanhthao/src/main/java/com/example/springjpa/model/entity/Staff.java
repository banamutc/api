package com.example.springjpa.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Time;

@Table
@Entity
@Data
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String position;
    private Time time_in;
    private Time time_out;
    public Staff() {
    }

    public Staff(Long id, String name, String position, Time time_in, Time time_out) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.time_in = time_in;
        this.time_out = time_out;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Time getTime_in() {
        return time_in;
    }

    public void setTime_in(Time time_in) {
        this.time_in = time_in;
    }

    public Time getTime_out() {
        return time_out;
    }

    public void setTime_out(Time time_out) {
        this.time_out = time_out;
    }
}
