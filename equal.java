// WAP the sum of cube of digits of a number is equal to the same number?

package com.java;

public class equal {
	public static void main(String args[])
	{
		
		int a=1,b=5,c=1;
		double d=b*b-4*a*c;
		if(d==0) {
			System.out.println("roots are equal");
		}else if(d>0) {
			System.out.println("roots are real and diferent");
		}else {
			System.out.println("roots are imaginary");
		}
		
	}

}
