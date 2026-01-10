package com.stringbuffer;

public class ConcatenateStrings {
	
	public static void main(String args[]) {
		 
	String[] words = {"Hello", " ", "World", "!", " Using", " StringBuffer"};
	
	StringBuffer sb = new StringBuffer();
	
	 for(String s : words) {
         sb.append(s);
     }

	String result = sb.toString();
	
	System.out.println("Concatenate String :"+result);

		
	}

}
