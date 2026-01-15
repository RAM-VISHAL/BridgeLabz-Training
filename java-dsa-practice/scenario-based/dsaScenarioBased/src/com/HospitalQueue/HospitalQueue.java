package com.HospitalQueue;

public class HospitalQueue {
	public static void main(String args[]) {
		
		Patient pa[] = {new Patient("Amit",5), new Patient("Riya",8),new Patient("vijay",9),new Patient("priya",6)};
		
		System.out.println("Patient by arrival time :");
		for(Patient p : pa) {
			p.display();
		}
		
		BubbleSort.sort(pa);
		
		System.out.println("-----------------------------------------------------");
		
		System.out.println("Patient by critical time :");
		for(Patient p : pa) {
			p.display();
		}
		
		
	}

}
