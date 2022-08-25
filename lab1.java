//Write a Java program that takes a year from user and print whether that year is a leap year or not.
package com.java;

public class lab1 {
	
	
	 public static void main(String args[]) {
	 int year =2016;
	 if(year%400==0)
	 {
		 System.out.println("is a leap year");
		 
	 }
	 else if(year%4==0)
	 {
		 System.out.println("is a leap year"); 
	 }
	 else
	 {
		 System.out.println("is not  a leap year");
	 }

}
}
