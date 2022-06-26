package com.labs.spring.carapp;

import org.springframework.beans.factory.annotation.Autowired;

public class Engine {
    String type;
    int capacity;

    @Autowired
    public Engine(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return " Engine{" +
                "type='" + type + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
