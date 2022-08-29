package com.java;

public class Car {
	 private int speed;
	    private double regularPrice;
	    private String color;

	    public Car(int speed, double regularPrice, String color) {
	        this.speed = speed;
	        this.regularPrice = regularPrice;
	        this.color = color;
	    }

	    public double getSalePrice() {
	        return regularPrice;
	    }
	

}
package com.java;

public class Truck extends Car {
    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight) 
    {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    public double getSalePrice() {
        return super.getSalePrice() * (weight > 2000 ? 0.85 : 0.75);
    }

	

}
package com.java;

public class Ford  extends Car {
    private int length;

    public Ford(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    public double getSalePrice() {
        return super.getSalePrice() * (length < 20 ? 0.9 : 0.85);
     
    }
}
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




