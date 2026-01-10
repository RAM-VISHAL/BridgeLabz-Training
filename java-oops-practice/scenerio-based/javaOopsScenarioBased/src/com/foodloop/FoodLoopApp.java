package com.foodloop;

import java.util.*;

public class FoodLoopApp {
	public static void main(String args[]) {
		FoodItem pizza = new VegItem("Panner pizza ",250,10);
		FoodItem chicken = new NonVegItem("Chicken Burger",300,5);
		
		List<FoodItem> combo = new ArrayList<>();
		combo.add(chicken);
		combo.add(pizza);
		
		Order order = new Order(combo);
		order.placeOrder();
		
		
		
	}

}
