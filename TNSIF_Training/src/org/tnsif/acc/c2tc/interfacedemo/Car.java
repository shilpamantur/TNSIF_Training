package org.tnsif.acc.c2tc.interfacedemo;

public class Car implements Vehicle {

    private String model;

    Car(String model) {
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println("Car " + model + " starting");
    }

    @Override
    public void stop() {
        System.out.println("Car " + model + " stopping");
    }
}