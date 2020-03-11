package com.example.demo.service;

import com.example.demo.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;


@Service
public class MailContentBuilder {
    private TemplateEngine templateEngine;

    @Autowired
    public MailContentBuilder(TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    public String build(Employee employee) {
        Context context = new Context();
        context.setVariable("firstName", employee.getFirstName());
        context.setVariable("lastName", employee.getLastName());
        return templateEngine.process("mailTemplate", context);
    }

}
