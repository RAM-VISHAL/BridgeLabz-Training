package com.annotation.customserialization;


	public class Main {
	    public static void main(String[] args) {

	        User user = new User("Ramvishal", 22, "secret123");

	        String json = JsonSerializer.toJson(user);
	        System.out.println(json);
	    }
	}