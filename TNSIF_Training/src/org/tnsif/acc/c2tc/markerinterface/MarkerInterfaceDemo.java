package org.tnsif.acc.c2tc.markerinterface;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {

		Registration sushma = new Student();

		Registration anil = new Student();

		Object obj = new Object();

		if (obj instanceof Registration) {
			System.out.println("Student is registered for the course");
		} else {
			System.out.println("Student is not registered for the course");
		}
	}
}