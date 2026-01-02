package com.inheritance.assistedproblems.animalhierarchy;

class Cat extends Animal {
	
	Cat(String name, int age){
		super(name,age);
	}
	
	void makeSound() {
		System.out.println("cat : meow , meow");
	}
	

}
