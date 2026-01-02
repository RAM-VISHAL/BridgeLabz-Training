package com.inheritance.assistedproblems.employeedetails;

 class Developer extends Employee {
	String name;
	int id;
	double salary;
	
	String programmingLanguage;
	public Developer(String name, int id, double salary, String programmingLanguage) {
		super(name,id,salary);
		this.programmingLanguage = programmingLanguage;
		
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Programming Language :"+programmingLanguage);
	}

}
