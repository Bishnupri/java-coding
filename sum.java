//Write a program in Java to input 5 numbers from keyboard and find their sum and average.

package com.java;
import java.util.*;

public class sum {
    
  public static void main(String[] args)

{       
    int i,n=0,p=0;
	double avg;
	{
	   
        System.out.println("Input the 5 numbers : ");  
         
	}
		for (i=0;i<5;i++)
		{
		    Scanner sc = new Scanner(System.in);
		    n = sc.nextInt();
		    
  		p +=n;
	}
	avg=p/5;
	System.out.println("The sum of 5 no is : " +p+"\nThe Average is : " +avg);
 
}


}
