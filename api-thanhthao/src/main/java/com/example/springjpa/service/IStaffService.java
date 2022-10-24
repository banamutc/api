package com.example.springjpa.service;

import com.example.springjpa.model.entity.Staff;
import com.example.springjpa.model.request.StaffRequest;
import com.example.springjpa.model.response.AccountResponse;

import java.sql.Time;
import java.util.List;

public interface IStaffService {
    Staff getStaff(Long id);

    List<Staff> getAll();


    Staff create(StaffRequest request);
    Staff update(Long id,StaffRequest request);

    Staff read(Long id);

    List<Staff> getStaffByHour();
}
