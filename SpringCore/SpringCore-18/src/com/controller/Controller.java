package com.controller;

import com.entity.Employee;
import com.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Controller {

    @Autowired
    private Service service;

    public String doPost(Employee employee) {
        return service.insideService(employee);
    }
}
