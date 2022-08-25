
//Write a program in Java to display the cube of the number upto given an integer.

package com.java;
import java.util.*;

public class cube {
	   public static void main(String[] args)

	   {
	       int num1,num2;

	       System.out.print("Input number is : ");
	       Scanner sc = new Scanner(System.in);
	   		    num2 = sc.nextInt();

	        for(num1=1;num1<=num2;num1++)
	        {
	        System.out.println("Number is : " +num1+" and cube of " +num1+" is : "+(num1*num1*num1));     
	       }
	    }
	   

}
