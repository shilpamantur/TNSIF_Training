package org.tnsif.acc.c2tc.interfacedemo;

public interface Vehicle {

    void start();

    void stop();

    int Max_speed = 120;

    default void repair() {
        System.out.println("Vehicle repair is done here");
    }

    static void checkMaintaince() {
        System.out.println("Vehicle maintaince taken care here");
    }
}