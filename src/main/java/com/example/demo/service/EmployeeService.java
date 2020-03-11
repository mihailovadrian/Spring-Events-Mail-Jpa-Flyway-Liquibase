package com.example.demo.service;

import com.example.demo.db.repository.EmployeeRepository;
import com.example.demo.dto.Employee;
import com.example.demo.event.publisher.EmployeePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeePublisher employeePublisher;

    @Autowired
    private EmployeeRepository employeeRepository;

    public void updateEmployee(Employee employee) {
        employeePublisher.sendMailToListener(employee);
    }

    public List<Employee> getAllEmployeesByFirstName(String firstName) {
        return employeeRepository.getAllByFirstName(firstName);
    }

}
