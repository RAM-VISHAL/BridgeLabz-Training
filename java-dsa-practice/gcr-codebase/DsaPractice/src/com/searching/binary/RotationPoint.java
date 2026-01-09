package com.searching.binary;

public class RotationPoint {
	public static int findRotationPoint(int arr[]){
		int n = arr.length;
		
	int	left = 0,right = n-1;
	
	while(left < right) {
		
		int mid = (left+right)/2;
		
		if(arr[mid] > arr[right]) {
			left = mid+1;
		}
		else {
			right = mid;
		}
	}
	return left;
		
	}
	
	public static void main(String args[]) {
		
		int arr[] = {30,40,50,10,20};
		
		int result = findRotationPoint(arr);
		System.out.println("Rotation Point Index:"+result);
		System.out.println("Smallest Element :"+arr[result]);
	}

}
