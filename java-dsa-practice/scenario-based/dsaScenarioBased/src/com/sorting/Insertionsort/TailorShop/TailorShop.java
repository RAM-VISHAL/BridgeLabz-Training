package com.sorting.Insertionsort.TailorShop;

public class TailorShop {
	public static void main(String args[]) {
	Order []order = { new Order(101, 2),
            new Order(102, 4),
            new Order(103, 6),
            new Order(104, 3)};
	
	
	insertionSort.insertionS(order);
	
	for(Order m : order ) {
		System.out.println("order Id :"+m.orderId +"Deadline :"+m.deadline+ "  days");
	}
}
}