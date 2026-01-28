package com.regex;

public class validateLicensePlateNum {

	
	public class LicensePlateValidation {
	    public static void main(String[] args) {

	        String regex = "^[A-Z]{2}[0-9]{4}$";

	        String[] plates = {
	            "AB1234",
	            "A12345",
	            "ab1234",
	            "AB12",
	            "XY9999"
	        };

	        for (String plate : plates) {
	            if (plate.matches(regex)) {
	                System.out.println(plate + " → Valid");
	            } else {
	                System.out.println(plate + " → Invalid");
	            }
	        }
	    }
	}

}
