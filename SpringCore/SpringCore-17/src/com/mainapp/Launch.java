package com.mainapp;

import com.bean.Employee;
import com.config.MyConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launch {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
        Employee bean = ac.getBean(Employee.class);
        bean.test();

       /* Employee bean1 = ac.getBean(Employee.class);
        bean1.test();*/

        ac.close();

    }
}
