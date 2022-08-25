//WAP to print fibonacci series using do-while loop.(0 1 1 2 3 5 8 13)?

package com.java;

public class fibonacci {
	public static void main (String args[]) {
		int i = 1, n = 13, firstTerm = 0, secondTerm = 1;
	    System.out.println("Fibonacci Series upto " + n + " terms:");

	    while (i <= n) {
	      System.out.print(firstTerm + ", ");

	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;

	      i++;
	    }
	  
	}

}
