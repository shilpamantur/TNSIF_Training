package org.tnsif.acc.c2tc.basicprograms;

import java.util.Scanner;

public class ReverseStringDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a String: ");
		String str = scan.nextLine();

		String reverse = "";

		// Reverse the string without using built-in reverse() method
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

		System.out.println("Original String : " + str);
		System.out.println("Reversed String : " + reverse);

		scan.close();
	}
}