package com.config;

import com.bean.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.bean", "com.postprocess"})
//@Scope(scopeName = "prototype")
public class MyConfig {

    //this way we can create custom bean
    @Bean
    //@Scope("prototype")     //scope is prototype it is automatically lazy and scope prototype means destroy method not run coz IOC not sure which bean we have to destroy if there are multiple beans
    public Employee getBean() {
        System.out.println("CUSTOM LOGIC");
        return new Employee();
    }

/*  if we create custom bean above is the way to create
    but we already creating bean of employee using @Component annotaion
    it will throw below error
    No qualifying bean of type 'com.bean.Employee' available: expected single matching bean but found 2: employee,getBean
    remove @Component from Employee class*/

}
