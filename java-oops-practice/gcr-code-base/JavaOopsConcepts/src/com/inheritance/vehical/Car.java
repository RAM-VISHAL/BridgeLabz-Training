package com.inheritance.assistedproblems.vehical;

public class Car  extends Vehical{
	
	int seatCapacity ;
	
	Car(String name,int maxSpeed, String fuelType, int seatCapacity){
		super(name,maxSpeed,fuelType);
		this.seatCapacity = seatCapacity;
		
	}
	void displayInfo() {
		super.displayInfo();
		System.out.println("Seat Capacity :"+seatCapacity + "seater");
	}

	
}
