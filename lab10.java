package com.java;
import java.util.Scanner;

public final class lab10 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int hcf=1;
		int s,g;
		if(a<b) {
			s=a;
			g=b;
		}else {
			s=b;
			g=a;
		}
		
		for(int i=s;i>1;i--) {
			if(g%i==0&&s%i==0) {
				hcf=i;
				break;
			}
			}
		
		System.out.print(hcf);
		
	}


}
