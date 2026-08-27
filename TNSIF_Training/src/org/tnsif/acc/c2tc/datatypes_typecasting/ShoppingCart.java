package org.tnsif.acc.c2tc.datatypes_typecasting;

public class ShoppingCart {

	public static void main(String[] args) {

		// Implicit Type Casting (smaller -> larger)

		int quantity = 3;

		double pricePerItem = 99.50;

		// int -> double automatically
		double total_price = quantity * pricePerItem;

		double discount = 10.75;

		System.out.println("Quantity: " + quantity);
		System.out.println("Price per Item: " + pricePerItem);
		System.out.println("Total Price: " + total_price);
		System.out.println("Discount: " + discount);
	}
}