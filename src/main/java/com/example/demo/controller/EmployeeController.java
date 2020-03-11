package com.example.demo.controller;

import com.example.demo.dto.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    @RequestMapping("/updateEmp")
    @ResponseBody
    public void updateEmployee(@RequestBody Employee employee) {
        employeeService.updateEmployee(employee);
//        return "mailTemplate.html";
    }

    @GetMapping("/test")
    public String test() {
        return "Hello";
    }

    @GetMapping("/updateButton")
    public String updateButt() {
        return "mailTemplate.html";
    }

    @GetMapping("/employeesByFirstName/{firstName}")
    @ResponseBody
    public List<Employee> getAllEmployeesByFirstName(@PathVariable String firstName) {
        return employeeService.getAllEmployeesByFirstName(firstName);
    }
}
