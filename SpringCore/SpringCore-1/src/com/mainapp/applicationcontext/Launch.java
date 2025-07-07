package com.mainapp.applicationcontext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        /*
         * Eager initialization:
         * before we are calling dean from .xml file it creates
         */

        /*how can we avoid extra beans creation if we do not want any bean to create
         * we can add some validations in .xml file*/

        Demo demo = (Demo) classPathXmlApplicationContext.getBean("demo");

        int test = demo.test();
        /*here we have added condition if its false still is creating bean of femo
         *  to avoid early bean creation we can add
         * property into .xml file lazy-init="true" to avoid unnecessary bean creation
         * now it create bean of "femo" we need*/

        if (test == 1001) { //true=1000
            Femo femo = (Femo) classPathXmlApplicationContext.getBean("femo");
            femo.test();

        }

        System.out.println("Exit");
    }
}
