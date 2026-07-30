package org.tnsif.acc.c2tc.oops;

class Human {

    // Private data members
    private String name;
    private int age;

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for name
    public String getName() {
        return this.name;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter method for age
    public int getAge() {
        return this.age;
    }
}

public class EncapsulationDemo {

    public static void main(String[] args) {

        Human obj = new Human();

        // First object values
        obj.setName("Balaji");
        obj.setAge(21);

        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());

        // Update object values
        obj.setName("Hemanth");
        obj.setAge(34);

        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}