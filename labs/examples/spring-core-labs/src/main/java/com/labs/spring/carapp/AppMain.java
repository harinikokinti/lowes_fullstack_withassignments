package com.labs.spring.carapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class AppMain {
    public static void main(String[] args) {

        // Create IoC conatainer with configuration class

        AbstractApplicationContext  context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        System.out.println("no od beans: " + context.getBeanDefinitionNames());

        for(String beanName : context.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }

        Car car1 = context.getBean("car1", Car.class);
        System.out.println(car1.getModel() + " " + car1.getColor() + " " + car1.getManufacturer() + car1.getEngine());

        Car car2 = context.getBean("car2", Car.class);
        System.out.println(car2.getModel() + " " + car2.getColor() + " " + car2.getManufacturer() + car2.getEngine());

        Car car3 = context.getBean("car3", Car.class);
        System.out.println(car3.getModel() + " " + car3.getColor() + " " + car3.getManufacturer() + car3.getEngine());


        context.registerShutdownHook();
   }
}
