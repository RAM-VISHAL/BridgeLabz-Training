package com.searching.linear;

public class LinearSearchSentence {

	public static String SearchSentence(String []sentences , String word ) {
		
		 for(String s : sentences) {
			 
			 if(s.contains(word)) {
				 return s;
			 }
		 }
		 return "Not found";
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String[] sentences = {
		            "Java is a powerful language",
		            "Linear search is simple",
		            "We are preparing for placements",
		            "Data structures are important"
		        };
		  
		 String word = "placements";

		 String result = SearchSentence(sentences,word);
		 
		 System.out.println("Result :"+result);


	}

}
