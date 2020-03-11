package com.example.demo.db.repository;

import com.example.demo.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> getAllByFirstName(String firstName);

    @Query(value = "SELECT adress FROM employee WHERE age = 24", nativeQuery = true)
    String mihailov();

}
