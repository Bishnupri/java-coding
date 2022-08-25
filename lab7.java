package com.java;

public class lab7 {
	public static void main(String args[])
	    {
		int n = 5;
        System.out.printf("Sum is %f", sum(n));
		
	    }
	 static double sum(int n)
	    
	    {
		  double i, s = 0.0;
	      for (i = 1; i <= n; i++)
	          s = s + 1/i;
	      return s;
	         
	    }
	


}
