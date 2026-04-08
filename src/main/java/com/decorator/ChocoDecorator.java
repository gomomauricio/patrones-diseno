package com.decorator;

public class ChocoDecorator implements Coffee {
	
	private Coffee coffee;
	
	

	public ChocoDecorator(Coffee coffee) {
		super();
		this.coffee = coffee;
	}



	@Override
	public double cost() {
		return coffee.cost() + 15;
	}



	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return coffee.getDescription() + ", chocolate";
	}

}
