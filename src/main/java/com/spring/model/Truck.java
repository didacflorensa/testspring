package com.spring.model;


public class Truck {

    public String id;
    public String name;

    public Truck(String id, String name) {
        this.id  = id;
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
