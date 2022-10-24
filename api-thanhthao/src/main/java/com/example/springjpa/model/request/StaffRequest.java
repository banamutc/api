package com.example.springjpa.model.request;

import lombok.Data;

import java.sql.Time;

@Data
public class StaffRequest {
    private String name;
    private String position;
    private Time time_in;
    private Time time_out;

    public StaffRequest() {
    }

    public StaffRequest(String name, String position, Time time_in, Time time_out) {
        this.name = name;
        this.position = position;
        this.time_in = time_in;
        this.time_out = time_out;
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
