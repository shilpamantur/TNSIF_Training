package org.tnsif.acc.c2tc.markerinterface;

public class MarkerInterfaceDemo {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Siddesh", 85.5, "Java");
        Student s2 = new Student(102, "Hema", 90.5, "Java");

        s1.display();

        System.out.println();

        s2.display();
    }
}