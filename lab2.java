//Write a Java program to swap two variable?
package com.java;

public class lab2 {
	public static void main(String args[]) {
		int a = 40, b = 60;
		System.out.println("Before swap");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swap");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		
	}

}
