package com.inheritance.assistedproblems.vehical;

public class Truck extends Vehical {
	
    int loadCapacity;
    int seatCapacity;
    
    Truck(String name,int maxSpeed,String fuelType,int seatCapacity){
    	super(name,maxSpeed,fuelType);
    	this.seatCapacity = seatCapacity;
    	this.loadCapacity = loadCapacity;
    }
    void displayInfo() {
    	super.displayInfo();
    	System.out.println("Load Capacity :"+loadCapacity);
    	System.out.println("Load Capacity :"+seatCapacity);
    }
}
