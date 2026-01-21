package com.sorting.Insertionsort.TailorShop;

public class insertionSort {
	
	public static void insertionS(Order []order) {
		
		for(int i=1; i<order.length; i++) {
			int j=i;
			
			while(j>0 && order[j-1].deadline > order[j].deadline) {
				
				Order temp = order[j-1];
				order[j-1] = order[j];
				order[j] = temp;
				j--;
				
			}
		}
	}

}
