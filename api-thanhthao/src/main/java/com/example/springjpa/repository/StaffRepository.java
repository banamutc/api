package com.example.springjpa.repository;

import com.example.springjpa.model.entity.Staff;
import com.example.springjpa.model.response.AccountResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Time;
import java.util.List;
import java.util.Optional;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {

    // Các phổ thông
    Optional<Staff> findByName(String name);;

    List<Staff> findAll();

    @Query(value = "select * from staff where" +
            " hour(time_in) >= 7" +
            "and hour(time_in) < 8", nativeQuery = true)
    List<Staff> StaffByHour();


}
