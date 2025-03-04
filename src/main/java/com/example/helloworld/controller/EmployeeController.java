package com.example.helloworld.controller;

import com.example.helloworld.model.EmployeeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeBean employeeBean;

    @GetMapping("/employee")
    public String getEmployeeInfo() {
        return employeeBean.getEmployeeDetails();
    }
}
