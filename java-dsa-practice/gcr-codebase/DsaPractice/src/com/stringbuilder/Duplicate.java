package com.stringbuilder;

import java.util.*;

public class Duplicate {
	
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter input string :");
	String input = sc.nextLine();
	
	StringBuilder sb  = new StringBuilder("");
	
	HashSet<Character> hs = new HashSet<>();
	
	for(char c : input.toCharArray()) {
		
		if(!hs.contains(c)) {
			sb.append(c);
			hs.add(c);
		}
		
	}
	
	System.out.println("Original String :"+input);
	System.out.println("Without Duplicates :"+sb);
	
	
 	
	}
	
}

