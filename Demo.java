package com.java;

public class Demo {
	 public static void main(String[] args) {
		    Truck truck= new Truck(200,200,"blue",20);
	        Ford ford = new Ford(500, 500, "red", 30);
	        Car car = new Car(100, 100, "white");
	        System.out.println("ford "+ford.getSalePrice());
	        System.out.println("car  "+car.getSalePrice());
	        System.out.println("truck "+truck.getSalePrice());

}
}
