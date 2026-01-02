package com.inheritance.assistedproblems.vehical;

public class Motorcycle extends Vehical {
	
	double engine;
	
	Motorcycle(String name,int maxSpeed,String fuelType,int seatCapacity,double engine){
		super(name,maxSpeed,fuelType);
		this.engine = engine;
		
	}
	
	void displayInfo() {
		System.out.println("Engine "+engine + "Stroke");
	}

}
