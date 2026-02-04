package com.methodRefrence.nameUppercasing;

import java.util.Arrays;
import java.util.*;
public class Employee {
	
	public static void main(String args[]) {
		
		List<String> employee = Arrays.asList("Ramvishal","Sanchit","Ankit", "Nitin","Surabh");
		
		employee.stream().map(String :: toUpperCase).forEach(System.out::println);
	}

}
