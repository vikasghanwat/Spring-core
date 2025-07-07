package com.config;

import com.entity.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan(basePackages = {"com.entity", "com.controller", "com.service", "com.repository"})
//@Scope(scopeName = "prototype")
public class MyConfig {

    @Bean
    public Employee getBean() {
        System.out.println("CUSTOM LOGIC");
        return new Employee();
    }

    @Bean
    public List myList() {
        return Arrays.asList("AI", "Cloud", "SAP");
    }

}
