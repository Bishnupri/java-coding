package com.java;
import java.util.Scanner;

public class tuesday {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Arithmetic Operator");
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		
		case '+':
			System.out.println("Used for ->>> addition");
			break;
			
		case '-':
			System.out.println("Used for ->>> subtraction");
			break;
			
		case '*':
			System.out.println("Used for ->>> multiplication");
			break;
			
		case '/':
			System.out.println("Used for ->>> division");
			break;
		}
	}
}
			
	


