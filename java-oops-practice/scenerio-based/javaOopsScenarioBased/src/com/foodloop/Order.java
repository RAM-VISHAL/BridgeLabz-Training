package com.foodloop;

import java.util.*;

public class Order implements IOrderable {
	
	private List<FoodItem> items;
	private double total;
	
	//Constructor for combo meal
	
	public Order(List<FoodItem> items) {
		this.items = items;
	}
	
	private double applyDiscount(double amount) {
		
		if(amount > 500) {
			return amount*0.02;
			
		}
		else if(amount > 300) {
			return amount*0.10;
		}
		else {
			return 0;
		}
		
	}
	
	public void placeOrder() {
		total = 0;
		
		for(FoodItem item : items) {
			if(item.isAvailable()) {
				total = total + item.getPrice();
				item.reduceStock();
			}
		}
		
		double discount = applyDiscount(total);
		total = total - discount;
		
		System.out.println("Order placed. Final Bill : ₹"+total);
	}
	
	public void cancelOrder() {
		System.out.println("Order cancelled.");
	}

}
