package com.java;

public class lab3 {
	static void divisible(int N)
	{
		for(int num =0; num< N; num++) {
			if (num% 3==0 && num % 5 ==0);
			System.out.print(num + "");
		}
	}
	public static void main(String args[]) {
		int N = 100;
		divisible(N);
	}
	
	

}
