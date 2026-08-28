package org.tnsif.acc.c2tc.oops;

class Student1 {

    Student1() {
        System.out.println("Default constructor");
    }

    Student1(String name, int age) {
        System.out.println("Name: " + name + " Age: " + age);
    }

    Student1(String name) {
        System.out.println("Name: " + name);
    }
}

public class ConstructorOverloading {

    public static void main(String[] args) {

        new Student1();
        new Student1("Hema", 26);
        new Student1("Hema");
    }
}