package com.labs.spring.carapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Car {
    String model;
    String color;
    String manufacturer;

//    @Autowired
//    @Qualifier("petrol")
    Engine engine;

   public Car() {

    }

    public Car(Engine engine) {
        this.engine = engine;
    }


    public Car(String model, String color, String manufacturer) {
       this.model = model;
       this.color = color;
       this.manufacturer = manufacturer;
    }




    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
