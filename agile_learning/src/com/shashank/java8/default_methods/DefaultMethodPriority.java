/**
 * 
 */
package com.shashank.java8.default_methods;

interface Fly {
	default void takeOff() { System.out.println("Fly::takeOff");}
	default void turn() {System.out.println("Fly::turn");}
	default void land() {System.out.println("Fly::land");}
	default void cruise() {System.out.println("Fly::cruise");}
}

interface FastFly extends Fly {
	
}

interface Sail {
	default void cruise() {System.out.println("Sail::cruise");}
}

class Vehicle {
	public void land(){System.out.println("Vehicle::land"); }
	
}

class SeaPlane extends Vehicle implements FastFly, Sail{
	
	private int altitude;
	
	public void setAltitude(int altitude) {
		this.altitude = altitude;
	}

	@Override
	public void cruise() {
		// TODO Auto-generated method stub
		System.out.println("In SeaPlane::cruise");
		if (altitude < 10) 
			Sail.super.cruise();
		else
			FastFly.super.cruise();
	}
	
}

/**
 * @author pooja
 *
 */
public class DefaultMethodPriority {
	
	public static void main(String[] args) {
		SeaPlane plane = new SeaPlane();
		plane.land();
		plane.setAltitude(10);
		plane.cruise();
		
	}

}
