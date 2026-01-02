package com.inheritance.assistedproblems.employeedetails;

public class Employee {
	
	String name ;
	int id;
	double salary;
	
	Employee(String name, int id, double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	void displayDetails() {
		System.out.println("Employee Name :"+name );
		System.out.println("Employee id :"+id);
		System.out.println("Employee salary :"+salary);
		
	}

}
