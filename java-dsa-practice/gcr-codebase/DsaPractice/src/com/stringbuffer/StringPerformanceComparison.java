package com.stringbuffer;

public class StringPerformanceComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 100000;
		String text = "hello";
		
		//  StringBuffer Test 
		
		StringBuffer sbBuffer = new StringBuffer();
		long startBuffer = System.nanoTime();
		
		for(int i=0; i<n; i++) {
			sbBuffer.append(text);
		}
		
		long endBuffer = System.nanoTime();
		long timeBuffer = endBuffer - startBuffer;
		
		//  StringBuilder test 
		
		StringBuilder sbBuilder = new StringBuilder();
		
		long startBuilder = System.nanoTime();
		
		for(int i=0; i<n; i++) {
			sbBuilder.append(text);
		}
		long endBuilder = System.nanoTime();
		long timeBuilder = endBuilder-startBuilder;
		
		//Result 
		
		System.out.println("Time taken by StringBuffer: " + timeBuffer + " ns");
	    System.out.println("Time taken by StringBuilder: " + timeBuilder + " ns");
	}

}
