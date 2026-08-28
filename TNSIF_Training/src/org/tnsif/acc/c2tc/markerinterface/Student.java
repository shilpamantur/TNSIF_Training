package org.tnsif.acc.c2tc.markerinterface;

public class Student implements Registration {

    private int id;
    private String name;
    private double fees;
    private String course;

    // Parameterized constructor
    public Student(int id, String name, double fees, String course) {
        this.id = id;
        this.name = name;
        this.fees = fees;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getFees() {
        return fees;
    }

    public String getCourse() {
        return course;
    }

    public void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Fees: " + fees);
        System.out.println("Course: " + course);
    }
}