package com.inheritance.assistedproblems.animalhierarchy;

 class Bird extends Animal {

	Bird(String name,int age){
		 super(name,age);
	}
	
	
	void makeSound() {
		System.out.println("Bird : chirp ,chirp");
	}
}
