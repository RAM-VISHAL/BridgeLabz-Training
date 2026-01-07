package com.sorting.bubblesort.sortstudentmarks;

public class StudentMarksMain {
	
 public static void SortMarks(int studentMark[]) {
	 int n = studentMark.length;
	 for(int i=0; i<n; i++) {
		 for(int j=0; j<n-1-i; j++) {
			 if(studentMark[j] > studentMark[j+1]) {
				 int temp = studentMark[j];
				 studentMark[j] = studentMark[j+1];
				 studentMark[j+1] = temp;
			 }
		 }
	 } 
	
}

 public static void  printf(int studentMark[]) {
	 
	 for(int a : studentMark) {
		 
		 System.out.print(a+" ");
	 }
 }
//public class StudentMarksMain {
 
	  public static void main(String args[]) {
		  
		  int studentMark[] = {10,20,50,3,6,1,4,50};
		 
		  SortMarks( studentMark) ;
		  printf(studentMark);
		  
		  
 		  
	  }
}
