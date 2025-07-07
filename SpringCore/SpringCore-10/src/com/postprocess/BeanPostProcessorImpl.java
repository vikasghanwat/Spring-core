package com.postprocess;

import com.controller.Controller;
import com.dao.Dao;
import com.service.Service;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorImpl implements BeanPostProcessor {

    //this method run after bean initialization and before init()
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Controller) {
            System.out.println("CONTROLLER BEAN INITIALIZATION WITH ID " + beanName);
        } else if (bean instanceof Service) {
            System.out.println("SERVICE BEAN INITIALIZATION WITH ID " + beanName);
        } else {
            System.out.println("SERVICE BEAN INITIALIZATION WITH ID " + beanName);
        }
        return bean;
    }

    //this method run after every init method
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        if (bean instanceof Controller) {
            System.out.println("CONTROLLER BEAN INITIALIZED SUCCESSFULLY");
        } else if (bean instanceof Service) {
            System.out.println("SERVICE BEAN INITIALIZED SUCCESSFULLY");
        } else {
            // we have init method in Dao class so verifying that
            Dao dao = (Dao) bean;
            String result = dao.init();
            if (result == null) {
                System.err.println("SERVICE BEAN FAIL TO INITIALIZE");
            } else if (result.equals("connection established")) {
                System.out.println("SERVICE BEAN INITIALIZED SUCCESSFULLY");
            } else {
                System.err.println("SERVICE BEAN FAIL TO INITIALIZE in else block");
            }
        }
        return bean;
    }

}
