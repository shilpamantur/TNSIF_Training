package org.tnsif.acc.c2tc.exceptionhandling;

public class NullPointerExceptionDemo {

    public static void main(String[] args) {

        String str = "Hello";

        try {
            System.out.println(str.length());
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("No matter what, this block will get executed");
        }
    }
}