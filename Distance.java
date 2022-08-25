//Add two distances in inch-feet by creating a class named 'AddDistance'.
package com.java;

public class Distance {
	int ft,inch;

	Distance(int f,int i)
	{
	ft=f;
	inch=i;
	}
	Distance addDist(Distance ob,Distance ob1)
	{
	int f=0,i=0;
	i=inch+ob.inch+ob1.inch;
	if(i>=12)
	{
	f=i/12;
	i=i%12;
	}
	f=ft+ob.ft+f+ob1.ft;
	Distance ob2=new Distance(f,i);
	return ob2;
	}

	void dispDist()
	{
	System.out.println(ft+"ft "+inch+"inch");
	}
	}

	class AddDistance
	{
	public static void main(String []ar)
	{
	Distance ob=new Distance(12,22);
	Distance ob1=new Distance(13,12);
	Distance ob2=new Distance(11,11);
	Distance ob3;
	ob3=ob.addDist(ob1,ob2);

	ob.dispDist();
	ob1.dispDist();
	ob2.dispDist();
	ob3.dispDist();
	}
	}
