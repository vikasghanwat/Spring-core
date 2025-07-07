package com.repository;

import com.entity.Employee;
import org.springframework.stereotype.Component;

@Component("Repo2")
public class RepositoryImpl2 implements Repository {

    @Override
    public String insideRepository(Employee employee) {
        return "NULL";
    }
}
