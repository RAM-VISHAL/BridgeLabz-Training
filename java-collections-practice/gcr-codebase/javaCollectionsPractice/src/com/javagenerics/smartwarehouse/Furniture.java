package com.javagenerics.smartwarehouse;

public class Furniture extends WarehouseItem{

	public Furniture(String name) {
		super(name);
		
	}

	@Override
	public String getCategory() {
		return "Furniture";
	}
	

}