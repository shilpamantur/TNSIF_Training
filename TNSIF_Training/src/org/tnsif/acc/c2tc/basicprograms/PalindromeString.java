package org.tnsif.acc.c2tc.basicprograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a String: ");
		String str = scan.nextLine();

		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

		if (str.equals(reverse)) {
			System.out.println("String is a Palindrome.");
		} else {
			System.out.println("String is not a Palindrome.");
		}

		scan.close();
	}
}