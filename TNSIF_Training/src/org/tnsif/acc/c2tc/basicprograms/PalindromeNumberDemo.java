package org.tnsif.acc.c2tc.basicprograms;

import java.util.Scanner;

public class PalindromeNumberDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a Number: ");
		int number = scan.nextInt();

		int original = number;
		int reverse = 0;

		while (number != 0) {
			int digit = number % 10;
			reverse = reverse * 10 + digit;
			number = number / 10;
		}

		if (original == reverse) {
			System.out.println(original + " is a Palindrome Number.");
		} else {
			System.out.println(original + " is not a Palindrome Number.");
		}

		scan.close();
	}
}