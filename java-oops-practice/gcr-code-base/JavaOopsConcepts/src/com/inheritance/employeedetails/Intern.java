package com.inheritance.assistedproblems.employeedetails;

public class Intern extends Employee {
    String name;
    int id;
    int salary;
	int duration;
	
	Intern(String name, int id,int salary ,int duration){
		super(name,id,salary);
		this.duration = duration;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Duration "+duration + " months");
	}
	
}
