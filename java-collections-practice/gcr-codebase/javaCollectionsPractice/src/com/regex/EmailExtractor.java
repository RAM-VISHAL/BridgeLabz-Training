package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtractor {
	public static void main(String args[]) {
		
		String text = "Contact us at support@example.com and info@company.org";
		
		String regex = "[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(text);
		
		
		
		while(m.find()) {
			
			System.out.println(m.group());
			
		}
	}

}
