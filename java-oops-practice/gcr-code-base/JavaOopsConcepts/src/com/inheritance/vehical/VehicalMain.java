package com.inheritance.assistedproblems.vehical;

public class VehicalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   Car c1     = new Car("Toyota Wellfire", 170, "Petrol", 7);
	   Truck t1   = new Truck("Volvo" , 180, "Diesel",4);
	   Motorcycle m1 = new Motorcycle("GT 650",150,"Petrol", 2 ,4);
	   
	   c1.displayInfo();
	   t1.displayInfo();
	   m1.displayInfo();

	}

}
