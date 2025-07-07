package com.mainapp.beanfactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Launch {

    public static void main(String[] args) {
        ClassPathResource resource = new ClassPathResource("bean.xml");
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);

        /*
         * Lazy initialization:
         * when we provide configuration details to bean factory still its not creating bean
         */
        Demo demo = (Demo) xmlBeanFactory.getBean("demo");
        Femo femo = (Femo) xmlBeanFactory.getBean("femo");
        /*after we called bean by it id from .xml file it create bean */

        demo.test();
        femo.test();

        System.out.println("Exit");
    }
}
