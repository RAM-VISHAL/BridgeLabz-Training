package com.Interface.listinterface.reverselist;
import java.util.*;

public class ReverseList {
	
	public static void reverseArrayList(ArrayList<Integer> al) {
		
		int start = 0;
		int end = al.size()-1;
		
		while(start < end) {
			int temp = al.get(start);
			al.set(start,al.get(end));
			al.set(end,temp);
			
			start++;
			end--;
			
			
 		}
	}
	
	public static void main(String args[]) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.addAll(Arrays.asList(1,2,3,4,5));
		
		reverseArrayList(al);
		
		System.out.println(al);
		
		
	}

}
