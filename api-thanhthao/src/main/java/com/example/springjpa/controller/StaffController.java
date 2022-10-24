package com.example.springjpa.controller;

import com.example.springjpa.model.entity.Staff;
import com.example.springjpa.model.request.StaffRequest;
import com.example.springjpa.model.response.AccountResponse;
import com.example.springjpa.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.util.List;
import java.util.Timer;

@RestController
@RequestMapping("staffs")
public class StaffController {
    @Autowired
    private IStaffService service;


    @GetMapping("/all")
    ResponseEntity<List<Staff>> getAll() {
        List<Staff> staff = service.getAll();
        return ResponseEntity.ok(staff);
    }

    @PostMapping("/create")
    ResponseEntity<Staff> create(@RequestBody StaffRequest request) {
        Staff staff = service.create(request);
        return ResponseEntity.ok(staff);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Staff> update(@PathVariable(name = "id") Long id, @RequestBody StaffRequest request) {
        Staff response1 = service.update(id, request);
        return ResponseEntity.ok(response1);
    }
    @GetMapping("read/{id}")
    public ResponseEntity<Staff> get(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok(service.read(id));
    }
    @GetMapping("hour")
    public ResponseEntity<List<Staff>> getPersonnelByHour () {
        List<Staff> staffList = service.getStaffByHour();
        return ResponseEntity.ok(staffList);
    }

}
