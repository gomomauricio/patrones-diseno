package com.decorator;

public class CaramelDecorator implements Coffee {
	
	private Coffee coffee;
	
	

	public CaramelDecorator(Coffee coffee) {
		super();
		this.coffee = coffee;
	}



	@Override
	public double cost() {
		return coffee.cost() + 10;
	}



	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return coffee.getDescription() + ", caramelo";
	}

}
