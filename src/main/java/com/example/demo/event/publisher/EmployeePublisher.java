package com.example.demo.event.publisher;

import com.example.demo.dto.Employee;
import com.example.demo.event.EmployeeEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EmployeePublisher {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void sendMailToListener(final Employee employee) {
        EmployeeEvent employeeEvent = new EmployeeEvent(this, employee);
        applicationEventPublisher.publishEvent(employeeEvent);
    }
}
