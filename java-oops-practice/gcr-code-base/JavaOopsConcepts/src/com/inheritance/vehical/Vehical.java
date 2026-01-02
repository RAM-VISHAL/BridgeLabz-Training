package com.inheritance.assistedproblems.vehical;

public class Vehical {
    String name;
	int maxSpeed ;
	String fuelType;
	
	Vehical(String name,int maxSpeed,String fuelType){
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}
	
	void displayInfo() {
		System.out.println("Name "+name);
		System.out.println("Max Speed is : "+maxSpeed);
		System.out.println("Fuel Type :"+fuelType);
	}
}
