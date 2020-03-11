package com.example.demo.event.listeners;

import com.example.demo.dto.Employee;
import com.example.demo.email.EmailService;
import com.example.demo.event.EmployeeEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MailTrapListener2 implements ApplicationListener<EmployeeEvent> {
    @Autowired
    EmailService emailService;

    @Override
    public void onApplicationEvent(EmployeeEvent event) {
        String employeeDetails = event.getEmployee().toString();
        Employee employee = event.getEmployee();
        emailService.sendSimpleMessage("c3337dfc48-3de4d0@inbox.mailtrap.io", "subiectListener2", employeeDetails);
        emailService.sendHtmlMessage("c3337dfc48-3de4d0@inbox.mailtrap.io", "htmlListener2", employee);
    }
}
