package org.tnsif.acc.c2tc.markerinterface;

import java.io.Serializable;

public class Student implements Serializable {

    int rollNo;
    String name;
    double marks;
    String course;

    public Student(int rollNo, String name, double marks, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.course = course;
    }

    public void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Course: " + course);
    }
}