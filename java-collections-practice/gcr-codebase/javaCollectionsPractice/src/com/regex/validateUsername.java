package com.regex;

public class validateUsername {
	 public static void main(String[] args) {

	        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";

	        String[] usernames = {
	            "user_123",
	            "123user",
	            "us",
	            "User_01",
	            "user@123"
	        };

	        for (String username : usernames) {
	            if (username.matches(regex)) {
	                System.out.println(username + " → Valid");
	            } else {
	                System.out.println(username + " → Invalid");
	            }
	        }
	    }
}
