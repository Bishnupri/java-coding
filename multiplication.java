
//Write a program in Java to display the multiplication table of a given integer?


package com.java;
import java.util.*;

public class multiplication {
	   public static void main(String[] args)

	   {
	      int num1,num2;

	      System.out.print("Enter the number(Table to be calculated): ");
	   {
	     System.out.print("Enter number of terms : ");
	     Scanner in = new Scanner(System.in);
	     num2 = in.nextInt();

	      System.out.println ("\n");
	      for(num1=0;num1<=num2;num1++)
	     
	        System.out.println(num2+" X "+num1+" = " +num2*num1);
	      }
	   }
	   

}
