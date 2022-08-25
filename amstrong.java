//WAP to input a number and check whether it is an amstrong number or not?

package com.java;
import java.util.Scanner;

public class amstrong {
	
	   public static void main(String[] args) 
	    {
	        int n, count = 0, a, b, c, sum = 0;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter  integer  to check:");
	        n = sc.nextInt();
	        a = n;
	        c = n;
	        while(a > 0)
	        {
	            a = a / 10;
	            count++;
	        }
	        while(n > 0)
	        {
	            b = n % 10;
	            sum = (int) (sum+Math.pow(b, count));
	            n = n / 10;
	        }
	        if(sum == c)
	        {
	            System.out.println("Number is Armstrong");
	        }
	        else
	        {
	            System.out.println("Number is not Armstrong");
	        }    
	    }
	}


