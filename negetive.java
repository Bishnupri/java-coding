//Write a Java program to Given two non-negative integers num1 and num2 represented as string, print the sum of num1 and num2
package com.java;
import java.util.Scanner;

public class negetive {
	public static void main(String args[]) {
		int x,y,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first integer");
		x=sc.nextInt();
		System.out.println("Enter the second integer");
		y=sc.nextInt();
		System.out.println("Enter the number");
		num=sc.nextInt();
		int z=x*x+y*y;
		if(z==num) {
			System.out.println("Equal");
		}else {
			System.out.println("not Equal");
		}
	}

}
