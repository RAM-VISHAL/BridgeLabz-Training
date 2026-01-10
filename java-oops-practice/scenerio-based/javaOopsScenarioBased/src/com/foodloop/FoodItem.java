package com.foodloop;

public class FoodItem {
	private String name ;
	private String category;
	protected double  price;
	private int availability;
	
	
	FoodItem(String name, String category,double price,int availability){
		
		this.name = name;
		this.category = category;
		this.price = price;
		this.availability = availability;
	}
	
	public boolean isAvailable() {
		return availability > 0;
	}
	public void reduceStock() {
		if(availability > 0)
			availability--;
	}
	
	public double getPrice() {
     return price;
	}
	
	public String getName() {
		return name;
	}
	

}
