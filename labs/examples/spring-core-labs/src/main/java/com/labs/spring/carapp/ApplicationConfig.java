package com.labs.spring.carapp;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public Car car1() {
        // constructor injection
       // return new Car();
       //return new Car("Nexon","Grey", "Tata", petrol());

        // setter injection
        Car car1 = new Car("Nexon","Grey", "Tata");
        car1.setEngine(electric());
        return car1;
    }

    public Car car2() {
        // constructor injection
       // return new Car();
        return new Car("Corolla","Red", "toyoto", petrol());

    }


    @Bean
    public Engine petrol() {
        return new Engine("petrol", 2000);
    }

    @Bean
    public Engine diesel() {
        return new Engine("diesel", 3000);
    }

    @Bean
    public Engine electric() {
        return new Engine("electric", 4000);
    }

}
