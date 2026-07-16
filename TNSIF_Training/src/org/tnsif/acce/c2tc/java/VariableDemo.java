package org.tnsif.acce.c2tc.java;

public class VariableDemo {
	int price=10;
	void print()
	{
		String msg = "hello";
		System.out.print(msg);
		
	}
	
	static String message= "Hello students";

	public static void main(String[] args) {
		VariableDemo obj=new VariableDemo();
		System.out.println(obj.price);
		obj.print();
		System.out.print(message);
		// TODO Auto-generated method stub

	}

}
