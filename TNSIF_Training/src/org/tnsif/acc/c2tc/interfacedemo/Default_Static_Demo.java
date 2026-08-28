package org.tnsif.acc.c2tc.interfacedemo;

public class Default_Static_Demo {

    public static void main(String[] args) {

        Vehicle car = new Car("Tata Sierro");
        Vehicle bike = new Bike("Royal Enf");

        car.start();
        car.stop();
        car.repair();

        System.out.println("-----------");

        bike.start();
        bike.stop();
        bike.repair();

        System.out.println("-----------");

        Vehicle.checkMaintaince();

        System.out.println("Maxspeed " + Vehicle.Max_speed);
    }
}