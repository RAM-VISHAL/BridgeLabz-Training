package com.searching.linear;

import java.util.*;

public class FirstNegativeNumber {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a array size :");
	int n = sc.nextInt();
	
	System.out.println("Enter array element :");
	int arr[] = new int[n];
	
	for(int i=0;  i<n; i++) {
		arr[i] = sc.nextInt();
	}
	
	//search a negative number
	
	for(int i=0; i<n; i++) {
		if(arr[i] < 0) {
			
			System.out.println("first negative number index: "+i);
			break;
		}
	}
	System.out.println("-1");
	
	}

}
