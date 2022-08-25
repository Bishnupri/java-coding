package com.java;
import java.util.Scanner;

public class lab11 {
	public static void main(String args[])
	{
		
			   
			  double sum=0;
			  int n;
			  Scanner sc=new Scanner(System.in);
			  n=sc.nextInt();
			  for(int i=2;i<=n;i++)
			  {
				  sum=sum+(1+(1/i));
				  
			  }
			  
			  System.out.println(sum);
			  
		
	}


}
