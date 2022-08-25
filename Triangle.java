//Write a program to print the area and parameter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.
package com.java;

public class Triangle {
    int s1=3;
    int s2=4;
    int s3=5;
    public static void main(String[] args)
      {
             Triangle t1=new Triangle();
             int para=(t1.s1+t1.s2+t1.s3);
             System.out.println("parameter is:"+para);
             int sp=(para/2);
             int ar=((((sp*(sp-t1.s1))*(sp-t1.s2))*(sp-t1.s3)));       
             int area=(int)Math.sqrt(ar);   
             System.out.println("Area is:"+area);
      }


}
