package com.methodRefrence.constructorRef;

import java.util.*;

public class InvoiceGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> invoice = Arrays.asList(101,102,103,104,105);
        
		
	List<Invoice>updateInvoice = 	invoice.stream().map(Invoice::new).toList();
	System.out.println(updateInvoice);
	}

}
