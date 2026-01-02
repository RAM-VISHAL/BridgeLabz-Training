package com.inheritance.assistedproblems.employeedetails;

public class EmploeeMain {
	
	public static void main(String args[]) {
		Manager m = new Manager("Ramvishal",148,50000,20);
		Developer d = new Developer("Aditya",149,30000,"java");
		Intern i = new Intern("Ram",150,20000,5);
		
		m.displayDetails();
		d.displayDetails();
		i.displayDetails();
		
	}

}
