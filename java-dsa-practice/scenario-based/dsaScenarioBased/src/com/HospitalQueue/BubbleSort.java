package com.HospitalQueue;

import java.util.*;
public class BubbleSort {
	
	public static void sort(Patient []pa) {
		
		int n = pa.length;
		
		for(int i=0; i<n-1; i++) {
			
			for(int j=0; j<n-i-1; j++) {
				if(pa[j].criticality < pa[j+1].criticality) {
					Patient temp = pa[j];
					pa[j]= pa[j+1];
					pa[j+1] = temp;
					
				}
			}
		}
		
	}

}
