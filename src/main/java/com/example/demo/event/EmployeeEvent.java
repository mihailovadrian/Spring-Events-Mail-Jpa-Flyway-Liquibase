package com.example.demo.event;

import com.example.demo.dto.Employee;
import org.springframework.context.ApplicationEvent;

public class EmployeeEvent extends ApplicationEvent {
    private Employee employee;

    public EmployeeEvent(Object source, Employee employee) {
        super(source);
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }
}
