package com.decorator;

public class BasicCoffee implements Coffee {

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public String getDescription() {
		return "Cafe simple";
	}
	
 
}
