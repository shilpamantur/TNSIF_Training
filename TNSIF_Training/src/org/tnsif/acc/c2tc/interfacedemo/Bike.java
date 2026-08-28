package org.tnsif.acc.c2tc.interfacedemo;

class Bike implements Vehicle {

    private String type;

    Bike(String type) {
        this.type = type;
    }

    @Override
    public void start() {
        System.out.println("Bike " + type + " starting");
    }

    @Override
    public void stop() {
        System.out.println("Bike " + type + " stopping");
    }
}