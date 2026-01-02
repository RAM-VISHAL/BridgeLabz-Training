package com.inheritance.assistedproblems.animalhierarchy;

public class AnimalMain {
	public static void main(String args[]) {
		
		Animal a1 = new Dog("Jack",5);
		Animal a2 = new Cat("Kitty",4);
		Animal a3 = new Bird("Sparrow",2);
		
		a1.makeSound();
		a2.makeSound();
		a3.makeSound();
		
		
	}

}
