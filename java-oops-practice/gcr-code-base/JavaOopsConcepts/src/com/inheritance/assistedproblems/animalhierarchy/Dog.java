package com.inheritance.assistedproblems.animalhierarchy;

 class Dog  extends Animal{
	
	 Dog(String  name,int age){
		 super(name,age);
	 }
	 void makeSound() {
		 System.out.println("Dog : bark,bark");
	 }

}
