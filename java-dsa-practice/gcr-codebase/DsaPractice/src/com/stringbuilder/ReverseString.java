package com.stringbuilder;

public class ReverseString {

	public static void main(String args[]) {
		 
		String input = "hello";
		
		StringBuilder sb = new StringBuilder(input);
		
		//reverse 
		sb.reverse();
		
		String reversed = sb.toString();
		
		System.out.println("Input :" + input);
		System.out.println("Reversed : "+reversed);
		
	}
}
