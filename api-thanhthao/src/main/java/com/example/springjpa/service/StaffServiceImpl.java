package com.example.springjpa.service;

import com.example.springjpa.model.entity.Staff;
import com.example.springjpa.model.request.StaffRequest;
import com.example.springjpa.model.response.AccountResponse;
import com.example.springjpa.repository.StaffRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class StaffServiceImpl implements IStaffService {

    @Autowired
    private StaffRepository repository;

    @Override
    public Staff getStaff(Long id) {
        return null;
    }

    @Override
    public List<Staff> getAll() {
        return repository.findAll();
    }


    @Override
    public Staff create(StaffRequest request) {
        Staff staff = new Staff();
        staff.setName(request.getName());
        staff.setPosition(request.getPosition());
        staff.setTime_in(request.getTime_in());
        staff.setTime_out(request.getTime_out());
        repository.save(staff);
        return staff;
    }

    @Override
    public Staff update(Long id, StaffRequest request) {
        Staff accounts = repository.getReferenceById(id);
        accounts.setName(request.getName());
        accounts.setPosition(request.getPosition());
        accounts.setTime_in(request.getTime_in());
        accounts.setTime_out(request.getTime_out());
        repository.save(accounts);
        return new Staff();
    }

    @Override
    public Staff read(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Staff> getStaffByHour() {
        return repository.StaffByHour();
    }

}
