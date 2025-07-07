package com.service;

import com.entity.Employee;
import com.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ServiceImpl implements Service {

    @Autowired   //filed injection
    @Qualifier("Repo1")
    //there are two bean with same type so IOC confuse which bean should he use so we have to use @Qualifier annotation
    // to explicit tell IOC use this bean
    private Repository repository;

/*    @Autowired     //setter injection
    @Qualifier("Repo1")
    public void setRepository(Repository repository) {
        this.repository = repository;
    }*/

/*    @Autowired   // Constructor injection
    public ServiceImpl(@Qualifier("Repo1") Repository repository) {
        this.repository = repository;
    }*/

    @Override
    public String insideService(Employee employee) {
        return repository.insideRepository(employee);
    }
}
