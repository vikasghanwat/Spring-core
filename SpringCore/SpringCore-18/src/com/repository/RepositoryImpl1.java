package com.repository;

import com.entity.Employee;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("Repo1")
public class RepositoryImpl1 implements Repository {

    //for injecting primitive data

    @Value("1000")
    private int id;

    @Value("java")
    private String book;

    //to perform arithmetic operation

    @Value("#{100+1}")
    private int add;

    //to add collection
    @Value("#{myList}")
    private List<String> addList;

    @Override
    public String insideRepository(Employee employee) {
        System.out.println(employee + " added successfully " + id + " | " + book + " | " + add + " | " + addList);
        return "SUCCESS FROM REPO-1";
    }
}
